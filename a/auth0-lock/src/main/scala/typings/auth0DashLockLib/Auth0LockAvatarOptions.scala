package typings
package auth0DashLockLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Auth0LockAvatarOptions extends js.Object {
  def displayName(email: java.lang.String, callback: Auth0LockAvatarDisplayNameCallback): scala.Unit
  def url(email: java.lang.String, callback: Auth0LockAvatarUrlCallback): scala.Unit
}

object Auth0LockAvatarOptions {
  @scala.inline
  def apply(
    displayName: (java.lang.String, Auth0LockAvatarDisplayNameCallback) => scala.Unit,
    url: (java.lang.String, Auth0LockAvatarUrlCallback) => scala.Unit
  ): Auth0LockAvatarOptions = {
    val __obj = js.Dynamic.literal(displayName = js.Any.fromFunction2(displayName), url = js.Any.fromFunction2(url))
  
    __obj.asInstanceOf[Auth0LockAvatarOptions]
  }
}

