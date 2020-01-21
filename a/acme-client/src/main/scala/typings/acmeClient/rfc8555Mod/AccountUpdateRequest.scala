package typings.acmeClient.rfc8555Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountUpdateRequest extends js.Object {
  var contact: js.UndefOr[js.Array[String]] = js.undefined
  var status: js.UndefOr[String] = js.undefined
  var termsOfServiceAgreed: js.UndefOr[Boolean] = js.undefined
}

object AccountUpdateRequest {
  @scala.inline
  def apply(
    contact: js.Array[String] = null,
    status: String = null,
    termsOfServiceAgreed: js.UndefOr[Boolean] = js.undefined
  ): AccountUpdateRequest = {
    val __obj = js.Dynamic.literal()
    if (contact != null) __obj.updateDynamic("contact")(contact.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (!js.isUndefined(termsOfServiceAgreed)) __obj.updateDynamic("termsOfServiceAgreed")(termsOfServiceAgreed.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountUpdateRequest]
  }
}

