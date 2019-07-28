package typings.auth0.auth0Mod

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
    val __obj = js.Dynamic.literal(name = name)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[CreateRoleData]
  }
}

