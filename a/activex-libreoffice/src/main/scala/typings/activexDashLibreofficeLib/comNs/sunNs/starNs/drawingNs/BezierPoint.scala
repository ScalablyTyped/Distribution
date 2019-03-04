package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a point on a Bezier curve.
  *
  * The two control points specify how the Bezier curve goes through the given position.
  * @deprecated Deprecated
  */
trait BezierPoint extends js.Object {
  /** This is the position of the first control point. */
  var ControlPoint1: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point
  /** This is the position of the second control point. */
  var ControlPoint2: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point
  /** This is the position of this point. */
  var Position: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point
}

object BezierPoint {
  @scala.inline
  def apply(
    ControlPoint1: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point,
    ControlPoint2: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point,
    Position: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point
  ): BezierPoint = {
    val __obj = js.Dynamic.literal(ControlPoint1 = ControlPoint1, ControlPoint2 = ControlPoint2, Position = Position)
  
    __obj.asInstanceOf[BezierPoint]
  }
}

