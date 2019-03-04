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
    val __obj = js.Dynamic.literal(active = active, email = email, name = name)
    __obj.updateDynamic("display-name")(`display-name`)
    __obj.updateDynamic("first-name")(`first-name`)
    __obj.updateDynamic("last-name")(`last-name`)
    if (password != null) __obj.updateDynamic("password")(password)
    __obj.asInstanceOf[UserObj]
  }
}

