package typings
package androiduixLib.androidNs.graphicsNs.PaintNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Join extends js.Object

@JSGlobal("android.graphics.Paint.Join")
@js.native
object Join extends js.Object {
  @js.native
  sealed trait BEVEL
    extends androiduixLib.androidNs.graphicsNs.PaintNs.Join
  
  @js.native
  sealed trait MITER
    extends androiduixLib.androidNs.graphicsNs.PaintNs.Join
  
  @js.native
  sealed trait ROUND
    extends androiduixLib.androidNs.graphicsNs.PaintNs.Join
  
  /* 2 */ val BEVEL: BEVEL with scala.Double = js.native
  /* 0 */ val MITER: MITER with scala.Double = js.native
  /* 1 */ val ROUND: ROUND with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[androiduixLib.androidNs.graphicsNs.PaintNs.Join with scala.Double] = js.native
}

