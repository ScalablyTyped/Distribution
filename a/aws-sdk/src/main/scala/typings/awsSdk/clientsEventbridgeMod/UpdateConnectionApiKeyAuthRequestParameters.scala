package typings.awsSdk.clientsEventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateConnectionApiKeyAuthRequestParameters extends StObject {
  
  /**
    * The name of the API key to use for authorization.
    */
  var ApiKeyName: js.UndefOr[AuthHeaderParameters] = js.undefined
  
  /**
    * The value associated with teh API key to use for authorization.
    */
  var ApiKeyValue: js.UndefOr[AuthHeaderParameters] = js.undefined
}
object UpdateConnectionApiKeyAuthRequestParameters {
  
  inline def apply(): UpdateConnectionApiKeyAuthRequestParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateConnectionApiKeyAuthRequestParameters]
  }
  
  extension [Self <: UpdateConnectionApiKeyAuthRequestParameters](x: Self) {
    
    inline def setApiKeyName(value: AuthHeaderParameters): Self = StObject.set(x, "ApiKeyName", value.asInstanceOf[js.Any])
    
    inline def setApiKeyNameUndefined: Self = StObject.set(x, "ApiKeyName", js.undefined)
    
    inline def setApiKeyValue(value: AuthHeaderParameters): Self = StObject.set(x, "ApiKeyValue", value.asInstanceOf[js.Any])
    
    inline def setApiKeyValueUndefined: Self = StObject.set(x, "ApiKeyValue", js.undefined)
  }
}
