package typings.awsSdk.clientsManagedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProposalActions extends StObject {
  
  /**
    *  The actions to perform for an APPROVED proposal to invite an Amazon Web Services account to create a member and join the network. 
    */
  var Invitations: js.UndefOr[InviteActionList] = js.undefined
  
  /**
    *  The actions to perform for an APPROVED proposal to remove a member from the network, which deletes the member and all associated member resources from the network. 
    */
  var Removals: js.UndefOr[RemoveActionList] = js.undefined
}
object ProposalActions {
  
  inline def apply(): ProposalActions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProposalActions]
  }
  
  extension [Self <: ProposalActions](x: Self) {
    
    inline def setInvitations(value: InviteActionList): Self = StObject.set(x, "Invitations", value.asInstanceOf[js.Any])
    
    inline def setInvitationsUndefined: Self = StObject.set(x, "Invitations", js.undefined)
    
    inline def setInvitationsVarargs(value: InviteAction*): Self = StObject.set(x, "Invitations", js.Array(value*))
    
    inline def setRemovals(value: RemoveActionList): Self = StObject.set(x, "Removals", value.asInstanceOf[js.Any])
    
    inline def setRemovalsUndefined: Self = StObject.set(x, "Removals", js.undefined)
    
    inline def setRemovalsVarargs(value: RemoveAction*): Self = StObject.set(x, "Removals", js.Array(value*))
  }
}
