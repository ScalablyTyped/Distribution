package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DelegatedAdminAccount extends StObject {
  
  /**
    * The Amazon Web Services account ID of the Amazon Inspector delegated administrator for your organization.
    */
  var accountId: js.UndefOr[AccountId] = js.undefined
  
  /**
    * The status of the Amazon Inspector delegated administrator.
    */
  var status: js.UndefOr[DelegatedAdminStatus] = js.undefined
}
object DelegatedAdminAccount {
  
  inline def apply(): DelegatedAdminAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DelegatedAdminAccount]
  }
  
  extension [Self <: DelegatedAdminAccount](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setStatus(value: DelegatedAdminStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
