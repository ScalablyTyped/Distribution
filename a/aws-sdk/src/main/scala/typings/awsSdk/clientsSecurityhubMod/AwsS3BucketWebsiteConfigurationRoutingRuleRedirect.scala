package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsS3BucketWebsiteConfigurationRoutingRuleRedirect extends StObject {
  
  /**
    * The host name to use in the redirect request.
    */
  var Hostname: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The HTTP redirect code to use in the response.
    */
  var HttpRedirectCode: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The protocol to use to redirect the request. By default, uses the protocol from the original request.
    */
  var Protocol: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The object key prefix to use in the redirect request. Cannot be provided if ReplaceKeyWith is present.
    */
  var ReplaceKeyPrefixWith: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The specific object key to use in the redirect request. Cannot be provided if ReplaceKeyPrefixWith is present.
    */
  var ReplaceKeyWith: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsS3BucketWebsiteConfigurationRoutingRuleRedirect {
  
  inline def apply(): AwsS3BucketWebsiteConfigurationRoutingRuleRedirect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsS3BucketWebsiteConfigurationRoutingRuleRedirect]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsS3BucketWebsiteConfigurationRoutingRuleRedirect] (val x: Self) extends AnyVal {
    
    inline def setHostname(value: NonEmptyString): Self = StObject.set(x, "Hostname", value.asInstanceOf[js.Any])
    
    inline def setHostnameUndefined: Self = StObject.set(x, "Hostname", js.undefined)
    
    inline def setHttpRedirectCode(value: NonEmptyString): Self = StObject.set(x, "HttpRedirectCode", value.asInstanceOf[js.Any])
    
    inline def setHttpRedirectCodeUndefined: Self = StObject.set(x, "HttpRedirectCode", js.undefined)
    
    inline def setProtocol(value: NonEmptyString): Self = StObject.set(x, "Protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "Protocol", js.undefined)
    
    inline def setReplaceKeyPrefixWith(value: NonEmptyString): Self = StObject.set(x, "ReplaceKeyPrefixWith", value.asInstanceOf[js.Any])
    
    inline def setReplaceKeyPrefixWithUndefined: Self = StObject.set(x, "ReplaceKeyPrefixWith", js.undefined)
    
    inline def setReplaceKeyWith(value: NonEmptyString): Self = StObject.set(x, "ReplaceKeyWith", value.asInstanceOf[js.Any])
    
    inline def setReplaceKeyWithUndefined: Self = StObject.set(x, "ReplaceKeyWith", js.undefined)
  }
}
