package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsOrdersV3VerticalsPurchasePurchaseFulfillmentInfo extends StObject {
  
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
  implicit class GoogleActionsOrdersV3VerticalsPurchasePurchaseFulfillmentInfoMutableBuilder[Self <: GoogleActionsOrdersV3VerticalsPurchasePurchaseFulfillmentInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpectedFulfillmentTime(value: GoogleActionsOrdersV3Time): Self = StObject.set(x, "expectedFulfillmentTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectedFulfillmentTimeUndefined: Self = StObject.set(x, "expectedFulfillmentTime", js.undefined)
    
    @scala.inline
    def setExpectedPreparationTime(value: GoogleActionsOrdersV3Time): Self = StObject.set(x, "expectedPreparationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectedPreparationTimeUndefined: Self = StObject.set(x, "expectedPreparationTime", js.undefined)
    
    @scala.inline
    def setExpireTime(value: String): Self = StObject.set(x, "expireTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpireTimeUndefined: Self = StObject.set(x, "expireTime", js.undefined)
    
    @scala.inline
    def setFulfillmentContact(value: GoogleActionsOrdersV3UserInfo): Self = StObject.set(x, "fulfillmentContact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFulfillmentContactUndefined: Self = StObject.set(x, "fulfillmentContact", js.undefined)
    
    @scala.inline
    def setFulfillmentType(value: GoogleActionsOrdersV3VerticalsPurchasePurchaseFulfillmentInfoFulfillmentType): Self = StObject.set(x, "fulfillmentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFulfillmentTypeUndefined: Self = StObject.set(x, "fulfillmentType", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setLocation(value: GoogleActionsV2Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setPickupInfo(value: GoogleActionsOrdersV3VerticalsPurchasePickupInfo): Self = StObject.set(x, "pickupInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPickupInfoUndefined: Self = StObject.set(x, "pickupInfo", js.undefined)
    
    @scala.inline
    def setPrice(value: GoogleActionsOrdersV3PriceAttribute): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
    
    @scala.inline
    def setShippingMethodName(value: String): Self = StObject.set(x, "shippingMethodName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShippingMethodNameUndefined: Self = StObject.set(x, "shippingMethodName", js.undefined)
    
    @scala.inline
    def setStoreCode(value: String): Self = StObject.set(x, "storeCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoreCodeUndefined: Self = StObject.set(x, "storeCode", js.undefined)
  }
}
