package typings.awsSdk.clientsCostexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateCostAllocationTagsStatusResponse extends StObject {
  
  /**
    * A list of UpdateCostAllocationTagsStatusError objects with error details about each cost allocation tag that can't be updated. If there's no failure, an empty array returns. 
    */
  var Errors: js.UndefOr[UpdateCostAllocationTagsStatusErrors] = js.undefined
}
object UpdateCostAllocationTagsStatusResponse {
  
  inline def apply(): UpdateCostAllocationTagsStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateCostAllocationTagsStatusResponse]
  }
  
  extension [Self <: UpdateCostAllocationTagsStatusResponse](x: Self) {
    
    inline def setErrors(value: UpdateCostAllocationTagsStatusErrors): Self = StObject.set(x, "Errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "Errors", js.undefined)
    
    inline def setErrorsVarargs(value: UpdateCostAllocationTagsStatusError*): Self = StObject.set(x, "Errors", js.Array(value*))
  }
}
