package typings.angularDashJwt.angularMod.jwt

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IJwtHelper extends js.Object {
  def decodeToken(token: String): JwtToken = js.native
  def getTokenExpirationDate(token: js.Any): Date = js.native
  def isTokenExpired(token: js.Any): Boolean = js.native
  def isTokenExpired(token: js.Any, offsetSeconds: Double): Boolean = js.native
}

