package typings.akamaiEdgeworkers

import typings.akamaiEdgeworkers.EW.QueuingStrategy
import typings.akamaiEdgeworkers.EW.ReadableStreamDefaultControllerEW
import typings.akamaiEdgeworkers.EW.ReadableStreamEW
import typings.akamaiEdgeworkers.EW.UnderlyingSink
import typings.akamaiEdgeworkers.EW.UnderlyingSource
import typings.akamaiEdgeworkers.EW.WritableStreamEW
import typings.akamaiEdgeworkers.akamaiEdgeworkersInts.`1`
import typings.akamaiEdgeworkers.anon.HighWaterMark
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides implementations of the [WHATWG Streams Standard].
  *
  * [WHATWG Streams Standard]: https://streams.spec.whatwg.org
  */
object streamsMod {
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("streams", "ByteLengthQueuingStrategy")
  @js.native
  open class ByteLengthQueuingStrategyCls protected ()
    extends StObject
       with ByteLengthQueuingStrategy {
    def this(options: HighWaterMark) = this()
    
    /* CompleteClass */
    @JSName("highWaterMark")
    var highWaterMark_ByteLengthQueuingStrategy: Double = js.native
    
    /* CompleteClass */
    @JSName("size")
    override def size_MByteLengthQueuingStrategy(chunk: js.typedarray.ArrayBufferView): Double = js.native
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("streams", "ReadableStream")
  @js.native
  open class ReadableStreamCls[R] ()
    extends StObject
       with ReadableStreamEW[Any] {
    def this(underlyingSource: UnderlyingSource[R]) = this()
    def this(underlyingSource: Unit, strategy: QueuingStrategy[R]) = this()
    def this(underlyingSource: UnderlyingSource[R], strategy: QueuingStrategy[R]) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("streams", "TransformStream")
  @js.native
  open class TransformStreamCls[I, O] ()
    extends StObject
       with TransformStream[I, O] {
    def this(transformer: Transformer[I, O]) = this()
    def this(transformer: Unit, writableStrategy: QueuingStrategy[I]) = this()
    def this(transformer: Transformer[I, O], writableStrategy: QueuingStrategy[I]) = this()
    def this(transformer: Unit, writableStrategy: Unit, readableStrategy: QueuingStrategy[O]) = this()
    def this(transformer: Unit, writableStrategy: QueuingStrategy[I], readableStrategy: QueuingStrategy[O]) = this()
    def this(transformer: Transformer[I, O], writableStrategy: Unit, readableStrategy: QueuingStrategy[O]) = this()
    def this(
      transformer: Transformer[I, O],
      writableStrategy: QueuingStrategy[I],
      readableStrategy: QueuingStrategy[O]
    ) = this()
    
    /* CompleteClass */
    override val readable: ReadableStream[O] = js.native
    
    /* CompleteClass */
    override val writable: WritableStream[I] = js.native
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("streams", "WritableStream")
  @js.native
  open class WritableStreamCls[W] ()
    extends StObject
       with WritableStreamEW[Any] {
    def this(underlyingSink: UnderlyingSink[W]) = this()
    def this(underlyingSink: Unit, strategy: QueuingStrategy[W]) = this()
    def this(underlyingSink: UnderlyingSink[W], strategy: QueuingStrategy[W]) = this()
  }
  
  trait ByteLengthQueuingStrategy
    extends StObject
       with QueuingStrategy[js.typedarray.ArrayBufferView] {
    
    @JSName("highWaterMark")
    var highWaterMark_ByteLengthQueuingStrategy: Double
    
    @JSName("size")
    def size_MByteLengthQueuingStrategy(chunk: js.typedarray.ArrayBufferView): Double
  }
  object ByteLengthQueuingStrategy {
    
    inline def apply(highWaterMark: Double, size: js.typedarray.ArrayBufferView => Double): ByteLengthQueuingStrategy = {
      val __obj = js.Dynamic.literal(highWaterMark = highWaterMark.asInstanceOf[js.Any], size = js.Any.fromFunction1(size))
      __obj.asInstanceOf[ByteLengthQueuingStrategy]
    }
    
    extension [Self <: ByteLengthQueuingStrategy](x: Self) {
      
      inline def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
      
      inline def setSize(value: js.typedarray.ArrayBufferView => Double): Self = StObject.set(x, "size", js.Any.fromFunction1(value))
    }
  }
  
  trait CountQueuingStrategy extends StObject {
    
    var highWaterMark: Double
    
    def size(chunk: Any): `1`
  }
  object CountQueuingStrategy {
    
    inline def apply(highWaterMark: Double, size: Any => `1`): CountQueuingStrategy = {
      val __obj = js.Dynamic.literal(highWaterMark = highWaterMark.asInstanceOf[js.Any], size = js.Any.fromFunction1(size))
      __obj.asInstanceOf[CountQueuingStrategy]
    }
    
    extension [Self <: CountQueuingStrategy](x: Self) {
      
      inline def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Any => `1`): Self = StObject.set(x, "size", js.Any.fromFunction1(value))
    }
  }
  
  type ReadableStream[R] = ReadableStreamEW[Any]
  
  type ReadableStreamDefaultController[R] = ReadableStreamDefaultControllerEW[Any]
  
  trait TransformStream[I, O] extends StObject {
    
    val readable: ReadableStream[O]
    
    val writable: WritableStream[I]
  }
  object TransformStream {
    
    inline def apply[I, O](readable: ReadableStream[O], writable: WritableStream[I]): TransformStream[I, O] = {
      val __obj = js.Dynamic.literal(readable = readable.asInstanceOf[js.Any], writable = writable.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransformStream[I, O]]
    }
    
    extension [Self <: TransformStream[?, ?], I, O](x: Self & (TransformStream[I, O])) {
      
      inline def setReadable(value: ReadableStream[O]): Self = StObject.set(x, "readable", value.asInstanceOf[js.Any])
      
      inline def setWritable(value: WritableStream[I]): Self = StObject.set(x, "writable", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TransformStreamDefaultController[O] extends StObject {
    
    val desiredSize: Double | Null = js.native
    
    def enqueue(chunk: O): Unit = js.native
    
    def error(): Unit = js.native
    def error(reason: Any): Unit = js.native
    
    def terminate(): Unit = js.native
  }
  
  trait Transformer[I, O] extends StObject {
    
    var flush: js.UndefOr[TransformerFlushCallback[O]] = js.undefined
    
    var readableType: Unit
    
    var start: js.UndefOr[TransformerStartCallback[O]] = js.undefined
    
    var transform: js.UndefOr[TransformerTransformCallback[I, O]] = js.undefined
    
    var writableType: Unit
  }
  object Transformer {
    
    inline def apply[I, O](readableType: Unit, writableType: Unit): Transformer[I, O] = {
      val __obj = js.Dynamic.literal(readableType = readableType.asInstanceOf[js.Any], writableType = writableType.asInstanceOf[js.Any])
      __obj.asInstanceOf[Transformer[I, O]]
    }
    
    extension [Self <: Transformer[?, ?], I, O](x: Self & (Transformer[I, O])) {
      
      inline def setFlush(value: /* controller */ TransformStreamDefaultController[O] => Unit | js.Promise[Unit]): Self = StObject.set(x, "flush", js.Any.fromFunction1(value))
      
      inline def setFlushUndefined: Self = StObject.set(x, "flush", js.undefined)
      
      inline def setReadableType(value: Unit): Self = StObject.set(x, "readableType", value.asInstanceOf[js.Any])
      
      inline def setStart(value: /* controller */ TransformStreamDefaultController[O] => Unit | js.Promise[Unit]): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      inline def setTransform(value: (I, /* controller */ TransformStreamDefaultController[O]) => Unit | js.Promise[Unit]): Self = StObject.set(x, "transform", js.Any.fromFunction2(value))
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      inline def setWritableType(value: Unit): Self = StObject.set(x, "writableType", value.asInstanceOf[js.Any])
    }
  }
  
  type TransformerFlushCallback[O] = js.Function1[/* controller */ TransformStreamDefaultController[O], Unit | js.Promise[Unit]]
  
  type TransformerStartCallback[O] = js.Function1[/* controller */ TransformStreamDefaultController[O], Unit | js.Promise[Unit]]
  
  type TransformerTransformCallback[I, O] = js.Function2[
    /* chunk */ I, 
    /* controller */ TransformStreamDefaultController[O], 
    Unit | js.Promise[Unit]
  ]
  
  type WritableStream[R] = WritableStreamEW[Any]
}
