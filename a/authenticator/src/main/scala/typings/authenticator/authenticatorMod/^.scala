package typings.authenticator.authenticatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("authenticator", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def generateKey(): String = js.native
  def generateToken(formattedKey: String): String = js.native
  def generateTotpUri(
    formattedKey: String,
    accountName: String,
    issuer: String,
    algorithm: String,
    digits: Double,
    period: Double
  ): String = js.native
  def verifyToken(formattedKey: String, formattedToken: String): VerifyResult | Null = js.native
}

