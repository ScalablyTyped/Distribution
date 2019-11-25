package typings.amapDashJsDashApiDashPlaceDashSearch

import typings.amapDashJsDashApi.AMap.LocationValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Id extends js.Object {
  var id: String
  var location: js.UndefOr[LocationValue] = js.undefined
  var name: js.UndefOr[String] = js.undefined
}

object Anon_Id {
  @scala.inline
  def apply(id: String, location: LocationValue = null, name: String = null): Anon_Id = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Id]
  }
}

