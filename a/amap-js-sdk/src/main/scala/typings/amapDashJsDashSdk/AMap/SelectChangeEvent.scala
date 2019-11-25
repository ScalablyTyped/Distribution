package typings.amapDashJsDashSdk.AMap

import typings.std.HTMLLIElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectChangeEvent extends js.Object {
  var data: Poi
  var id: String
  var listElement: HTMLLIElement
  var marker: Marker
  var `type`: String
}

object SelectChangeEvent {
  @scala.inline
  def apply(data: Poi, id: String, listElement: HTMLLIElement, marker: Marker, `type`: String): SelectChangeEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], listElement = listElement.asInstanceOf[js.Any], marker = marker.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectChangeEvent]
  }
}

