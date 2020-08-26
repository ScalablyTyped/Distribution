package typings.activexLibreoffice.com_.sun.star.drawing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a 3-dimensional vector. */
@js.native
trait Direction3D extends js.Object {
  var DirectionX: Double = js.native
  var DirectionY: Double = js.native
  var DirectionZ: Double = js.native
}

object Direction3D {
  @scala.inline
  def apply(DirectionX: Double, DirectionY: Double, DirectionZ: Double): Direction3D = {
    val __obj = js.Dynamic.literal(DirectionX = DirectionX.asInstanceOf[js.Any], DirectionY = DirectionY.asInstanceOf[js.Any], DirectionZ = DirectionZ.asInstanceOf[js.Any])
    __obj.asInstanceOf[Direction3D]
  }
  @scala.inline
  implicit class Direction3DOps[Self <: Direction3D] (val x: Self) extends AnyVal {
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
    def setDirectionX(value: Double): Self = this.set("DirectionX", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirectionY(value: Double): Self = this.set("DirectionY", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirectionZ(value: Double): Self = this.set("DirectionZ", value.asInstanceOf[js.Any])
  }
  
}

