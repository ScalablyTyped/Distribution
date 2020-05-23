package typings.atlassianCrowdClient.userMod

import typings.atlassianCrowdClient.anon.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserObj extends js.Object {
  val active: Boolean
  val `display-name`: String
  val email: String
  val `first-name`: String
  val `last-name`: String
  val name: String
  val password: js.UndefOr[Value] = js.undefined
}

object UserObj {
  @scala.inline
  def apply(
    active: Boolean,
    `display-name`: String,
    email: String,
    `first-name`: String,
    `last-name`: String,
    name: String,
    password: Value = null
  ): UserObj = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("display-name")(`display-name`.asInstanceOf[js.Any])
    __obj.updateDynamic("first-name")(`first-name`.asInstanceOf[js.Any])
    __obj.updateDynamic("last-name")(`last-name`.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserObj]
  }
}

