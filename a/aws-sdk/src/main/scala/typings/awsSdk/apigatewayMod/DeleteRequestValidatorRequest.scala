package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteRequestValidatorRequest extends StObject {
  
  /**
    * [Required] The identifier of the RequestValidator to be deleted.
    */
  var requestValidatorId: String
  
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String
}
object DeleteRequestValidatorRequest {
  
  @scala.inline
  def apply(requestValidatorId: String, restApiId: String): DeleteRequestValidatorRequest = {
    val __obj = js.Dynamic.literal(requestValidatorId = requestValidatorId.asInstanceOf[js.Any], restApiId = restApiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRequestValidatorRequest]
  }
  
  @scala.inline
  implicit class DeleteRequestValidatorRequestMutableBuilder[Self <: DeleteRequestValidatorRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequestValidatorId(value: String): Self = StObject.set(x, "requestValidatorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestApiId(value: String): Self = StObject.set(x, "restApiId", value.asInstanceOf[js.Any])
  }
}
