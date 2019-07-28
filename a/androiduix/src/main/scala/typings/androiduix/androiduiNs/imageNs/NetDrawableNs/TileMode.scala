package typings.androiduix.androiduiNs.imageNs.NetDrawableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TileMode extends js.Object

@JSGlobal("androidui.image.NetDrawable.TileMode")
@js.native
object TileMode extends js.Object {
  @js.native
  sealed trait DEFAULT extends TileMode
  
  @js.native
  sealed trait REPEAT extends TileMode
  
  /* 0 */ val DEFAULT: typings.androiduix.androiduiNs.imageNs.NetDrawableNs.TileMode.DEFAULT with Double = js.native
  /* 1 */ val REPEAT: typings.androiduix.androiduiNs.imageNs.NetDrawableNs.TileMode.REPEAT with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TileMode with Double] = js.native
}

