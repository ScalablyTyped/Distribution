package typings.acmeDashClient.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateAccountRequest extends AccountRequest {
  var externalAccountBinding: js.UndefOr[js.Object] = js.undefined
  var onlyReturnExisting: js.UndefOr[Boolean] = js.undefined
  var termsOfServiceAgreed: js.UndefOr[Boolean] = js.undefined
}

object CreateAccountRequest {
  @scala.inline
  def apply(
    contact: js.Array[String] = null,
    externalAccountBinding: js.Object = null,
    onlyReturnExisting: js.UndefOr[Boolean] = js.undefined,
    termsOfServiceAgreed: js.UndefOr[Boolean] = js.undefined
  ): CreateAccountRequest = {
    val __obj = js.Dynamic.literal()
    if (contact != null) __obj.updateDynamic("contact")(contact.asInstanceOf[js.Any])
    if (externalAccountBinding != null) __obj.updateDynamic("externalAccountBinding")(externalAccountBinding.asInstanceOf[js.Any])
    if (!js.isUndefined(onlyReturnExisting)) __obj.updateDynamic("onlyReturnExisting")(onlyReturnExisting.asInstanceOf[js.Any])
    if (!js.isUndefined(termsOfServiceAgreed)) __obj.updateDynamic("termsOfServiceAgreed")(termsOfServiceAgreed.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAccountRequest]
  }
}

