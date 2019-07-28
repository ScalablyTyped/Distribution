package typings.auth0DashLock

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Auth0LockAvatarOptions extends js.Object {
  def displayName(email: String, callback: Auth0LockAvatarDisplayNameCallback): Unit
  def url(email: String, callback: Auth0LockAvatarUrlCallback): Unit
}

object Auth0LockAvatarOptions {
  @scala.inline
  def apply(
    displayName: (String, Auth0LockAvatarDisplayNameCallback) => Unit,
    url: (String, Auth0LockAvatarUrlCallback) => Unit
  ): Auth0LockAvatarOptions = {
    val __obj = js.Dynamic.literal(displayName = js.Any.fromFunction2(displayName), url = js.Any.fromFunction2(url))
  
    __obj.asInstanceOf[Auth0LockAvatarOptions]
  }
}

