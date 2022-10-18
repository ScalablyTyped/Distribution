package typings.awsSdk.clientsFmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAdminAccountResponse extends StObject {
  
  /**
    * The Amazon Web Services account that is set as the Firewall Manager administrator.
    */
  var AdminAccount: js.UndefOr[AWSAccountId] = js.undefined
  
  /**
    * The status of the Amazon Web Services account that you set as the Firewall Manager administrator.
    */
  var RoleStatus: js.UndefOr[AccountRoleStatus] = js.undefined
}
object GetAdminAccountResponse {
  
  inline def apply(): GetAdminAccountResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAdminAccountResponse]
  }
  
  extension [Self <: GetAdminAccountResponse](x: Self) {
    
    inline def setAdminAccount(value: AWSAccountId): Self = StObject.set(x, "AdminAccount", value.asInstanceOf[js.Any])
    
    inline def setAdminAccountUndefined: Self = StObject.set(x, "AdminAccount", js.undefined)
    
    inline def setRoleStatus(value: AccountRoleStatus): Self = StObject.set(x, "RoleStatus", value.asInstanceOf[js.Any])
    
    inline def setRoleStatusUndefined: Self = StObject.set(x, "RoleStatus", js.undefined)
  }
}
