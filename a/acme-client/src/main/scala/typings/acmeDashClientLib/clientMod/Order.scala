package typings
package acmeDashClientLib.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Order extends HasStatus {
  var authorizations: js.Array[java.lang.String]
  var certificate: js.UndefOr[java.lang.String] = js.undefined
  var expires: js.UndefOr[java.lang.String] = js.undefined
  @JSName("finalize")
  var finalize_FOrder: java.lang.String
  var identifiers: js.Array[Identifier]
  var notAfter: js.UndefOr[java.lang.String] = js.undefined
  var notBefore: js.UndefOr[java.lang.String] = js.undefined
  @JSName("status")
  var status_Order: acmeDashClientLib.acmeDashClientLibStrings.pending | acmeDashClientLib.acmeDashClientLibStrings.ready | acmeDashClientLib.acmeDashClientLibStrings.processing | acmeDashClientLib.acmeDashClientLibStrings.valid | acmeDashClientLib.acmeDashClientLibStrings.invalid
}

object Order {
  @scala.inline
  def apply(
    authorizations: js.Array[java.lang.String],
    finalize: java.lang.String,
    identifiers: js.Array[Identifier],
    status: acmeDashClientLib.acmeDashClientLibStrings.pending | acmeDashClientLib.acmeDashClientLibStrings.ready | acmeDashClientLib.acmeDashClientLibStrings.processing | acmeDashClientLib.acmeDashClientLibStrings.valid | acmeDashClientLib.acmeDashClientLibStrings.invalid,
    certificate: java.lang.String = null,
    expires: java.lang.String = null,
    notAfter: java.lang.String = null,
    notBefore: java.lang.String = null
  ): Order = {
    val __obj = js.Dynamic.literal(authorizations = authorizations, finalize = finalize, identifiers = identifiers, status = status.asInstanceOf[js.Any])
    if (certificate != null) __obj.updateDynamic("certificate")(certificate)
    if (expires != null) __obj.updateDynamic("expires")(expires)
    if (notAfter != null) __obj.updateDynamic("notAfter")(notAfter)
    if (notBefore != null) __obj.updateDynamic("notBefore")(notBefore)
    __obj.asInstanceOf[Order]
  }
}

