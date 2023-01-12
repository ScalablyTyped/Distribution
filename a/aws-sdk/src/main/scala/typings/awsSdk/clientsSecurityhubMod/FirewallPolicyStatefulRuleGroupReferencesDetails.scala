package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirewallPolicyStatefulRuleGroupReferencesDetails extends StObject {
  
  /**
    * The ARN of the stateful rule group.
    */
  var ResourceArn: js.UndefOr[NonEmptyString] = js.undefined
}
object FirewallPolicyStatefulRuleGroupReferencesDetails {
  
  inline def apply(): FirewallPolicyStatefulRuleGroupReferencesDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirewallPolicyStatefulRuleGroupReferencesDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FirewallPolicyStatefulRuleGroupReferencesDetails] (val x: Self) extends AnyVal {
    
    inline def setResourceArn(value: NonEmptyString): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setResourceArnUndefined: Self = StObject.set(x, "ResourceArn", js.undefined)
  }
}
