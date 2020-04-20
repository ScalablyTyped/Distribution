package typings.angularJwt.mod.jwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAuthManagerServiceProvider extends js.Object {
  def authenticate(): Unit
  def checkAuthOnRefresh(): Unit
  def redirectWhenUnauthenticated(): Unit
  def unauthenticate(): Unit
}

object IAuthManagerServiceProvider {
  @scala.inline
  def apply(
    authenticate: () => Unit,
    checkAuthOnRefresh: () => Unit,
    redirectWhenUnauthenticated: () => Unit,
    unauthenticate: () => Unit
  ): IAuthManagerServiceProvider = {
    val __obj = js.Dynamic.literal(authenticate = js.Any.fromFunction0(authenticate), checkAuthOnRefresh = js.Any.fromFunction0(checkAuthOnRefresh), redirectWhenUnauthenticated = js.Any.fromFunction0(redirectWhenUnauthenticated), unauthenticate = js.Any.fromFunction0(unauthenticate))
    __obj.asInstanceOf[IAuthManagerServiceProvider]
  }
}

