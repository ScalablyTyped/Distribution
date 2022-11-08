package typings.awsSdk.clientsElasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Subnet extends StObject {
  
  /**
    * The Availability Zone associated with the subnet.
    */
  var SubnetAvailabilityZone: js.UndefOr[AvailabilityZone] = js.undefined
  
  /**
    * The unique identifier for the subnet.
    */
  var SubnetIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * The outpost ARN of the subnet.
    */
  var SubnetOutpost: js.UndefOr[typings.awsSdk.clientsElasticacheMod.SubnetOutpost] = js.undefined
  
  /**
    * Either ipv4 | ipv6 | dual_stack. IPv6 is supported for workloads using Redis engine version 6.2 onward or Memcached engine version 1.6.6 on all instances built on the Nitro system.
    */
  var SupportedNetworkTypes: js.UndefOr[NetworkTypeList] = js.undefined
}
object Subnet {
  
  inline def apply(): Subnet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Subnet]
  }
  
  extension [Self <: Subnet](x: Self) {
    
    inline def setSubnetAvailabilityZone(value: AvailabilityZone): Self = StObject.set(x, "SubnetAvailabilityZone", value.asInstanceOf[js.Any])
    
    inline def setSubnetAvailabilityZoneUndefined: Self = StObject.set(x, "SubnetAvailabilityZone", js.undefined)
    
    inline def setSubnetIdentifier(value: String): Self = StObject.set(x, "SubnetIdentifier", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdentifierUndefined: Self = StObject.set(x, "SubnetIdentifier", js.undefined)
    
    inline def setSubnetOutpost(value: SubnetOutpost): Self = StObject.set(x, "SubnetOutpost", value.asInstanceOf[js.Any])
    
    inline def setSubnetOutpostUndefined: Self = StObject.set(x, "SubnetOutpost", js.undefined)
    
    inline def setSupportedNetworkTypes(value: NetworkTypeList): Self = StObject.set(x, "SupportedNetworkTypes", value.asInstanceOf[js.Any])
    
    inline def setSupportedNetworkTypesUndefined: Self = StObject.set(x, "SupportedNetworkTypes", js.undefined)
    
    inline def setSupportedNetworkTypesVarargs(value: NetworkType*): Self = StObject.set(x, "SupportedNetworkTypes", js.Array(value*))
  }
}
