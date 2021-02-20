package typings.asana.mod.auth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OauthErrorOptions extends StObject {
  
  var error: js.UndefOr[String] = js.native
  
  var error_description: js.UndefOr[String] = js.native
  
  var error_uri: js.UndefOr[String] = js.native
}
object OauthErrorOptions {
  
  @scala.inline
  def apply(): OauthErrorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OauthErrorOptions]
  }
  
  @scala.inline
  implicit class OauthErrorOptionsMutableBuilder[Self <: OauthErrorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setError_description(value: String): Self = StObject.set(x, "error_description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError_descriptionUndefined: Self = StObject.set(x, "error_description", js.undefined)
    
    @scala.inline
    def setError_uri(value: String): Self = StObject.set(x, "error_uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError_uriUndefined: Self = StObject.set(x, "error_uri", js.undefined)
  }
}
