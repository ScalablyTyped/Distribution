package typings.activexLibreoffice.com_.sun.star.geometry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This structure contains the necessary information for a three-dimensional cube.
  * @since OOo 2.0
  */
@js.native
trait RealRectangle3D extends js.Object {
  var X1: Double = js.native
  /**
    * maximum X coordinate.
    *
    * Must be greater than X1 for non-empty cubes.
    *
    * .
    */
  var X2: Double = js.native
  var Y1: Double = js.native
  /**
    * maximum Y coordinate.
    *
    * Must be greater than Y1 for non-empty cubes.
    */
  var Y2: Double = js.native
  var Z1: Double = js.native
  /**
    * maximum Z coordinate.
    *
    * Must be greater than Z1 for non-empty cubes.
    */
  var Z2: Double = js.native
}

object RealRectangle3D {
  @scala.inline
  def apply(X1: Double, X2: Double, Y1: Double, Y2: Double, Z1: Double, Z2: Double): RealRectangle3D = {
    val __obj = js.Dynamic.literal(X1 = X1.asInstanceOf[js.Any], X2 = X2.asInstanceOf[js.Any], Y1 = Y1.asInstanceOf[js.Any], Y2 = Y2.asInstanceOf[js.Any], Z1 = Z1.asInstanceOf[js.Any], Z2 = Z2.asInstanceOf[js.Any])
    __obj.asInstanceOf[RealRectangle3D]
  }
  @scala.inline
  implicit class RealRectangle3DOps[Self <: RealRectangle3D] (val x: Self) extends AnyVal {
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
    def setX1(value: Double): Self = this.set("X1", value.asInstanceOf[js.Any])
    @scala.inline
    def setX2(value: Double): Self = this.set("X2", value.asInstanceOf[js.Any])
    @scala.inline
    def setY1(value: Double): Self = this.set("Y1", value.asInstanceOf[js.Any])
    @scala.inline
    def setY2(value: Double): Self = this.set("Y2", value.asInstanceOf[js.Any])
    @scala.inline
    def setZ1(value: Double): Self = this.set("Z1", value.asInstanceOf[js.Any])
    @scala.inline
    def setZ2(value: Double): Self = this.set("Z2", value.asInstanceOf[js.Any])
  }
  
}

