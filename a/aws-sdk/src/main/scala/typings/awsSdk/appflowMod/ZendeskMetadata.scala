package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ZendeskMetadata extends StObject {
  
  /**
    *  The desired authorization scope for the Zendesk account. 
    */
  var oAuthScopes: js.UndefOr[OAuthScopeList] = js.native
}
object ZendeskMetadata {
  
  @scala.inline
  def apply(): ZendeskMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZendeskMetadata]
  }
  
  @scala.inline
  implicit class ZendeskMetadataMutableBuilder[Self <: ZendeskMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOAuthScopes(value: OAuthScopeList): Self = StObject.set(x, "oAuthScopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOAuthScopesUndefined: Self = StObject.set(x, "oAuthScopes", js.undefined)
    
    @scala.inline
    def setOAuthScopesVarargs(value: OAuthScope*): Self = StObject.set(x, "oAuthScopes", js.Array(value :_*))
  }
}
