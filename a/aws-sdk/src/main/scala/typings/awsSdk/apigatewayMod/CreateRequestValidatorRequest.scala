package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateRequestValidatorRequest extends StObject {
  
  /**
    * The name of the to-be-created RequestValidator.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String = js.native
  
  /**
    * A Boolean flag to indicate whether to validate request body according to the configured model schema for the method (true) or not (false).
    */
  var validateRequestBody: js.UndefOr[Boolean] = js.native
  
  /**
    * A Boolean flag to indicate whether to validate request parameters, true, or not false.
    */
  var validateRequestParameters: js.UndefOr[Boolean] = js.native
}
object CreateRequestValidatorRequest {
  
  @scala.inline
  def apply(restApiId: String): CreateRequestValidatorRequest = {
    val __obj = js.Dynamic.literal(restApiId = restApiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRequestValidatorRequest]
  }
  
  @scala.inline
  implicit class CreateRequestValidatorRequestMutableBuilder[Self <: CreateRequestValidatorRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRestApiId(value: String): Self = StObject.set(x, "restApiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidateRequestBody(value: Boolean): Self = StObject.set(x, "validateRequestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidateRequestBodyUndefined: Self = StObject.set(x, "validateRequestBody", js.undefined)
    
    @scala.inline
    def setValidateRequestParameters(value: Boolean): Self = StObject.set(x, "validateRequestParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidateRequestParametersUndefined: Self = StObject.set(x, "validateRequestParameters", js.undefined)
  }
}
