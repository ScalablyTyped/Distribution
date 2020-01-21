package typings.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateRoleData extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var name: String
}

object CreateRoleData {
  @scala.inline
  def apply(name: String, description: String = null): CreateRoleData = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRoleData]
  }
}

