package typings.awsSdk.clientsCostexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateCostAllocationTagsStatusRequest extends StObject {
  
  /**
    * The list of CostAllocationTagStatusEntry objects that are used to update cost allocation tags status for this request. 
    */
  var CostAllocationTagsStatus: CostAllocationTagStatusList
}
object UpdateCostAllocationTagsStatusRequest {
  
  inline def apply(CostAllocationTagsStatus: CostAllocationTagStatusList): UpdateCostAllocationTagsStatusRequest = {
    val __obj = js.Dynamic.literal(CostAllocationTagsStatus = CostAllocationTagsStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCostAllocationTagsStatusRequest]
  }
  
  extension [Self <: UpdateCostAllocationTagsStatusRequest](x: Self) {
    
    inline def setCostAllocationTagsStatus(value: CostAllocationTagStatusList): Self = StObject.set(x, "CostAllocationTagsStatus", value.asInstanceOf[js.Any])
    
    inline def setCostAllocationTagsStatusVarargs(value: CostAllocationTagStatusEntry*): Self = StObject.set(x, "CostAllocationTagsStatus", js.Array(value*))
  }
}
