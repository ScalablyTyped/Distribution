package typings.awsLambda.anon

import typings.awsLambda.commonMod.StringMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeParameter extends StObject {
  
  var clientMetadata: js.UndefOr[StringMap] = js.undefined
  
  var codeParameter: String
  
  var userAttributes: StringMap
  
  var usernameParameter: String
}
object CodeParameter {
  
  inline def apply(codeParameter: String, userAttributes: StringMap, usernameParameter: String): CodeParameter = {
    val __obj = js.Dynamic.literal(codeParameter = codeParameter.asInstanceOf[js.Any], userAttributes = userAttributes.asInstanceOf[js.Any], usernameParameter = usernameParameter.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeParameter]
  }
  
  extension [Self <: CodeParameter](x: Self) {
    
    inline def setClientMetadata(value: StringMap): Self = StObject.set(x, "clientMetadata", value.asInstanceOf[js.Any])
    
    inline def setClientMetadataUndefined: Self = StObject.set(x, "clientMetadata", js.undefined)
    
    inline def setCodeParameter(value: String): Self = StObject.set(x, "codeParameter", value.asInstanceOf[js.Any])
    
    inline def setUserAttributes(value: StringMap): Self = StObject.set(x, "userAttributes", value.asInstanceOf[js.Any])
    
    inline def setUsernameParameter(value: String): Self = StObject.set(x, "usernameParameter", value.asInstanceOf[js.Any])
  }
}
