package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeRoleAliasRequest extends StObject {
  
  /**
    * The role alias to describe.
    */
  var roleAlias: RoleAlias
}
object DescribeRoleAliasRequest {
  
  inline def apply(roleAlias: RoleAlias): DescribeRoleAliasRequest = {
    val __obj = js.Dynamic.literal(roleAlias = roleAlias.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRoleAliasRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeRoleAliasRequest] (val x: Self) extends AnyVal {
    
    inline def setRoleAlias(value: RoleAlias): Self = StObject.set(x, "roleAlias", value.asInstanceOf[js.Any])
  }
}
