package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListInvitationsResponse extends StObject {
  
  /**
    * An array of objects, one for each invitation that was received by the account.
    */
  var invitations: js.UndefOr[listOfInvitation] = js.undefined
  
  /**
    * The string to use in a subsequent request to get the next page of results in a paginated response. This value is null if there are no additional pages.
    */
  var nextToken: js.UndefOr[string] = js.undefined
}
object ListInvitationsResponse {
  
  inline def apply(): ListInvitationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListInvitationsResponse]
  }
  
  extension [Self <: ListInvitationsResponse](x: Self) {
    
    inline def setInvitations(value: listOfInvitation): Self = StObject.set(x, "invitations", value.asInstanceOf[js.Any])
    
    inline def setInvitationsUndefined: Self = StObject.set(x, "invitations", js.undefined)
    
    inline def setInvitationsVarargs(value: Invitation*): Self = StObject.set(x, "invitations", js.Array(value*))
    
    inline def setNextToken(value: string): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
