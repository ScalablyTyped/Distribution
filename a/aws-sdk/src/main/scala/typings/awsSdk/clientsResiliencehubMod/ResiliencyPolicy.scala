package typings.awsSdk.clientsResiliencehubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResiliencyPolicy extends StObject {
  
  /**
    * The timestamp for when the resiliency policy was created.
    */
  var creationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Specifies a high-level geographical location constraint for where your resilience policy data can be stored.
    */
  var dataLocationConstraint: js.UndefOr[DataLocationConstraint] = js.undefined
  
  /**
    * Specifies the estimated cost tier of the resiliency policy.
    */
  var estimatedCostTier: js.UndefOr[EstimatedCostTier] = js.undefined
  
  /**
    * The resiliency policy.
    */
  var policy: js.UndefOr[DisruptionPolicy] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the resiliency policy. The format for this ARN is: arn:partition:resiliencehub:region:account:resiliency-policy/policy-id. For more information about ARNs, see  Amazon Resource Names (ARNs) in the AWS General Reference.
    */
  var policyArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The description for the policy.
    */
  var policyDescription: js.UndefOr[EntityDescription] = js.undefined
  
  /**
    * The name of the policy
    */
  var policyName: js.UndefOr[EntityName] = js.undefined
  
  /**
    * The tags assigned to the resource. A tag is a label that you assign to an Amazon Web Services resource. Each tag consists of a key/value pair.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The tier for this resiliency policy, ranging from the highest severity (MissionCritical) to lowest (NonCritical).
    */
  var tier: js.UndefOr[ResiliencyPolicyTier] = js.undefined
}
object ResiliencyPolicy {
  
  inline def apply(): ResiliencyPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResiliencyPolicy]
  }
  
  extension [Self <: ResiliencyPolicy](x: Self) {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setDataLocationConstraint(value: DataLocationConstraint): Self = StObject.set(x, "dataLocationConstraint", value.asInstanceOf[js.Any])
    
    inline def setDataLocationConstraintUndefined: Self = StObject.set(x, "dataLocationConstraint", js.undefined)
    
    inline def setEstimatedCostTier(value: EstimatedCostTier): Self = StObject.set(x, "estimatedCostTier", value.asInstanceOf[js.Any])
    
    inline def setEstimatedCostTierUndefined: Self = StObject.set(x, "estimatedCostTier", js.undefined)
    
    inline def setPolicy(value: DisruptionPolicy): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyArn(value: Arn): Self = StObject.set(x, "policyArn", value.asInstanceOf[js.Any])
    
    inline def setPolicyArnUndefined: Self = StObject.set(x, "policyArn", js.undefined)
    
    inline def setPolicyDescription(value: EntityDescription): Self = StObject.set(x, "policyDescription", value.asInstanceOf[js.Any])
    
    inline def setPolicyDescriptionUndefined: Self = StObject.set(x, "policyDescription", js.undefined)
    
    inline def setPolicyName(value: EntityName): Self = StObject.set(x, "policyName", value.asInstanceOf[js.Any])
    
    inline def setPolicyNameUndefined: Self = StObject.set(x, "policyName", js.undefined)
    
    inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTier(value: ResiliencyPolicyTier): Self = StObject.set(x, "tier", value.asInstanceOf[js.Any])
    
    inline def setTierUndefined: Self = StObject.set(x, "tier", js.undefined)
  }
}
