package typings.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BorderBottomWidth extends js.Object {
  var backgroundColor: String = js.native
  var borderBottomColor: String = js.native
  var borderBottomWidth: Double = js.native
  var bottom: Double = js.native
  var height: Double = js.native
  var left: Double = js.native
  var position: String = js.native
  var right: Double = js.native
}

object BorderBottomWidth {
  @scala.inline
  def apply(
    backgroundColor: String,
    borderBottomColor: String,
    borderBottomWidth: Double,
    bottom: Double,
    height: Double,
    left: Double,
    position: String,
    right: Double
  ): BorderBottomWidth = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], borderBottomColor = borderBottomColor.asInstanceOf[js.Any], borderBottomWidth = borderBottomWidth.asInstanceOf[js.Any], bottom = bottom.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderBottomWidth]
  }
  @scala.inline
  implicit class BorderBottomWidthOps[Self <: BorderBottomWidth] (val x: Self) extends AnyVal {
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
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setBorderBottomColor(value: String): Self = this.set("borderBottomColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setBorderBottomWidth(value: Double): Self = this.set("borderBottomWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setBottom(value: Double): Self = this.set("bottom", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setLeft(value: Double): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def setRight(value: Double): Self = this.set("right", value.asInstanceOf[js.Any])
  }
  
}

