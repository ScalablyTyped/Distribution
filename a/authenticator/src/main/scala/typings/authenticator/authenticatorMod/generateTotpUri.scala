package typings.authenticator.authenticatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("authenticator", "generateTotpUri")
@js.native
object generateTotpUri extends js.Object {
  def apply(
    formattedKey: String,
    accountName: String,
    issuer: String,
    algorithm: String,
    digits: Double,
    period: Double
  ): String = js.native
}

