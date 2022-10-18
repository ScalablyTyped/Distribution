package typings.awsSdk.clientsApigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateIntegrationResponseRequest extends StObject {
  
  /**
    * Specifies an update integration response request's HTTP method.
    */
  var httpMethod: String
  
  /**
    * For more information about supported patch operations, see Patch Operations.
    */
  var patchOperations: js.UndefOr[ListOfPatchOperation] = js.undefined
  
  /**
    * Specifies an update integration response request's resource identifier.
    */
  var resourceId: String
  
  /**
    * The string identifier of the associated RestApi.
    */
  var restApiId: String
  
  /**
    * Specifies an update integration response request's status code.
    */
  var statusCode: StatusCode
}
object UpdateIntegrationResponseRequest {
  
  inline def apply(httpMethod: String, resourceId: String, restApiId: String, statusCode: StatusCode): UpdateIntegrationResponseRequest = {
    val __obj = js.Dynamic.literal(httpMethod = httpMethod.asInstanceOf[js.Any], resourceId = resourceId.asInstanceOf[js.Any], restApiId = restApiId.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateIntegrationResponseRequest]
  }
  
  extension [Self <: UpdateIntegrationResponseRequest](x: Self) {
    
    inline def setHttpMethod(value: String): Self = StObject.set(x, "httpMethod", value.asInstanceOf[js.Any])
    
    inline def setPatchOperations(value: ListOfPatchOperation): Self = StObject.set(x, "patchOperations", value.asInstanceOf[js.Any])
    
    inline def setPatchOperationsUndefined: Self = StObject.set(x, "patchOperations", js.undefined)
    
    inline def setPatchOperationsVarargs(value: PatchOperation*): Self = StObject.set(x, "patchOperations", js.Array(value*))
    
    inline def setResourceId(value: String): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    inline def setRestApiId(value: String): Self = StObject.set(x, "restApiId", value.asInstanceOf[js.Any])
    
    inline def setStatusCode(value: StatusCode): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
  }
}
