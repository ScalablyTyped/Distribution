package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RectanglePoint extends js.Object

/** specifies one of nine points in a rectangle. */
@JSGlobal("com.sun.star.drawing.RectanglePoint")
@js.native
object RectanglePoint extends js.Object {
  /** specify to the point on the bottom of the left side from the rectangle. */
  @js.native
  sealed trait LEFT_BOTTOM
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.RectanglePoint
  
  /** specify to the point on the middle of the left side from the rectangle. */
  @js.native
  sealed trait LEFT_MIDDLE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.RectanglePoint
  
  /** specify to the point on the left side from the top of the rectangle. */
  @js.native
  sealed trait LEFT_TOP
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.RectanglePoint
  
  /** specify to the point on the middle of the bottom from the rectangle. */
  @js.native
  sealed trait MIDDLE_BOTTOM
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.RectanglePoint
  
  /** specify to the point on the center from the rectangle. */
  @js.native
  sealed trait MIDDLE_MIDDLE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.RectanglePoint
  
  /** specify to the point on the middle of the top from the rectangle. */
  @js.native
  sealed trait MIDDLE_TOP
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.RectanglePoint
  
  /** specify to the point on the bottom of the right side from the rectangle. */
  @js.native
  sealed trait RIGHT_BOTTOM
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.RectanglePoint
  
  /** specify to the point on the middle of the right side from the rectangle. */
  @js.native
  sealed trait RIGHT_MIDDLE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.RectanglePoint
  
  /** specify to the point on the right side from the top of the rectangle. */
  @js.native
  sealed trait RIGHT_TOP
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.RectanglePoint
  
  /* 6 */ val LEFT_BOTTOM: LEFT_BOTTOM with scala.Double = js.native
  /* 3 */ val LEFT_MIDDLE: LEFT_MIDDLE with scala.Double = js.native
  /* 0 */ val LEFT_TOP: LEFT_TOP with scala.Double = js.native
  /* 7 */ val MIDDLE_BOTTOM: MIDDLE_BOTTOM with scala.Double = js.native
  /* 4 */ val MIDDLE_MIDDLE: MIDDLE_MIDDLE with scala.Double = js.native
  /* 1 */ val MIDDLE_TOP: MIDDLE_TOP with scala.Double = js.native
  /* 8 */ val RIGHT_BOTTOM: RIGHT_BOTTOM with scala.Double = js.native
  /* 5 */ val RIGHT_MIDDLE: RIGHT_MIDDLE with scala.Double = js.native
  /* 2 */ val RIGHT_TOP: RIGHT_TOP with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.RectanglePoint with scala.Double
  ] = js.native
}

