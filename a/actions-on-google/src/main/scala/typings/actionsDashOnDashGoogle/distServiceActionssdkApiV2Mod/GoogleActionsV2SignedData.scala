package typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod

import typings.actionsDashOnDashGoogle.distCommonMod.ApiClientObjectMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2SignedData extends js.Object {
  /**
    * Matches IN_APP_DATA_SIGNATURE from getPurchases() method in Play InApp
    * Billing API.
    */
  var inAppDataSignature: js.UndefOr[String] = js.undefined
  /**
    * Match INAPP_PURCHASE_DATA
    * from getPurchases() method. Contains all inapp purchase data in JSON format
    * See details in table 6 of
    * https://developer.android.com/google/play/billing/billing_reference.html.
    */
  var inAppPurchaseData: js.UndefOr[ApiClientObjectMap[_]] = js.undefined
}

object GoogleActionsV2SignedData {
  @scala.inline
  def apply(inAppDataSignature: String = null, inAppPurchaseData: ApiClientObjectMap[_] = null): GoogleActionsV2SignedData = {
    val __obj = js.Dynamic.literal()
    if (inAppDataSignature != null) __obj.updateDynamic("inAppDataSignature")(inAppDataSignature.asInstanceOf[js.Any])
    if (inAppPurchaseData != null) __obj.updateDynamic("inAppPurchaseData")(inAppPurchaseData.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsV2SignedData]
  }
}

