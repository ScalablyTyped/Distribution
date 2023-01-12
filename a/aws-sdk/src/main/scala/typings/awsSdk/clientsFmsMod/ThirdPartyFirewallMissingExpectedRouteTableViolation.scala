package typings.awsSdk.clientsFmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThirdPartyFirewallMissingExpectedRouteTableViolation extends StObject {
  
  /**
    * The Availability Zone of the firewall subnet that's causing the violation.
    */
  var AvailabilityZone: js.UndefOr[LengthBoundedString] = js.undefined
  
  /**
    * The resource ID of the current route table that's associated with the subnet, if one is available.
    */
  var CurrentRouteTable: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * The resource ID of the route table that should be associated with the subnet.
    */
  var ExpectedRouteTable: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * The resource ID of the VPC associated with a fireawll subnet that's causing the violation.
    */
  var VPC: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * The ID of the third-party firewall or VPC resource that's causing the violation.
    */
  var ViolationTarget: js.UndefOr[typings.awsSdk.clientsFmsMod.ViolationTarget] = js.undefined
}
object ThirdPartyFirewallMissingExpectedRouteTableViolation {
  
  inline def apply(): ThirdPartyFirewallMissingExpectedRouteTableViolation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThirdPartyFirewallMissingExpectedRouteTableViolation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ThirdPartyFirewallMissingExpectedRouteTableViolation] (val x: Self) extends AnyVal {
    
    inline def setAvailabilityZone(value: LengthBoundedString): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZoneUndefined: Self = StObject.set(x, "AvailabilityZone", js.undefined)
    
    inline def setCurrentRouteTable(value: ResourceId): Self = StObject.set(x, "CurrentRouteTable", value.asInstanceOf[js.Any])
    
    inline def setCurrentRouteTableUndefined: Self = StObject.set(x, "CurrentRouteTable", js.undefined)
    
    inline def setExpectedRouteTable(value: ResourceId): Self = StObject.set(x, "ExpectedRouteTable", value.asInstanceOf[js.Any])
    
    inline def setExpectedRouteTableUndefined: Self = StObject.set(x, "ExpectedRouteTable", js.undefined)
    
    inline def setVPC(value: ResourceId): Self = StObject.set(x, "VPC", value.asInstanceOf[js.Any])
    
    inline def setVPCUndefined: Self = StObject.set(x, "VPC", js.undefined)
    
    inline def setViolationTarget(value: ViolationTarget): Self = StObject.set(x, "ViolationTarget", value.asInstanceOf[js.Any])
    
    inline def setViolationTargetUndefined: Self = StObject.set(x, "ViolationTarget", js.undefined)
  }
}
