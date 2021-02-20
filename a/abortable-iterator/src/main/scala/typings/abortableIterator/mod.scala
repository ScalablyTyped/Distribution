package typings.abortableIterator

import typings.abortableIterator.abortableIteratorStrings.aborted
import typings.std.AbortSignal
import typings.std.AsyncIterable
import typings.std.Error
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("abortable-iterator", JSImport.Default)
  @js.native
  def default[T](source: Source_[T]): AsyncIterable[T] = js.native
  @JSImport("abortable-iterator", JSImport.Default)
  @js.native
  def default[T](source: Source_[T], signal: js.UndefOr[scala.Nothing], options: Options[T]): AsyncIterable[T] = js.native
  @JSImport("abortable-iterator", JSImport.Default)
  @js.native
  def default[T](source: Source_[T], signals: Signals[T]): AsyncIterable[T] = js.native
  @JSImport("abortable-iterator", JSImport.Default)
  @js.native
  def default[T](source: Source_[T], signal: AbortSignal): AsyncIterable[T] = js.native
  @JSImport("abortable-iterator", JSImport.Default)
  @js.native
  def default[T](source: Source_[T], signal: AbortSignal, options: Options[T]): AsyncIterable[T] = js.native
  
  @JSImport("abortable-iterator", "AbortError")
  @js.native
  class AbortError () extends Error {
    def this(message: String) = this()
    def this(message: js.UndefOr[scala.Nothing], code: String) = this()
    def this(message: String, code: String) = this()
    
    var code: String = js.native
    
    var `type`: aborted = js.native
  }
  
  @JSImport("abortable-iterator", "duplex")
  @js.native
  def duplex[TSource, TSinkSource, TSinkReturn](duplex: Duplex_[TSource, TSinkSource, TSinkReturn]): Duplex_[TSource, TSinkSource, TSinkReturn] = js.native
  @JSImport("abortable-iterator", "duplex")
  @js.native
  def duplex[TSource, TSinkSource, TSinkReturn](
    duplex: Duplex_[TSource, TSinkSource, TSinkReturn],
    signal: js.UndefOr[scala.Nothing],
    options: Options[TSource]
  ): Duplex_[TSource, TSinkSource, TSinkReturn] = js.native
  @JSImport("abortable-iterator", "duplex")
  @js.native
  def duplex[TSource, TSinkSource, TSinkReturn](duplex: Duplex_[TSource, TSinkSource, TSinkReturn], signals: Signals[TSource]): Duplex_[TSource, TSinkSource, TSinkReturn] = js.native
  @JSImport("abortable-iterator", "duplex")
  @js.native
  def duplex[TSource, TSinkSource, TSinkReturn](duplex: Duplex_[TSource, TSinkSource, TSinkReturn], signal: AbortSignal): Duplex_[TSource, TSinkSource, TSinkReturn] = js.native
  @JSImport("abortable-iterator", "duplex")
  @js.native
  def duplex[TSource, TSinkSource, TSinkReturn](duplex: Duplex_[TSource, TSinkSource, TSinkReturn], signal: AbortSignal, options: Options[TSource]): Duplex_[TSource, TSinkSource, TSinkReturn] = js.native
  
  @JSImport("abortable-iterator", "sink")
  @js.native
  def sink[TSource, TReturn](sink: Sink_[TSource, TReturn]): Sink_[TSource, TReturn] = js.native
  @JSImport("abortable-iterator", "sink")
  @js.native
  def sink[TSource, TReturn](sink: Sink_[TSource, TReturn], signal: js.UndefOr[scala.Nothing], options: Options[TSource]): Sink_[TSource, TReturn] = js.native
  @JSImport("abortable-iterator", "sink")
  @js.native
  def sink[TSource, TReturn](sink: Sink_[TSource, TReturn], signals: Signals[TSource]): Sink_[TSource, TReturn] = js.native
  @JSImport("abortable-iterator", "sink")
  @js.native
  def sink[TSource, TReturn](sink: Sink_[TSource, TReturn], signal: AbortSignal): Sink_[TSource, TReturn] = js.native
  @JSImport("abortable-iterator", "sink")
  @js.native
  def sink[TSource, TReturn](sink: Sink_[TSource, TReturn], signal: AbortSignal, options: Options[TSource]): Sink_[TSource, TReturn] = js.native
  
  @JSImport("abortable-iterator", "source")
  @js.native
  def source[T](source: Source_[T]): AsyncIterable[T] = js.native
  @JSImport("abortable-iterator", "source")
  @js.native
  def source[T](source: Source_[T], signal: js.UndefOr[scala.Nothing], options: Options[T]): AsyncIterable[T] = js.native
  @JSImport("abortable-iterator", "source")
  @js.native
  def source[T](source: Source_[T], signals: Signals[T]): AsyncIterable[T] = js.native
  @JSImport("abortable-iterator", "source")
  @js.native
  def source[T](source: Source_[T], signal: AbortSignal): AsyncIterable[T] = js.native
  @JSImport("abortable-iterator", "source")
  @js.native
  def source[T](source: Source_[T], signal: AbortSignal, options: Options[T]): AsyncIterable[T] = js.native
  
  @JSImport("abortable-iterator", "transform")
  @js.native
  def transform[TSourceIn, TSourceOut](transform: Transform_[TSourceIn, TSourceOut]): Transform_[TSourceIn, TSourceOut] = js.native
  @JSImport("abortable-iterator", "transform")
  @js.native
  def transform[TSourceIn, TSourceOut](
    transform: Transform_[TSourceIn, TSourceOut],
    signal: js.UndefOr[scala.Nothing],
    options: Options[TSourceIn]
  ): Transform_[TSourceIn, TSourceOut] = js.native
  @JSImport("abortable-iterator", "transform")
  @js.native
  def transform[TSourceIn, TSourceOut](transform: Transform_[TSourceIn, TSourceOut], signals: Signals[TSourceIn]): Transform_[TSourceIn, TSourceOut] = js.native
  @JSImport("abortable-iterator", "transform")
  @js.native
  def transform[TSourceIn, TSourceOut](transform: Transform_[TSourceIn, TSourceOut], signal: AbortSignal): Transform_[TSourceIn, TSourceOut] = js.native
  @JSImport("abortable-iterator", "transform")
  @js.native
  def transform[TSourceIn, TSourceOut](transform: Transform_[TSourceIn, TSourceOut], signal: AbortSignal, options: Options[TSourceIn]): Transform_[TSourceIn, TSourceOut] = js.native
  
  @js.native
  trait Duplex_[TSource, TSinkSource, TSinkReturn] extends StObject {
    
    def sink(source: Source_[TSinkSource]): TSinkReturn = js.native
    @JSName("sink")
    var sink_Original: Sink_[TSinkSource, TSinkReturn] = js.native
    
    var source: Source_[TSource] = js.native
  }
  
  @js.native
  trait Options[T] extends StObject {
    
    var abortCode: js.UndefOr[String] = js.native
    
    var abortMessage: js.UndefOr[String] = js.native
    
    var onAbort: js.UndefOr[js.Function1[/* source */ Source_[T], Unit]] = js.native
    
    var returnOnAbort: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply[T](): Options[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[T]]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options[_], T] (val x: Self with Options[T]) extends AnyVal {
      
      @scala.inline
      def setAbortCode(value: String): Self = StObject.set(x, "abortCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAbortCodeUndefined: Self = StObject.set(x, "abortCode", js.undefined)
      
      @scala.inline
      def setAbortMessage(value: String): Self = StObject.set(x, "abortMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAbortMessageUndefined: Self = StObject.set(x, "abortMessage", js.undefined)
      
      @scala.inline
      def setOnAbort(value: /* source */ Source_[T] => Unit): Self = StObject.set(x, "onAbort", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAbortUndefined: Self = StObject.set(x, "onAbort", js.undefined)
      
      @scala.inline
      def setReturnOnAbort(value: Boolean): Self = StObject.set(x, "returnOnAbort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturnOnAbortUndefined: Self = StObject.set(x, "returnOnAbort", js.undefined)
    }
  }
  
  type Signals[T] = js.Array[typings.abortableIterator.anon.Options[T]]
  
  type Sink_[TSource, TReturn] = js.Function1[/* source */ Source_[TSource], TReturn]
  
  type Source_[T] = AsyncIterable[T] | Iterable[T]
  
  type Transform_[TSourceIn, TSourceOut] = js.Function1[/* source */ Source_[TSourceIn], Source_[TSourceOut]]
}
