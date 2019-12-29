package typings.atAntvG2.atAntvG2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipItem extends js.Object {
  var color: String
  var marker: js.Any
  var name: String
  var point: js.Any
  var showMarker: Boolean
  var title: String
  var value: String
  var x: Double
  var y: Double
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
}

