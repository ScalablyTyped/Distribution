package typings.awsSdk.clientsMemorydbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PurchaseReservedNodesOfferingRequest extends StObject {
  
  /**
    * The number of node instances to reserve.
    */
  var NodeCount: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * A customer-specified identifier to track this reservation.
    */
  var ReservationId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the reserved node offering to purchase.
    */
  var ReservedNodesOfferingId: String
  
  /**
    * A list of tags to be added to this resource. A tag is a key-value pair. A tag key must be accompanied by a tag value, although null is accepted.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object PurchaseReservedNodesOfferingRequest {
  
  inline def apply(ReservedNodesOfferingId: String): PurchaseReservedNodesOfferingRequest = {
    val __obj = js.Dynamic.literal(ReservedNodesOfferingId = ReservedNodesOfferingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PurchaseReservedNodesOfferingRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PurchaseReservedNodesOfferingRequest] (val x: Self) extends AnyVal {
    
    inline def setNodeCount(value: IntegerOptional): Self = StObject.set(x, "NodeCount", value.asInstanceOf[js.Any])
    
    inline def setNodeCountUndefined: Self = StObject.set(x, "NodeCount", js.undefined)
    
    inline def setReservationId(value: String): Self = StObject.set(x, "ReservationId", value.asInstanceOf[js.Any])
    
    inline def setReservationIdUndefined: Self = StObject.set(x, "ReservationId", js.undefined)
    
    inline def setReservedNodesOfferingId(value: String): Self = StObject.set(x, "ReservedNodesOfferingId", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
