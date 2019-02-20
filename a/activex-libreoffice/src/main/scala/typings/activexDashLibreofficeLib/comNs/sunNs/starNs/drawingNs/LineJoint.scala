package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LineJoint extends js.Object

/** The LineJoint defines rendering of joints between thick lines */
@JSGlobal("com.sun.star.drawing.LineJoint")
@js.native
object LineJoint extends js.Object {
  /** the edges of the thick lines will be joined by lines */
  @js.native
  sealed trait BEVEL
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.LineJoint
  
  /** the middle value between the joints is used */
  @js.native
  sealed trait MIDDLE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.LineJoint
  
  /** the lines join at intersections */
  @js.native
  sealed trait MITER
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.LineJoint
  
  /**
    * the area is not filled.
    *
    * the line has no special end.
    *
    * the joint between lines will not be connected
    *
    * the line is hidden.
    *
    * Don't animate this text.
    *
    * the text size is only defined by the font properties
    */
  @js.native
  sealed trait NONE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.LineJoint
  
  /**
    * the dash is a point
    *
    * the line will get a half circle as additional cap
    *
    * the lines join with an arc
    */
  @js.native
  sealed trait ROUND
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.LineJoint
  
  /* 2 */ val BEVEL: BEVEL with scala.Double = js.native
  /* 1 */ val MIDDLE: MIDDLE with scala.Double = js.native
  /* 3 */ val MITER: MITER with scala.Double = js.native
  /* 0 */ val NONE: NONE with scala.Double = js.native
  /* 4 */ val ROUND: ROUND with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.LineJoint with scala.Double
  ] = js.native
}

