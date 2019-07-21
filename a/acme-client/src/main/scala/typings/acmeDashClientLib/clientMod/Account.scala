package typings
package acmeDashClientLib.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Account extends js.Object {
  var contact: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var externalAccountBinding: js.UndefOr[js.Object] = js.undefined
  var orders: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var status: js.UndefOr[java.lang.String] = js.undefined
  var termsOfServiceAgreed: js.UndefOr[scala.Boolean] = js.undefined
}

object Account {
  @scala.inline
  def apply(
    contact: js.Array[java.lang.String] = null,
    externalAccountBinding: js.Object = null,
    orders: js.Array[java.lang.String] = null,
    status: java.lang.String = null,
    termsOfServiceAgreed: js.UndefOr[scala.Boolean] = js.undefined
  ): Account = {
    val __obj = js.Dynamic.literal()
    if (contact != null) __obj.updateDynamic("contact")(contact)
    if (externalAccountBinding != null) __obj.updateDynamic("externalAccountBinding")(externalAccountBinding)
    if (orders != null) __obj.updateDynamic("orders")(orders)
    if (status != null) __obj.updateDynamic("status")(status)
    if (!js.isUndefined(termsOfServiceAgreed)) __obj.updateDynamic("termsOfServiceAgreed")(termsOfServiceAgreed)
    __obj.asInstanceOf[Account]
  }
}

