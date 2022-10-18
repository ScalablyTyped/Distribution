package typings.awsSdk.clientsDrsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Account extends StObject {
  
  /**
    * Account ID of AWS account.
    */
  var accountID: js.UndefOr[AccountID] = js.undefined
}
object Account {
  
  inline def apply(): Account = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Account]
  }
  
  extension [Self <: Account](x: Self) {
    
    inline def setAccountID(value: AccountID): Self = StObject.set(x, "accountID", value.asInstanceOf[js.Any])
    
    inline def setAccountIDUndefined: Self = StObject.set(x, "accountID", js.undefined)
  }
}
