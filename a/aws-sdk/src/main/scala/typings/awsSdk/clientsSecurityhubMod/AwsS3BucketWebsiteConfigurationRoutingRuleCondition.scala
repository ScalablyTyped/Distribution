package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsS3BucketWebsiteConfigurationRoutingRuleCondition extends StObject {
  
  /**
    * Indicates to redirect the request if the HTTP error code matches this value.
    */
  var HttpErrorCodeReturnedEquals: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Indicates to redirect the request if the key prefix matches this value.
    */
  var KeyPrefixEquals: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsS3BucketWebsiteConfigurationRoutingRuleCondition {
  
  inline def apply(): AwsS3BucketWebsiteConfigurationRoutingRuleCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsS3BucketWebsiteConfigurationRoutingRuleCondition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsS3BucketWebsiteConfigurationRoutingRuleCondition] (val x: Self) extends AnyVal {
    
    inline def setHttpErrorCodeReturnedEquals(value: NonEmptyString): Self = StObject.set(x, "HttpErrorCodeReturnedEquals", value.asInstanceOf[js.Any])
    
    inline def setHttpErrorCodeReturnedEqualsUndefined: Self = StObject.set(x, "HttpErrorCodeReturnedEquals", js.undefined)
    
    inline def setKeyPrefixEquals(value: NonEmptyString): Self = StObject.set(x, "KeyPrefixEquals", value.asInstanceOf[js.Any])
    
    inline def setKeyPrefixEqualsUndefined: Self = StObject.set(x, "KeyPrefixEquals", js.undefined)
  }
}
