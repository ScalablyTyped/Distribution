package typings.amapDashJsDashApi

import typings.amapDashJsDashApi.AMap.LocationValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IdLocation extends js.Object {
  var id: String
  var location: js.UndefOr[LocationValue] = js.undefined
  var name: js.UndefOr[String] = js.undefined
}

object Anon_IdLocation {
  @scala.inline
  def apply(id: String, location: LocationValue = null, name: String = null): Anon_IdLocation = {
    val __obj = js.Dynamic.literal(id = id)
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Anon_IdLocation]
  }
}

