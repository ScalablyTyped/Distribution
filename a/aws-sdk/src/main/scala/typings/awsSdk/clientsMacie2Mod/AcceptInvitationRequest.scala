package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AcceptInvitationRequest extends StObject {
  
  /**
    * The Amazon Web Services account ID for the account that sent the invitation.
    */
  var administratorAccountId: js.UndefOr[string] = js.undefined
  
  /**
    * The unique identifier for the invitation to accept.
    */
  var invitationId: string
  
  /**
    * (Deprecated) The Amazon Web Services account ID for the account that sent the invitation. This property has been replaced by the administratorAccountId property and is retained only for backward compatibility.
    */
  var masterAccount: js.UndefOr[string] = js.undefined
}
object AcceptInvitationRequest {
  
  inline def apply(invitationId: string): AcceptInvitationRequest = {
    val __obj = js.Dynamic.literal(invitationId = invitationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceptInvitationRequest]
  }
  
  extension [Self <: AcceptInvitationRequest](x: Self) {
    
    inline def setAdministratorAccountId(value: string): Self = StObject.set(x, "administratorAccountId", value.asInstanceOf[js.Any])
    
    inline def setAdministratorAccountIdUndefined: Self = StObject.set(x, "administratorAccountId", js.undefined)
    
    inline def setInvitationId(value: string): Self = StObject.set(x, "invitationId", value.asInstanceOf[js.Any])
    
    inline def setMasterAccount(value: string): Self = StObject.set(x, "masterAccount", value.asInstanceOf[js.Any])
    
    inline def setMasterAccountUndefined: Self = StObject.set(x, "masterAccount", js.undefined)
  }
}
