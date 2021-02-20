package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestValidator extends StObject {
  
  /**
    * The identifier of this RequestValidator.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * The name of this RequestValidator
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * A Boolean flag to indicate whether to validate a request body according to the configured Model schema.
    */
  var validateRequestBody: js.UndefOr[Boolean] = js.native
  
  /**
    * A Boolean flag to indicate whether to validate request parameters (true) or not (false).
    */
  var validateRequestParameters: js.UndefOr[Boolean] = js.native
}
object RequestValidator {
  
  @scala.inline
  def apply(): RequestValidator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestValidator]
  }
  
  @scala.inline
  implicit class RequestValidatorMutableBuilder[Self <: RequestValidator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
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
