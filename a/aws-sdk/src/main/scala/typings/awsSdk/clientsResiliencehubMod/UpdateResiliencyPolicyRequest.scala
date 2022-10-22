package typings.awsSdk.clientsResiliencehubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateResiliencyPolicyRequest extends StObject {
  
  /**
    * Specifies a high-level geographical location constraint for where your resilience policy data can be stored.
    */
  var dataLocationConstraint: js.UndefOr[DataLocationConstraint] = js.undefined
  
  /**
    * The type of resiliency policy to be created, including the recovery time objective (RTO) and recovery point objective (RPO) in seconds.
    */
  var policy: js.UndefOr[DisruptionPolicy] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the resiliency policy. The format for this ARN is: arn:partition:resiliencehub:region:account:resiliency-policy/policy-id. For more information about ARNs, see  Amazon Resource Names (ARNs) in the AWS General Reference.
    */
  var policyArn: Arn
  
  /**
    * The description for the policy.
    */
  var policyDescription: js.UndefOr[EntityDescription] = js.undefined
  
  /**
    * The name of the policy
    */
  var policyName: js.UndefOr[EntityName] = js.undefined
  
  /**
    * The tier for this resiliency policy, ranging from the highest severity (MissionCritical) to lowest (NonCritical).
    */
  var tier: js.UndefOr[ResiliencyPolicyTier] = js.undefined
}
object UpdateResiliencyPolicyRequest {
  
  inline def apply(policyArn: Arn): UpdateResiliencyPolicyRequest = {
    val __obj = js.Dynamic.literal(policyArn = policyArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateResiliencyPolicyRequest]
  }
  
  extension [Self <: UpdateResiliencyPolicyRequest](x: Self) {
    
    inline def setDataLocationConstraint(value: DataLocationConstraint): Self = StObject.set(x, "dataLocationConstraint", value.asInstanceOf[js.Any])
    
    inline def setDataLocationConstraintUndefined: Self = StObject.set(x, "dataLocationConstraint", js.undefined)
    
    inline def setPolicy(value: DisruptionPolicy): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyArn(value: Arn): Self = StObject.set(x, "policyArn", value.asInstanceOf[js.Any])
    
    inline def setPolicyDescription(value: EntityDescription): Self = StObject.set(x, "policyDescription", value.asInstanceOf[js.Any])
    
    inline def setPolicyDescriptionUndefined: Self = StObject.set(x, "policyDescription", js.undefined)
    
    inline def setPolicyName(value: EntityName): Self = StObject.set(x, "policyName", value.asInstanceOf[js.Any])
    
    inline def setPolicyNameUndefined: Self = StObject.set(x, "policyName", js.undefined)
    
    inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
    
    inline def setTier(value: ResiliencyPolicyTier): Self = StObject.set(x, "tier", value.asInstanceOf[js.Any])
    
    inline def setTierUndefined: Self = StObject.set(x, "tier", js.undefined)
  }
}
