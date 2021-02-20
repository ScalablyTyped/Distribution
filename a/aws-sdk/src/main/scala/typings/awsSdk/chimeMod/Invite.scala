package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Invite extends StObject {
  
  /**
    * The email address to which the invite is sent.
    */
  var EmailAddress: js.UndefOr[typings.awsSdk.chimeMod.EmailAddress] = js.native
  
  /**
    * The status of the invite email.
    */
  var EmailStatus: js.UndefOr[typings.awsSdk.chimeMod.EmailStatus] = js.native
  
  /**
    * The invite ID.
    */
  var InviteId: js.UndefOr[String] = js.native
  
  /**
    * The status of the invite.
    */
  var Status: js.UndefOr[InviteStatus] = js.native
}
object Invite {
  
  @scala.inline
  def apply(): Invite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Invite]
  }
  
  @scala.inline
  implicit class InviteMutableBuilder[Self <: Invite] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmailAddress(value: EmailAddress): Self = StObject.set(x, "EmailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailAddressUndefined: Self = StObject.set(x, "EmailAddress", js.undefined)
    
    @scala.inline
    def setEmailStatus(value: EmailStatus): Self = StObject.set(x, "EmailStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailStatusUndefined: Self = StObject.set(x, "EmailStatus", js.undefined)
    
    @scala.inline
    def setInviteId(value: String): Self = StObject.set(x, "InviteId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInviteIdUndefined: Self = StObject.set(x, "InviteId", js.undefined)
    
    @scala.inline
    def setStatus(value: InviteStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
