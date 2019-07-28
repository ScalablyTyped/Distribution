package typings.actionsDashOnDashGoogle.assistantDashAppMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserName extends js.Object {
  /** User's display name. */
  var displayName: String
  /** User's family name. */
  var familyName: String
  /** User's given name. */
  var givenName: String
}

object UserName {
  @scala.inline
  def apply(displayName: String, familyName: String, givenName: String): UserName = {
    val __obj = js.Dynamic.literal(displayName = displayName, familyName = familyName, givenName = givenName)
  
    __obj.asInstanceOf[UserName]
  }
}

