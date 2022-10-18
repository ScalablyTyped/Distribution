package typings.awsSdk.clientsSmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportAppCatalogRequest extends StObject {
  
  /**
    * The name of the service role. If you omit this parameter, we create a service-linked role for Migration Hub in your account. Otherwise, the role that you provide must have the policy and trust policy described in the Migration Hub User Guide.
    */
  var roleName: js.UndefOr[RoleName] = js.undefined
}
object ImportAppCatalogRequest {
  
  inline def apply(): ImportAppCatalogRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportAppCatalogRequest]
  }
  
  extension [Self <: ImportAppCatalogRequest](x: Self) {
    
    inline def setRoleName(value: RoleName): Self = StObject.set(x, "roleName", value.asInstanceOf[js.Any])
    
    inline def setRoleNameUndefined: Self = StObject.set(x, "roleName", js.undefined)
  }
}
