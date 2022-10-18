package typings.awsSdk.clientsGreengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateRoleFromGroupResponse extends StObject {
  
  /**
    * The time, in milliseconds since the epoch, when the role was disassociated from the group.
    */
  var DisassociatedAt: js.UndefOr[string] = js.undefined
}
object DisassociateRoleFromGroupResponse {
  
  inline def apply(): DisassociateRoleFromGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisassociateRoleFromGroupResponse]
  }
  
  extension [Self <: DisassociateRoleFromGroupResponse](x: Self) {
    
    inline def setDisassociatedAt(value: string): Self = StObject.set(x, "DisassociatedAt", value.asInstanceOf[js.Any])
    
    inline def setDisassociatedAtUndefined: Self = StObject.set(x, "DisassociatedAt", js.undefined)
  }
}
