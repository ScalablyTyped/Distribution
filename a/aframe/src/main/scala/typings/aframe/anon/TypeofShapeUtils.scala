package typings.aframe.anon

import typings.three.shapeUtilsMod.Vec2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofShapeUtils extends js.Object {
  def area(contour: js.Array[Vec2]): Double = js.native
  def isClockWise(pts: js.Array[Vec2]): Boolean = js.native
  def triangulateShape(contour: js.Array[Vec2], holes: js.Array[js.Array[Vec2]]): js.Array[js.Array[Double]] = js.native
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
  @scala.inline
  implicit class TypeofShapeUtilsOps[Self <: TypeofShapeUtils] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArea(value: js.Array[Vec2] => Double): Self = this.set("area", js.Any.fromFunction1(value))
    @scala.inline
    def setIsClockWise(value: js.Array[Vec2] => Boolean): Self = this.set("isClockWise", js.Any.fromFunction1(value))
    @scala.inline
    def setTriangulateShape(value: (js.Array[Vec2], js.Array[js.Array[Vec2]]) => js.Array[js.Array[Double]]): Self = this.set("triangulateShape", js.Any.fromFunction2(value))
  }
  
}

