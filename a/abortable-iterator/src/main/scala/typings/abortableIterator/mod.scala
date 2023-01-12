package typings.abortableIterator

import typings.abortableIterator.anon.Sink
import typings.itStreamTypes.mod.Duplex
import typings.itStreamTypes.mod.Source
import typings.std.AbortSignal
import typings.std.AsyncGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("abortable-iterator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("abortable-iterator", "AbortError")
  @js.native
  open class AbortError ()
    extends typings.abortableIterator.distSrcAbortErrorMod.AbortError {
    def this(message: String) = this()
    def this(message: String, code: String) = this()
    def this(message: Unit, code: String) = this()
  }
  
  inline def abortableDuplex[TSource, TSink, RSink](duplex: Duplex[TSource, TSink, RSink], signal: AbortSignal): Sink[TSink, RSink, TSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("abortableDuplex")(duplex.asInstanceOf[js.Any], signal.asInstanceOf[js.Any])).asInstanceOf[Sink[TSink, RSink, TSource]]
  inline def abortableDuplex[TSource, TSink, RSink](duplex: Duplex[TSource, TSink, RSink], signal: AbortSignal, options: Options[TSource]): Sink[TSink, RSink, TSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("abortableDuplex")(duplex.asInstanceOf[js.Any], signal.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Sink[TSink, RSink, TSource]]
  
  inline def abortableSink[T, R](sink: typings.itStreamTypes.mod.Sink[T, R], signal: AbortSignal): typings.itStreamTypes.mod.Sink[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("abortableSink")(sink.asInstanceOf[js.Any], signal.asInstanceOf[js.Any])).asInstanceOf[typings.itStreamTypes.mod.Sink[T, R]]
  inline def abortableSink[T, R](sink: typings.itStreamTypes.mod.Sink[T, R], signal: AbortSignal, options: Options[T]): typings.itStreamTypes.mod.Sink[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("abortableSink")(sink.asInstanceOf[js.Any], signal.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.itStreamTypes.mod.Sink[T, R]]
  
  inline def abortableSource[T](source: Source[T], signal: AbortSignal): AsyncGenerator[T, Unit, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("abortableSource")(source.asInstanceOf[js.Any], signal.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[T, Unit, Any]]
  inline def abortableSource[T](source: Source[T], signal: AbortSignal, options: Options[T]): AsyncGenerator[T, Unit, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("abortableSource")(source.asInstanceOf[js.Any], signal.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[T, Unit, Any]]
  
  inline def abortableTransform[T, R](sink: typings.itStreamTypes.mod.Sink[T, R], signal: AbortSignal): typings.itStreamTypes.mod.Sink[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("abortableTransform")(sink.asInstanceOf[js.Any], signal.asInstanceOf[js.Any])).asInstanceOf[typings.itStreamTypes.mod.Sink[T, R]]
  inline def abortableTransform[T, R](sink: typings.itStreamTypes.mod.Sink[T, R], signal: AbortSignal, options: Options[T]): typings.itStreamTypes.mod.Sink[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("abortableTransform")(sink.asInstanceOf[js.Any], signal.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.itStreamTypes.mod.Sink[T, R]]
  
  trait Options[T] extends StObject {
    
    var abortCode: js.UndefOr[String] = js.undefined
    
    var abortMessage: js.UndefOr[String] = js.undefined
    
    var onAbort: js.UndefOr[js.Function1[/* source */ Source[T], Unit]] = js.undefined
    
    var onReturnError: js.UndefOr[js.Function1[/* err */ js.Error, Unit]] = js.undefined
    
    var returnOnAbort: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply[T](): Options[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options[?], T] (val x: Self & Options[T]) extends AnyVal {
      
      inline def setAbortCode(value: String): Self = StObject.set(x, "abortCode", value.asInstanceOf[js.Any])
      
      inline def setAbortCodeUndefined: Self = StObject.set(x, "abortCode", js.undefined)
      
      inline def setAbortMessage(value: String): Self = StObject.set(x, "abortMessage", value.asInstanceOf[js.Any])
      
      inline def setAbortMessageUndefined: Self = StObject.set(x, "abortMessage", js.undefined)
      
      inline def setOnAbort(value: /* source */ Source[T] => Unit): Self = StObject.set(x, "onAbort", js.Any.fromFunction1(value))
      
      inline def setOnAbortUndefined: Self = StObject.set(x, "onAbort", js.undefined)
      
      inline def setOnReturnError(value: /* err */ js.Error => Unit): Self = StObject.set(x, "onReturnError", js.Any.fromFunction1(value))
      
      inline def setOnReturnErrorUndefined: Self = StObject.set(x, "onReturnError", js.undefined)
      
      inline def setReturnOnAbort(value: Boolean): Self = StObject.set(x, "returnOnAbort", value.asInstanceOf[js.Any])
      
      inline def setReturnOnAbortUndefined: Self = StObject.set(x, "returnOnAbort", js.undefined)
    }
  }
}
