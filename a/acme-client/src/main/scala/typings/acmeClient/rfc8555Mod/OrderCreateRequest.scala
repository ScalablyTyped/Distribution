package typings.acmeClient.rfc8555Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderCreateRequest extends js.Object {
  var identifiers: js.Array[Identifier]
  var notAfter: js.UndefOr[String] = js.undefined
  var notBefore: js.UndefOr[String] = js.undefined
}

object OrderCreateRequest {
  @scala.inline
  def apply(identifiers: js.Array[Identifier], notAfter: String = null, notBefore: String = null): OrderCreateRequest = {
    val __obj = js.Dynamic.literal(identifiers = identifiers.asInstanceOf[js.Any])
    if (notAfter != null) __obj.updateDynamic("notAfter")(notAfter.asInstanceOf[js.Any])
    if (notBefore != null) __obj.updateDynamic("notBefore")(notBefore.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderCreateRequest]
  }
}

