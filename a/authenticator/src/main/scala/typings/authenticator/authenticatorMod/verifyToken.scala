package typings.authenticator.authenticatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("authenticator", "verifyToken")
@js.native
object verifyToken extends js.Object {
  def apply(formattedKey: String, formattedToken: String): VerifyResult | Null = js.native
}

