package typings.awsSdk.clientsCleanroomsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteMemberInput extends StObject {
  
  /**
    * The account ID of the member to remove.
    */
  var accountId: AccountId
  
  /**
    * The unique identifier for the associated collaboration.
    */
  var collaborationIdentifier: CollaborationIdentifier
}
object DeleteMemberInput {
  
  inline def apply(accountId: AccountId, collaborationIdentifier: CollaborationIdentifier): DeleteMemberInput = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], collaborationIdentifier = collaborationIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMemberInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteMemberInput] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setCollaborationIdentifier(value: CollaborationIdentifier): Self = StObject.set(x, "collaborationIdentifier", value.asInstanceOf[js.Any])
  }
}
