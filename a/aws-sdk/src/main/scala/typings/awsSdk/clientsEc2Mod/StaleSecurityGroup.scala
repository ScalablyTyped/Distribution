package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StaleSecurityGroup extends StObject {
  
  /**
    * The description of the security group.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the security group.
    */
  var GroupId: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the security group.
    */
  var GroupName: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the stale inbound rules in the security group.
    */
  var StaleIpPermissions: js.UndefOr[StaleIpPermissionSet] = js.undefined
  
  /**
    * Information about the stale outbound rules in the security group.
    */
  var StaleIpPermissionsEgress: js.UndefOr[StaleIpPermissionSet] = js.undefined
  
  /**
    * The ID of the VPC for the security group.
    */
  var VpcId: js.UndefOr[String] = js.undefined
}
object StaleSecurityGroup {
  
  inline def apply(): StaleSecurityGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StaleSecurityGroup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StaleSecurityGroup] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setGroupId(value: String): Self = StObject.set(x, "GroupId", value.asInstanceOf[js.Any])
    
    inline def setGroupIdUndefined: Self = StObject.set(x, "GroupId", js.undefined)
    
    inline def setGroupName(value: String): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    inline def setGroupNameUndefined: Self = StObject.set(x, "GroupName", js.undefined)
    
    inline def setStaleIpPermissions(value: StaleIpPermissionSet): Self = StObject.set(x, "StaleIpPermissions", value.asInstanceOf[js.Any])
    
    inline def setStaleIpPermissionsEgress(value: StaleIpPermissionSet): Self = StObject.set(x, "StaleIpPermissionsEgress", value.asInstanceOf[js.Any])
    
    inline def setStaleIpPermissionsEgressUndefined: Self = StObject.set(x, "StaleIpPermissionsEgress", js.undefined)
    
    inline def setStaleIpPermissionsEgressVarargs(value: StaleIpPermission*): Self = StObject.set(x, "StaleIpPermissionsEgress", js.Array(value*))
    
    inline def setStaleIpPermissionsUndefined: Self = StObject.set(x, "StaleIpPermissions", js.undefined)
    
    inline def setStaleIpPermissionsVarargs(value: StaleIpPermission*): Self = StObject.set(x, "StaleIpPermissions", js.Array(value*))
    
    inline def setVpcId(value: String): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
