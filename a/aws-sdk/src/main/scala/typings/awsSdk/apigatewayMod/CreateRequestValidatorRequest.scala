package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRequestValidatorRequest extends StObject {
  
  /**
    * The name of the to-be-created RequestValidator.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The string identifier of the associated RestApi.
    */
  var restApiId: String
  
  /**
    * A Boolean flag to indicate whether to validate request body according to the configured model schema for the method (true) or not (false).
    */
  var validateRequestBody: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A Boolean flag to indicate whether to validate request parameters, true, or not false.
    */
  var validateRequestParameters: js.UndefOr[Boolean] = js.undefined
}
object CreateRequestValidatorRequest {
  
  inline def apply(restApiId: String): CreateRequestValidatorRequest = {
    val __obj = js.Dynamic.literal(restApiId = restApiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRequestValidatorRequest]
  }
  
  extension [Self <: CreateRequestValidatorRequest](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRestApiId(value: String): Self = StObject.set(x, "restApiId", value.asInstanceOf[js.Any])
    
    inline def setValidateRequestBody(value: Boolean): Self = StObject.set(x, "validateRequestBody", value.asInstanceOf[js.Any])
    
    inline def setValidateRequestBodyUndefined: Self = StObject.set(x, "validateRequestBody", js.undefined)
    
    inline def setValidateRequestParameters(value: Boolean): Self = StObject.set(x, "validateRequestParameters", value.asInstanceOf[js.Any])
    
    inline def setValidateRequestParametersUndefined: Self = StObject.set(x, "validateRequestParameters", js.undefined)
  }
}
