package typings.abortableIterator

import typings.abortableIterator.abortableIteratorStrings.aborted
import typings.std.AbortSignal
import typings.std.AsyncIterable
import typings.std.Error
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("abortable-iterator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](source: Source_[T]): AsyncIterable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any]).asInstanceOf[AsyncIterable[T]]
  inline def default[T](source: Source_[T], signal: Unit, options: Options[T]): AsyncIterable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any], signal.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncIterable[T]]
  inline def default[T](source: Source_[T], signals: Signals[T]): AsyncIterable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any], signals.asInstanceOf[js.Any])).asInstanceOf[AsyncIterable[T]]
  inline def default[T](source: Source_[T], signal: AbortSignal): AsyncIterable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any], signal.asInstanceOf[js.Any])).asInstanceOf[AsyncIterable[T]]
  inline def default[T](source: Source_[T], signal: AbortSignal, options: Options[T]): AsyncIterable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any], signal.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncIterable[T]]
  
  @JSImport("abortable-iterator", "AbortError")
  @js.native
  class AbortError ()
    extends StObject
       with Error {
    def this(message: String) = this()
    def this(message: String, code: String) = this()
    def this(message: Unit, code: String) = this()
    
    var code: String = js.native
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    var `type`: aborted = js.native
  }
  
  inline def duplex[TSource, TSinkSource, TSinkReturn](duplex: Duplex_[TSource, TSinkSource, TSinkReturn]): Duplex_[TSource, TSinkSource, TSinkReturn] = ^.asInstanceOf[js.Dynamic].applyDynamic("duplex")(duplex.asInstanceOf[js.Any]).asInstanceOf[Duplex_[TSource, TSinkSource, TSinkReturn]]
  inline def duplex[TSource, TSinkSource, TSinkReturn](duplex: Duplex_[TSource, TSinkSource, TSinkReturn], signal: Unit, options: Options[TSource]): Duplex_[TSource, TSinkSource, TSinkReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("duplex")(duplex.asInstanceOf[js.Any], signal.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Duplex_[TSource, TSinkSource, TSinkReturn]]
  inline def duplex[TSource, TSinkSource, TSinkReturn](duplex: Duplex_[TSource, TSinkSource, TSinkReturn], signals: Signals[TSource]): Duplex_[TSource, TSinkSource, TSinkReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("duplex")(duplex.asInstanceOf[js.Any], signals.asInstanceOf[js.Any])).asInstanceOf[Duplex_[TSource, TSinkSource, TSinkReturn]]
  inline def duplex[TSource, TSinkSource, TSinkReturn](duplex: Duplex_[TSource, TSinkSource, TSinkReturn], signal: AbortSignal): Duplex_[TSource, TSinkSource, TSinkReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("duplex")(duplex.asInstanceOf[js.Any], signal.asInstanceOf[js.Any])).asInstanceOf[Duplex_[TSource, TSinkSource, TSinkReturn]]
  inline def duplex[TSource, TSinkSource, TSinkReturn](duplex: Duplex_[TSource, TSinkSource, TSinkReturn], signal: AbortSignal, options: Options[TSource]): Duplex_[TSource, TSinkSource, TSinkReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("duplex")(duplex.asInstanceOf[js.Any], signal.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Duplex_[TSource, TSinkSource, TSinkReturn]]
  
  inline def sink[TSource, TReturn](sink: Sink_[TSource, TReturn]): Sink_[TSource, TReturn] = ^.asInstanceOf[js.Dynamic].applyDynamic("sink")(sink.asInstanceOf[js.Any]).asInstanceOf[Sink_[TSource, TReturn]]
  inline def sink[TSource, TReturn](sink: Sink_[TSource, TReturn], signal: Unit, options: Options[TSource]): Sink_[TSource, TReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("sink")(sink.asInstanceOf[js.Any], signal.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Sink_[TSource, TReturn]]
  inline def sink[TSource, TReturn](sink: Sink_[TSource, TReturn], signals: Signals[TSource]): Sink_[TSource, TReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("sink")(sink.asInstanceOf[js.Any], signals.asInstanceOf[js.Any])).asInstanceOf[Sink_[TSource, TReturn]]
  inline def sink[TSource, TReturn](sink: Sink_[TSource, TReturn], signal: AbortSignal): Sink_[TSource, TReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("sink")(sink.asInstanceOf[js.Any], signal.asInstanceOf[js.Any])).asInstanceOf[Sink_[TSource, TReturn]]
  inline def sink[TSource, TReturn](sink: Sink_[TSource, TReturn], signal: AbortSignal, options: Options[TSource]): Sink_[TSource, TReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("sink")(sink.asInstanceOf[js.Any], signal.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Sink_[TSource, TReturn]]
  
  inline def source[T](source: Source_[T]): AsyncIterable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("source")(source.asInstanceOf[js.Any]).asInstanceOf[AsyncIterable[T]]
  inline def source[T](source: Source_[T], signal: Unit, options: Options[T]): AsyncIterable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("source")(source.asInstanceOf[js.Any], signal.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncIterable[T]]
  inline def source[T](source: Source_[T], signals: Signals[T]): AsyncIterable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("source")(source.asInstanceOf[js.Any], signals.asInstanceOf[js.Any])).asInstanceOf[AsyncIterable[T]]
  inline def source[T](source: Source_[T], signal: AbortSignal): AsyncIterable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("source")(source.asInstanceOf[js.Any], signal.asInstanceOf[js.Any])).asInstanceOf[AsyncIterable[T]]
  inline def source[T](source: Source_[T], signal: AbortSignal, options: Options[T]): AsyncIterable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("source")(source.asInstanceOf[js.Any], signal.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncIterable[T]]
  
  inline def transform[TSourceIn, TSourceOut](transform: Transform_[TSourceIn, TSourceOut]): Transform_[TSourceIn, TSourceOut] = ^.asInstanceOf[js.Dynamic].applyDynamic("transform")(transform.asInstanceOf[js.Any]).asInstanceOf[Transform_[TSourceIn, TSourceOut]]
  inline def transform[TSourceIn, TSourceOut](transform: Transform_[TSourceIn, TSourceOut], signal: Unit, options: Options[TSourceIn]): Transform_[TSourceIn, TSourceOut] = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(transform.asInstanceOf[js.Any], signal.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Transform_[TSourceIn, TSourceOut]]
  inline def transform[TSourceIn, TSourceOut](transform: Transform_[TSourceIn, TSourceOut], signals: Signals[TSourceIn]): Transform_[TSourceIn, TSourceOut] = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(transform.asInstanceOf[js.Any], signals.asInstanceOf[js.Any])).asInstanceOf[Transform_[TSourceIn, TSourceOut]]
  inline def transform[TSourceIn, TSourceOut](transform: Transform_[TSourceIn, TSourceOut], signal: AbortSignal): Transform_[TSourceIn, TSourceOut] = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(transform.asInstanceOf[js.Any], signal.asInstanceOf[js.Any])).asInstanceOf[Transform_[TSourceIn, TSourceOut]]
  inline def transform[TSourceIn, TSourceOut](transform: Transform_[TSourceIn, TSourceOut], signal: AbortSignal, options: Options[TSourceIn]): Transform_[TSourceIn, TSourceOut] = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(transform.asInstanceOf[js.Any], signal.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Transform_[TSourceIn, TSourceOut]]
  
  trait Duplex_[TSource, TSinkSource, TSinkReturn] extends StObject {
    
    def sink(source: Source_[TSinkSource]): TSinkReturn
    @JSName("sink")
    var sink_Original: Sink_[TSinkSource, TSinkReturn]
    
    var source: Source_[TSource]
  }
  object Duplex_ {
    
    inline def apply[TSource, TSinkSource, TSinkReturn](sink: /* source */ Source_[TSinkSource] => TSinkReturn, source: Source_[TSource]): Duplex_[TSource, TSinkSource, TSinkReturn] = {
      val __obj = js.Dynamic.literal(sink = js.Any.fromFunction1(sink), source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[Duplex_[TSource, TSinkSource, TSinkReturn]]
    }
    
    extension [Self <: Duplex_[?, ?, ?], TSource, TSinkSource, TSinkReturn](x: Self & (Duplex_[TSource, TSinkSource, TSinkReturn])) {
      
      inline def setSink(value: /* source */ Source_[TSinkSource] => TSinkReturn): Self = StObject.set(x, "sink", js.Any.fromFunction1(value))
      
      inline def setSource(value: Source_[TSource]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options[T] extends StObject {
    
    var abortCode: js.UndefOr[String] = js.undefined
    
    var abortMessage: js.UndefOr[String] = js.undefined
    
    var onAbort: js.UndefOr[js.Function1[/* source */ Source_[T], Unit]] = js.undefined
    
    var returnOnAbort: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply[T](): Options[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[T]]
    }
    
    extension [Self <: Options[?], T](x: Self & Options[T]) {
      
      inline def setAbortCode(value: String): Self = StObject.set(x, "abortCode", value.asInstanceOf[js.Any])
      
      inline def setAbortCodeUndefined: Self = StObject.set(x, "abortCode", js.undefined)
      
      inline def setAbortMessage(value: String): Self = StObject.set(x, "abortMessage", value.asInstanceOf[js.Any])
      
      inline def setAbortMessageUndefined: Self = StObject.set(x, "abortMessage", js.undefined)
      
      inline def setOnAbort(value: /* source */ Source_[T] => Unit): Self = StObject.set(x, "onAbort", js.Any.fromFunction1(value))
      
      inline def setOnAbortUndefined: Self = StObject.set(x, "onAbort", js.undefined)
      
      inline def setReturnOnAbort(value: Boolean): Self = StObject.set(x, "returnOnAbort", value.asInstanceOf[js.Any])
      
      inline def setReturnOnAbortUndefined: Self = StObject.set(x, "returnOnAbort", js.undefined)
    }
  }
  
  type Signals[T] = js.Array[typings.abortableIterator.anon.Options[T]]
  
  type Sink_[TSource, TReturn] = js.Function1[/* source */ Source_[TSource], TReturn]
  
  type Source_[T] = AsyncIterable[T] | Iterable[T]
  
  type Transform_[TSourceIn, TSourceOut] = js.Function1[/* source */ Source_[TSourceIn], Source_[TSourceOut]]
}
