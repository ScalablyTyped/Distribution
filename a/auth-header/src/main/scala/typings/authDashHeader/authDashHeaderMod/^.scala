package typings.authDashHeader.authDashHeaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("auth-header", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def format(scheme: String): String = js.native
  def format(scheme: String, token: String): String = js.native
  def format(scheme: String, token: String, params: Params): String = js.native
  def format(token: TokenOptions): String = js.native
  def parse(header: String): Token = js.native
}

