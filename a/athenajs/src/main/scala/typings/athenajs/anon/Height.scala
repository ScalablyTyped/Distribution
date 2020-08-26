package typings.athenajs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Height extends js.Object {
  var height: Double = js.native
  var hitBox: js.UndefOr[X] = js.native
  var offsetX: Double = js.native
  var offsetY: Double = js.native
  var plane: js.UndefOr[Double] = js.native
  var width: Double = js.native
}

object Height {
  @scala.inline
  def apply(height: Double, offsetX: Double, offsetY: Double, width: Double): Height = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Height]
  }
  @scala.inline
  implicit class HeightOps[Self <: Height] (val x: Self) extends AnyVal {
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setOffsetX(value: Double): Self = this.set("offsetX", value.asInstanceOf[js.Any])
    @scala.inline
    def setOffsetY(value: Double): Self = this.set("offsetY", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def setHitBox(value: X): Self = this.set("hitBox", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHitBox: Self = this.set("hitBox", js.undefined)
    @scala.inline
    def setPlane(value: Double): Self = this.set("plane", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlane: Self = this.set("plane", js.undefined)
  }
  
}

