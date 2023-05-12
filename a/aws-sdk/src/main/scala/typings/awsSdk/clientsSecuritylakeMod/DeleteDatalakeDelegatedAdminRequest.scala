package typings.awsSdk.clientsSecuritylakeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDatalakeDelegatedAdminRequest extends StObject {
  
  /**
    * The account ID the Security Lake delegated administrator.
    */
  var account: SafeString
}
object DeleteDatalakeDelegatedAdminRequest {
  
  inline def apply(account: SafeString): DeleteDatalakeDelegatedAdminRequest = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDatalakeDelegatedAdminRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteDatalakeDelegatedAdminRequest] (val x: Self) extends AnyVal {
    
    inline def setAccount(value: SafeString): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
  }
}
