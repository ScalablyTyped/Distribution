package typings.amapJsApi.anon

import typings.amapJsApi.AMap.LocationValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Name extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var position: js.UndefOr[LocationValue] = js.undefined
}

object Name {
  @scala.inline
  def apply(name: String = null, position: LocationValue = null): Name = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
}

