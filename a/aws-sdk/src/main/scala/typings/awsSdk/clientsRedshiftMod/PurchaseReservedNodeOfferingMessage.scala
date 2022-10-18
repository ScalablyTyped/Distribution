package typings.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PurchaseReservedNodeOfferingMessage extends StObject {
  
  /**
    * The number of reserved nodes that you want to purchase. Default: 1 
    */
  var NodeCount: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The unique identifier of the reserved node offering you want to purchase.
    */
  var ReservedNodeOfferingId: String
}
object PurchaseReservedNodeOfferingMessage {
  
  inline def apply(ReservedNodeOfferingId: String): PurchaseReservedNodeOfferingMessage = {
    val __obj = js.Dynamic.literal(ReservedNodeOfferingId = ReservedNodeOfferingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PurchaseReservedNodeOfferingMessage]
  }
  
  extension [Self <: PurchaseReservedNodeOfferingMessage](x: Self) {
    
    inline def setNodeCount(value: IntegerOptional): Self = StObject.set(x, "NodeCount", value.asInstanceOf[js.Any])
    
    inline def setNodeCountUndefined: Self = StObject.set(x, "NodeCount", js.undefined)
    
    inline def setReservedNodeOfferingId(value: String): Self = StObject.set(x, "ReservedNodeOfferingId", value.asInstanceOf[js.Any])
  }
}
