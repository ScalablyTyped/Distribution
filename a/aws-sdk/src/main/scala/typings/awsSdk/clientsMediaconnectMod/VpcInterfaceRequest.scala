package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpcInterfaceRequest extends StObject {
  
  /**
    * The name of the VPC Interface. This value must be unique within the current flow.
    */
  var Name: string
  
  /**
    * The type of network interface. If this value is not included in the request, MediaConnect uses ENA as the networkInterfaceType.
    */
  var NetworkInterfaceType: js.UndefOr[typings.awsSdk.clientsMediaconnectMod.NetworkInterfaceType] = js.undefined
  
  /**
    * Role Arn MediaConnect can assumes to create ENIs in customer's account
    */
  var RoleArn: string
  
  /**
    * Security Group IDs to be used on ENI.
    */
  var SecurityGroupIds: listOfString
  
  /**
    * Subnet must be in the AZ of the Flow
    */
  var SubnetId: string
}
object VpcInterfaceRequest {
  
  inline def apply(Name: string, RoleArn: string, SecurityGroupIds: listOfString, SubnetId: string): VpcInterfaceRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any], SecurityGroupIds = SecurityGroupIds.asInstanceOf[js.Any], SubnetId = SubnetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcInterfaceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VpcInterfaceRequest] (val x: Self) extends AnyVal {
    
    inline def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNetworkInterfaceType(value: NetworkInterfaceType): Self = StObject.set(x, "NetworkInterfaceType", value.asInstanceOf[js.Any])
    
    inline def setNetworkInterfaceTypeUndefined: Self = StObject.set(x, "NetworkInterfaceType", js.undefined)
    
    inline def setRoleArn(value: string): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupIds(value: listOfString): Self = StObject.set(x, "SecurityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupIdsVarargs(value: string*): Self = StObject.set(x, "SecurityGroupIds", js.Array(value*))
    
    inline def setSubnetId(value: string): Self = StObject.set(x, "SubnetId", value.asInstanceOf[js.Any])
  }
}
