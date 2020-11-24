package typings.abortableIterator.mod

import typings.std.AbortSignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("abortable-iterator", "sink")
@js.native
object sink extends js.Object {
  
  def apply[TSource, TReturn](sink: Sink_[TSource, TReturn]): Sink_[TSource, TReturn] = js.native
  def apply[TSource, TReturn](sink: Sink_[TSource, TReturn], signal: js.UndefOr[scala.Nothing], options: Options[TSource]): Sink_[TSource, TReturn] = js.native
  def apply[TSource, TReturn](sink: Sink_[TSource, TReturn], signals: Signals[TSource]): Sink_[TSource, TReturn] = js.native
  def apply[TSource, TReturn](sink: Sink_[TSource, TReturn], signal: AbortSignal): Sink_[TSource, TReturn] = js.native
  def apply[TSource, TReturn](sink: Sink_[TSource, TReturn], signal: AbortSignal, options: Options[TSource]): Sink_[TSource, TReturn] = js.native
}
