package typings.auth0Js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Auth0Error extends StObject {
  
  // Need to include non-intuitive error fields that Auth0 uses
  var code: js.UndefOr[String] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var error: LibErrorCodes | SpecErrorCodes | String = js.native
  
  var errorDescription: js.UndefOr[String] = js.native
  
  // Auth0 is not consistent in the naming of the error description field
  var error_description: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var original: js.UndefOr[js.Any] = js.native
  
  var policy: js.UndefOr[String] = js.native
  
  var statusCode: js.UndefOr[Double] = js.native
  
  var statusText: js.UndefOr[String] = js.native
}
object Auth0Error {
  
  @scala.inline
  def apply(error: LibErrorCodes | SpecErrorCodes | String): Auth0Error = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[Auth0Error]
  }
  
  @scala.inline
  implicit class Auth0ErrorMutableBuilder[Self <: Auth0Error] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setError(value: LibErrorCodes | SpecErrorCodes | String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorDescription(value: String): Self = StObject.set(x, "errorDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorDescriptionUndefined: Self = StObject.set(x, "errorDescription", js.undefined)
    
    @scala.inline
    def setError_description(value: String): Self = StObject.set(x, "error_description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError_descriptionUndefined: Self = StObject.set(x, "error_description", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOriginal(value: js.Any): Self = StObject.set(x, "original", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalUndefined: Self = StObject.set(x, "original", js.undefined)
    
    @scala.inline
    def setPolicy(value: String): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
    
    @scala.inline
    def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
    
    @scala.inline
    def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusTextUndefined: Self = StObject.set(x, "statusText", js.undefined)
  }
}
