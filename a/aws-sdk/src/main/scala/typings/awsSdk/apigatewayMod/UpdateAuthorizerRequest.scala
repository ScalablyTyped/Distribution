package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAuthorizerRequest extends StObject {
  
  /**
    * [Required] The identifier of the Authorizer resource.
    */
  var authorizerId: String
  
  /**
    * A list of update operations to be applied to the specified resource and in the order specified in this list.
    */
  var patchOperations: js.UndefOr[ListOfPatchOperation] = js.undefined
  
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String
}
object UpdateAuthorizerRequest {
  
  @scala.inline
  def apply(authorizerId: String, restApiId: String): UpdateAuthorizerRequest = {
    val __obj = js.Dynamic.literal(authorizerId = authorizerId.asInstanceOf[js.Any], restApiId = restApiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAuthorizerRequest]
  }
  
  @scala.inline
  implicit class UpdateAuthorizerRequestMutableBuilder[Self <: UpdateAuthorizerRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorizerId(value: String): Self = StObject.set(x, "authorizerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatchOperations(value: ListOfPatchOperation): Self = StObject.set(x, "patchOperations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatchOperationsUndefined: Self = StObject.set(x, "patchOperations", js.undefined)
    
    @scala.inline
    def setPatchOperationsVarargs(value: PatchOperation*): Self = StObject.set(x, "patchOperations", js.Array(value :_*))
    
    @scala.inline
    def setRestApiId(value: String): Self = StObject.set(x, "restApiId", value.asInstanceOf[js.Any])
  }
}
