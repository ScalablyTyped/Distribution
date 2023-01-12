package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateInvitationsRequest extends StObject {
  
  /**
    * An array that lists Amazon Web Services account IDs, one for each account to send the invitation to.
    */
  var accountIds: listOfString
  
  /**
    * Specifies whether to send the invitation as an email message. If this value is false, Amazon Macie sends the invitation (as an email message) to the email address that you specified for the recipient's account when you associated the account with your account. The default value is false.
    */
  var disableEmailNotification: js.UndefOr[boolean] = js.undefined
  
  /**
    * Custom text to include in the email message that contains the invitation. The text can contain as many as 80 alphanumeric characters.
    */
  var message: js.UndefOr[string] = js.undefined
}
object CreateInvitationsRequest {
  
  inline def apply(accountIds: listOfString): CreateInvitationsRequest = {
    val __obj = js.Dynamic.literal(accountIds = accountIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateInvitationsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateInvitationsRequest] (val x: Self) extends AnyVal {
    
    inline def setAccountIds(value: listOfString): Self = StObject.set(x, "accountIds", value.asInstanceOf[js.Any])
    
    inline def setAccountIdsVarargs(value: string*): Self = StObject.set(x, "accountIds", js.Array(value*))
    
    inline def setDisableEmailNotification(value: boolean): Self = StObject.set(x, "disableEmailNotification", value.asInstanceOf[js.Any])
    
    inline def setDisableEmailNotificationUndefined: Self = StObject.set(x, "disableEmailNotification", js.undefined)
    
    inline def setMessage(value: string): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
