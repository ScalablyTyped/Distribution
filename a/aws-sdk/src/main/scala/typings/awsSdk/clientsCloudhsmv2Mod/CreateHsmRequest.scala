package typings.awsSdk.clientsCloudhsmv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateHsmRequest extends StObject {
  
  /**
    * The Availability Zone where you are creating the HSM. To find the cluster's Availability Zones, use DescribeClusters.
    */
  var AvailabilityZone: ExternalAz
  
  /**
    * The identifier (ID) of the HSM's cluster. To find the cluster ID, use DescribeClusters.
    */
  var ClusterId: typings.awsSdk.clientsCloudhsmv2Mod.ClusterId
  
  /**
    * The HSM's IP address. If you specify an IP address, use an available address from the subnet that maps to the Availability Zone where you are creating the HSM. If you don't specify an IP address, one is chosen for you from that subnet.
    */
  var IpAddress: js.UndefOr[typings.awsSdk.clientsCloudhsmv2Mod.IpAddress] = js.undefined
}
object CreateHsmRequest {
  
  inline def apply(AvailabilityZone: ExternalAz, ClusterId: ClusterId): CreateHsmRequest = {
    val __obj = js.Dynamic.literal(AvailabilityZone = AvailabilityZone.asInstanceOf[js.Any], ClusterId = ClusterId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateHsmRequest]
  }
  
  extension [Self <: CreateHsmRequest](x: Self) {
    
    inline def setAvailabilityZone(value: ExternalAz): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    inline def setClusterId(value: ClusterId): Self = StObject.set(x, "ClusterId", value.asInstanceOf[js.Any])
    
    inline def setIpAddress(value: IpAddress): Self = StObject.set(x, "IpAddress", value.asInstanceOf[js.Any])
    
    inline def setIpAddressUndefined: Self = StObject.set(x, "IpAddress", js.undefined)
  }
}
