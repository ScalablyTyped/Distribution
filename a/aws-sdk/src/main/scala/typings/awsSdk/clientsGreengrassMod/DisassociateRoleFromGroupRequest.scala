package typings.awsSdk.clientsGreengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateRoleFromGroupRequest extends StObject {
  
  /**
    * The ID of the Greengrass group.
    */
  var GroupId: string
}
object DisassociateRoleFromGroupRequest {
  
  inline def apply(GroupId: string): DisassociateRoleFromGroupRequest = {
    val __obj = js.Dynamic.literal(GroupId = GroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateRoleFromGroupRequest]
  }
  
  extension [Self <: DisassociateRoleFromGroupRequest](x: Self) {
    
    inline def setGroupId(value: string): Self = StObject.set(x, "GroupId", value.asInstanceOf[js.Any])
  }
}
