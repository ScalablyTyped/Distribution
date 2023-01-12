package typings.awsSdk.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebsiteConfiguration extends StObject {
  
  /**
    * The name of the error document for the website.
    */
  var ErrorDocument: js.UndefOr[typings.awsSdk.clientsS3Mod.ErrorDocument] = js.undefined
  
  /**
    * The name of the index document for the website.
    */
  var IndexDocument: js.UndefOr[typings.awsSdk.clientsS3Mod.IndexDocument] = js.undefined
  
  /**
    * The redirect behavior for every request to this bucket's website endpoint.  If you specify this property, you can't specify any other property. 
    */
  var RedirectAllRequestsTo: js.UndefOr[typings.awsSdk.clientsS3Mod.RedirectAllRequestsTo] = js.undefined
  
  /**
    * Rules that define when a redirect is applied and the redirect behavior.
    */
  var RoutingRules: js.UndefOr[typings.awsSdk.clientsS3Mod.RoutingRules] = js.undefined
}
object WebsiteConfiguration {
  
  inline def apply(): WebsiteConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebsiteConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebsiteConfiguration] (val x: Self) extends AnyVal {
    
    inline def setErrorDocument(value: ErrorDocument): Self = StObject.set(x, "ErrorDocument", value.asInstanceOf[js.Any])
    
    inline def setErrorDocumentUndefined: Self = StObject.set(x, "ErrorDocument", js.undefined)
    
    inline def setIndexDocument(value: IndexDocument): Self = StObject.set(x, "IndexDocument", value.asInstanceOf[js.Any])
    
    inline def setIndexDocumentUndefined: Self = StObject.set(x, "IndexDocument", js.undefined)
    
    inline def setRedirectAllRequestsTo(value: RedirectAllRequestsTo): Self = StObject.set(x, "RedirectAllRequestsTo", value.asInstanceOf[js.Any])
    
    inline def setRedirectAllRequestsToUndefined: Self = StObject.set(x, "RedirectAllRequestsTo", js.undefined)
    
    inline def setRoutingRules(value: RoutingRules): Self = StObject.set(x, "RoutingRules", value.asInstanceOf[js.Any])
    
    inline def setRoutingRulesUndefined: Self = StObject.set(x, "RoutingRules", js.undefined)
    
    inline def setRoutingRulesVarargs(value: RoutingRule*): Self = StObject.set(x, "RoutingRules", js.Array(value*))
  }
}
