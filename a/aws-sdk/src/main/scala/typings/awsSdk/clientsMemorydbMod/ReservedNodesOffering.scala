package typings.awsSdk.clientsMemorydbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReservedNodesOffering extends StObject {
  
  /**
    * The duration of the reservation in seconds.
    */
  var Duration: js.UndefOr[Integer] = js.undefined
  
  /**
    * The fixed price charged for this reserved node.
    */
  var FixedPrice: js.UndefOr[Double] = js.undefined
  
  /**
    * The node type for the reserved nodes. For more information, see Supported node types.
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
    * The offering identifier.
    */
  var ReservedNodesOfferingId: js.UndefOr[String] = js.undefined
}
object ReservedNodesOffering {
  
  inline def apply(): ReservedNodesOffering = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservedNodesOffering]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReservedNodesOffering] (val x: Self) extends AnyVal {
    
    inline def setDuration(value: Integer): Self = StObject.set(x, "Duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "Duration", js.undefined)
    
    inline def setFixedPrice(value: Double): Self = StObject.set(x, "FixedPrice", value.asInstanceOf[js.Any])
    
    inline def setFixedPriceUndefined: Self = StObject.set(x, "FixedPrice", js.undefined)
    
    inline def setNodeType(value: String): Self = StObject.set(x, "NodeType", value.asInstanceOf[js.Any])
    
    inline def setNodeTypeUndefined: Self = StObject.set(x, "NodeType", js.undefined)
    
    inline def setOfferingType(value: String): Self = StObject.set(x, "OfferingType", value.asInstanceOf[js.Any])
    
    inline def setOfferingTypeUndefined: Self = StObject.set(x, "OfferingType", js.undefined)
    
    inline def setRecurringCharges(value: RecurringChargeList): Self = StObject.set(x, "RecurringCharges", value.asInstanceOf[js.Any])
    
    inline def setRecurringChargesUndefined: Self = StObject.set(x, "RecurringCharges", js.undefined)
    
    inline def setRecurringChargesVarargs(value: RecurringCharge*): Self = StObject.set(x, "RecurringCharges", js.Array(value*))
    
    inline def setReservedNodesOfferingId(value: String): Self = StObject.set(x, "ReservedNodesOfferingId", value.asInstanceOf[js.Any])
    
    inline def setReservedNodesOfferingIdUndefined: Self = StObject.set(x, "ReservedNodesOfferingId", js.undefined)
  }
}
