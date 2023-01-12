package typings.awsSdk.clientsFmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DnsRuleGroupPriorityConflictViolation extends StObject {
  
  /**
    * The ID of the Firewall Manager DNS Firewall policy that was already applied to the VPC. This policy contains the rule group that's already associated with the VPC. 
    */
  var ConflictingPolicyId: js.UndefOr[PolicyId] = js.undefined
  
  /**
    * The priority setting of the two conflicting rule groups.
    */
  var ConflictingPriority: js.UndefOr[DnsRuleGroupPriority] = js.undefined
  
  /**
    * The priorities of rule groups that are already associated with the VPC. To retry your operation, choose priority settings that aren't in this list for the rule groups in your new DNS Firewall policy. 
    */
  var UnavailablePriorities: js.UndefOr[DnsRuleGroupPriorities] = js.undefined
  
  /**
    * Information about the VPC ID. 
    */
  var ViolationTarget: js.UndefOr[typings.awsSdk.clientsFmsMod.ViolationTarget] = js.undefined
  
  /**
    * A description of the violation that specifies the VPC and the rule group that's already associated with it.
    */
  var ViolationTargetDescription: js.UndefOr[LengthBoundedString] = js.undefined
}
object DnsRuleGroupPriorityConflictViolation {
  
  inline def apply(): DnsRuleGroupPriorityConflictViolation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DnsRuleGroupPriorityConflictViolation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DnsRuleGroupPriorityConflictViolation] (val x: Self) extends AnyVal {
    
    inline def setConflictingPolicyId(value: PolicyId): Self = StObject.set(x, "ConflictingPolicyId", value.asInstanceOf[js.Any])
    
    inline def setConflictingPolicyIdUndefined: Self = StObject.set(x, "ConflictingPolicyId", js.undefined)
    
    inline def setConflictingPriority(value: DnsRuleGroupPriority): Self = StObject.set(x, "ConflictingPriority", value.asInstanceOf[js.Any])
    
    inline def setConflictingPriorityUndefined: Self = StObject.set(x, "ConflictingPriority", js.undefined)
    
    inline def setUnavailablePriorities(value: DnsRuleGroupPriorities): Self = StObject.set(x, "UnavailablePriorities", value.asInstanceOf[js.Any])
    
    inline def setUnavailablePrioritiesUndefined: Self = StObject.set(x, "UnavailablePriorities", js.undefined)
    
    inline def setUnavailablePrioritiesVarargs(value: DnsRuleGroupPriority*): Self = StObject.set(x, "UnavailablePriorities", js.Array(value*))
    
    inline def setViolationTarget(value: ViolationTarget): Self = StObject.set(x, "ViolationTarget", value.asInstanceOf[js.Any])
    
    inline def setViolationTargetDescription(value: LengthBoundedString): Self = StObject.set(x, "ViolationTargetDescription", value.asInstanceOf[js.Any])
    
    inline def setViolationTargetDescriptionUndefined: Self = StObject.set(x, "ViolationTargetDescription", js.undefined)
    
    inline def setViolationTargetUndefined: Self = StObject.set(x, "ViolationTarget", js.undefined)
  }
}
