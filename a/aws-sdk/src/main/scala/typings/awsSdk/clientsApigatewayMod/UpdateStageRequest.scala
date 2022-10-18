package typings.awsSdk.clientsApigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateStageRequest extends StObject {
  
  /**
    * For more information about supported patch operations, see Patch Operations.
    */
  var patchOperations: js.UndefOr[ListOfPatchOperation] = js.undefined
  
  /**
    * The string identifier of the associated RestApi.
    */
  var restApiId: String
  
  /**
    * The name of the Stage resource to change information about.
    */
  var stageName: String
}
object UpdateStageRequest {
  
  inline def apply(restApiId: String, stageName: String): UpdateStageRequest = {
    val __obj = js.Dynamic.literal(restApiId = restApiId.asInstanceOf[js.Any], stageName = stageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateStageRequest]
  }
  
  extension [Self <: UpdateStageRequest](x: Self) {
    
    inline def setPatchOperations(value: ListOfPatchOperation): Self = StObject.set(x, "patchOperations", value.asInstanceOf[js.Any])
    
    inline def setPatchOperationsUndefined: Self = StObject.set(x, "patchOperations", js.undefined)
    
    inline def setPatchOperationsVarargs(value: PatchOperation*): Self = StObject.set(x, "patchOperations", js.Array(value*))
    
    inline def setRestApiId(value: String): Self = StObject.set(x, "restApiId", value.asInstanceOf[js.Any])
    
    inline def setStageName(value: String): Self = StObject.set(x, "stageName", value.asInstanceOf[js.Any])
  }
}
