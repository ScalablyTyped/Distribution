package typings.awsSdk.clientsOutpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Order extends StObject {
  
  /**
    * The line items for the order
    */
  var LineItems: js.UndefOr[LineItemListDefinition] = js.undefined
  
  /**
    * The fulfillment date of the order.
    */
  var OrderFulfilledDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ID of the order.
    */
  var OrderId: js.UndefOr[typings.awsSdk.clientsOutpostsMod.OrderId] = js.undefined
  
  /**
    * The submission date for the order.
    */
  var OrderSubmissionDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The type of order.
    */
  var OrderType: js.UndefOr[typings.awsSdk.clientsOutpostsMod.OrderType] = js.undefined
  
  /**
    *  The ID of the Outpost in the order. 
    */
  var OutpostId: js.UndefOr[OutpostIdOnly] = js.undefined
  
  /**
    * The payment option for the order.
    */
  var PaymentOption: js.UndefOr[typings.awsSdk.clientsOutpostsMod.PaymentOption] = js.undefined
  
  /**
    * The payment term.
    */
  var PaymentTerm: js.UndefOr[typings.awsSdk.clientsOutpostsMod.PaymentTerm] = js.undefined
  
  /**
    * The status of the order.    PREPARING - Order is received and being prepared.    IN_PROGRESS - Order is either being built, shipped, or installed. To get more details, see the line item status.    COMPLETED - Order is complete.    CANCELLED - Order is cancelled.    ERROR - Customer should contact support.    The following status are deprecated: RECEIVED, PENDING, PROCESSING, INSTALLING, and FULFILLED.  
    */
  var Status: js.UndefOr[OrderStatus] = js.undefined
}
object Order {
  
  inline def apply(): Order = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Order]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Order] (val x: Self) extends AnyVal {
    
    inline def setLineItems(value: LineItemListDefinition): Self = StObject.set(x, "LineItems", value.asInstanceOf[js.Any])
    
    inline def setLineItemsUndefined: Self = StObject.set(x, "LineItems", js.undefined)
    
    inline def setLineItemsVarargs(value: LineItem*): Self = StObject.set(x, "LineItems", js.Array(value*))
    
    inline def setOrderFulfilledDate(value: js.Date): Self = StObject.set(x, "OrderFulfilledDate", value.asInstanceOf[js.Any])
    
    inline def setOrderFulfilledDateUndefined: Self = StObject.set(x, "OrderFulfilledDate", js.undefined)
    
    inline def setOrderId(value: OrderId): Self = StObject.set(x, "OrderId", value.asInstanceOf[js.Any])
    
    inline def setOrderIdUndefined: Self = StObject.set(x, "OrderId", js.undefined)
    
    inline def setOrderSubmissionDate(value: js.Date): Self = StObject.set(x, "OrderSubmissionDate", value.asInstanceOf[js.Any])
    
    inline def setOrderSubmissionDateUndefined: Self = StObject.set(x, "OrderSubmissionDate", js.undefined)
    
    inline def setOrderType(value: OrderType): Self = StObject.set(x, "OrderType", value.asInstanceOf[js.Any])
    
    inline def setOrderTypeUndefined: Self = StObject.set(x, "OrderType", js.undefined)
    
    inline def setOutpostId(value: OutpostIdOnly): Self = StObject.set(x, "OutpostId", value.asInstanceOf[js.Any])
    
    inline def setOutpostIdUndefined: Self = StObject.set(x, "OutpostId", js.undefined)
    
    inline def setPaymentOption(value: PaymentOption): Self = StObject.set(x, "PaymentOption", value.asInstanceOf[js.Any])
    
    inline def setPaymentOptionUndefined: Self = StObject.set(x, "PaymentOption", js.undefined)
    
    inline def setPaymentTerm(value: PaymentTerm): Self = StObject.set(x, "PaymentTerm", value.asInstanceOf[js.Any])
    
    inline def setPaymentTermUndefined: Self = StObject.set(x, "PaymentTerm", js.undefined)
    
    inline def setStatus(value: OrderStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
