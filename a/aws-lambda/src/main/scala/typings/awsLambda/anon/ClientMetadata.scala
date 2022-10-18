package typings.awsLambda.anon

import typings.awsLambda.triggerCognitoUserPoolTriggerCommonMod.StringMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientMetadata extends StObject {
  
  var clientMetadata: js.UndefOr[StringMap] = js.undefined
  
  var code: String | Null
  
  var `type`: String
  
  var userAttributes: StringMap
}
object ClientMetadata {
  
  inline def apply(`type`: String, userAttributes: StringMap): ClientMetadata = {
    val __obj = js.Dynamic.literal(userAttributes = userAttributes.asInstanceOf[js.Any], code = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientMetadata]
  }
  
  extension [Self <: ClientMetadata](x: Self) {
    
    inline def setClientMetadata(value: StringMap): Self = StObject.set(x, "clientMetadata", value.asInstanceOf[js.Any])
    
    inline def setClientMetadataUndefined: Self = StObject.set(x, "clientMetadata", js.undefined)
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeNull: Self = StObject.set(x, "code", null)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUserAttributes(value: StringMap): Self = StObject.set(x, "userAttributes", value.asInstanceOf[js.Any])
  }
}
