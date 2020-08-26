package typings.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BorderBottomLeftRadius extends js.Object {
  var borderBottomLeftRadius: Double = js.native
  var borderBottomRightRadius: Double = js.native
  var bottom: Double = js.native
  var left: Double = js.native
  var position: String = js.native
  var right: Double = js.native
}

object BorderBottomLeftRadius {
  @scala.inline
  def apply(
    borderBottomLeftRadius: Double,
    borderBottomRightRadius: Double,
    bottom: Double,
    left: Double,
    position: String,
    right: Double
  ): BorderBottomLeftRadius = {
    val __obj = js.Dynamic.literal(borderBottomLeftRadius = borderBottomLeftRadius.asInstanceOf[js.Any], borderBottomRightRadius = borderBottomRightRadius.asInstanceOf[js.Any], bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderBottomLeftRadius]
  }
  @scala.inline
  implicit class BorderBottomLeftRadiusOps[Self <: BorderBottomLeftRadius] (val x: Self) extends AnyVal {
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
    def setBorderBottomLeftRadius(value: Double): Self = this.set("borderBottomLeftRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def setBorderBottomRightRadius(value: Double): Self = this.set("borderBottomRightRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def setBottom(value: Double): Self = this.set("bottom", value.asInstanceOf[js.Any])
    @scala.inline
    def setLeft(value: Double): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def setRight(value: Double): Self = this.set("right", value.asInstanceOf[js.Any])
  }
  
}

