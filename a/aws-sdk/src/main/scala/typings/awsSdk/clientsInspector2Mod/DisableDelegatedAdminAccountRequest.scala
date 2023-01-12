package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisableDelegatedAdminAccountRequest extends StObject {
  
  /**
    * The Amazon Web Services account ID of the current Amazon Inspector delegated administrator.
    */
  var delegatedAdminAccountId: AccountId
}
object DisableDelegatedAdminAccountRequest {
  
  inline def apply(delegatedAdminAccountId: AccountId): DisableDelegatedAdminAccountRequest = {
    val __obj = js.Dynamic.literal(delegatedAdminAccountId = delegatedAdminAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableDelegatedAdminAccountRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisableDelegatedAdminAccountRequest] (val x: Self) extends AnyVal {
    
    inline def setDelegatedAdminAccountId(value: AccountId): Self = StObject.set(x, "delegatedAdminAccountId", value.asInstanceOf[js.Any])
  }
}
