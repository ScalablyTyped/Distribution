package typings.awsSdk.clientsFmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolicySummary extends StObject {
  
  /**
    * Indicates whether Firewall Manager should automatically remove protections from resources that leave the policy scope and clean up resources that Firewall Manager is managing for accounts when those accounts leave policy scope. For example, Firewall Manager will disassociate a Firewall Manager managed web ACL from a protected customer resource when the customer resource leaves policy scope.  By default, Firewall Manager doesn't remove protections or delete Firewall Manager managed resources.  This option is not available for Shield Advanced or WAF Classic policies.
    */
  var DeleteUnusedFMManagedResources: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the specified policy.
    */
  var PolicyArn: js.UndefOr[ResourceArn] = js.undefined
  
  /**
    * The ID of the specified policy.
    */
  var PolicyId: js.UndefOr[typings.awsSdk.clientsFmsMod.PolicyId] = js.undefined
  
  /**
    * The name of the specified policy.
    */
  var PolicyName: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * Indicates if the policy should be automatically applied to new resources.
    */
  var RemediationEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The type of resource protected by or in scope of the policy. This is in the format shown in the Amazon Web Services Resource Types Reference. For WAF and Shield Advanced, examples include AWS::ElasticLoadBalancingV2::LoadBalancer and AWS::CloudFront::Distribution. For a security group common policy, valid values are AWS::EC2::NetworkInterface and AWS::EC2::Instance. For a security group content audit policy, valid values are AWS::EC2::SecurityGroup, AWS::EC2::NetworkInterface, and AWS::EC2::Instance. For a security group usage audit policy, the value is AWS::EC2::SecurityGroup. For an Network Firewall policy or DNS Firewall policy, the value is AWS::EC2::VPC.
    */
  var ResourceType: js.UndefOr[typings.awsSdk.clientsFmsMod.ResourceType] = js.undefined
  
  /**
    * The service that the policy is using to protect the resources. This specifies the type of policy that is created, either an WAF policy, a Shield Advanced policy, or a security group policy.
    */
  var SecurityServiceType: js.UndefOr[typings.awsSdk.clientsFmsMod.SecurityServiceType] = js.undefined
}
object PolicySummary {
  
  inline def apply(): PolicySummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicySummary]
  }
  
  extension [Self <: PolicySummary](x: Self) {
    
    inline def setDeleteUnusedFMManagedResources(value: Boolean): Self = StObject.set(x, "DeleteUnusedFMManagedResources", value.asInstanceOf[js.Any])
    
    inline def setDeleteUnusedFMManagedResourcesUndefined: Self = StObject.set(x, "DeleteUnusedFMManagedResources", js.undefined)
    
    inline def setPolicyArn(value: ResourceArn): Self = StObject.set(x, "PolicyArn", value.asInstanceOf[js.Any])
    
    inline def setPolicyArnUndefined: Self = StObject.set(x, "PolicyArn", js.undefined)
    
    inline def setPolicyId(value: PolicyId): Self = StObject.set(x, "PolicyId", value.asInstanceOf[js.Any])
    
    inline def setPolicyIdUndefined: Self = StObject.set(x, "PolicyId", js.undefined)
    
    inline def setPolicyName(value: ResourceName): Self = StObject.set(x, "PolicyName", value.asInstanceOf[js.Any])
    
    inline def setPolicyNameUndefined: Self = StObject.set(x, "PolicyName", js.undefined)
    
    inline def setRemediationEnabled(value: Boolean): Self = StObject.set(x, "RemediationEnabled", value.asInstanceOf[js.Any])
    
    inline def setRemediationEnabledUndefined: Self = StObject.set(x, "RemediationEnabled", js.undefined)
    
    inline def setResourceType(value: ResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
    
    inline def setSecurityServiceType(value: SecurityServiceType): Self = StObject.set(x, "SecurityServiceType", value.asInstanceOf[js.Any])
    
    inline def setSecurityServiceTypeUndefined: Self = StObject.set(x, "SecurityServiceType", js.undefined)
  }
}
