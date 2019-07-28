package typings.atlassianDashCrowdDashClient.libModelsUserMod

import typings.atlassianDashCrowdDashClient.Anon_Value
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
  val password: js.UndefOr[Anon_Value] = js.undefined
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
    password: Anon_Value = null
  ): UserObj = {
    val __obj = js.Dynamic.literal(active = active, email = email, name = name)
    __obj.updateDynamic("display-name")(`display-name`)
    __obj.updateDynamic("first-name")(`first-name`)
    __obj.updateDynamic("last-name")(`last-name`)
    if (password != null) __obj.updateDynamic("password")(password)
    __obj.asInstanceOf[UserObj]
  }
}

