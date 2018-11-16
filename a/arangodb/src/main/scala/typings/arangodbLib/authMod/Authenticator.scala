package typings
package arangodbLib.authMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Authenticator extends js.Object {
  def create(password: java.lang.String): AuthData = js.native
  def verify(): scala.Boolean = js.native
  def verify(hash: AuthData): scala.Boolean = js.native
  def verify(hash: AuthData, password: java.lang.String): scala.Boolean = js.native
}

