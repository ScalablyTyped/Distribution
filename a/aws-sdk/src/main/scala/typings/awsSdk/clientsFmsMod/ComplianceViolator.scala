package typings.awsSdk.clientsFmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComplianceViolator extends StObject {
  
  /**
    * Metadata about the resource that doesn't comply with the policy scope.
    */
  var Metadata: js.UndefOr[ComplianceViolatorMetadata] = js.undefined
  
  /**
    * The resource ID.
    */
  var ResourceId: js.UndefOr[typings.awsSdk.clientsFmsMod.ResourceId] = js.undefined
  
  /**
    * The resource type. This is in the format shown in the Amazon Web Services Resource Types Reference. For example: AWS::ElasticLoadBalancingV2::LoadBalancer, AWS::CloudFront::Distribution, or AWS::NetworkFirewall::FirewallPolicy.
    */
  var ResourceType: js.UndefOr[typings.awsSdk.clientsFmsMod.ResourceType] = js.undefined
  
  /**
    * The reason that the resource is not protected by the policy.
    */
  var ViolationReason: js.UndefOr[typings.awsSdk.clientsFmsMod.ViolationReason] = js.undefined
}
object ComplianceViolator {
  
  inline def apply(): ComplianceViolator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComplianceViolator]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComplianceViolator] (val x: Self) extends AnyVal {
    
    inline def setMetadata(value: ComplianceViolatorMetadata): Self = StObject.set(x, "Metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "Metadata", js.undefined)
    
    inline def setResourceId(value: ResourceId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "ResourceId", js.undefined)
    
    inline def setResourceType(value: ResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
    
    inline def setViolationReason(value: ViolationReason): Self = StObject.set(x, "ViolationReason", value.asInstanceOf[js.Any])
    
    inline def setViolationReasonUndefined: Self = StObject.set(x, "ViolationReason", js.undefined)
  }
}
