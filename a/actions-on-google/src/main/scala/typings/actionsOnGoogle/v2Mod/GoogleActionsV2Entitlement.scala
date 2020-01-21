package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2Entitlement extends js.Object {
  /**
    * Only present for in-app purchase and in-app subs.
    */
  var inAppDetails: js.UndefOr[GoogleActionsV2SignedData] = js.undefined
  /**
    * Product sku. Package name for paid app, suffix of Finsky docid for
    * in-app purchase and in-app subscription.
    * Match getSku() in Play InApp Billing API.
    */
  var sku: js.UndefOr[String] = js.undefined
  var skuType: js.UndefOr[GoogleActionsV2EntitlementSkuType] = js.undefined
}

object GoogleActionsV2Entitlement {
  @scala.inline
  def apply(
    inAppDetails: GoogleActionsV2SignedData = null,
    sku: String = null,
    skuType: GoogleActionsV2EntitlementSkuType = null
  ): GoogleActionsV2Entitlement = {
    val __obj = js.Dynamic.literal()
    if (inAppDetails != null) __obj.updateDynamic("inAppDetails")(inAppDetails.asInstanceOf[js.Any])
    if (sku != null) __obj.updateDynamic("sku")(sku.asInstanceOf[js.Any])
    if (skuType != null) __obj.updateDynamic("skuType")(skuType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsV2Entitlement]
  }
}

