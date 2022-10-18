package typings.awsSdk.clientsElbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AvailabilityZone extends StObject {
  
  /**
    * [Network Load Balancers] If you need static IP addresses for your load balancer, you can specify one Elastic IP address per Availability Zone when you create an internal-facing load balancer. For internal load balancers, you can specify a private IP address from the IPv4 range of the subnet.
    */
  var LoadBalancerAddresses: js.UndefOr[typings.awsSdk.clientsElbv2Mod.LoadBalancerAddresses] = js.undefined
  
  /**
    * [Application Load Balancers on Outposts] The ID of the Outpost.
    */
  var OutpostId: js.UndefOr[typings.awsSdk.clientsElbv2Mod.OutpostId] = js.undefined
  
  /**
    * The ID of the subnet. You can specify one subnet per Availability Zone.
    */
  var SubnetId: js.UndefOr[typings.awsSdk.clientsElbv2Mod.SubnetId] = js.undefined
  
  /**
    * The name of the Availability Zone.
    */
  var ZoneName: js.UndefOr[typings.awsSdk.clientsElbv2Mod.ZoneName] = js.undefined
}
object AvailabilityZone {
  
  inline def apply(): AvailabilityZone = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AvailabilityZone]
  }
  
  extension [Self <: AvailabilityZone](x: Self) {
    
    inline def setLoadBalancerAddresses(value: LoadBalancerAddresses): Self = StObject.set(x, "LoadBalancerAddresses", value.asInstanceOf[js.Any])
    
    inline def setLoadBalancerAddressesUndefined: Self = StObject.set(x, "LoadBalancerAddresses", js.undefined)
    
    inline def setLoadBalancerAddressesVarargs(value: LoadBalancerAddress*): Self = StObject.set(x, "LoadBalancerAddresses", js.Array(value*))
    
    inline def setOutpostId(value: OutpostId): Self = StObject.set(x, "OutpostId", value.asInstanceOf[js.Any])
    
    inline def setOutpostIdUndefined: Self = StObject.set(x, "OutpostId", js.undefined)
    
    inline def setSubnetId(value: SubnetId): Self = StObject.set(x, "SubnetId", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdUndefined: Self = StObject.set(x, "SubnetId", js.undefined)
    
    inline def setZoneName(value: ZoneName): Self = StObject.set(x, "ZoneName", value.asInstanceOf[js.Any])
    
    inline def setZoneNameUndefined: Self = StObject.set(x, "ZoneName", js.undefined)
  }
}
