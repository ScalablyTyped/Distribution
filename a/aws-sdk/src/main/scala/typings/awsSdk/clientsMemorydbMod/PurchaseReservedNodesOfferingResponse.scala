package typings.awsSdk.clientsMemorydbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PurchaseReservedNodesOfferingResponse extends StObject {
  
  /**
    * Represents the output of a PurchaseReservedNodesOffering operation.
    */
  var ReservedNode: js.UndefOr[typings.awsSdk.clientsMemorydbMod.ReservedNode] = js.undefined
}
object PurchaseReservedNodesOfferingResponse {
  
  inline def apply(): PurchaseReservedNodesOfferingResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PurchaseReservedNodesOfferingResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PurchaseReservedNodesOfferingResponse] (val x: Self) extends AnyVal {
    
    inline def setReservedNode(value: ReservedNode): Self = StObject.set(x, "ReservedNode", value.asInstanceOf[js.Any])
    
    inline def setReservedNodeUndefined: Self = StObject.set(x, "ReservedNode", js.undefined)
  }
}
