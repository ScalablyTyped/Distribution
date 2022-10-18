package typings.awsSdk.anon

import typings.awsSdk.clientsIamMod.roleNameType
import typings.awsSdk.libServiceMod.WaiterConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-sdk.aws-sdk/clients/iam.GetRoleRequest & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
trait GetRoleRequestwaiterWaite extends StObject {
  
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.undefined
  
  /**
    * The name of the IAM role to get information about. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var RoleName: roleNameType
}
object GetRoleRequestwaiterWaite {
  
  inline def apply(RoleName: roleNameType): GetRoleRequestwaiterWaite = {
    val __obj = js.Dynamic.literal(RoleName = RoleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRoleRequestwaiterWaite]
  }
  
  extension [Self <: GetRoleRequestwaiterWaite](x: Self) {
    
    inline def set$waiter(value: WaiterConfiguration): Self = StObject.set(x, "$waiter", value.asInstanceOf[js.Any])
    
    inline def set$waiterUndefined: Self = StObject.set(x, "$waiter", js.undefined)
    
    inline def setRoleName(value: roleNameType): Self = StObject.set(x, "RoleName", value.asInstanceOf[js.Any])
  }
}
