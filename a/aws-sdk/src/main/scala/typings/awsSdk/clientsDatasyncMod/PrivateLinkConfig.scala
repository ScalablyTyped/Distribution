package typings.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrivateLinkConfig extends StObject {
  
  /**
    * The private endpoint that is configured for an agent that has access to IP addresses in a PrivateLink. An agent that is configured with this endpoint will not be accessible over the public internet.
    */
  var PrivateLinkEndpoint: js.UndefOr[Endpoint] = js.undefined
  
  /**
    * The Amazon Resource Names (ARNs) of the security groups that are configured for the EC2 resource that hosts an agent activated in a VPC or an agent that has access to a VPC endpoint.
    */
  var SecurityGroupArns: js.UndefOr[PLSecurityGroupArnList] = js.undefined
  
  /**
    * The Amazon Resource Names (ARNs) of the subnets that are configured for an agent activated in a VPC or an agent that has access to a VPC endpoint.
    */
  var SubnetArns: js.UndefOr[PLSubnetArnList] = js.undefined
  
  /**
    * The ID of the VPC endpoint that is configured for an agent. An agent that is configured with a VPC endpoint will not be accessible over the public internet.
    */
  var VpcEndpointId: js.UndefOr[typings.awsSdk.clientsDatasyncMod.VpcEndpointId] = js.undefined
}
object PrivateLinkConfig {
  
  inline def apply(): PrivateLinkConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrivateLinkConfig]
  }
  
  extension [Self <: PrivateLinkConfig](x: Self) {
    
    inline def setPrivateLinkEndpoint(value: Endpoint): Self = StObject.set(x, "PrivateLinkEndpoint", value.asInstanceOf[js.Any])
    
    inline def setPrivateLinkEndpointUndefined: Self = StObject.set(x, "PrivateLinkEndpoint", js.undefined)
    
    inline def setSecurityGroupArns(value: PLSecurityGroupArnList): Self = StObject.set(x, "SecurityGroupArns", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupArnsUndefined: Self = StObject.set(x, "SecurityGroupArns", js.undefined)
    
    inline def setSecurityGroupArnsVarargs(value: Ec2SecurityGroupArn*): Self = StObject.set(x, "SecurityGroupArns", js.Array(value*))
    
    inline def setSubnetArns(value: PLSubnetArnList): Self = StObject.set(x, "SubnetArns", value.asInstanceOf[js.Any])
    
    inline def setSubnetArnsUndefined: Self = StObject.set(x, "SubnetArns", js.undefined)
    
    inline def setSubnetArnsVarargs(value: Ec2SubnetArn*): Self = StObject.set(x, "SubnetArns", js.Array(value*))
    
    inline def setVpcEndpointId(value: VpcEndpointId): Self = StObject.set(x, "VpcEndpointId", value.asInstanceOf[js.Any])
    
    inline def setVpcEndpointIdUndefined: Self = StObject.set(x, "VpcEndpointId", js.undefined)
  }
}
