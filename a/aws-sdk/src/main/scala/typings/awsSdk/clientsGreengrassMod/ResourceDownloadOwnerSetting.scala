package typings.awsSdk.clientsGreengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceDownloadOwnerSetting extends StObject {
  
  /**
    * The group owner of the resource. This is the name of an existing Linux OS group on the system or a GID. The group's permissions are added to the Lambda process.
    */
  var GroupOwner: string
  
  /**
    * The permissions that the group owner has to the resource. Valid values are ''rw'' (read/write) or ''ro'' (read-only).
    */
  var GroupPermission: Permission
}
object ResourceDownloadOwnerSetting {
  
  inline def apply(GroupOwner: string, GroupPermission: Permission): ResourceDownloadOwnerSetting = {
    val __obj = js.Dynamic.literal(GroupOwner = GroupOwner.asInstanceOf[js.Any], GroupPermission = GroupPermission.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceDownloadOwnerSetting]
  }
  
  extension [Self <: ResourceDownloadOwnerSetting](x: Self) {
    
    inline def setGroupOwner(value: string): Self = StObject.set(x, "GroupOwner", value.asInstanceOf[js.Any])
    
    inline def setGroupPermission(value: Permission): Self = StObject.set(x, "GroupPermission", value.asInstanceOf[js.Any])
  }
}
