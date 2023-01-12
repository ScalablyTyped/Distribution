package typings.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SalesforceMetadata extends StObject {
  
  /**
    * The Salesforce APIs that you can have Amazon AppFlow use when your flows transfers data to or from Salesforce.
    */
  var dataTransferApis: js.UndefOr[SalesforceDataTransferApiList] = js.undefined
  
  /**
    *  The desired authorization scope for the Salesforce account. 
    */
  var oAuthScopes: js.UndefOr[OAuthScopeList] = js.undefined
}
object SalesforceMetadata {
  
  inline def apply(): SalesforceMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SalesforceMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SalesforceMetadata] (val x: Self) extends AnyVal {
    
    inline def setDataTransferApis(value: SalesforceDataTransferApiList): Self = StObject.set(x, "dataTransferApis", value.asInstanceOf[js.Any])
    
    inline def setDataTransferApisUndefined: Self = StObject.set(x, "dataTransferApis", js.undefined)
    
    inline def setDataTransferApisVarargs(value: SalesforceDataTransferApi*): Self = StObject.set(x, "dataTransferApis", js.Array(value*))
    
    inline def setOAuthScopes(value: OAuthScopeList): Self = StObject.set(x, "oAuthScopes", value.asInstanceOf[js.Any])
    
    inline def setOAuthScopesUndefined: Self = StObject.set(x, "oAuthScopes", js.undefined)
    
    inline def setOAuthScopesVarargs(value: OAuthScope*): Self = StObject.set(x, "oAuthScopes", js.Array(value*))
  }
}
