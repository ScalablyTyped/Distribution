package typings.atlassianDashCrowdDashClient.libModelsUserMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait User extends js.Object {
  val active: Boolean
  val attributes: StringDictionary[js.Any]
  val displayname: String
  val email: String
  val firstname: String
  val lastname: String
  val password: js.UndefOr[String] = js.undefined
  val username: String
  def toCrowd(): UserObj
}

object User {
  @scala.inline
  def apply(
    active: Boolean,
    attributes: StringDictionary[js.Any],
    displayname: String,
    email: String,
    firstname: String,
    lastname: String,
    toCrowd: () => UserObj,
    username: String,
    password: String = null
  ): User = {
    val __obj = js.Dynamic.literal(active = active, attributes = attributes, displayname = displayname, email = email, firstname = firstname, lastname = lastname, toCrowd = js.Any.fromFunction0(toCrowd), username = username)
    if (password != null) __obj.updateDynamic("password")(password)
    __obj.asInstanceOf[User]
  }
}

