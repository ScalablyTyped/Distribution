package typings.awsSdk.clientsAlexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendInvitationRequest extends StObject {
  
  /**
    * The ARN of the user to whom to send an invitation. Required.
    */
  var UserArn: js.UndefOr[Arn] = js.undefined
}
object SendInvitationRequest {
  
  inline def apply(): SendInvitationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendInvitationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SendInvitationRequest] (val x: Self) extends AnyVal {
    
    inline def setUserArn(value: Arn): Self = StObject.set(x, "UserArn", value.asInstanceOf[js.Any])
    
    inline def setUserArnUndefined: Self = StObject.set(x, "UserArn", js.undefined)
  }
}
