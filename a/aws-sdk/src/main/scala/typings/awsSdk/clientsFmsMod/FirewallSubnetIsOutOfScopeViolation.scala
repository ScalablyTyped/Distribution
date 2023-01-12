package typings.awsSdk.clientsFmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirewallSubnetIsOutOfScopeViolation extends StObject {
  
  /**
    * The ID of the firewall subnet that violates the policy scope.
    */
  var FirewallSubnetId: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * The Availability Zone of the firewall subnet that violates the policy scope.
    */
  var SubnetAvailabilityZone: js.UndefOr[LengthBoundedString] = js.undefined
  
  /**
    * The Availability Zone ID of the firewall subnet that violates the policy scope.
    */
  var SubnetAvailabilityZoneId: js.UndefOr[LengthBoundedString] = js.undefined
  
  /**
    * The VPC endpoint ID of the firewall subnet that violates the policy scope.
    */
  var VpcEndpointId: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * The VPC ID of the firewall subnet that violates the policy scope.
    */
  var VpcId: js.UndefOr[ResourceId] = js.undefined
}
object FirewallSubnetIsOutOfScopeViolation {
  
  inline def apply(): FirewallSubnetIsOutOfScopeViolation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirewallSubnetIsOutOfScopeViolation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FirewallSubnetIsOutOfScopeViolation] (val x: Self) extends AnyVal {
    
    inline def setFirewallSubnetId(value: ResourceId): Self = StObject.set(x, "FirewallSubnetId", value.asInstanceOf[js.Any])
    
    inline def setFirewallSubnetIdUndefined: Self = StObject.set(x, "FirewallSubnetId", js.undefined)
    
    inline def setSubnetAvailabilityZone(value: LengthBoundedString): Self = StObject.set(x, "SubnetAvailabilityZone", value.asInstanceOf[js.Any])
    
    inline def setSubnetAvailabilityZoneId(value: LengthBoundedString): Self = StObject.set(x, "SubnetAvailabilityZoneId", value.asInstanceOf[js.Any])
    
    inline def setSubnetAvailabilityZoneIdUndefined: Self = StObject.set(x, "SubnetAvailabilityZoneId", js.undefined)
    
    inline def setSubnetAvailabilityZoneUndefined: Self = StObject.set(x, "SubnetAvailabilityZone", js.undefined)
    
    inline def setVpcEndpointId(value: ResourceId): Self = StObject.set(x, "VpcEndpointId", value.asInstanceOf[js.Any])
    
    inline def setVpcEndpointIdUndefined: Self = StObject.set(x, "VpcEndpointId", js.undefined)
    
    inline def setVpcId(value: ResourceId): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
