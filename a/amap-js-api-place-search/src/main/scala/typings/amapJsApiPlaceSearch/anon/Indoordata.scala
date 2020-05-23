package typings.amapJsApiPlaceSearch.anon

import typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Indoordata extends js.Object {
  var indoor_data: Cpid
  var indoor_map: `true`
}

object Indoordata {
  @scala.inline
  def apply(indoor_data: Cpid, indoor_map: `true`): Indoordata = {
    val __obj = js.Dynamic.literal(indoor_data = indoor_data.asInstanceOf[js.Any], indoor_map = indoor_map.asInstanceOf[js.Any])
    __obj.asInstanceOf[Indoordata]
  }
}

