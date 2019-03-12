package typings
package angularDashJwtLib.angularMod.jwtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAuthManagerServiceProvider extends js.Object {
  def authenticate(): scala.Unit
  def checkAuthOnRefresh(): scala.Unit
  def redirectWhenUnauthenticated(): scala.Unit
  def unauthenticate(): scala.Unit
}

object IAuthManagerServiceProvider {
  @scala.inline
  def apply(
    authenticate: () => scala.Unit,
    checkAuthOnRefresh: () => scala.Unit,
    redirectWhenUnauthenticated: () => scala.Unit,
    unauthenticate: () => scala.Unit
  ): IAuthManagerServiceProvider = {
    val __obj = js.Dynamic.literal(authenticate = js.Any.fromFunction0(authenticate), checkAuthOnRefresh = js.Any.fromFunction0(checkAuthOnRefresh), redirectWhenUnauthenticated = js.Any.fromFunction0(redirectWhenUnauthenticated), unauthenticate = js.Any.fromFunction0(unauthenticate))
  
    __obj.asInstanceOf[IAuthManagerServiceProvider]
  }
}

