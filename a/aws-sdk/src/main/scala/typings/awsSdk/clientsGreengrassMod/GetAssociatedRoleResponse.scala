package typings.awsSdk.clientsGreengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAssociatedRoleResponse extends StObject {
  
  /**
    * The time when the role was associated with the group.
    */
  var AssociatedAt: js.UndefOr[string] = js.undefined
  
  /**
    * The ARN of the role that is associated with the group.
    */
  var RoleArn: js.UndefOr[string] = js.undefined
}
object GetAssociatedRoleResponse {
  
  inline def apply(): GetAssociatedRoleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAssociatedRoleResponse]
  }
  
  extension [Self <: GetAssociatedRoleResponse](x: Self) {
    
    inline def setAssociatedAt(value: string): Self = StObject.set(x, "AssociatedAt", value.asInstanceOf[js.Any])
    
    inline def setAssociatedAtUndefined: Self = StObject.set(x, "AssociatedAt", js.undefined)
    
    inline def setRoleArn(value: string): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
  }
}
