package typings.awsSdk.clientsAppstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceAccountCredentials extends StObject {
  
  /**
    * The user name of the account. This account must have the following privileges: create computer objects, join computers to the domain, and change/reset the password on descendant computer objects for the organizational units specified.
    */
  var AccountName: typings.awsSdk.clientsAppstreamMod.AccountName
  
  /**
    * The password for the account.
    */
  var AccountPassword: typings.awsSdk.clientsAppstreamMod.AccountPassword
}
object ServiceAccountCredentials {
  
  inline def apply(AccountName: AccountName, AccountPassword: AccountPassword): ServiceAccountCredentials = {
    val __obj = js.Dynamic.literal(AccountName = AccountName.asInstanceOf[js.Any], AccountPassword = AccountPassword.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceAccountCredentials]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServiceAccountCredentials] (val x: Self) extends AnyVal {
    
    inline def setAccountName(value: AccountName): Self = StObject.set(x, "AccountName", value.asInstanceOf[js.Any])
    
    inline def setAccountPassword(value: AccountPassword): Self = StObject.set(x, "AccountPassword", value.asInstanceOf[js.Any])
  }
}
