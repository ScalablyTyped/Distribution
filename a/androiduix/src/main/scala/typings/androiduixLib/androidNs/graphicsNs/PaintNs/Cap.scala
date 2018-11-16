package typings
package androiduixLib.androidNs.graphicsNs.PaintNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Cap extends js.Object

@JSGlobal("android.graphics.Paint.Cap")
@js.native
object Cap extends js.Object {
  @js.native
  sealed trait BUTT
    extends androiduixLib.androidNs.graphicsNs.PaintNs.Cap
  
  @js.native
  sealed trait ROUND
    extends androiduixLib.androidNs.graphicsNs.PaintNs.Cap
  
  @js.native
  sealed trait SQUARE
    extends androiduixLib.androidNs.graphicsNs.PaintNs.Cap
  
  /* 0 */ val BUTT: BUTT with scala.Double = js.native
  /* 1 */ val ROUND: ROUND with scala.Double = js.native
  /* 2 */ val SQUARE: SQUARE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[androiduixLib.androidNs.graphicsNs.PaintNs.Cap with scala.Double] = js.native
}

