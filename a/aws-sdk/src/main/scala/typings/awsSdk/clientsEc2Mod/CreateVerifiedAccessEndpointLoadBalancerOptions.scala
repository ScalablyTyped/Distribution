package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateVerifiedAccessEndpointLoadBalancerOptions extends StObject {
  
  /**
    * The ARN of the load balancer.
    */
  var LoadBalancerArn: js.UndefOr[typings.awsSdk.clientsEc2Mod.LoadBalancerArn] = js.undefined
  
  /**
    * The IP port number.
    */
  var Port: js.UndefOr[VerifiedAccessEndpointPortNumber] = js.undefined
  
  /**
    * The IP protocol.
    */
  var Protocol: js.UndefOr[VerifiedAccessEndpointProtocol] = js.undefined
  
  /**
    * The IDs of the subnets.
    */
  var SubnetIds: js.UndefOr[CreateVerifiedAccessEndpointSubnetIdList] = js.undefined
}
object CreateVerifiedAccessEndpointLoadBalancerOptions {
  
  inline def apply(): CreateVerifiedAccessEndpointLoadBalancerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateVerifiedAccessEndpointLoadBalancerOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateVerifiedAccessEndpointLoadBalancerOptions] (val x: Self) extends AnyVal {
    
    inline def setLoadBalancerArn(value: LoadBalancerArn): Self = StObject.set(x, "LoadBalancerArn", value.asInstanceOf[js.Any])
    
    inline def setLoadBalancerArnUndefined: Self = StObject.set(x, "LoadBalancerArn", js.undefined)
    
    inline def setPort(value: VerifiedAccessEndpointPortNumber): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "Port", js.undefined)
    
    inline def setProtocol(value: VerifiedAccessEndpointProtocol): Self = StObject.set(x, "Protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "Protocol", js.undefined)
    
    inline def setSubnetIds(value: CreateVerifiedAccessEndpointSubnetIdList): Self = StObject.set(x, "SubnetIds", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdsUndefined: Self = StObject.set(x, "SubnetIds", js.undefined)
    
    inline def setSubnetIdsVarargs(value: SubnetId*): Self = StObject.set(x, "SubnetIds", js.Array(value*))
  }
}
