package typings
package androiduixLib.androidNs.graphicsNs.PaintNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Align extends js.Object

@JSGlobal("android.graphics.Paint.Align")
@js.native
object Align extends js.Object {
  @js.native
  sealed trait CENTER
    extends androiduixLib.androidNs.graphicsNs.PaintNs.Align
  
  @js.native
  sealed trait LEFT
    extends androiduixLib.androidNs.graphicsNs.PaintNs.Align
  
  @js.native
  sealed trait RIGHT
    extends androiduixLib.androidNs.graphicsNs.PaintNs.Align
  
  /* 1 */ val CENTER: CENTER with scala.Double = js.native
  /* 0 */ val LEFT: LEFT with scala.Double = js.native
  /* 2 */ val RIGHT: RIGHT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[androiduixLib.androidNs.graphicsNs.PaintNs.Align with scala.Double] = js.native
}

