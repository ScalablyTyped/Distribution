package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAnalyticsMetadata extends StObject {
  
  /**
    *  The desired authorization scope for the Google Analytics account. 
    */
  var oAuthScopes: js.UndefOr[OAuthScopeList] = js.undefined
}
object GoogleAnalyticsMetadata {
  
  @scala.inline
  def apply(): GoogleAnalyticsMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsMetadata]
  }
  
  @scala.inline
  implicit class GoogleAnalyticsMetadataMutableBuilder[Self <: GoogleAnalyticsMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOAuthScopes(value: OAuthScopeList): Self = StObject.set(x, "oAuthScopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOAuthScopesUndefined: Self = StObject.set(x, "oAuthScopes", js.undefined)
    
    @scala.inline
    def setOAuthScopesVarargs(value: OAuthScope*): Self = StObject.set(x, "oAuthScopes", js.Array(value :_*))
  }
}
