package typings
package angularDashJwtLib.angularMod.jwtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IJwtHelper extends js.Object {
  def decodeToken(token: java.lang.String): JwtToken = js.native
  def getTokenExpirationDate(token: js.Any): stdLib.Date = js.native
  def isTokenExpired(token: js.Any): scala.Boolean = js.native
  def isTokenExpired(token: js.Any, offsetSeconds: scala.Double): scala.Boolean = js.native
}

