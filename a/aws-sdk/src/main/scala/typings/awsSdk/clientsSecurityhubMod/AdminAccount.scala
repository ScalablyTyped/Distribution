package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdminAccount extends StObject {
  
  /**
    * The Amazon Web Services account identifier of the Security Hub administrator account.
    */
  var AccountId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The current status of the Security Hub administrator account. Indicates whether the account is currently enabled as a Security Hub administrator.
    */
  var Status: js.UndefOr[AdminStatus] = js.undefined
}
object AdminAccount {
  
  inline def apply(): AdminAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdminAccount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AdminAccount] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: NonEmptyString): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    inline def setStatus(value: AdminStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
