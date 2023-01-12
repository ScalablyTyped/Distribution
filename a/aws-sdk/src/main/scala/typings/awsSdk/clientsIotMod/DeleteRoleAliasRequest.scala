package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteRoleAliasRequest extends StObject {
  
  /**
    * The role alias to delete.
    */
  var roleAlias: RoleAlias
}
object DeleteRoleAliasRequest {
  
  inline def apply(roleAlias: RoleAlias): DeleteRoleAliasRequest = {
    val __obj = js.Dynamic.literal(roleAlias = roleAlias.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRoleAliasRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteRoleAliasRequest] (val x: Self) extends AnyVal {
    
    inline def setRoleAlias(value: RoleAlias): Self = StObject.set(x, "roleAlias", value.asInstanceOf[js.Any])
  }
}
