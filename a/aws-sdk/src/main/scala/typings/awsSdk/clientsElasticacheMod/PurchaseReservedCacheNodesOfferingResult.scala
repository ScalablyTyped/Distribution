package typings.awsSdk.clientsElasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PurchaseReservedCacheNodesOfferingResult extends StObject {
  
  var ReservedCacheNode: js.UndefOr[typings.awsSdk.clientsElasticacheMod.ReservedCacheNode] = js.undefined
}
object PurchaseReservedCacheNodesOfferingResult {
  
  inline def apply(): PurchaseReservedCacheNodesOfferingResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PurchaseReservedCacheNodesOfferingResult]
  }
  
  extension [Self <: PurchaseReservedCacheNodesOfferingResult](x: Self) {
    
    inline def setReservedCacheNode(value: ReservedCacheNode): Self = StObject.set(x, "ReservedCacheNode", value.asInstanceOf[js.Any])
    
    inline def setReservedCacheNodeUndefined: Self = StObject.set(x, "ReservedCacheNode", js.undefined)
  }
}
