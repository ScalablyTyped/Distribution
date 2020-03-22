package typings.amapJsApi

import typings.amapJsApi.AMap.LocationValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLocation extends js.Object {
  var id: String
  var location: js.UndefOr[LocationValue] = js.undefined
  var name: js.UndefOr[String] = js.undefined
}

object AnonLocation {
  @scala.inline
  def apply(id: String, location: LocationValue = null, name: String = null): AnonLocation = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLocation]
  }
}

