package typings.awsSdk.clientsGreengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateRoleToGroupResponse extends StObject {
  
  /**
    * The time, in milliseconds since the epoch, when the role ARN was associated with the group.
    */
  var AssociatedAt: js.UndefOr[string] = js.undefined
}
object AssociateRoleToGroupResponse {
  
  inline def apply(): AssociateRoleToGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateRoleToGroupResponse]
  }
  
  extension [Self <: AssociateRoleToGroupResponse](x: Self) {
    
    inline def setAssociatedAt(value: string): Self = StObject.set(x, "AssociatedAt", value.asInstanceOf[js.Any])
    
    inline def setAssociatedAtUndefined: Self = StObject.set(x, "AssociatedAt", js.undefined)
  }
}
