package typings.actionsOnGoogle.v2Mod

import typings.actionsOnGoogle.commonMod.ApiClientObjectMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2SignedData extends js.Object {
  
  /**
    * Matches IN_APP_DATA_SIGNATURE from getPurchases() method in Play InApp
    * Billing API.
    */
  var inAppDataSignature: js.UndefOr[String] = js.native
  
  /**
    * Match INAPP_PURCHASE_DATA
    * from getPurchases() method. Contains all inapp purchase data in JSON format
    * See details in table 6 of
    * https://developer.android.com/google/play/billing/billing_reference.html.
    */
  var inAppPurchaseData: js.UndefOr[ApiClientObjectMap[_]] = js.native
}
object GoogleActionsV2SignedData {
  
  @scala.inline
  def apply(): GoogleActionsV2SignedData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2SignedData]
  }
  
  @scala.inline
  implicit class GoogleActionsV2SignedDataOps[Self <: GoogleActionsV2SignedData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInAppDataSignature(value: String): Self = this.set("inAppDataSignature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInAppDataSignature: Self = this.set("inAppDataSignature", js.undefined)
    
    @scala.inline
    def setInAppPurchaseData(value: ApiClientObjectMap[_]): Self = this.set("inAppPurchaseData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInAppPurchaseData: Self = this.set("inAppPurchaseData", js.undefined)
  }
}
