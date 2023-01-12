package typings.awsSdk.clientsEfsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyMountTargetSecurityGroupsRequest extends StObject {
  
  /**
    * The ID of the mount target whose security groups you want to modify.
    */
  var MountTargetId: typings.awsSdk.clientsEfsMod.MountTargetId
  
  /**
    * An array of up to five VPC security group IDs.
    */
  var SecurityGroups: js.UndefOr[typings.awsSdk.clientsEfsMod.SecurityGroups] = js.undefined
}
object ModifyMountTargetSecurityGroupsRequest {
  
  inline def apply(MountTargetId: MountTargetId): ModifyMountTargetSecurityGroupsRequest = {
    val __obj = js.Dynamic.literal(MountTargetId = MountTargetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyMountTargetSecurityGroupsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModifyMountTargetSecurityGroupsRequest] (val x: Self) extends AnyVal {
    
    inline def setMountTargetId(value: MountTargetId): Self = StObject.set(x, "MountTargetId", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroups(value: SecurityGroups): Self = StObject.set(x, "SecurityGroups", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupsUndefined: Self = StObject.set(x, "SecurityGroups", js.undefined)
    
    inline def setSecurityGroupsVarargs(value: SecurityGroup*): Self = StObject.set(x, "SecurityGroups", js.Array(value*))
  }
}
