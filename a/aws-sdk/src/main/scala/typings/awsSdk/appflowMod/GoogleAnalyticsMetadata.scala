package typings.awsSdk.appflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleAnalyticsMetadata extends js.Object {
  
  /**
    *  The desired authorization scope for the Google Analytics account. 
    */
  var oAuthScopes: js.UndefOr[OAuthScopeList] = js.native
}
object GoogleAnalyticsMetadata {
  
  @scala.inline
  def apply(): GoogleAnalyticsMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsMetadata]
  }
  
  @scala.inline
  implicit class GoogleAnalyticsMetadataOps[Self <: GoogleAnalyticsMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOAuthScopesVarargs(value: OAuthScope*): Self = this.set("oAuthScopes", js.Array(value :_*))
    
    @scala.inline
    def setOAuthScopes(value: OAuthScopeList): Self = this.set("oAuthScopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOAuthScopes: Self = this.set("oAuthScopes", js.undefined)
  }
}
