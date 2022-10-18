package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VPCDerivedInfo extends StObject {
  
  /**
    * The Availability Zones for the domain. Exists only if the domain was created with VPCOptions.
    */
  var AvailabilityZones: js.UndefOr[StringList] = js.undefined
  
  /**
    * The security groups for the VPC endpoint.
    */
  var SecurityGroupIds: js.UndefOr[StringList] = js.undefined
  
  /**
    * The subnets for the VPC endpoint.
    */
  var SubnetIds: js.UndefOr[StringList] = js.undefined
  
  /**
    * The VPC ID for the domain. Exists only if the domain was created with VPCOptions.
    */
  var VPCId: js.UndefOr[String] = js.undefined
}
object VPCDerivedInfo {
  
  inline def apply(): VPCDerivedInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VPCDerivedInfo]
  }
  
  extension [Self <: VPCDerivedInfo](x: Self) {
    
    inline def setAvailabilityZones(value: StringList): Self = StObject.set(x, "AvailabilityZones", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZonesUndefined: Self = StObject.set(x, "AvailabilityZones", js.undefined)
    
    inline def setAvailabilityZonesVarargs(value: String*): Self = StObject.set(x, "AvailabilityZones", js.Array(value*))
    
    inline def setSecurityGroupIds(value: StringList): Self = StObject.set(x, "SecurityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupIdsUndefined: Self = StObject.set(x, "SecurityGroupIds", js.undefined)
    
    inline def setSecurityGroupIdsVarargs(value: String*): Self = StObject.set(x, "SecurityGroupIds", js.Array(value*))
    
    inline def setSubnetIds(value: StringList): Self = StObject.set(x, "SubnetIds", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdsUndefined: Self = StObject.set(x, "SubnetIds", js.undefined)
    
    inline def setSubnetIdsVarargs(value: String*): Self = StObject.set(x, "SubnetIds", js.Array(value*))
    
    inline def setVPCId(value: String): Self = StObject.set(x, "VPCId", value.asInstanceOf[js.Any])
    
    inline def setVPCIdUndefined: Self = StObject.set(x, "VPCId", js.undefined)
  }
}
