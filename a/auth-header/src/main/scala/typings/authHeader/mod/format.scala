package typings.authHeader.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("auth-header", "format")
@js.native
object format extends js.Object {
  def apply(scheme: String): String = js.native
  def apply(scheme: String, token: js.UndefOr[scala.Nothing], params: Params): String = js.native
  def apply(scheme: String, token: String): String = js.native
  def apply(scheme: String, token: String, params: Params): String = js.native
  def apply(token: TokenOptions): String = js.native
}

