package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Invitation extends StObject {
  
  /**
    * The account ID of the Security Hub administrator account that the invitation was sent from.
    */
  var AccountId: js.UndefOr[typings.awsSdk.clientsSecurityhubMod.AccountId] = js.undefined
  
  /**
    * The ID of the invitation sent to the member account.
    */
  var InvitationId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The timestamp of when the invitation was sent.
    */
  var InvitedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The current status of the association between the member and administrator accounts.
    */
  var MemberStatus: js.UndefOr[NonEmptyString] = js.undefined
}
object Invitation {
  
  inline def apply(): Invitation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Invitation]
  }
  
  extension [Self <: Invitation](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    inline def setInvitationId(value: NonEmptyString): Self = StObject.set(x, "InvitationId", value.asInstanceOf[js.Any])
    
    inline def setInvitationIdUndefined: Self = StObject.set(x, "InvitationId", js.undefined)
    
    inline def setInvitedAt(value: js.Date): Self = StObject.set(x, "InvitedAt", value.asInstanceOf[js.Any])
    
    inline def setInvitedAtUndefined: Self = StObject.set(x, "InvitedAt", js.undefined)
    
    inline def setMemberStatus(value: NonEmptyString): Self = StObject.set(x, "MemberStatus", value.asInstanceOf[js.Any])
    
    inline def setMemberStatusUndefined: Self = StObject.set(x, "MemberStatus", js.undefined)
  }
}
