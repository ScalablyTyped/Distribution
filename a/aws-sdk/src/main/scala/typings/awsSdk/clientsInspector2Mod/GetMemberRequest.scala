package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMemberRequest extends StObject {
  
  /**
    * The Amazon Web Services account ID of the member account to retrieve information on.
    */
  var accountId: AccountId
}
object GetMemberRequest {
  
  inline def apply(accountId: AccountId): GetMemberRequest = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMemberRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetMemberRequest] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
  }
}
