package typings.actionsOnGoogle.v2Mod

import typings.actionsOnGoogle.commonMod.ApiClientObjectMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2OrdersOrderUpdate extends js.Object {
  
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
  implicit class GoogleActionsV2OrdersOrderUpdateOps[Self <: GoogleActionsV2OrdersOrderUpdate] (val x: Self) extends AnyVal {
    
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
    def setActionOrderId(value: String): Self = this.set("actionOrderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionOrderId: Self = this.set("actionOrderId", js.undefined)
    
    @scala.inline
    def setCancellationInfo(value: GoogleActionsV2OrdersCancellationInfo): Self = this.set("cancellationInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancellationInfo: Self = this.set("cancellationInfo", js.undefined)
    
    @scala.inline
    def setFulfillmentInfo(value: GoogleActionsV2OrdersFulfillmentInfo): Self = this.set("fulfillmentInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFulfillmentInfo: Self = this.set("fulfillmentInfo", js.undefined)
    
    @scala.inline
    def setGoogleOrderId(value: String): Self = this.set("googleOrderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGoogleOrderId: Self = this.set("googleOrderId", js.undefined)
    
    @scala.inline
    def setInTransitInfo(value: GoogleActionsV2OrdersInTransitInfo): Self = this.set("inTransitInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInTransitInfo: Self = this.set("inTransitInfo", js.undefined)
    
    @scala.inline
    def setInfoExtension(value: ApiClientObjectMap[_]): Self = this.set("infoExtension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInfoExtension: Self = this.set("infoExtension", js.undefined)
    
    @scala.inline
    def setLineItemUpdates(value: ApiClientObjectMap[GoogleActionsV2OrdersLineItemUpdate]): Self = this.set("lineItemUpdates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineItemUpdates: Self = this.set("lineItemUpdates", js.undefined)
    
    @scala.inline
    def setOrderManagementActionsVarargs(value: GoogleActionsV2OrdersOrderUpdateAction*): Self = this.set("orderManagementActions", js.Array(value :_*))
    
    @scala.inline
    def setOrderManagementActions(value: js.Array[GoogleActionsV2OrdersOrderUpdateAction]): Self = this.set("orderManagementActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrderManagementActions: Self = this.set("orderManagementActions", js.undefined)
    
    @scala.inline
    def setOrderState(value: GoogleActionsV2OrdersOrderState): Self = this.set("orderState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrderState: Self = this.set("orderState", js.undefined)
    
    @scala.inline
    def setReceipt(value: GoogleActionsV2OrdersReceipt): Self = this.set("receipt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReceipt: Self = this.set("receipt", js.undefined)
    
    @scala.inline
    def setRejectionInfo(value: GoogleActionsV2OrdersRejectionInfo): Self = this.set("rejectionInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRejectionInfo: Self = this.set("rejectionInfo", js.undefined)
    
    @scala.inline
    def setReturnInfo(value: GoogleActionsV2OrdersReturnInfo): Self = this.set("returnInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnInfo: Self = this.set("returnInfo", js.undefined)
    
    @scala.inline
    def setTotalPrice(value: GoogleActionsV2OrdersPrice): Self = this.set("totalPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalPrice: Self = this.set("totalPrice", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
    
    @scala.inline
    def setUserNotification(value: GoogleActionsV2OrdersOrderUpdateUserNotification): Self = this.set("userNotification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserNotification: Self = this.set("userNotification", js.undefined)
  }
}
