package typings.auth0Lock

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Auth0LockAvatarOptions extends js.Object {
  def displayName(email: String, callback: Auth0LockAvatarDisplayNameCallback): Unit = js.native
  def url(email: String, callback: Auth0LockAvatarUrlCallback): Unit = js.native
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
  @scala.inline
  implicit class Auth0LockAvatarOptionsOps[Self <: Auth0LockAvatarOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDisplayName(value: (String, Auth0LockAvatarDisplayNameCallback) => Unit): Self = this.set("displayName", js.Any.fromFunction2(value))
    @scala.inline
    def setUrl(value: (String, Auth0LockAvatarUrlCallback) => Unit): Self = this.set("url", js.Any.fromFunction2(value))
  }
  
}

