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

