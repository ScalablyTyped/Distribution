package typings.amapJsApiPlaceSearch

import typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIndoordata extends js.Object {
  var indoor_data: AnonCpid
  var indoor_map: `true`
}

object AnonIndoordata {
  @scala.inline
  def apply(indoor_data: AnonCpid, indoor_map: `true`): AnonIndoordata = {
    val __obj = js.Dynamic.literal(indoor_data = indoor_data.asInstanceOf[js.Any], indoor_map = indoor_map.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIndoordata]
  }
}

