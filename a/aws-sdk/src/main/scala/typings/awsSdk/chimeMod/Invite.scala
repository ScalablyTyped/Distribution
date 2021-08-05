package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Invite extends StObject {
  
  /**
    * The email address to which the invite is sent.
    */
  var EmailAddress: js.UndefOr[typings.awsSdk.chimeMod.EmailAddress] = js.undefined
  
  /**
    * The status of the invite email.
    */
  var EmailStatus: js.UndefOr[typings.awsSdk.chimeMod.EmailStatus] = js.undefined
  
  /**
    * The invite ID.
    */
  var InviteId: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the invite.
    */
  var Status: js.UndefOr[InviteStatus] = js.undefined
}
object Invite {
  
  inline def apply(): Invite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Invite]
  }
  
  extension [Self <: Invite](x: Self) {
    
    inline def setEmailAddress(value: EmailAddress): Self = StObject.set(x, "EmailAddress", value.asInstanceOf[js.Any])
    
    inline def setEmailAddressUndefined: Self = StObject.set(x, "EmailAddress", js.undefined)
    
    inline def setEmailStatus(value: EmailStatus): Self = StObject.set(x, "EmailStatus", value.asInstanceOf[js.Any])
    
    inline def setEmailStatusUndefined: Self = StObject.set(x, "EmailStatus", js.undefined)
    
    inline def setInviteId(value: String): Self = StObject.set(x, "InviteId", value.asInstanceOf[js.Any])
    
    inline def setInviteIdUndefined: Self = StObject.set(x, "InviteId", js.undefined)
    
    inline def setStatus(value: InviteStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
