package typings.abortableIterator.mod

import typings.std.AbortSignal
import typings.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("abortable-iterator", "source")
@js.native
object source extends js.Object {
  
  def apply[T](source: Source_[T]): AsyncIterable[T] = js.native
  def apply[T](source: Source_[T], signal: js.UndefOr[scala.Nothing], options: Options[T]): AsyncIterable[T] = js.native
  def apply[T](source: Source_[T], signals: Signals[T]): AsyncIterable[T] = js.native
  def apply[T](source: Source_[T], signal: AbortSignal): AsyncIterable[T] = js.native
  def apply[T](source: Source_[T], signal: AbortSignal, options: Options[T]): AsyncIterable[T] = js.native
}
