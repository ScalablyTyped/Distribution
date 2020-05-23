package typings.activexLibreoffice.com_.sun.star.drawing

import typings.activexLibreoffice.com_.sun.star.awt.Point
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
  var ControlPoint1: Point
  /** This is the position of the second control point. */
  var ControlPoint2: Point
  /** This is the position of this point. */
  var Position: Point
}

object BezierPoint {
  @scala.inline
  def apply(ControlPoint1: Point, ControlPoint2: Point, Position: Point): BezierPoint = {
    val __obj = js.Dynamic.literal(ControlPoint1 = ControlPoint1.asInstanceOf[js.Any], ControlPoint2 = ControlPoint2.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any])
    __obj.asInstanceOf[BezierPoint]
  }
}

