package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsS3BucketWebsiteConfigurationRoutingRule extends StObject {
  
  /**
    * Provides the condition that must be met in order to apply the routing rule.
    */
  var Condition: js.UndefOr[AwsS3BucketWebsiteConfigurationRoutingRuleCondition] = js.undefined
  
  /**
    * Provides the rules to redirect the request if the condition in Condition is met.
    */
  var Redirect: js.UndefOr[AwsS3BucketWebsiteConfigurationRoutingRuleRedirect] = js.undefined
}
object AwsS3BucketWebsiteConfigurationRoutingRule {
  
  inline def apply(): AwsS3BucketWebsiteConfigurationRoutingRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsS3BucketWebsiteConfigurationRoutingRule]
  }
  
  extension [Self <: AwsS3BucketWebsiteConfigurationRoutingRule](x: Self) {
    
    inline def setCondition(value: AwsS3BucketWebsiteConfigurationRoutingRuleCondition): Self = StObject.set(x, "Condition", value.asInstanceOf[js.Any])
    
    inline def setConditionUndefined: Self = StObject.set(x, "Condition", js.undefined)
    
    inline def setRedirect(value: AwsS3BucketWebsiteConfigurationRoutingRuleRedirect): Self = StObject.set(x, "Redirect", value.asInstanceOf[js.Any])
    
    inline def setRedirectUndefined: Self = StObject.set(x, "Redirect", js.undefined)
  }
}
