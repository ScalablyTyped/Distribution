package typings.antvG2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TooltipItem extends js.Object {
  var color: String = js.native
  var marker: js.Any = js.native
  var name: String = js.native
  var point: js.Any = js.native
  var showMarker: Boolean = js.native
  var title: String = js.native
  var value: String = js.native
  var x: Double = js.native
  var y: Double = js.native
}

object TooltipItem {
  @scala.inline
  def apply(
    color: String,
    marker: js.Any,
    name: String,
    point: js.Any,
    showMarker: Boolean,
    title: String,
    value: String,
    x: Double,
    y: Double
  ): TooltipItem = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], marker = marker.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], showMarker = showMarker.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipItem]
  }
  @scala.inline
  implicit class TooltipItemOps[Self <: TooltipItem] (val x: Self) extends AnyVal {
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setMarker(value: js.Any): Self = this.set("marker", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPoint(value: js.Any): Self = this.set("point", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowMarker(value: Boolean): Self = this.set("showMarker", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
  
}

