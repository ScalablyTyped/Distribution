package typings.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateServiceLinkedRoleResponse extends StObject {
  
  /**
    * A Role object that contains details about the newly created role.
    */
  var Role: js.UndefOr[typings.awsSdk.clientsIamMod.Role] = js.undefined
}
object CreateServiceLinkedRoleResponse {
  
  inline def apply(): CreateServiceLinkedRoleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateServiceLinkedRoleResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateServiceLinkedRoleResponse] (val x: Self) extends AnyVal {
    
    inline def setRole(value: Role): Self = StObject.set(x, "Role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "Role", js.undefined)
  }
}
