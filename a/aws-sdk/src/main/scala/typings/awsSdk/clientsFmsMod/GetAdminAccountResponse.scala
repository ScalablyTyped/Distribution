package typings.awsSdk.clientsFmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAdminAccountResponse extends StObject {
  
  /**
    * The account that is set as the Firewall Manager default administrator.
    */
  var AdminAccount: js.UndefOr[AWSAccountId] = js.undefined
  
  /**
    * The status of the account that you set as the Firewall Manager default administrator.
    */
  var RoleStatus: js.UndefOr[AccountRoleStatus] = js.undefined
}
object GetAdminAccountResponse {
  
  inline def apply(): GetAdminAccountResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAdminAccountResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetAdminAccountResponse] (val x: Self) extends AnyVal {
    
    inline def setAdminAccount(value: AWSAccountId): Self = StObject.set(x, "AdminAccount", value.asInstanceOf[js.Any])
    
    inline def setAdminAccountUndefined: Self = StObject.set(x, "AdminAccount", js.undefined)
    
    inline def setRoleStatus(value: AccountRoleStatus): Self = StObject.set(x, "RoleStatus", value.asInstanceOf[js.Any])
    
    inline def setRoleStatusUndefined: Self = StObject.set(x, "RoleStatus", js.undefined)
  }
}
