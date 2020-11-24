package typings.authenticator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
