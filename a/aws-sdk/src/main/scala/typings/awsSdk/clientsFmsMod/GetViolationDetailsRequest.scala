package typings.awsSdk.clientsFmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetViolationDetailsRequest extends StObject {
  
  /**
    * The Amazon Web Services account ID that you want the details for.
    */
  var MemberAccount: AWSAccountId
  
  /**
    * The ID of the Firewall Manager policy that you want the details for. This currently only supports security group content audit policies.
    */
  var PolicyId: typings.awsSdk.clientsFmsMod.PolicyId
  
  /**
    * The ID of the resource that has violations.
    */
  var ResourceId: typings.awsSdk.clientsFmsMod.ResourceId
  
  /**
    * The resource type. This is in the format shown in the Amazon Web Services Resource Types Reference. Supported resource types are: AWS::EC2::Instance, AWS::EC2::NetworkInterface, AWS::EC2::SecurityGroup, AWS::NetworkFirewall::FirewallPolicy, and AWS::EC2::Subnet. 
    */
  var ResourceType: typings.awsSdk.clientsFmsMod.ResourceType
}
object GetViolationDetailsRequest {
  
  inline def apply(
    MemberAccount: AWSAccountId,
    PolicyId: PolicyId,
    ResourceId: ResourceId,
    ResourceType: ResourceType
  ): GetViolationDetailsRequest = {
    val __obj = js.Dynamic.literal(MemberAccount = MemberAccount.asInstanceOf[js.Any], PolicyId = PolicyId.asInstanceOf[js.Any], ResourceId = ResourceId.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetViolationDetailsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetViolationDetailsRequest] (val x: Self) extends AnyVal {
    
    inline def setMemberAccount(value: AWSAccountId): Self = StObject.set(x, "MemberAccount", value.asInstanceOf[js.Any])
    
    inline def setPolicyId(value: PolicyId): Self = StObject.set(x, "PolicyId", value.asInstanceOf[js.Any])
    
    inline def setResourceId(value: ResourceId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceType(value: ResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
  }
}
