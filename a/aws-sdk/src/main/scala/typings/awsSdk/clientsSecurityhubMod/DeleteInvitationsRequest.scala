package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteInvitationsRequest extends StObject {
  
  /**
    * The list of the account IDs that sent the invitations to delete.
    */
  var AccountIds: AccountIdList
}
object DeleteInvitationsRequest {
  
  inline def apply(AccountIds: AccountIdList): DeleteInvitationsRequest = {
    val __obj = js.Dynamic.literal(AccountIds = AccountIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteInvitationsRequest]
  }
  
  extension [Self <: DeleteInvitationsRequest](x: Self) {
    
    inline def setAccountIds(value: AccountIdList): Self = StObject.set(x, "AccountIds", value.asInstanceOf[js.Any])
    
    inline def setAccountIdsVarargs(value: NonEmptyString*): Self = StObject.set(x, "AccountIds", js.Array(value*))
  }
}
