package typings.acmeDashClient.acmeDashClientMod

import typings.acmeDashClient.acmeDashClientStrings.invalid
import typings.acmeDashClient.acmeDashClientStrings.pending
import typings.acmeDashClient.acmeDashClientStrings.processing
import typings.acmeDashClient.acmeDashClientStrings.ready
import typings.acmeDashClient.acmeDashClientStrings.valid
import typings.acmeDashClient.typesRfc8555Mod.Identifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Order
  extends typings.acmeDashClient.typesRfc8555Mod.Order {
  var url: String
}

object Order {
  @scala.inline
  def apply(
    authorizations: js.Array[String],
    finalize: String,
    identifiers: js.Array[Identifier],
    status: pending | ready | processing | valid | invalid,
    url: String,
    certificate: String = null,
    error: js.Object = null,
    expires: String = null,
    notAfter: String = null,
    notBefore: String = null
  ): Order = {
    val __obj = js.Dynamic.literal(authorizations = authorizations.asInstanceOf[js.Any], finalize = finalize.asInstanceOf[js.Any], identifiers = identifiers.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (certificate != null) __obj.updateDynamic("certificate")(certificate.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (expires != null) __obj.updateDynamic("expires")(expires.asInstanceOf[js.Any])
    if (notAfter != null) __obj.updateDynamic("notAfter")(notAfter.asInstanceOf[js.Any])
    if (notBefore != null) __obj.updateDynamic("notBefore")(notBefore.asInstanceOf[js.Any])
    __obj.asInstanceOf[Order]
  }
}

