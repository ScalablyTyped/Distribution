package typings.awsSdk.clientsOutpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrderSummary extends StObject {
  
  /**
    *  The status of all line items in the order. 
    */
  var LineItemCountsByStatus: js.UndefOr[LineItemStatusCounts] = js.undefined
  
  /**
    *  The fulfilment date for the order. 
    */
  var OrderFulfilledDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The ID of the order. 
    */
  var OrderId: js.UndefOr[typings.awsSdk.clientsOutpostsMod.OrderId] = js.undefined
  
  /**
    *  The submission date for the order. 
    */
  var OrderSubmissionDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The type of order. 
    */
  var OrderType: js.UndefOr[typings.awsSdk.clientsOutpostsMod.OrderType] = js.undefined
  
  /**
    *  The ID of the Outpost. 
    */
  var OutpostId: js.UndefOr[OutpostIdOnly] = js.undefined
  
  /**
    * The status of the order.    PREPARING - Order is received and is being prepared.    IN_PROGRESS - Order is either being built, shipped, or installed. For more information, see the LineItem status.    COMPLETED - Order is complete.    CANCELLED - Order is cancelled.    ERROR - Customer should contact support.    The following statuses are deprecated: RECEIVED, PENDING, PROCESSING, INSTALLING, and FULFILLED.  
    */
  var Status: js.UndefOr[OrderStatus] = js.undefined
}
object OrderSummary {
  
  inline def apply(): OrderSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderSummary]
  }
  
  extension [Self <: OrderSummary](x: Self) {
    
    inline def setLineItemCountsByStatus(value: LineItemStatusCounts): Self = StObject.set(x, "LineItemCountsByStatus", value.asInstanceOf[js.Any])
    
    inline def setLineItemCountsByStatusUndefined: Self = StObject.set(x, "LineItemCountsByStatus", js.undefined)
    
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
    
    inline def setStatus(value: OrderStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
