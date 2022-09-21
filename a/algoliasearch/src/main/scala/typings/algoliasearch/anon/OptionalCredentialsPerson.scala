package typings.algoliasearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined algoliasearch.algoliasearch/dist/algoliasearch.OptionalCredentials<@algolia/client-personalization.@algolia/client-personalization.PersonalizationClientOptions> */
trait OptionalCredentialsPerson extends StObject {
  
  var apiKey: js.UndefOr[String] = js.undefined
  
  var appId: js.UndefOr[String] = js.undefined
  
  var region: js.UndefOr[String] = js.undefined
}
object OptionalCredentialsPerson {
  
  inline def apply(): OptionalCredentialsPerson = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionalCredentialsPerson]
  }
  
  extension [Self <: OptionalCredentialsPerson](x: Self) {
    
    inline def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
    
    inline def setApiKeyUndefined: Self = StObject.set(x, "apiKey", js.undefined)
    
    inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
  }
}
