package typings
package actionsDashOnDashGoogleLib.assistantDashAppMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserName extends js.Object {
  /** User's display name. */
  var displayName: java.lang.String
  /** User's family name. */
  var familyName: java.lang.String
  /** User's given name. */
  var givenName: java.lang.String
}

object UserName {
  @scala.inline
  def apply(displayName: java.lang.String, familyName: java.lang.String, givenName: java.lang.String): UserName = {
    val __obj = js.Dynamic.literal(displayName = displayName, familyName = familyName, givenName = givenName)
  
    __obj.asInstanceOf[UserName]
  }
}

