package typings.awsSdk.clientsMemorydbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReservedNode extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the reserved node.
    */
  var ARN: js.UndefOr[String] = js.undefined
  
  /**
    * The duration of the reservation in seconds.
    */
  var Duration: js.UndefOr[Integer] = js.undefined
  
  /**
    * The fixed price charged for this reserved node.
    */
  var FixedPrice: js.UndefOr[Double] = js.undefined
  
  /**
    * The number of nodes that have been reserved.
    */
  var NodeCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The node type for the reserved nodes.
    */
  var NodeType: js.UndefOr[String] = js.undefined
  
  /**
    * The offering type of this reserved node.
    */
  var OfferingType: js.UndefOr[String] = js.undefined
  
  /**
    * The recurring price charged to run this reserved node.
    */
  var RecurringCharges: js.UndefOr[RecurringChargeList] = js.undefined
  
  /**
    * A customer-specified identifier to track this reservation.
    */
  var ReservationId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the reserved node offering to purchase.
    */
  var ReservedNodesOfferingId: js.UndefOr[String] = js.undefined
  
  /**
    * The time the reservation started.
    */
  var StartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The state of the reserved node.
    */
  var State: js.UndefOr[String] = js.undefined
}
object ReservedNode {
  
  inline def apply(): ReservedNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservedNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReservedNode] (val x: Self) extends AnyVal {
    
    inline def setARN(value: String): Self = StObject.set(x, "ARN", value.asInstanceOf[js.Any])
    
    inline def setARNUndefined: Self = StObject.set(x, "ARN", js.undefined)
    
    inline def setDuration(value: Integer): Self = StObject.set(x, "Duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "Duration", js.undefined)
    
    inline def setFixedPrice(value: Double): Self = StObject.set(x, "FixedPrice", value.asInstanceOf[js.Any])
    
    inline def setFixedPriceUndefined: Self = StObject.set(x, "FixedPrice", js.undefined)
    
    inline def setNodeCount(value: Integer): Self = StObject.set(x, "NodeCount", value.asInstanceOf[js.Any])
    
    inline def setNodeCountUndefined: Self = StObject.set(x, "NodeCount", js.undefined)
    
    inline def setNodeType(value: String): Self = StObject.set(x, "NodeType", value.asInstanceOf[js.Any])
    
    inline def setNodeTypeUndefined: Self = StObject.set(x, "NodeType", js.undefined)
    
    inline def setOfferingType(value: String): Self = StObject.set(x, "OfferingType", value.asInstanceOf[js.Any])
    
    inline def setOfferingTypeUndefined: Self = StObject.set(x, "OfferingType", js.undefined)
    
    inline def setRecurringCharges(value: RecurringChargeList): Self = StObject.set(x, "RecurringCharges", value.asInstanceOf[js.Any])
    
    inline def setRecurringChargesUndefined: Self = StObject.set(x, "RecurringCharges", js.undefined)
    
    inline def setRecurringChargesVarargs(value: RecurringCharge*): Self = StObject.set(x, "RecurringCharges", js.Array(value*))
    
    inline def setReservationId(value: String): Self = StObject.set(x, "ReservationId", value.asInstanceOf[js.Any])
    
    inline def setReservationIdUndefined: Self = StObject.set(x, "ReservationId", js.undefined)
    
    inline def setReservedNodesOfferingId(value: String): Self = StObject.set(x, "ReservedNodesOfferingId", value.asInstanceOf[js.Any])
    
    inline def setReservedNodesOfferingIdUndefined: Self = StObject.set(x, "ReservedNodesOfferingId", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
