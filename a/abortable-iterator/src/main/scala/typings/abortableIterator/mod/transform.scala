package typings.abortableIterator.mod

import typings.std.AbortSignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("abortable-iterator", "transform")
@js.native
object transform extends js.Object {
  
  def apply[TSourceIn, TSourceOut](transform: Transform_[TSourceIn, TSourceOut]): Transform_[TSourceIn, TSourceOut] = js.native
  def apply[TSourceIn, TSourceOut](
    transform: Transform_[TSourceIn, TSourceOut],
    signal: js.UndefOr[scala.Nothing],
    options: Options[TSourceIn]
  ): Transform_[TSourceIn, TSourceOut] = js.native
  def apply[TSourceIn, TSourceOut](transform: Transform_[TSourceIn, TSourceOut], signals: Signals[TSourceIn]): Transform_[TSourceIn, TSourceOut] = js.native
  def apply[TSourceIn, TSourceOut](transform: Transform_[TSourceIn, TSourceOut], signal: AbortSignal): Transform_[TSourceIn, TSourceOut] = js.native
  def apply[TSourceIn, TSourceOut](transform: Transform_[TSourceIn, TSourceOut], signal: AbortSignal, options: Options[TSourceIn]): Transform_[TSourceIn, TSourceOut] = js.native
}
