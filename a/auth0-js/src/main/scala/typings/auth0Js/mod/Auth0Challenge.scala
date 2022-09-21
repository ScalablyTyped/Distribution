package typings.auth0Js.mod

import org.scalablytyped.runtime.StringDictionary
import typings.auth0Js.auth0JsStrings.auth0
import typings.auth0Js.auth0JsStrings.code
import typings.auth0Js.auth0JsStrings.recaptcha_v2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Auth0Challenge
  extends StObject
     with /* other */ StringDictionary[Any] {
  
  var image: String
  
  var provider: auth0 | recaptcha_v2
  
  var required: Boolean
  
  var `type`: code
}
object Auth0Challenge {
  
  inline def apply(image: String, provider: auth0 | recaptcha_v2, required: Boolean): Auth0Challenge = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("code")
    __obj.asInstanceOf[Auth0Challenge]
  }
  
  extension [Self <: Auth0Challenge](x: Self) {
    
    inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setProvider(value: auth0 | recaptcha_v2): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setType(value: code): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
