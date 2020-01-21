package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsOrdersV3VerticalsPurchasePurchaseFulfillmentInfo extends js.Object {
  /**
    * A window if a time-range is specified or ETA if single time specified.
    * Expected delivery or pickup time.
    */
  var expectedFulfillmentTime: js.UndefOr[GoogleActionsOrdersV3Time] = js.undefined
  /**
    * A window if a time-range is specified or ETA if single time specified.
    * Expected time to prepare the food. Single-time preferred.
    */
  var expectedPreparationTime: js.UndefOr[GoogleActionsOrdersV3Time] = js.undefined
  /**
    * Time at which this fulfillment option expires.
    */
  var expireTime: js.UndefOr[String] = js.undefined
  /**
    * User contact for this fulfillment.
    */
  var fulfillmentContact: js.UndefOr[GoogleActionsOrdersV3UserInfo] = js.undefined
  /**
    * Required: The type of fulfillment.
    */
  var fulfillmentType: js.UndefOr[GoogleActionsOrdersV3VerticalsPurchasePurchaseFulfillmentInfoFulfillmentType] = js.undefined
  /**
    * Unique identifier for this service option.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * Pickup or delivery location.
    */
  var location: js.UndefOr[GoogleActionsV2Location] = js.undefined
  /**
    * Additional information regarding how order would be picked. This field
    * would only be applicable when fulfillment type is PICKUP.
    */
  var pickupInfo: js.UndefOr[GoogleActionsOrdersV3VerticalsPurchasePickupInfo] = js.undefined
  /**
    * Cost of this option.
    */
  var price: js.UndefOr[GoogleActionsOrdersV3PriceAttribute] = js.undefined
  /**
    * Name of the shipping method selected by the user.
    */
  var shippingMethodName: js.UndefOr[String] = js.undefined
  /**
    * StoreCode of the location.
    * Example: Walmart is the merchant and store_code is the walmart store
    * where fulfillment happened.
    * https://support.google.com/business/answer/3370250?hl=en&ref_topic=4596653.
    */
  var storeCode: js.UndefOr[String] = js.undefined
}

object GoogleActionsOrdersV3VerticalsPurchasePurchaseFulfillmentInfo {
  @scala.inline
  def apply(
    expectedFulfillmentTime: GoogleActionsOrdersV3Time = null,
    expectedPreparationTime: GoogleActionsOrdersV3Time = null,
    expireTime: String = null,
    fulfillmentContact: GoogleActionsOrdersV3UserInfo = null,
    fulfillmentType: GoogleActionsOrdersV3VerticalsPurchasePurchaseFulfillmentInfoFulfillmentType = null,
    id: String = null,
    location: GoogleActionsV2Location = null,
    pickupInfo: GoogleActionsOrdersV3VerticalsPurchasePickupInfo = null,
    price: GoogleActionsOrdersV3PriceAttribute = null,
    shippingMethodName: String = null,
    storeCode: String = null
  ): GoogleActionsOrdersV3VerticalsPurchasePurchaseFulfillmentInfo = {
    val __obj = js.Dynamic.literal()
    if (expectedFulfillmentTime != null) __obj.updateDynamic("expectedFulfillmentTime")(expectedFulfillmentTime.asInstanceOf[js.Any])
    if (expectedPreparationTime != null) __obj.updateDynamic("expectedPreparationTime")(expectedPreparationTime.asInstanceOf[js.Any])
    if (expireTime != null) __obj.updateDynamic("expireTime")(expireTime.asInstanceOf[js.Any])
    if (fulfillmentContact != null) __obj.updateDynamic("fulfillmentContact")(fulfillmentContact.asInstanceOf[js.Any])
    if (fulfillmentType != null) __obj.updateDynamic("fulfillmentType")(fulfillmentType.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (pickupInfo != null) __obj.updateDynamic("pickupInfo")(pickupInfo.asInstanceOf[js.Any])
    if (price != null) __obj.updateDynamic("price")(price.asInstanceOf[js.Any])
    if (shippingMethodName != null) __obj.updateDynamic("shippingMethodName")(shippingMethodName.asInstanceOf[js.Any])
    if (storeCode != null) __obj.updateDynamic("storeCode")(storeCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsOrdersV3VerticalsPurchasePurchaseFulfillmentInfo]
  }
}

