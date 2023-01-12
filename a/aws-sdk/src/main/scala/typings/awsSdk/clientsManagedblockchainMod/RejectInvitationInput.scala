package typings.awsSdk.clientsManagedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RejectInvitationInput extends StObject {
  
  /**
    * The unique identifier of the invitation to reject.
    */
  var InvitationId: ResourceIdString
}
object RejectInvitationInput {
  
  inline def apply(InvitationId: ResourceIdString): RejectInvitationInput = {
    val __obj = js.Dynamic.literal(InvitationId = InvitationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RejectInvitationInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RejectInvitationInput] (val x: Self) extends AnyVal {
    
    inline def setInvitationId(value: ResourceIdString): Self = StObject.set(x, "InvitationId", value.asInstanceOf[js.Any])
  }
}
