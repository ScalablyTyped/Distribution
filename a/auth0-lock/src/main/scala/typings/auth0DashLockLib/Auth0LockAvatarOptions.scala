package typings
package auth0DashLockLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Auth0LockAvatarOptions extends js.Object {
  def displayName(email: java.lang.String, callback: Auth0LockAvatarDisplayNameCallback): scala.Unit
  def url(email: java.lang.String, callback: Auth0LockAvatarUrlCallback): scala.Unit
}

