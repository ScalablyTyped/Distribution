package typings
package atlassianDashCrowdDashClientLib.libModelsUserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserObj extends js.Object {
  val active: scala.Boolean
  val `display-name`: java.lang.String
  val email: java.lang.String
  val `first-name`: java.lang.String
  val `last-name`: java.lang.String
  val name: java.lang.String
  val password: js.UndefOr[atlassianDashCrowdDashClientLib.Anon_Value] = js.undefined
}

object UserObj {
  @scala.inline
  def apply(
    active: scala.Boolean,
    `display-name`: java.lang.String,
    email: java.lang.String,
    `first-name`: java.lang.String,
    `last-name`: java.lang.String,
    name: java.lang.String,
    password: atlassianDashCrowdDashClientLib.Anon_Value = null
  ): UserObj = {
    val __obj = js.Dynamic.literal(`display-name` = `display-name`, `first-name` = `first-name`, `last-name` = `last-name`)
    __obj.updateDynamic("active")(active)
    __obj.updateDynamic("email")(email)
    __obj.updateDynamic("name")(name)
    if (password != null) __obj.updateDynamic("password")(password)
    __obj.asInstanceOf[UserObj]
  }
}

