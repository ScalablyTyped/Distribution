package typings
package atlassianDashCrowdDashClientLib.libModelsUserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait User extends js.Object {
  val active: scala.Boolean
  val attributes: org.scalablytyped.runtime.StringDictionary[js.Any]
  val displayname: java.lang.String
  val email: java.lang.String
  val firstname: java.lang.String
  val lastname: java.lang.String
  val password: js.UndefOr[java.lang.String] = js.undefined
  val username: java.lang.String
  def toCrowd(): UserObj
}

object User {
  @scala.inline
  def apply(
    active: scala.Boolean,
    attributes: org.scalablytyped.runtime.StringDictionary[js.Any],
    displayname: java.lang.String,
    email: java.lang.String,
    firstname: java.lang.String,
    lastname: java.lang.String,
    toCrowd: js.Function0[UserObj],
    username: java.lang.String,
    password: java.lang.String = null
  ): User = {
    val __obj = js.Dynamic.literal(active = active, attributes = attributes, displayname = displayname, email = email, firstname = firstname, lastname = lastname, toCrowd = toCrowd, username = username)
    if (password != null) __obj.updateDynamic("password")(password)
    __obj.asInstanceOf[User]
  }
}

