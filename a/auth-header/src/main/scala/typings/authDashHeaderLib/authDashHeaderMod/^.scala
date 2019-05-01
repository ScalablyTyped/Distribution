package typings
package authDashHeaderLib.authDashHeaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("auth-header", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def format(scheme: java.lang.String): java.lang.String = js.native
  def format(scheme: java.lang.String, token: java.lang.String): java.lang.String = js.native
  def format(scheme: java.lang.String, token: java.lang.String, params: Params): java.lang.String = js.native
  def format(token: TokenOptions): java.lang.String = js.native
  def parse(header: java.lang.String): Token = js.native
}

