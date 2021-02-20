package typings.activexLibreoffice.com_.sun.star.drawing

import typings.activexLibreoffice.com_.sun.star.awt.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a point on a Bezier curve.
  *
  * The two control points specify how the Bezier curve goes through the given position.
  * @deprecated Deprecated
  */
@js.native
trait BezierPoint extends StObject {
  
  /** This is the position of the first control point. */
  var ControlPoint1: Point = js.native
  
  /** This is the position of the second control point. */
  var ControlPoint2: Point = js.native
  
  /** This is the position of this point. */
  var Position: Point = js.native
}
object BezierPoint {
  
  @scala.inline
  def apply(ControlPoint1: Point, ControlPoint2: Point, Position: Point): BezierPoint = {
    val __obj = js.Dynamic.literal(ControlPoint1 = ControlPoint1.asInstanceOf[js.Any], ControlPoint2 = ControlPoint2.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any])
    __obj.asInstanceOf[BezierPoint]
  }
  
  @scala.inline
  implicit class BezierPointMutableBuilder[Self <: BezierPoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setControlPoint1(value: Point): Self = StObject.set(x, "ControlPoint1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControlPoint2(value: Point): Self = StObject.set(x, "ControlPoint2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Point): Self = StObject.set(x, "Position", value.asInstanceOf[js.Any])
  }
}
