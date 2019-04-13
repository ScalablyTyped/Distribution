package typings
package angularDashOauth2Lib.angularMod.oauth2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OAuth extends js.Object {
  def getAccessToken(data: Data): angularLib.angularMod.IPromise[java.lang.String] = js.native
  def getAccessToken(data: Data, options: js.Any): angularLib.angularMod.IPromise[java.lang.String] = js.native
  def getRefreshToken(): angularLib.angularMod.IPromise[java.lang.String] = js.native
  def getRefreshToken(data: Data): angularLib.angularMod.IPromise[java.lang.String] = js.native
  def getRefreshToken(data: Data, options: js.Any): angularLib.angularMod.IPromise[java.lang.String] = js.native
  def isAuthenticated(): scala.Boolean = js.native
  def revokeToken(): angularLib.angularMod.IPromise[java.lang.String] = js.native
  def revokeToken(data: Data): angularLib.angularMod.IPromise[java.lang.String] = js.native
  def revokeToken(data: Data, options: js.Any): angularLib.angularMod.IPromise[java.lang.String] = js.native
}

