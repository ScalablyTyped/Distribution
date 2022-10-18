package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsS3BucketWebsiteConfiguration extends StObject {
  
  /**
    * The name of the error document for the website.
    */
  var ErrorDocument: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The name of the index document for the website.
    */
  var IndexDocumentSuffix: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The redirect behavior for requests to the website.
    */
  var RedirectAllRequestsTo: js.UndefOr[AwsS3BucketWebsiteConfigurationRedirectTo] = js.undefined
  
  /**
    * The rules for applying redirects for requests to the website.
    */
  var RoutingRules: js.UndefOr[AwsS3BucketWebsiteConfigurationRoutingRules] = js.undefined
}
object AwsS3BucketWebsiteConfiguration {
  
  inline def apply(): AwsS3BucketWebsiteConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsS3BucketWebsiteConfiguration]
  }
  
  extension [Self <: AwsS3BucketWebsiteConfiguration](x: Self) {
    
    inline def setErrorDocument(value: NonEmptyString): Self = StObject.set(x, "ErrorDocument", value.asInstanceOf[js.Any])
    
    inline def setErrorDocumentUndefined: Self = StObject.set(x, "ErrorDocument", js.undefined)
    
    inline def setIndexDocumentSuffix(value: NonEmptyString): Self = StObject.set(x, "IndexDocumentSuffix", value.asInstanceOf[js.Any])
    
    inline def setIndexDocumentSuffixUndefined: Self = StObject.set(x, "IndexDocumentSuffix", js.undefined)
    
    inline def setRedirectAllRequestsTo(value: AwsS3BucketWebsiteConfigurationRedirectTo): Self = StObject.set(x, "RedirectAllRequestsTo", value.asInstanceOf[js.Any])
    
    inline def setRedirectAllRequestsToUndefined: Self = StObject.set(x, "RedirectAllRequestsTo", js.undefined)
    
    inline def setRoutingRules(value: AwsS3BucketWebsiteConfigurationRoutingRules): Self = StObject.set(x, "RoutingRules", value.asInstanceOf[js.Any])
    
    inline def setRoutingRulesUndefined: Self = StObject.set(x, "RoutingRules", js.undefined)
    
    inline def setRoutingRulesVarargs(value: AwsS3BucketWebsiteConfigurationRoutingRule*): Self = StObject.set(x, "RoutingRules", js.Array(value*))
  }
}
