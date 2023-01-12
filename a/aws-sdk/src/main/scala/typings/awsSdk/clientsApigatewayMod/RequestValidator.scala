package typings.awsSdk.clientsApigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestValidator extends StObject {
  
  /**
    * The identifier of this RequestValidator.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The name of this RequestValidator
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * A Boolean flag to indicate whether to validate a request body according to the configured Model schema.
    */
  var validateRequestBody: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A Boolean flag to indicate whether to validate request parameters (true) or not (false).
    */
  var validateRequestParameters: js.UndefOr[Boolean] = js.undefined
}
object RequestValidator {
  
  inline def apply(): RequestValidator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestValidator]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestValidator] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValidateRequestBody(value: Boolean): Self = StObject.set(x, "validateRequestBody", value.asInstanceOf[js.Any])
    
    inline def setValidateRequestBodyUndefined: Self = StObject.set(x, "validateRequestBody", js.undefined)
    
    inline def setValidateRequestParameters(value: Boolean): Self = StObject.set(x, "validateRequestParameters", value.asInstanceOf[js.Any])
    
    inline def setValidateRequestParametersUndefined: Self = StObject.set(x, "validateRequestParameters", js.undefined)
  }
}
