package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsOrdersV3VerticalsPurchasePurchaseFulfillmentInfo extends js.Object {
  
  /**
    * A window if a time-range is specified or ETA if single time specified.
    * Expected delivery or pickup time.
    */
  var expectedFulfillmentTime: js.UndefOr[GoogleActionsOrdersV3Time] = js.native
  
  /**
    * A window if a time-range is specified or ETA if single time specified.
    * Expected time to prepare the food. Single-time preferred.
    */
  var expectedPreparationTime: js.UndefOr[GoogleActionsOrdersV3Time] = js.native
  
  /**
    * Time at which this fulfillment option expires.
    */
  var expireTime: js.UndefOr[String] = js.native
  
  /**
    * User contact for this fulfillment.
    */
  var fulfillmentContact: js.UndefOr[GoogleActionsOrdersV3UserInfo] = js.native
  
  /**
    * Required: The type of fulfillment.
    */
  var fulfillmentType: js.UndefOr[GoogleActionsOrdersV3VerticalsPurchasePurchaseFulfillmentInfoFulfillmentType] = js.native
  
  /**
    * Unique identifier for this service option.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Pickup or delivery location.
    */
  var location: js.UndefOr[GoogleActionsV2Location] = js.native
  
  /**
    * Additional information regarding how order would be picked. This field
    * would only be applicable when fulfillment type is PICKUP.
    */
  var pickupInfo: js.UndefOr[GoogleActionsOrdersV3VerticalsPurchasePickupInfo] = js.native
  
  /**
    * Cost of this option.
    */
  var price: js.UndefOr[GoogleActionsOrdersV3PriceAttribute] = js.native
  
  /**
    * Name of the shipping method selected by the user.
    */
  var shippingMethodName: js.UndefOr[String] = js.native
  
  /**
    * StoreCode of the location.
    * Example: Walmart is the merchant and store_code is the walmart store
    * where fulfillment happened.
    * https://support.google.com/business/answer/3370250?hl=en&ref_topic=4596653.
    */
  var storeCode: js.UndefOr[String] = js.native
}
object GoogleActionsOrdersV3VerticalsPurchasePurchaseFulfillmentInfo {
  
  @scala.inline
  def apply(): GoogleActionsOrdersV3VerticalsPurchasePurchaseFulfillmentInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsOrdersV3VerticalsPurchasePurchaseFulfillmentInfo]
  }
  
  @scala.inline
  implicit class GoogleActionsOrdersV3VerticalsPurchasePurchaseFulfillmentInfoOps[Self <: GoogleActionsOrdersV3VerticalsPurchasePurchaseFulfillmentInfo] (val x: Self) extends AnyVal {
    
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
    def setExpectedFulfillmentTime(value: GoogleActionsOrdersV3Time): Self = this.set("expectedFulfillmentTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpectedFulfillmentTime: Self = this.set("expectedFulfillmentTime", js.undefined)
    
    @scala.inline
    def setExpectedPreparationTime(value: GoogleActionsOrdersV3Time): Self = this.set("expectedPreparationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpectedPreparationTime: Self = this.set("expectedPreparationTime", js.undefined)
    
    @scala.inline
    def setExpireTime(value: String): Self = this.set("expireTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpireTime: Self = this.set("expireTime", js.undefined)
    
    @scala.inline
    def setFulfillmentContact(value: GoogleActionsOrdersV3UserInfo): Self = this.set("fulfillmentContact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFulfillmentContact: Self = this.set("fulfillmentContact", js.undefined)
    
    @scala.inline
    def setFulfillmentType(value: GoogleActionsOrdersV3VerticalsPurchasePurchaseFulfillmentInfoFulfillmentType): Self = this.set("fulfillmentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFulfillmentType: Self = this.set("fulfillmentType", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setLocation(value: GoogleActionsV2Location): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setPickupInfo(value: GoogleActionsOrdersV3VerticalsPurchasePickupInfo): Self = this.set("pickupInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePickupInfo: Self = this.set("pickupInfo", js.undefined)
    
    @scala.inline
    def setPrice(value: GoogleActionsOrdersV3PriceAttribute): Self = this.set("price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrice: Self = this.set("price", js.undefined)
    
    @scala.inline
    def setShippingMethodName(value: String): Self = this.set("shippingMethodName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShippingMethodName: Self = this.set("shippingMethodName", js.undefined)
    
    @scala.inline
    def setStoreCode(value: String): Self = this.set("storeCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStoreCode: Self = this.set("storeCode", js.undefined)
  }
}
