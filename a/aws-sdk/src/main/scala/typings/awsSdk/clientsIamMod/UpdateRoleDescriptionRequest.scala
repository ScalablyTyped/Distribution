package typings.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateRoleDescriptionRequest extends StObject {
  
  /**
    * The new description that you want to apply to the specified role.
    */
  var Description: roleDescriptionType
  
  /**
    * The name of the role that you want to modify.
    */
  var RoleName: roleNameType
}
object UpdateRoleDescriptionRequest {
  
  inline def apply(Description: roleDescriptionType, RoleName: roleNameType): UpdateRoleDescriptionRequest = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], RoleName = RoleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRoleDescriptionRequest]
  }
  
  extension [Self <: UpdateRoleDescriptionRequest](x: Self) {
    
    inline def setDescription(value: roleDescriptionType): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setRoleName(value: roleNameType): Self = StObject.set(x, "RoleName", value.asInstanceOf[js.Any])
  }
}
