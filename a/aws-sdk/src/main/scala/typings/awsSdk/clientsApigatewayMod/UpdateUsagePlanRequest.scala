package typings.awsSdk.clientsApigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateUsagePlanRequest extends StObject {
  
  /**
    * For more information about supported patch operations, see Patch Operations.
    */
  var patchOperations: js.UndefOr[ListOfPatchOperation] = js.undefined
  
  /**
    * The Id of the to-be-updated usage plan.
    */
  var usagePlanId: String
}
object UpdateUsagePlanRequest {
  
  inline def apply(usagePlanId: String): UpdateUsagePlanRequest = {
    val __obj = js.Dynamic.literal(usagePlanId = usagePlanId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateUsagePlanRequest]
  }
  
  extension [Self <: UpdateUsagePlanRequest](x: Self) {
    
    inline def setPatchOperations(value: ListOfPatchOperation): Self = StObject.set(x, "patchOperations", value.asInstanceOf[js.Any])
    
    inline def setPatchOperationsUndefined: Self = StObject.set(x, "patchOperations", js.undefined)
    
    inline def setPatchOperationsVarargs(value: PatchOperation*): Self = StObject.set(x, "patchOperations", js.Array(value*))
    
    inline def setUsagePlanId(value: String): Self = StObject.set(x, "usagePlanId", value.asInstanceOf[js.Any])
  }
}
