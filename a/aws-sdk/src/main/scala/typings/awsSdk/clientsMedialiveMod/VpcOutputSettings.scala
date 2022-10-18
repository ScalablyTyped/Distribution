package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpcOutputSettings extends StObject {
  
  /**
    * List of public address allocation ids to associate with ENIs that will be created in Output VPC.
  Must specify one for SINGLE_PIPELINE, two for STANDARD channels
    */
  var PublicAddressAllocationIds: js.UndefOr[listOfString] = js.undefined
  
  /**
    * A list of up to 5 EC2 VPC security group IDs to attach to the Output VPC network interfaces.
  If none are specified then the VPC default security group will be used
    */
  var SecurityGroupIds: js.UndefOr[listOfString] = js.undefined
  
  /**
    * A list of VPC subnet IDs from the same VPC.
  If STANDARD channel, subnet IDs must be mapped to two unique availability zones (AZ).
    */
  var SubnetIds: listOfString
}
object VpcOutputSettings {
  
  inline def apply(SubnetIds: listOfString): VpcOutputSettings = {
    val __obj = js.Dynamic.literal(SubnetIds = SubnetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcOutputSettings]
  }
  
  extension [Self <: VpcOutputSettings](x: Self) {
    
    inline def setPublicAddressAllocationIds(value: listOfString): Self = StObject.set(x, "PublicAddressAllocationIds", value.asInstanceOf[js.Any])
    
    inline def setPublicAddressAllocationIdsUndefined: Self = StObject.set(x, "PublicAddressAllocationIds", js.undefined)
    
    inline def setPublicAddressAllocationIdsVarargs(value: string*): Self = StObject.set(x, "PublicAddressAllocationIds", js.Array(value*))
    
    inline def setSecurityGroupIds(value: listOfString): Self = StObject.set(x, "SecurityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupIdsUndefined: Self = StObject.set(x, "SecurityGroupIds", js.undefined)
    
    inline def setSecurityGroupIdsVarargs(value: string*): Self = StObject.set(x, "SecurityGroupIds", js.Array(value*))
    
    inline def setSubnetIds(value: listOfString): Self = StObject.set(x, "SubnetIds", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdsVarargs(value: string*): Self = StObject.set(x, "SubnetIds", js.Array(value*))
  }
}
