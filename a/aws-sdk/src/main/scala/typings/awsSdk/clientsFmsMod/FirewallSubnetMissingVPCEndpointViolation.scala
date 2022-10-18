package typings.awsSdk.clientsFmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirewallSubnetMissingVPCEndpointViolation extends StObject {
  
  /**
    * The ID of the firewall that this VPC endpoint is associated with.
    */
  var FirewallSubnetId: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * The name of the Availability Zone of the deleted VPC subnet.
    */
  var SubnetAvailabilityZone: js.UndefOr[LengthBoundedString] = js.undefined
  
  /**
    * The ID of the Availability Zone of the deleted VPC subnet.
    */
  var SubnetAvailabilityZoneId: js.UndefOr[LengthBoundedString] = js.undefined
  
  /**
    * The resource ID of the VPC associated with the deleted VPC subnet.
    */
  var VpcId: js.UndefOr[ResourceId] = js.undefined
}
object FirewallSubnetMissingVPCEndpointViolation {
  
  inline def apply(): FirewallSubnetMissingVPCEndpointViolation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirewallSubnetMissingVPCEndpointViolation]
  }
  
  extension [Self <: FirewallSubnetMissingVPCEndpointViolation](x: Self) {
    
    inline def setFirewallSubnetId(value: ResourceId): Self = StObject.set(x, "FirewallSubnetId", value.asInstanceOf[js.Any])
    
    inline def setFirewallSubnetIdUndefined: Self = StObject.set(x, "FirewallSubnetId", js.undefined)
    
    inline def setSubnetAvailabilityZone(value: LengthBoundedString): Self = StObject.set(x, "SubnetAvailabilityZone", value.asInstanceOf[js.Any])
    
    inline def setSubnetAvailabilityZoneId(value: LengthBoundedString): Self = StObject.set(x, "SubnetAvailabilityZoneId", value.asInstanceOf[js.Any])
    
    inline def setSubnetAvailabilityZoneIdUndefined: Self = StObject.set(x, "SubnetAvailabilityZoneId", js.undefined)
    
    inline def setSubnetAvailabilityZoneUndefined: Self = StObject.set(x, "SubnetAvailabilityZone", js.undefined)
    
    inline def setVpcId(value: ResourceId): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
