package typings.acmeClient.rfc8555Mod

import typings.acmeClient.acmeClientStrings.deactivated
import typings.acmeClient.acmeClientStrings.revoked
import typings.acmeClient.acmeClientStrings.valid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Account extends js.Object {
  var contact: js.UndefOr[js.Array[String]] = js.undefined
  var externalAccountBinding: js.UndefOr[js.Object] = js.undefined
  var orders: String
  var status: valid | deactivated | revoked
  var termsOfServiceAgreed: js.UndefOr[Boolean] = js.undefined
}

object Account {
  @scala.inline
  def apply(
    orders: String,
    status: valid | deactivated | revoked,
    contact: js.Array[String] = null,
    externalAccountBinding: js.Object = null,
    termsOfServiceAgreed: js.UndefOr[Boolean] = js.undefined
  ): Account = {
    val __obj = js.Dynamic.literal(orders = orders.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (contact != null) __obj.updateDynamic("contact")(contact.asInstanceOf[js.Any])
    if (externalAccountBinding != null) __obj.updateDynamic("externalAccountBinding")(externalAccountBinding.asInstanceOf[js.Any])
    if (!js.isUndefined(termsOfServiceAgreed)) __obj.updateDynamic("termsOfServiceAgreed")(termsOfServiceAgreed.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Account]
  }
}

