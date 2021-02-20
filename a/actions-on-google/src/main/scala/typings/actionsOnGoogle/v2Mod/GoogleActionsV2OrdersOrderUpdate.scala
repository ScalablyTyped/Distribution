package typings.actionsOnGoogle.v2Mod

import typings.actionsOnGoogle.commonMod.ApiClientObjectMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2OrdersOrderUpdate extends StObject {
  
  /**
    * Required. The canonical order id referencing this order.
    * If integrators don't generate the canonical order id in their system,
    * they can simply copy over google_order_id included in order.
    */
  var actionOrderId: js.UndefOr[String] = js.native
  
  /**
    * Information about cancellation state.
    */
  var cancellationInfo: js.UndefOr[GoogleActionsV2OrdersCancellationInfo] = js.native
  
  /**
    * Information about fulfillment state.
    */
  var fulfillmentInfo: js.UndefOr[GoogleActionsV2OrdersFulfillmentInfo] = js.native
  
  /**
    * Id of the order is the Google-issued id.
    */
  var googleOrderId: js.UndefOr[String] = js.native
  
  /**
    * Information about in transit state.
    */
  var inTransitInfo: js.UndefOr[GoogleActionsV2OrdersInTransitInfo] = js.native
  
  /**
    * Extra data based on a custom order state or in addition to info of a
    * standard state.
    */
  var infoExtension: js.UndefOr[ApiClientObjectMap[_]] = js.native
  
  /**
    * Map of line item-level changes, keyed by item id. Optional.
    */
  var lineItemUpdates: js.UndefOr[ApiClientObjectMap[GoogleActionsV2OrdersLineItemUpdate]] = js.native
  
  /**
    * Updated applicable management actions for the order, e.g. manage, modify,
    * contact support.
    */
  var orderManagementActions: js.UndefOr[js.Array[GoogleActionsV2OrdersOrderUpdateAction]] = js.native
  
  /**
    * The new state of the order.
    */
  var orderState: js.UndefOr[GoogleActionsV2OrdersOrderState] = js.native
  
  /**
    * Receipt for order.
    */
  var receipt: js.UndefOr[GoogleActionsV2OrdersReceipt] = js.native
  
  /**
    * Information about rejection state.
    */
  var rejectionInfo: js.UndefOr[GoogleActionsV2OrdersRejectionInfo] = js.native
  
  /**
    * Information about returned state.
    */
  var returnInfo: js.UndefOr[GoogleActionsV2OrdersReturnInfo] = js.native
  
  /**
    * New total price of the order
    */
  var totalPrice: js.UndefOr[GoogleActionsV2OrdersPrice] = js.native
  
  /**
    * When the order was updated from the app's perspective.
    */
  var updateTime: js.UndefOr[String] = js.native
  
  /**
    * If specified, displays a notification to the user with the specified
    * title and text. Specifying a notification is a suggestion to
    * notify and is not guaranteed to result in a notification.
    */
  var userNotification: js.UndefOr[GoogleActionsV2OrdersOrderUpdateUserNotification] = js.native
}
object GoogleActionsV2OrdersOrderUpdate {
  
  @scala.inline
  def apply(): GoogleActionsV2OrdersOrderUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2OrdersOrderUpdate]
  }
  
  @scala.inline
  implicit class GoogleActionsV2OrdersOrderUpdateMutableBuilder[Self <: GoogleActionsV2OrdersOrderUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionOrderId(value: String): Self = StObject.set(x, "actionOrderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionOrderIdUndefined: Self = StObject.set(x, "actionOrderId", js.undefined)
    
    @scala.inline
    def setCancellationInfo(value: GoogleActionsV2OrdersCancellationInfo): Self = StObject.set(x, "cancellationInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancellationInfoUndefined: Self = StObject.set(x, "cancellationInfo", js.undefined)
    
    @scala.inline
    def setFulfillmentInfo(value: GoogleActionsV2OrdersFulfillmentInfo): Self = StObject.set(x, "fulfillmentInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFulfillmentInfoUndefined: Self = StObject.set(x, "fulfillmentInfo", js.undefined)
    
    @scala.inline
    def setGoogleOrderId(value: String): Self = StObject.set(x, "googleOrderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoogleOrderIdUndefined: Self = StObject.set(x, "googleOrderId", js.undefined)
    
    @scala.inline
    def setInTransitInfo(value: GoogleActionsV2OrdersInTransitInfo): Self = StObject.set(x, "inTransitInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInTransitInfoUndefined: Self = StObject.set(x, "inTransitInfo", js.undefined)
    
    @scala.inline
    def setInfoExtension(value: ApiClientObjectMap[_]): Self = StObject.set(x, "infoExtension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoExtensionUndefined: Self = StObject.set(x, "infoExtension", js.undefined)
    
    @scala.inline
    def setLineItemUpdates(value: ApiClientObjectMap[GoogleActionsV2OrdersLineItemUpdate]): Self = StObject.set(x, "lineItemUpdates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineItemUpdatesUndefined: Self = StObject.set(x, "lineItemUpdates", js.undefined)
    
    @scala.inline
    def setOrderManagementActions(value: js.Array[GoogleActionsV2OrdersOrderUpdateAction]): Self = StObject.set(x, "orderManagementActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderManagementActionsUndefined: Self = StObject.set(x, "orderManagementActions", js.undefined)
    
    @scala.inline
    def setOrderManagementActionsVarargs(value: GoogleActionsV2OrdersOrderUpdateAction*): Self = StObject.set(x, "orderManagementActions", js.Array(value :_*))
    
    @scala.inline
    def setOrderState(value: GoogleActionsV2OrdersOrderState): Self = StObject.set(x, "orderState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderStateUndefined: Self = StObject.set(x, "orderState", js.undefined)
    
    @scala.inline
    def setReceipt(value: GoogleActionsV2OrdersReceipt): Self = StObject.set(x, "receipt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceiptUndefined: Self = StObject.set(x, "receipt", js.undefined)
    
    @scala.inline
    def setRejectionInfo(value: GoogleActionsV2OrdersRejectionInfo): Self = StObject.set(x, "rejectionInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRejectionInfoUndefined: Self = StObject.set(x, "rejectionInfo", js.undefined)
    
    @scala.inline
    def setReturnInfo(value: GoogleActionsV2OrdersReturnInfo): Self = StObject.set(x, "returnInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnInfoUndefined: Self = StObject.set(x, "returnInfo", js.undefined)
    
    @scala.inline
    def setTotalPrice(value: GoogleActionsV2OrdersPrice): Self = StObject.set(x, "totalPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalPriceUndefined: Self = StObject.set(x, "totalPrice", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    
    @scala.inline
    def setUserNotification(value: GoogleActionsV2OrdersOrderUpdateUserNotification): Self = StObject.set(x, "userNotification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserNotificationUndefined: Self = StObject.set(x, "userNotification", js.undefined)
  }
}
