package typings.av

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typings.av.avStrings.buffer
import typings.av.avStrings.cookie
import typings.av.avStrings.data
import typings.av.avStrings.decodeStart
import typings.av.avStrings.duration
import typings.av.avStrings.end
import typings.av.avStrings.error
import typings.av.avStrings.format
import typings.av.avStrings.metadata
import typings.av.avStrings.progress
import typings.av.avStrings.ready
import typings.av.avStrings.refill
import typings.av.avStrings.timeUpdate
import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AV {
  
  @js.native
  trait Asset extends StObject {
    
    var active: Boolean = js.native
    
    var buffered: Double = js.native
    
    def decodeToBuffer(callback: js.Function1[/* buffer */ js.typedarray.Float32Array, Unit]): Unit = js.native
    
    var decoder: Decoder | Null = js.native
    
    var demuxer: Demuxer | Null = js.native
    
    var duration: Double | Null = js.native
    
    @JSName("emit")
    def emit_buffer(event: buffer, fn: js.Function1[/* percent */ Double, Unit]): Unit = js.native
    @JSName("emit")
    def emit_data(event: data, fn: js.Function1[/* data */ js.typedarray.Float32Array, Unit]): Unit = js.native
    @JSName("emit")
    def emit_decodeStart(event: decodeStart, fn: js.Function0[Unit]): Unit = js.native
    @JSName("emit")
    def emit_duration(event: duration, fn: js.Function1[/* msecs */ Double, Unit]): Unit = js.native
    @JSName("emit")
    def emit_error(event: error, fn: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    @JSName("emit")
    def emit_format(event: format, fn: js.Function1[/* object */ Format, Unit]): Unit = js.native
    @JSName("emit")
    def emit_metadata(event: metadata, fn: js.Function1[/* object */ Metadata, Unit]): Unit = js.native
    
    var format: Format | Null = js.native
    
    @JSName("get")
    def get_duration(event: duration, callback: js.Function1[/* duration */ Double, Unit]): Unit = js.native
    @JSName("get")
    def get_format(event: format, callback: js.Function1[/* format */ Format, Unit]): Unit = js.native
    @JSName("get")
    def get_metadata(event: metadata, callback: js.Function1[/* metadata */ Metadata, Unit]): Unit = js.native
    
    var metadata: Metadata | Null = js.native
    
    @JSName("off")
    def off_buffer(event: buffer, fn: js.Function1[/* percent */ Double, Unit]): Unit = js.native
    @JSName("off")
    def off_data(event: data, fn: js.Function1[/* data */ js.typedarray.Float32Array, Unit]): Unit = js.native
    @JSName("off")
    def off_decodeStart(event: decodeStart, fn: js.Function0[Unit]): Unit = js.native
    @JSName("off")
    def off_duration(event: duration, fn: js.Function1[/* msecs */ Double, Unit]): Unit = js.native
    @JSName("off")
    def off_error(event: error, fn: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    @JSName("off")
    def off_format(event: format, fn: js.Function1[/* object */ Format, Unit]): Unit = js.native
    @JSName("off")
    def off_metadata(event: metadata, fn: js.Function1[/* object */ Metadata, Unit]): Unit = js.native
    
    @JSName("on")
    def on_buffer(event: buffer, fn: js.Function1[/* percent */ Double, Unit]): Unit = js.native
    @JSName("on")
    def on_data(event: data, fn: js.Function1[/* data */ js.typedarray.Float32Array, Unit]): Unit = js.native
    @JSName("on")
    def on_decodeStart(event: decodeStart, fn: js.Function0[Unit]): Unit = js.native
    @JSName("on")
    def on_duration(event: duration, fn: js.Function1[/* msecs */ Double, Unit]): Unit = js.native
    @JSName("on")
    def on_error(event: error, fn: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    @JSName("on")
    def on_format(event: format, fn: js.Function1[/* object */ Format, Unit]): Unit = js.native
    @JSName("on")
    def on_metadata(event: metadata, fn: js.Function1[/* object */ Metadata, Unit]): Unit = js.native
    
    @JSName("once")
    def once_buffer(event: buffer, fn: js.Function1[/* percent */ Double, Unit]): Unit = js.native
    @JSName("once")
    def once_data(event: data, fn: js.Function1[/* data */ js.typedarray.Float32Array, Unit]): Unit = js.native
    @JSName("once")
    def once_decodeStart(event: decodeStart, fn: js.Function0[Unit]): Unit = js.native
    @JSName("once")
    def once_duration(event: duration, fn: js.Function1[/* msecs */ Double, Unit]): Unit = js.native
    @JSName("once")
    def once_error(event: error, fn: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    @JSName("once")
    def once_format(event: format, fn: js.Function1[/* object */ Format, Unit]): Unit = js.native
    @JSName("once")
    def once_metadata(event: metadata, fn: js.Function1[/* object */ Metadata, Unit]): Unit = js.native
    
    var source: Source = js.native
    
    def start(): Unit = js.native
    
    def stop(): Unit = js.native
  }
  
  @js.native
  trait AudioDevice extends StObject {
    
    var currentTime: Double = js.native
    
    @JSName("emit")
    def emit_refill(event: refill, fn: js.Function1[/* buffer */ Buffer, Unit]): Unit = js.native
    @JSName("emit")
    def emit_timeUpdate(event: timeUpdate, fn: js.Function1[/* msecs */ Double, Unit]): Unit = js.native
    
    @JSName("off")
    def off_refill(event: refill, fn: js.Function1[/* buffer */ Buffer, Unit]): Unit = js.native
    @JSName("off")
    def off_timeUpdate(event: timeUpdate, fn: js.Function1[/* msecs */ Double, Unit]): Unit = js.native
    
    @JSName("on")
    def on_refill(event: refill, fn: js.Function1[/* buffer */ Buffer, Unit]): Unit = js.native
    @JSName("on")
    def on_timeUpdate(event: timeUpdate, fn: js.Function1[/* msecs */ Double, Unit]): Unit = js.native
    
    @JSName("once")
    def once_refill(event: refill, fn: js.Function1[/* buffer */ Buffer, Unit]): Unit = js.native
    @JSName("once")
    def once_timeUpdate(event: timeUpdate, fn: js.Function1[/* msecs */ Double, Unit]): Unit = js.native
    
    var playing: Boolean = js.native
    
    def seek(time: Double): Unit = js.native
    
    def start(): Unit = js.native
    
    def stop(): Unit = js.native
  }
  
  type BalanceFilter = Filter
  
  @js.native
  trait Bitstream extends StObject {
    
    def advance(bits: Double): Unit = js.native
    
    def align(): Unit = js.native
    
    def available(bits: Double): Boolean = js.native
    
    var bitposition: Double = js.native
    
    def copy(): Bitstream = js.native
    
    def offset(): Double = js.native
    
    def peek(bits: Double): Double = js.native
    def peek(bits: Double, signed: Boolean): Double = js.native
    
    def peekLSB(bits: Double): Double = js.native
    def peekLSB(bits: Double, signed: Boolean): Double = js.native
    
    def read(bits: Double): Double = js.native
    def read(bits: Double, signed: Boolean): Double = js.native
    
    def readLSB(bits: Double): Double = js.native
    def readLSB(bits: Double, signed: Boolean): Double = js.native
  }
  
  trait Buffer
    extends StObject
       with _BufferFormats {
    
    def copy(): Buffer
    
    var length: Double
    
    def slice(offset: Double, length: Double): Buffer
    
    def toBlob(): Blob
    
    def toBlobURL(): String
  }
  object Buffer {
    
    inline def apply(
      copy: () => Buffer,
      length: Double,
      slice: (Double, Double) => Buffer,
      toBlob: () => Blob,
      toBlobURL: () => String
    ): Buffer = {
      val __obj = js.Dynamic.literal(copy = js.Any.fromFunction0(copy), length = length.asInstanceOf[js.Any], slice = js.Any.fromFunction2(slice), toBlob = js.Any.fromFunction0(toBlob), toBlobURL = js.Any.fromFunction0(toBlobURL))
      __obj.asInstanceOf[Buffer]
    }
    
    extension [Self <: Buffer](x: Self) {
      
      inline def setCopy(value: () => Buffer): Self = StObject.set(x, "copy", js.Any.fromFunction0(value))
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setSlice(value: (Double, Double) => Buffer): Self = StObject.set(x, "slice", js.Any.fromFunction2(value))
      
      inline def setToBlob(value: () => Blob): Self = StObject.set(x, "toBlob", js.Any.fromFunction0(value))
      
      inline def setToBlobURL(value: () => String): Self = StObject.set(x, "toBlobURL", js.Any.fromFunction0(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.av.AV.Buffer
    - typings.av.AV.TypedArray
    - js.typedarray.ArrayBuffer
    - typings.av.AV.BufferList
  */
  type BufferFormats = _BufferFormats | TypedArray | js.typedarray.ArrayBuffer
  
  trait BufferList
    extends StObject
       with _BufferFormats {
    
    def advance(): Boolean
    
    def append(buffer: Buffer): Unit
    
    var availableBuffers: Double
    
    var availableBytes: Double
    
    def copy(): BufferList
    
    var first: Buffer | Null
    
    var last: Buffer | Null
    
    var numBuffers: Double
    
    def reset(): Unit
    
    def rewind(): Boolean
  }
  object BufferList {
    
    inline def apply(
      advance: () => Boolean,
      append: Buffer => Unit,
      availableBuffers: Double,
      availableBytes: Double,
      copy: () => BufferList,
      numBuffers: Double,
      reset: () => Unit,
      rewind: () => Boolean
    ): BufferList = {
      val __obj = js.Dynamic.literal(advance = js.Any.fromFunction0(advance), append = js.Any.fromFunction1(append), availableBuffers = availableBuffers.asInstanceOf[js.Any], availableBytes = availableBytes.asInstanceOf[js.Any], copy = js.Any.fromFunction0(copy), numBuffers = numBuffers.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), rewind = js.Any.fromFunction0(rewind), first = null, last = null)
      __obj.asInstanceOf[BufferList]
    }
    
    extension [Self <: BufferList](x: Self) {
      
      inline def setAdvance(value: () => Boolean): Self = StObject.set(x, "advance", js.Any.fromFunction0(value))
      
      inline def setAppend(value: Buffer => Unit): Self = StObject.set(x, "append", js.Any.fromFunction1(value))
      
      inline def setAvailableBuffers(value: Double): Self = StObject.set(x, "availableBuffers", value.asInstanceOf[js.Any])
      
      inline def setAvailableBytes(value: Double): Self = StObject.set(x, "availableBytes", value.asInstanceOf[js.Any])
      
      inline def setCopy(value: () => BufferList): Self = StObject.set(x, "copy", js.Any.fromFunction0(value))
      
      inline def setFirst(value: Buffer): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
      
      inline def setFirstNull: Self = StObject.set(x, "first", null)
      
      inline def setLast(value: Buffer): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
      
      inline def setLastNull: Self = StObject.set(x, "last", null)
      
      inline def setNumBuffers(value: Double): Self = StObject.set(x, "numBuffers", value.asInstanceOf[js.Any])
      
      inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
      
      inline def setRewind(value: () => Boolean): Self = StObject.set(x, "rewind", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait Decoder extends StObject {
    
    var bitstream: Bitstream = js.native
    
    def decode(): Boolean = js.native
    
    @JSName("emit")
    def emit_data(event: data, fn: js.Function2[/* data */ TypedArray, /* isLastBuffer */ Boolean, Unit]): Unit = js.native
    @JSName("emit")
    def emit_end(event: end, fn: js.Function0[Unit]): Unit = js.native
    @JSName("emit")
    def emit_error(event: error, fn: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    
    def init(): Unit = js.native
    
    @JSName("off")
    def off_data(event: data, fn: js.Function2[/* data */ TypedArray, /* isLastBuffer */ Boolean, Unit]): Unit = js.native
    @JSName("off")
    def off_end(event: end, fn: js.Function0[Unit]): Unit = js.native
    @JSName("off")
    def off_error(event: error, fn: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    
    @JSName("on")
    def on_data(event: data, fn: js.Function2[/* data */ TypedArray, /* isLastBuffer */ Boolean, Unit]): Unit = js.native
    @JSName("on")
    def on_end(event: end, fn: js.Function0[Unit]): Unit = js.native
    @JSName("on")
    def on_error(event: error, fn: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    
    @JSName("once")
    def once_data(event: data, fn: js.Function2[/* data */ TypedArray, /* isLastBuffer */ Boolean, Unit]): Unit = js.native
    @JSName("once")
    def once_end(event: end, fn: js.Function0[Unit]): Unit = js.native
    @JSName("once")
    def once_error(event: error, fn: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    
    def readChunk(): TypedArray = js.native
    
    var receivedFinalBuffer: Boolean = js.native
    
    def seek(timestamp: Double): Double = js.native
    
    def setCookie(cookie: Buffer): Unit = js.native
    
    var stream: Stream = js.native
  }
  
  @js.native
  trait Demuxer extends StObject {
    
    @JSName("emit")
    def emit_cookie(event: cookie, fn: js.Function1[/* buffer */ Buffer, Unit]): Unit = js.native
    @JSName("emit")
    def emit_data(event: data, fn: js.Function2[/* buffer */ Buffer, /* isLastBuffer */ Boolean, Unit]): Unit = js.native
    @JSName("emit")
    def emit_duration(event: duration, fn: js.Function1[/* msecs */ Double, Unit]): Unit = js.native
    @JSName("emit")
    def emit_error(event: error, fn: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    @JSName("emit")
    def emit_format(event: format, fn: js.Function1[/* object */ Format, Unit]): Unit = js.native
    @JSName("emit")
    def emit_metadata(event: metadata, fn: js.Function1[/* object */ Metadata, Unit]): Unit = js.native
    
    def init(): Unit = js.native
    
    @JSName("off")
    def off_cookie(event: cookie, fn: js.Function1[/* buffer */ Buffer, Unit]): Unit = js.native
    @JSName("off")
    def off_data(event: data, fn: js.Function2[/* buffer */ Buffer, /* isLastBuffer */ Boolean, Unit]): Unit = js.native
    @JSName("off")
    def off_duration(event: duration, fn: js.Function1[/* msecs */ Double, Unit]): Unit = js.native
    @JSName("off")
    def off_error(event: error, fn: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    @JSName("off")
    def off_format(event: format, fn: js.Function1[/* object */ Format, Unit]): Unit = js.native
    @JSName("off")
    def off_metadata(event: metadata, fn: js.Function1[/* object */ Metadata, Unit]): Unit = js.native
    
    @JSName("on")
    def on_cookie(event: cookie, fn: js.Function1[/* buffer */ Buffer, Unit]): Unit = js.native
    @JSName("on")
    def on_data(event: data, fn: js.Function2[/* buffer */ Buffer, /* isLastBuffer */ Boolean, Unit]): Unit = js.native
    @JSName("on")
    def on_duration(event: duration, fn: js.Function1[/* msecs */ Double, Unit]): Unit = js.native
    @JSName("on")
    def on_error(event: error, fn: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    @JSName("on")
    def on_format(event: format, fn: js.Function1[/* object */ Format, Unit]): Unit = js.native
    @JSName("on")
    def on_metadata(event: metadata, fn: js.Function1[/* object */ Metadata, Unit]): Unit = js.native
    
    @JSName("once")
    def once_cookie(event: cookie, fn: js.Function1[/* buffer */ Buffer, Unit]): Unit = js.native
    @JSName("once")
    def once_data(event: data, fn: js.Function2[/* buffer */ Buffer, /* isLastBuffer */ Boolean, Unit]): Unit = js.native
    @JSName("once")
    def once_duration(event: duration, fn: js.Function1[/* msecs */ Double, Unit]): Unit = js.native
    @JSName("once")
    def once_error(event: error, fn: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    @JSName("once")
    def once_format(event: format, fn: js.Function1[/* object */ Format, Unit]): Unit = js.native
    @JSName("once")
    def once_metadata(event: metadata, fn: js.Function1[/* object */ Metadata, Unit]): Unit = js.native
    
    def readChunk(): Unit = js.native
    
    var stream: Stream = js.native
  }
  
  @js.native
  trait DemuxerConstructor
    extends StObject
       with Instantiable0[Demuxer] {
    
    def probe(stream: Stream): Boolean = js.native
  }
  
  @js.native
  trait Device extends StObject {
    
    def destroy(): Unit = js.native
    
    @JSName("emit")
    def emit_refill(event: refill, fn: js.Function1[/* buffer */ Buffer, Unit]): Unit = js.native
    @JSName("emit")
    def emit_timeUpdate(event: timeUpdate, fn: js.Function1[/* msecs */ Double, Unit]): Unit = js.native
    
    def getDeviceTime(): Double = js.native
    
    @JSName("off")
    def off_refill(event: refill, fn: js.Function1[/* buffer */ Buffer, Unit]): Unit = js.native
    @JSName("off")
    def off_timeUpdate(event: timeUpdate, fn: js.Function1[/* msecs */ Double, Unit]): Unit = js.native
    
    @JSName("on")
    def on_refill(event: refill, fn: js.Function1[/* buffer */ Buffer, Unit]): Unit = js.native
    @JSName("on")
    def on_timeUpdate(event: timeUpdate, fn: js.Function1[/* msecs */ Double, Unit]): Unit = js.native
    
    @JSName("once")
    def once_refill(event: refill, fn: js.Function1[/* buffer */ Buffer, Unit]): Unit = js.native
    @JSName("once")
    def once_timeUpdate(event: timeUpdate, fn: js.Function1[/* msecs */ Double, Unit]): Unit = js.native
    
    var supported: Boolean = js.native
  }
  
  @js.native
  trait DeviceConstructor
    extends StObject
       with Instantiable2[/* sampleRate */ Double, /* channels */ Double, Device]
  
  /* Rewritten from type alias, can be one of: 
    - typings.av.avStrings.ascii
    - typings.av.avStrings.utf8
    - typings.av.avStrings.`utf16-be`
    - typings.av.avStrings.`utf16-le`
    - typings.av.avStrings.`utf16-bom`
  */
  trait Encoding extends StObject
  object Encoding {
    
    inline def ascii: typings.av.avStrings.ascii = "ascii".asInstanceOf[typings.av.avStrings.ascii]
    
    inline def `utf16-be`: typings.av.avStrings.`utf16-be` = "utf16-be".asInstanceOf[typings.av.avStrings.`utf16-be`]
    
    inline def `utf16-bom`: typings.av.avStrings.`utf16-bom` = "utf16-bom".asInstanceOf[typings.av.avStrings.`utf16-bom`]
    
    inline def `utf16-le`: typings.av.avStrings.`utf16-le` = "utf16-le".asInstanceOf[typings.av.avStrings.`utf16-le`]
    
    inline def utf8: typings.av.avStrings.utf8 = "utf8".asInstanceOf[typings.av.avStrings.utf8]
  }
  
  trait EventEmitter extends StObject {
    
    def emit(event: String, args: Any*): Unit
    
    def off(event: String, fn: js.Function1[/* repeated */ Any, Unit]): Unit
    
    def on(event: String, fn: js.Function1[/* repeated */ Any, Unit]): Unit
    
    def once(event: String, fn: js.Function1[/* repeated */ Any, Unit]): Unit
  }
  object EventEmitter {
    
    inline def apply(
      emit: (String, /* repeated */ Any) => Unit,
      off: (String, js.Function1[/* repeated */ Any, Unit]) => Unit,
      on: (String, js.Function1[/* repeated */ Any, Unit]) => Unit,
      once: (String, js.Function1[/* repeated */ Any, Unit]) => Unit
    ): EventEmitter = {
      val __obj = js.Dynamic.literal(emit = js.Any.fromFunction2(emit), off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on), once = js.Any.fromFunction2(once))
      __obj.asInstanceOf[EventEmitter]
    }
    
    extension [Self <: EventEmitter](x: Self) {
      
      inline def setEmit(value: (String, /* repeated */ Any) => Unit): Self = StObject.set(x, "emit", js.Any.fromFunction2(value))
      
      inline def setOff(value: (String, js.Function1[/* repeated */ Any, Unit]) => Unit): Self = StObject.set(x, "off", js.Any.fromFunction2(value))
      
      inline def setOn(value: (String, js.Function1[/* repeated */ Any, Unit]) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
      
      inline def setOnce(value: (String, js.Function1[/* repeated */ Any, Unit]) => Unit): Self = StObject.set(x, "once", js.Any.fromFunction2(value))
    }
  }
  
  trait Filter extends StObject {
    
    def process(buffer: TypedArray): Unit
  }
  object Filter {
    
    inline def apply(process: TypedArray => Unit): Filter = {
      val __obj = js.Dynamic.literal(process = js.Any.fromFunction1(process))
      __obj.asInstanceOf[Filter]
    }
    
    extension [Self <: Filter](x: Self) {
      
      inline def setProcess(value: TypedArray => Unit): Self = StObject.set(x, "process", js.Any.fromFunction1(value))
    }
  }
  
  trait Format extends StObject {
    
    var bitsPerChannel: Double
    
    var channelsPerFrame: Double
    
    var formatID: String
    
    var sampleRate: Double
  }
  object Format {
    
    inline def apply(bitsPerChannel: Double, channelsPerFrame: Double, formatID: String, sampleRate: Double): Format = {
      val __obj = js.Dynamic.literal(bitsPerChannel = bitsPerChannel.asInstanceOf[js.Any], channelsPerFrame = channelsPerFrame.asInstanceOf[js.Any], formatID = formatID.asInstanceOf[js.Any], sampleRate = sampleRate.asInstanceOf[js.Any])
      __obj.asInstanceOf[Format]
    }
    
    extension [Self <: Format](x: Self) {
      
      inline def setBitsPerChannel(value: Double): Self = StObject.set(x, "bitsPerChannel", value.asInstanceOf[js.Any])
      
      inline def setChannelsPerFrame(value: Double): Self = StObject.set(x, "channelsPerFrame", value.asInstanceOf[js.Any])
      
      inline def setFormatID(value: String): Self = StObject.set(x, "formatID", value.asInstanceOf[js.Any])
      
      inline def setSampleRate(value: Double): Self = StObject.set(x, "sampleRate", value.asInstanceOf[js.Any])
    }
  }
  
  trait HttpSourceOpts extends StObject {
    
    var length: js.UndefOr[Double] = js.undefined
  }
  object HttpSourceOpts {
    
    inline def apply(): HttpSourceOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HttpSourceOpts]
    }
    
    extension [Self <: HttpSourceOpts](x: Self) {
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    }
  }
  
  type Metadata = StringDictionary[Any]
  
  @js.native
  trait Player extends StObject {
    
    var asset: Asset = js.native
    
    var buffered: Double = js.native
    
    var currentTime: Double = js.native
    
    var duration: Double = js.native
    
    def emit(event: ready | end, fn: js.Function0[Unit]): Unit = js.native
    def emit(event: duration | progress, fn: js.Function1[/* msecs */ Double, Unit]): Unit = js.native
    @JSName("emit")
    def emit_buffer(event: buffer, fn: js.Function1[/* percent */ Double, Unit]): Unit = js.native
    @JSName("emit")
    def emit_error(event: error, fn: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    @JSName("emit")
    def emit_format(event: format, fn: js.Function1[/* object */ Format, Unit]): Unit = js.native
    @JSName("emit")
    def emit_metadata(event: metadata, fn: js.Function1[/* object */ Metadata, Unit]): Unit = js.native
    
    var filters: js.Array[Filter] = js.native
    
    var format: js.UndefOr[Format] = js.native
    
    var metadata: Metadata = js.native
    
    def off(event: ready | end, fn: js.Function0[Unit]): Unit = js.native
    def off(event: duration | progress, fn: js.Function1[/* msecs */ Double, Unit]): Unit = js.native
    @JSName("off")
    def off_buffer(event: buffer, fn: js.Function1[/* percent */ Double, Unit]): Unit = js.native
    @JSName("off")
    def off_error(event: error, fn: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    @JSName("off")
    def off_format(event: format, fn: js.Function1[/* object */ Format, Unit]): Unit = js.native
    @JSName("off")
    def off_metadata(event: metadata, fn: js.Function1[/* object */ Metadata, Unit]): Unit = js.native
    
    def on(event: ready | end, fn: js.Function0[Unit]): Unit = js.native
    def on(event: duration | progress, fn: js.Function1[/* msecs */ Double, Unit]): Unit = js.native
    @JSName("on")
    def on_buffer(event: buffer, fn: js.Function1[/* percent */ Double, Unit]): Unit = js.native
    @JSName("on")
    def on_error(event: error, fn: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    @JSName("on")
    def on_format(event: format, fn: js.Function1[/* object */ Format, Unit]): Unit = js.native
    @JSName("on")
    def on_metadata(event: metadata, fn: js.Function1[/* object */ Metadata, Unit]): Unit = js.native
    
    def once(event: ready | end, fn: js.Function0[Unit]): Unit = js.native
    def once(event: duration | progress, fn: js.Function1[/* msecs */ Double, Unit]): Unit = js.native
    @JSName("once")
    def once_buffer(event: buffer, fn: js.Function1[/* percent */ Double, Unit]): Unit = js.native
    @JSName("once")
    def once_error(event: error, fn: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    @JSName("once")
    def once_format(event: format, fn: js.Function1[/* object */ Format, Unit]): Unit = js.native
    @JSName("once")
    def once_metadata(event: metadata, fn: js.Function1[/* object */ Metadata, Unit]): Unit = js.native
    
    var pan: Double = js.native
    
    def pause(): Unit = js.native
    
    def play(): Unit = js.native
    
    var playing: Boolean = js.native
    
    def preload(): Unit = js.native
    
    def stop(): Unit = js.native
    
    def togglePlayback(): Unit = js.native
    
    var volume: Double = js.native
  }
  
  @js.native
  trait Source extends StObject {
    
    @JSName("emit")
    def emit_data(event: data, fn: js.Function1[/* buffer */ Buffer, Unit]): Unit = js.native
    @JSName("emit")
    def emit_end(event: end, fn: js.Function0[Unit]): Unit = js.native
    @JSName("emit")
    def emit_error(event: error, fn: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    @JSName("emit")
    def emit_progress(event: progress, fn: js.Function1[/* percent */ Double, Unit]): Unit = js.native
    
    @JSName("off")
    def off_data(event: data, fn: js.Function1[/* buffer */ Buffer, Unit]): Unit = js.native
    @JSName("off")
    def off_end(event: end, fn: js.Function0[Unit]): Unit = js.native
    @JSName("off")
    def off_error(event: error, fn: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    @JSName("off")
    def off_progress(event: progress, fn: js.Function1[/* percent */ Double, Unit]): Unit = js.native
    
    @JSName("on")
    def on_data(event: data, fn: js.Function1[/* buffer */ Buffer, Unit]): Unit = js.native
    @JSName("on")
    def on_end(event: end, fn: js.Function0[Unit]): Unit = js.native
    @JSName("on")
    def on_error(event: error, fn: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    @JSName("on")
    def on_progress(event: progress, fn: js.Function1[/* percent */ Double, Unit]): Unit = js.native
    
    @JSName("once")
    def once_data(event: data, fn: js.Function1[/* buffer */ Buffer, Unit]): Unit = js.native
    @JSName("once")
    def once_end(event: end, fn: js.Function0[Unit]): Unit = js.native
    @JSName("once")
    def once_error(event: error, fn: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    @JSName("once")
    def once_progress(event: progress, fn: js.Function1[/* percent */ Double, Unit]): Unit = js.native
    
    def pause(): Unit = js.native
    
    def reset(): Unit = js.native
    
    def start(): Unit = js.native
  }
  
  @js.native
  trait Stream extends StObject {
    
    def advance(bytes: Double): Unit = js.native
    
    def available(bytes: Double): Boolean = js.native
    
    def copy(): Stream = js.native
    
    var offset: Double = js.native
    
    def peekBuffer(offset: Double, length: Double): Buffer = js.native
    
    def peekFloat32(): Double = js.native
    def peekFloat32(offset: Double): Double = js.native
    
    def peekFloat64(): Double = js.native
    def peekFloat64(offset: Double): Double = js.native
    
    def peekFloat80(): Double = js.native
    def peekFloat80(offset: Double): Double = js.native
    
    def peekInt16(): Double = js.native
    def peekInt16(offset: Double): Double = js.native
    
    def peekInt24(): Double = js.native
    def peekInt24(offset: Double): Double = js.native
    
    def peekInt32(): Double = js.native
    def peekInt32(offset: Double): Double = js.native
    
    def peekInt8(): Double = js.native
    def peekInt8(offset: Double): Double = js.native
    
    def peekString(offset: Double, length: Double): String = js.native
    def peekString(offset: Double, length: Double, encoding: Encoding): String = js.native
    
    def peekUInt16(): Double = js.native
    def peekUInt16(offset: Double): Double = js.native
    
    def peekUInt24(): Double = js.native
    def peekUInt24(offset: Double): Double = js.native
    
    def peekUInt32(): Double = js.native
    def peekUInt32(offset: Double): Double = js.native
    
    def peekUInt8(): Double = js.native
    def peekUInt8(offset: Double): Double = js.native
    
    def readBuffer(length: Double): Buffer = js.native
    
    def readFloat32(): Double = js.native
    
    def readFloat64(): Double = js.native
    
    def readFloat80(): Double = js.native
    
    def readInt16(): Double = js.native
    
    def readInt24(): Double = js.native
    
    def readInt32(): Double = js.native
    
    def readInt8(): Double = js.native
    
    def readString(length: Double): String = js.native
    def readString(length: Double, encoding: Encoding): String = js.native
    
    def readUInt16(): Double = js.native
    
    def readUInt24(): Double = js.native
    
    def readUInt32(): Double = js.native
    
    def readUInt8(): Double = js.native
    
    def remainingBytes(): Double = js.native
    
    def rewind(bytes: Double): Unit = js.native
    
    def seek(position: Double): Unit = js.native
  }
  
  type TypedArray = js.typedarray.Int8Array | js.typedarray.Uint8Array | js.typedarray.Uint8ClampedArray | js.typedarray.Int16Array | js.typedarray.Uint16Array | js.typedarray.Int32Array | js.typedarray.Uint32Array | js.typedarray.Float32Array | js.typedarray.Float64Array
  
  type UnderflowError = js.Error
  
  type VolumeFilter = Filter
  
  trait _BufferFormats extends StObject
  object _BufferFormats {
    
    inline def Buffer(
      copy: () => typings.av.AV.Buffer,
      length: Double,
      slice: (Double, Double) => typings.av.AV.Buffer,
      toBlob: () => Blob,
      toBlobURL: () => String
    ): typings.av.AV.Buffer = {
      val __obj = js.Dynamic.literal(copy = js.Any.fromFunction0(copy), length = length.asInstanceOf[js.Any], slice = js.Any.fromFunction2(slice), toBlob = js.Any.fromFunction0(toBlob), toBlobURL = js.Any.fromFunction0(toBlobURL))
      __obj.asInstanceOf[typings.av.AV.Buffer]
    }
    
    inline def BufferList(
      advance: () => Boolean,
      append: Buffer => Unit,
      availableBuffers: Double,
      availableBytes: Double,
      copy: () => typings.av.AV.BufferList,
      numBuffers: Double,
      reset: () => Unit,
      rewind: () => Boolean
    ): typings.av.AV.BufferList = {
      val __obj = js.Dynamic.literal(advance = js.Any.fromFunction0(advance), append = js.Any.fromFunction1(append), availableBuffers = availableBuffers.asInstanceOf[js.Any], availableBytes = availableBytes.asInstanceOf[js.Any], copy = js.Any.fromFunction0(copy), numBuffers = numBuffers.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), rewind = js.Any.fromFunction0(rewind), first = null, last = null)
      __obj.asInstanceOf[typings.av.AV.BufferList]
    }
  }
}
