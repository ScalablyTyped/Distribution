package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZendeskMetadata extends StObject {
  
  /**
    *  The desired authorization scope for the Zendesk account. 
    */
  var oAuthScopes: js.UndefOr[OAuthScopeList] = js.undefined
}
object ZendeskMetadata {
  
  inline def apply(): ZendeskMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZendeskMetadata]
  }
  
  extension [Self <: ZendeskMetadata](x: Self) {
    
    inline def setOAuthScopes(value: OAuthScopeList): Self = StObject.set(x, "oAuthScopes", value.asInstanceOf[js.Any])
    
    inline def setOAuthScopesUndefined: Self = StObject.set(x, "oAuthScopes", js.undefined)
    
    inline def setOAuthScopesVarargs(value: OAuthScope*): Self = StObject.set(x, "oAuthScopes", js.Array(value*))
  }
}
