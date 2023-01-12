package typings.awsSdk.clientsResiliencehubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateResiliencyPolicyRequest extends StObject {
  
  /**
    * Used for an idempotency token. A client token is a unique, case-sensitive string of up to 64 ASCII characters. You should not reuse the same client token for other API requests.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * Specifies a high-level geographical location constraint for where your resilience policy data can be stored.
    */
  var dataLocationConstraint: js.UndefOr[DataLocationConstraint] = js.undefined
  
  /**
    * The type of resiliency policy to be created, including the recovery time objective (RTO) and recovery point objective (RPO) in seconds.
    */
  var policy: DisruptionPolicy
  
  /**
    * The description for the policy.
    */
  var policyDescription: js.UndefOr[EntityDescription] = js.undefined
  
  /**
    * The name of the policy
    */
  var policyName: EntityName
  
  /**
    * The tags assigned to the resource. A tag is a label that you assign to an Amazon Web Services resource. Each tag consists of a key/value pair.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The tier for this resiliency policy, ranging from the highest severity (MissionCritical) to lowest (NonCritical).
    */
  var tier: ResiliencyPolicyTier
}
object CreateResiliencyPolicyRequest {
  
  inline def apply(policy: DisruptionPolicy, policyName: EntityName, tier: ResiliencyPolicyTier): CreateResiliencyPolicyRequest = {
    val __obj = js.Dynamic.literal(policy = policy.asInstanceOf[js.Any], policyName = policyName.asInstanceOf[js.Any], tier = tier.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateResiliencyPolicyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateResiliencyPolicyRequest] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setDataLocationConstraint(value: DataLocationConstraint): Self = StObject.set(x, "dataLocationConstraint", value.asInstanceOf[js.Any])
    
    inline def setDataLocationConstraintUndefined: Self = StObject.set(x, "dataLocationConstraint", js.undefined)
    
    inline def setPolicy(value: DisruptionPolicy): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyDescription(value: EntityDescription): Self = StObject.set(x, "policyDescription", value.asInstanceOf[js.Any])
    
    inline def setPolicyDescriptionUndefined: Self = StObject.set(x, "policyDescription", js.undefined)
    
    inline def setPolicyName(value: EntityName): Self = StObject.set(x, "policyName", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTier(value: ResiliencyPolicyTier): Self = StObject.set(x, "tier", value.asInstanceOf[js.Any])
  }
}
