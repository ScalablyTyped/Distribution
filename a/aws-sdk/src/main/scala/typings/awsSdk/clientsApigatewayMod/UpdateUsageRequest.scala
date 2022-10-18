package typings.awsSdk.clientsApigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateUsageRequest extends StObject {
  
  /**
    * The identifier of the API key associated with the usage plan in which a temporary extension is granted to the remaining quota.
    */
  var keyId: String
  
  /**
    * For more information about supported patch operations, see Patch Operations.
    */
  var patchOperations: js.UndefOr[ListOfPatchOperation] = js.undefined
  
  /**
    * The Id of the usage plan associated with the usage data.
    */
  var usagePlanId: String
}
object UpdateUsageRequest {
  
  inline def apply(keyId: String, usagePlanId: String): UpdateUsageRequest = {
    val __obj = js.Dynamic.literal(keyId = keyId.asInstanceOf[js.Any], usagePlanId = usagePlanId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateUsageRequest]
  }
  
  extension [Self <: UpdateUsageRequest](x: Self) {
    
    inline def setKeyId(value: String): Self = StObject.set(x, "keyId", value.asInstanceOf[js.Any])
    
    inline def setPatchOperations(value: ListOfPatchOperation): Self = StObject.set(x, "patchOperations", value.asInstanceOf[js.Any])
    
    inline def setPatchOperationsUndefined: Self = StObject.set(x, "patchOperations", js.undefined)
    
    inline def setPatchOperationsVarargs(value: PatchOperation*): Self = StObject.set(x, "patchOperations", js.Array(value*))
    
    inline def setUsagePlanId(value: String): Self = StObject.set(x, "usagePlanId", value.asInstanceOf[js.Any])
  }
}
