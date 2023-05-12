package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyVerifiedAccessEndpointLoadBalancerOptions extends StObject {
  
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
  var SubnetIds: js.UndefOr[ModifyVerifiedAccessEndpointSubnetIdList] = js.undefined
}
object ModifyVerifiedAccessEndpointLoadBalancerOptions {
  
  inline def apply(): ModifyVerifiedAccessEndpointLoadBalancerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyVerifiedAccessEndpointLoadBalancerOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModifyVerifiedAccessEndpointLoadBalancerOptions] (val x: Self) extends AnyVal {
    
    inline def setPort(value: VerifiedAccessEndpointPortNumber): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "Port", js.undefined)
    
    inline def setProtocol(value: VerifiedAccessEndpointProtocol): Self = StObject.set(x, "Protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "Protocol", js.undefined)
    
    inline def setSubnetIds(value: ModifyVerifiedAccessEndpointSubnetIdList): Self = StObject.set(x, "SubnetIds", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdsUndefined: Self = StObject.set(x, "SubnetIds", js.undefined)
    
    inline def setSubnetIdsVarargs(value: SubnetId*): Self = StObject.set(x, "SubnetIds", js.Array(value*))
  }
}
