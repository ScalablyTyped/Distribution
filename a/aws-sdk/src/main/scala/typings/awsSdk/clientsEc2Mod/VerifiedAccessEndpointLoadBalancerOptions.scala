package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VerifiedAccessEndpointLoadBalancerOptions extends StObject {
  
  /**
    * The ARN of the load balancer.
    */
  var LoadBalancerArn: js.UndefOr[String] = js.undefined
  
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
  var SubnetIds: js.UndefOr[VerifiedAccessEndpointSubnetIdList] = js.undefined
}
object VerifiedAccessEndpointLoadBalancerOptions {
  
  inline def apply(): VerifiedAccessEndpointLoadBalancerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VerifiedAccessEndpointLoadBalancerOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VerifiedAccessEndpointLoadBalancerOptions] (val x: Self) extends AnyVal {
    
    inline def setLoadBalancerArn(value: String): Self = StObject.set(x, "LoadBalancerArn", value.asInstanceOf[js.Any])
    
    inline def setLoadBalancerArnUndefined: Self = StObject.set(x, "LoadBalancerArn", js.undefined)
    
    inline def setPort(value: VerifiedAccessEndpointPortNumber): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "Port", js.undefined)
    
    inline def setProtocol(value: VerifiedAccessEndpointProtocol): Self = StObject.set(x, "Protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "Protocol", js.undefined)
    
    inline def setSubnetIds(value: VerifiedAccessEndpointSubnetIdList): Self = StObject.set(x, "SubnetIds", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdsUndefined: Self = StObject.set(x, "SubnetIds", js.undefined)
    
    inline def setSubnetIdsVarargs(value: SubnetId*): Self = StObject.set(x, "SubnetIds", js.Array(value*))
  }
}
