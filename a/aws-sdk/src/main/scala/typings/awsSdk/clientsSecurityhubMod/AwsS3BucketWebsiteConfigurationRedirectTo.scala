package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsS3BucketWebsiteConfigurationRedirectTo extends StObject {
  
  /**
    * The name of the host to redirect requests to.
    */
  var Hostname: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The protocol to use when redirecting requests. By default, this field uses the same protocol as the original request. Valid values are http or https.
    */
  var Protocol: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsS3BucketWebsiteConfigurationRedirectTo {
  
  inline def apply(): AwsS3BucketWebsiteConfigurationRedirectTo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsS3BucketWebsiteConfigurationRedirectTo]
  }
  
  extension [Self <: AwsS3BucketWebsiteConfigurationRedirectTo](x: Self) {
    
    inline def setHostname(value: NonEmptyString): Self = StObject.set(x, "Hostname", value.asInstanceOf[js.Any])
    
    inline def setHostnameUndefined: Self = StObject.set(x, "Hostname", js.undefined)
    
    inline def setProtocol(value: NonEmptyString): Self = StObject.set(x, "Protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "Protocol", js.undefined)
  }
}
