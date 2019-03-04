package typings
package amapDashJsDashSdkLib.AMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectChangeEvent extends js.Object {
  var data: Poi
  var id: java.lang.String
  var listElement: stdLib.HTMLLIElement
  var marker: Marker
  var `type`: java.lang.String
}

object SelectChangeEvent {
  @scala.inline
  def apply(
    data: Poi,
    id: java.lang.String,
    listElement: stdLib.HTMLLIElement,
    marker: Marker,
    `type`: java.lang.String
  ): SelectChangeEvent = {
    val __obj = js.Dynamic.literal(data = data, id = id, listElement = listElement, marker = marker)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SelectChangeEvent]
  }
}

