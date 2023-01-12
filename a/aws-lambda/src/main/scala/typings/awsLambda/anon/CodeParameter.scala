package typings.awsLambda.anon

import typings.awsLambda.triggerCognitoUserPoolTriggerCommonMod.StringMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeParameter extends StObject {
  
  var clientMetadata: js.UndefOr[StringMap] = js.undefined
  
  var codeParameter: String
  
  var linkParameter: String
  
  var userAttributes: StringMap
  
  /**
    * This is null for all events other than the AdminCreateUser action.
    */
  var usernameParameter: String | Null
}
object CodeParameter {
  
  inline def apply(codeParameter: String, linkParameter: String, userAttributes: StringMap): CodeParameter = {
    val __obj = js.Dynamic.literal(codeParameter = codeParameter.asInstanceOf[js.Any], linkParameter = linkParameter.asInstanceOf[js.Any], userAttributes = userAttributes.asInstanceOf[js.Any], usernameParameter = null)
    __obj.asInstanceOf[CodeParameter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CodeParameter] (val x: Self) extends AnyVal {
    
    inline def setClientMetadata(value: StringMap): Self = StObject.set(x, "clientMetadata", value.asInstanceOf[js.Any])
    
    inline def setClientMetadataUndefined: Self = StObject.set(x, "clientMetadata", js.undefined)
    
    inline def setCodeParameter(value: String): Self = StObject.set(x, "codeParameter", value.asInstanceOf[js.Any])
    
    inline def setLinkParameter(value: String): Self = StObject.set(x, "linkParameter", value.asInstanceOf[js.Any])
    
    inline def setUserAttributes(value: StringMap): Self = StObject.set(x, "userAttributes", value.asInstanceOf[js.Any])
    
    inline def setUsernameParameter(value: String): Self = StObject.set(x, "usernameParameter", value.asInstanceOf[js.Any])
    
    inline def setUsernameParameterNull: Self = StObject.set(x, "usernameParameter", null)
  }
}
