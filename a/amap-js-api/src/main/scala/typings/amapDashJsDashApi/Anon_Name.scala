package typings.amapDashJsDashApi

import typings.amapDashJsDashApi.AMap.LocationValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var position: js.UndefOr[LocationValue] = js.undefined
}

object Anon_Name {
  @scala.inline
  def apply(name: String = null, position: LocationValue = null): Anon_Name = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Name]
  }
}

