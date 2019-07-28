package typings.actionsDashOnDashGoogle.assistantDashAppMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait User extends js.Object {
  /** Unique Oauth2 token. Only available with account linking. */
  var accessToken: String
  /**
    * Timestamp for the last access from the user.
    * Retrieve using app.getLastSeen() to get a Date object or null if never seen.
    */
  var lastSeen: String
  /** Random string ID for Google user. */
  var userId: String
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
  var userStorage: String
}

object User {
  @scala.inline
  def apply(accessToken: String, lastSeen: String, userId: String, userName: UserName, userStorage: String): User = {
    val __obj = js.Dynamic.literal(accessToken = accessToken, lastSeen = lastSeen, userId = userId, userName = userName, userStorage = userStorage)
  
    __obj.asInstanceOf[User]
  }
}

