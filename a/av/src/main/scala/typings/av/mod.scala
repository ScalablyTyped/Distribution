package typings.av

import org.scalablytyped.runtime.Instantiable0
import typings.av.AV.BufferFormats
import typings.av.AV.DemuxerConstructor
import typings.av.AV.Device
import typings.av.AV.DeviceConstructor
import typings.av.AV.HttpSourceOpts
import typings.av.AV.Source
import typings.av.AV.TypedArray
import typings.std.Blob
import typings.std.Error
import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("av", "Asset")
  @js.native
  open class Asset protected ()
    extends StObject
       with typings.av.AV.Asset {
    def this(source: Source) = this()
  }
  object Asset {
    
    @JSImport("av", "Asset")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def fromBuffer(buffer: BufferFormats): typings.av.AV.Asset = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(buffer.asInstanceOf[js.Any]).asInstanceOf[typings.av.AV.Asset]
    
    /* static member */
    inline def fromFile(file: File): typings.av.AV.Asset = ^.asInstanceOf[js.Dynamic].applyDynamic("fromFile")(file.asInstanceOf[js.Any]).asInstanceOf[typings.av.AV.Asset]
    
    /* static member */
    inline def fromURL(url: String): typings.av.AV.Asset = ^.asInstanceOf[js.Dynamic].applyDynamic("fromURL")(url.asInstanceOf[js.Any]).asInstanceOf[typings.av.AV.Asset]
    inline def fromURL(url: String, opts: HttpSourceOpts): typings.av.AV.Asset = (^.asInstanceOf[js.Dynamic].applyDynamic("fromURL")(url.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.av.AV.Asset]
  }
  
  @JSImport("av", "AudioDevice")
  @js.native
  open class AudioDevice protected ()
    extends StObject
       with typings.av.AV.AudioDevice {
    def this(sampleRate: Double, channels: Double) = this()
  }
  object AudioDevice {
    
    @JSImport("av", "AudioDevice")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def create(sampleRate: Double, channels: Double): Device | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(sampleRate.asInstanceOf[js.Any], channels.asInstanceOf[js.Any])).asInstanceOf[Device | Null]
    
    /* static member */
    inline def register(device: DeviceConstructor): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("register")(device.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @JSImport("av", "BalanceFilter")
  @js.native
  open class BalanceFilter ()
    extends StObject
       with typings.av.AV.Filter {
    
    /* CompleteClass */
    override def process(buffer: TypedArray): Unit = js.native
  }
  
  @JSImport("av", "Bitstream")
  @js.native
  open class Bitstream protected ()
    extends StObject
       with typings.av.AV.Bitstream {
    def this(stream: typings.av.AV.Stream) = this()
  }
  
  @JSImport("av", "Buffer")
  @js.native
  open class Buffer protected ()
    extends StObject
       with typings.av.AV.Buffer {
    def this(data: TypedArray) = this()
    
    /* CompleteClass */
    override def copy(): typings.av.AV.Buffer = js.native
    
    /* CompleteClass */
    var length: Double = js.native
    
    /* CompleteClass */
    override def slice(offset: Double, length: Double): typings.av.AV.Buffer = js.native
    
    /* CompleteClass */
    override def toBlob(): Blob = js.native
    
    /* CompleteClass */
    override def toBlobURL(): String = js.native
  }
  object Buffer {
    
    @JSImport("av", "Buffer")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def allocate(size: Double): typings.av.AV.Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("allocate")(size.asInstanceOf[js.Any]).asInstanceOf[typings.av.AV.Buffer]
  }
  
  @JSImport("av", "BufferList")
  @js.native
  open class BufferList ()
    extends StObject
       with typings.av.AV.BufferList {
    
    /* CompleteClass */
    override def advance(): Boolean = js.native
    
    /* CompleteClass */
    override def append(buffer: typings.av.AV.Buffer): Unit = js.native
    
    /* CompleteClass */
    var availableBuffers: Double = js.native
    
    /* CompleteClass */
    var availableBytes: Double = js.native
    
    /* CompleteClass */
    override def copy(): typings.av.AV.BufferList = js.native
    
    /* CompleteClass */
    var first: typings.av.AV.Buffer | Null = js.native
    
    /* CompleteClass */
    var last: typings.av.AV.Buffer | Null = js.native
    
    /* CompleteClass */
    var numBuffers: Double = js.native
    
    /* CompleteClass */
    override def reset(): Unit = js.native
    
    /* CompleteClass */
    override def rewind(): Boolean = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("av", "BufferSource")
  @js.native
  open class BufferSource protected ()
    extends StObject
       with Source {
    def this(input: BufferFormats) = this()
  }
  
  @JSImport("av", "Decoder")
  @js.native
  abstract class Decoder ()
    extends StObject
       with typings.av.AV.Decoder
  object Decoder {
    
    @JSImport("av", "Decoder")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def find(id: String): typings.av.AV.Decoder | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("find")(id.asInstanceOf[js.Any]).asInstanceOf[typings.av.AV.Decoder | Null]
    
    /* static member */
    inline def register(id: String, decoder: Instantiable0[typings.av.AV.Decoder]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("register")(id.asInstanceOf[js.Any], decoder.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @JSImport("av", "Demuxer")
  @js.native
  abstract class Demuxer ()
    extends StObject
       with typings.av.AV.Demuxer
  object Demuxer {
    
    @JSImport("av", "Demuxer")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def find(buffer: typings.av.AV.Buffer): typings.av.AV.Demuxer | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("find")(buffer.asInstanceOf[js.Any]).asInstanceOf[typings.av.AV.Demuxer | Null]
    
    /* static member */
    inline def register(demuxer: DemuxerConstructor): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("register")(demuxer.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @JSImport("av", "EventEmitter")
  @js.native
  open class EventEmitter ()
    extends StObject
       with typings.av.AV.EventEmitter {
    
    /* CompleteClass */
    override def emit(event: String, args: Any*): Unit = js.native
    
    /* CompleteClass */
    override def off(event: String, fn: js.Function1[/* repeated */ Any, Unit]): Unit = js.native
    
    /* CompleteClass */
    override def on(event: String, fn: js.Function1[/* repeated */ Any, Unit]): Unit = js.native
    
    /* CompleteClass */
    override def once(event: String, fn: js.Function1[/* repeated */ Any, Unit]): Unit = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("av", "FileSource")
  @js.native
  open class FileSource protected ()
    extends StObject
       with Source {
    def this(file: File) = this()
  }
  
  @JSImport("av", "Filter")
  @js.native
  open class Filter ()
    extends StObject
       with typings.av.AV.Filter {
    def this(context: js.Object, key: String) = this()
    
    /* CompleteClass */
    override def process(buffer: TypedArray): Unit = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("av", "HTTPSource")
  @js.native
  open class HTTPSource protected ()
    extends StObject
       with Source {
    def this(url: String) = this()
    def this(url: String, opts: HttpSourceOpts) = this()
  }
  
  @JSImport("av", "Player")
  @js.native
  open class Player protected ()
    extends StObject
       with typings.av.AV.Player {
    def this(asset: typings.av.AV.Asset) = this()
  }
  object Player {
    
    @JSImport("av", "Player")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def fromBuffer(buffer: BufferFormats): typings.av.AV.Player = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(buffer.asInstanceOf[js.Any]).asInstanceOf[typings.av.AV.Player]
    
    /* static member */
    inline def fromFile(file: File): typings.av.AV.Player = ^.asInstanceOf[js.Dynamic].applyDynamic("fromFile")(file.asInstanceOf[js.Any]).asInstanceOf[typings.av.AV.Player]
    
    /* static member */
    inline def fromURL(url: String): typings.av.AV.Player = ^.asInstanceOf[js.Dynamic].applyDynamic("fromURL")(url.asInstanceOf[js.Any]).asInstanceOf[typings.av.AV.Player]
    inline def fromURL(url: String, opts: HttpSourceOpts): typings.av.AV.Player = (^.asInstanceOf[js.Dynamic].applyDynamic("fromURL")(url.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.av.AV.Player]
  }
  
  @JSImport("av", "Stream")
  @js.native
  open class Stream protected ()
    extends StObject
       with typings.av.AV.Stream {
    def this(list: typings.av.AV.BufferList) = this()
  }
  object Stream {
    
    @JSImport("av", "Stream")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def fromBuffer(buffer: typings.av.AV.Buffer): typings.av.AV.Stream = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(buffer.asInstanceOf[js.Any]).asInstanceOf[typings.av.AV.Stream]
  }
  
  @JSImport("av", "UnderflowError")
  @js.native
  open class UnderflowError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("av", "VolumeFilter")
  @js.native
  open class VolumeFilter ()
    extends StObject
       with typings.av.AV.Filter {
    
    /* CompleteClass */
    override def process(buffer: TypedArray): Unit = js.native
  }
}
