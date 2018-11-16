package typings
package androiduixLib.androidNs.graphicsNs.PaintNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Style extends js.Object

@JSGlobal("android.graphics.Paint.Style")
@js.native
object Style extends js.Object {
  @js.native
  sealed trait FILL
    extends androiduixLib.androidNs.graphicsNs.PaintNs.Style
  
  @js.native
  sealed trait FILL_AND_STROKE
    extends androiduixLib.androidNs.graphicsNs.PaintNs.Style
  
  @js.native
  sealed trait STROKE
    extends androiduixLib.androidNs.graphicsNs.PaintNs.Style
  
  /* 0 */ val FILL: FILL with scala.Double = js.native
  /* 2 */ val FILL_AND_STROKE: FILL_AND_STROKE with scala.Double = js.native
  /* 1 */ val STROKE: STROKE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[androiduixLib.androidNs.graphicsNs.PaintNs.Style with scala.Double] = js.native
}

