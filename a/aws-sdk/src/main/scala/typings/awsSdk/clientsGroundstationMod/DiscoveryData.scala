package typings.awsSdk.clientsGroundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiscoveryData extends StObject {
  
  /**
    * List of capabilities to associate with agent.
    */
  var capabilityArns: CapabilityArnList
  
  /**
    * List of private IP addresses to associate with agent.
    */
  var privateIpAddresses: IpAddressList
  
  /**
    * List of public IP addresses to associate with agent.
    */
  var publicIpAddresses: IpAddressList
}
object DiscoveryData {
  
  inline def apply(
    capabilityArns: CapabilityArnList,
    privateIpAddresses: IpAddressList,
    publicIpAddresses: IpAddressList
  ): DiscoveryData = {
    val __obj = js.Dynamic.literal(capabilityArns = capabilityArns.asInstanceOf[js.Any], privateIpAddresses = privateIpAddresses.asInstanceOf[js.Any], publicIpAddresses = publicIpAddresses.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiscoveryData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DiscoveryData] (val x: Self) extends AnyVal {
    
    inline def setCapabilityArns(value: CapabilityArnList): Self = StObject.set(x, "capabilityArns", value.asInstanceOf[js.Any])
    
    inline def setCapabilityArnsVarargs(value: CapabilityArn*): Self = StObject.set(x, "capabilityArns", js.Array(value*))
    
    inline def setPrivateIpAddresses(value: IpAddressList): Self = StObject.set(x, "privateIpAddresses", value.asInstanceOf[js.Any])
    
    inline def setPrivateIpAddressesVarargs(value: IpV4Address*): Self = StObject.set(x, "privateIpAddresses", js.Array(value*))
    
    inline def setPublicIpAddresses(value: IpAddressList): Self = StObject.set(x, "publicIpAddresses", value.asInstanceOf[js.Any])
    
    inline def setPublicIpAddressesVarargs(value: IpV4Address*): Self = StObject.set(x, "publicIpAddresses", js.Array(value*))
  }
}
