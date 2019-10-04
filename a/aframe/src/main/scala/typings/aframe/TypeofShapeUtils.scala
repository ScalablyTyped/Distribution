package typings.aframe

import typings.three.srcExtrasShapeUtilsMod.Vec2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofShapeUtils extends js.Object {
  def area(contour: js.Array[Vec2]): Double
  def isClockWise(pts: js.Array[Vec2]): Boolean
  def triangulateShape(contour: js.Array[Vec2], holes: js.Array[js.Array[Vec2]]): js.Array[js.Array[Double]]
}

object TypeofShapeUtils {
  @scala.inline
  def apply(
    area: js.Array[Vec2] => Double,
    isClockWise: js.Array[Vec2] => Boolean,
    triangulateShape: (js.Array[Vec2], js.Array[js.Array[Vec2]]) => js.Array[js.Array[Double]]
  ): TypeofShapeUtils = {
    val __obj = js.Dynamic.literal(area = js.Any.fromFunction1(area), isClockWise = js.Any.fromFunction1(isClockWise), triangulateShape = js.Any.fromFunction2(triangulateShape))
  
    __obj.asInstanceOf[TypeofShapeUtils]
  }
}

