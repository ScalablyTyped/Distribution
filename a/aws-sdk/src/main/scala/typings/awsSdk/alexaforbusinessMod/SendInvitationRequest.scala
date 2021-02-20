package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendInvitationRequest extends StObject {
  
  /**
    * The ARN of the user to whom to send an invitation. Required.
    */
  var UserArn: js.UndefOr[Arn] = js.native
}
object SendInvitationRequest {
  
  @scala.inline
  def apply(): SendInvitationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendInvitationRequest]
  }
  
  @scala.inline
  implicit class SendInvitationRequestMutableBuilder[Self <: SendInvitationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUserArn(value: Arn): Self = StObject.set(x, "UserArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserArnUndefined: Self = StObject.set(x, "UserArn", js.undefined)
  }
}
