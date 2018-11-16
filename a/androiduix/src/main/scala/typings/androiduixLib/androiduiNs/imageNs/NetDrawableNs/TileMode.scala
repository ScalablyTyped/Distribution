package typings
package androiduixLib.androiduiNs.imageNs.NetDrawableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TileMode extends js.Object

@JSGlobal("androidui.image.NetDrawable.TileMode")
@js.native
object TileMode extends js.Object {
  @js.native
  sealed trait DEFAULT
    extends androiduixLib.androiduiNs.imageNs.NetDrawableNs.TileMode
  
  @js.native
  sealed trait REPEAT
    extends androiduixLib.androiduiNs.imageNs.NetDrawableNs.TileMode
  
  /* 0 */ val DEFAULT: DEFAULT with scala.Double = js.native
  /* 1 */ val REPEAT: REPEAT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[androiduixLib.androiduiNs.imageNs.NetDrawableNs.TileMode with scala.Double] = js.native
}

