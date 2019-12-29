package typings.acmeDashClient.typesRfc8555Mod

import typings.acmeDashClient.acmeDashClientStrings.invalid
import typings.acmeDashClient.acmeDashClientStrings.pending
import typings.acmeDashClient.acmeDashClientStrings.processing
import typings.acmeDashClient.acmeDashClientStrings.ready
import typings.acmeDashClient.acmeDashClientStrings.valid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Order extends js.Object {
  var authorizations: js.Array[String]
  var certificate: js.UndefOr[String] = js.undefined
  var error: js.UndefOr[js.Object] = js.undefined
  var expires: js.UndefOr[String] = js.undefined
  @JSName("finalize")
  var finalize_FOrder: String
  var identifiers: js.Array[Identifier]
  var notAfter: js.UndefOr[String] = js.undefined
  var notBefore: js.UndefOr[String] = js.undefined
  var status: pending | ready | processing | valid | invalid
}

object Order {
  @scala.inline
  def apply(
    authorizations: js.Array[String],
    finalize: String,
    identifiers: js.Array[Identifier],
    status: pending | ready | processing | valid | invalid,
    certificate: String = null,
    error: js.Object = null,
    expires: String = null,
    notAfter: String = null,
    notBefore: String = null
  ): Order = {
    val __obj = js.Dynamic.literal(authorizations = authorizations.asInstanceOf[js.Any], finalize = finalize.asInstanceOf[js.Any], identifiers = identifiers.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (certificate != null) __obj.updateDynamic("certificate")(certificate.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (expires != null) __obj.updateDynamic("expires")(expires.asInstanceOf[js.Any])
    if (notAfter != null) __obj.updateDynamic("notAfter")(notAfter.asInstanceOf[js.Any])
    if (notBefore != null) __obj.updateDynamic("notBefore")(notBefore.asInstanceOf[js.Any])
    __obj.asInstanceOf[Order]
  }
}

