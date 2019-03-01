package typings
package actionsDashOnDashGoogleLib.assistantDashAppMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait User extends js.Object {
  /** Unique Oauth2 token. Only available with account linking. */
  var accessToken: java.lang.String
  /**
    * Timestamp for the last access from the user.
    * Retrieve using app.getLastSeen() to get a Date object or null if never seen.
    */
  var lastSeen: java.lang.String
  /** Random string ID for Google user. */
  var userId: java.lang.String
  /**
    * User name information. Null if not requested with
    *     {@link AssistantApp#askForPermission|askForPermission(SupportedPermissions.NAME)}.
    */
  var userName: UserName
  /**
    * A string persistent across sessions.
    * Retrieved and set using app.userStorage which allows you to store it like an JSON object
    * which is abstracted for convenience by the client library.
    */
  var userStorage: java.lang.String
}

object User {
  @scala.inline
  def apply(
    accessToken: java.lang.String,
    lastSeen: java.lang.String,
    userId: java.lang.String,
    userName: UserName,
    userStorage: java.lang.String
  ): User = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("accessToken")(accessToken)
    __obj.updateDynamic("lastSeen")(lastSeen)
    __obj.updateDynamic("userId")(userId)
    __obj.updateDynamic("userName")(userName)
    __obj.updateDynamic("userStorage")(userStorage)
    __obj.asInstanceOf[User]
  }
}

