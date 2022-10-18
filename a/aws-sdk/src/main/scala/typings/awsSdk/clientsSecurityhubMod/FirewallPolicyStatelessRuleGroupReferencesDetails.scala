package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirewallPolicyStatelessRuleGroupReferencesDetails extends StObject {
  
  /**
    * The order in which to run the stateless rule group.
    */
  var Priority: js.UndefOr[Integer] = js.undefined
  
  /**
    * The ARN of the stateless rule group.
    */
  var ResourceArn: js.UndefOr[NonEmptyString] = js.undefined
}
object FirewallPolicyStatelessRuleGroupReferencesDetails {
  
  inline def apply(): FirewallPolicyStatelessRuleGroupReferencesDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirewallPolicyStatelessRuleGroupReferencesDetails]
  }
  
  extension [Self <: FirewallPolicyStatelessRuleGroupReferencesDetails](x: Self) {
    
    inline def setPriority(value: Integer): Self = StObject.set(x, "Priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "Priority", js.undefined)
    
    inline def setResourceArn(value: NonEmptyString): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setResourceArnUndefined: Self = StObject.set(x, "ResourceArn", js.undefined)
  }
}
