package typings.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateUserRequest extends js.Object {
  
  /**
    * The authentication type for the user. You must specify USERPOOL. 
    */
  var AuthenticationType: typings.awsSdk.appstreamMod.AuthenticationType = js.native
  
  /**
    * The first name, or given name, of the user.
    */
  var FirstName: js.UndefOr[UserAttributeValue] = js.native
  
  /**
    * The last name, or surname, of the user.
    */
  var LastName: js.UndefOr[UserAttributeValue] = js.native
  
  /**
    * The action to take for the welcome email that is sent to a user after the user is created in the user pool. If you specify SUPPRESS, no email is sent. If you specify RESEND, do not specify the first name or last name of the user. If the value is null, the email is sent.   The temporary password in the welcome email is valid for only 7 days. If users don’t set their passwords within 7 days, you must send them a new welcome email. 
    */
  var MessageAction: js.UndefOr[typings.awsSdk.appstreamMod.MessageAction] = js.native
  
  /**
    * The email address of the user.  Users' email addresses are case-sensitive. During login, if they specify an email address that doesn't use the same capitalization as the email address specified when their user pool account was created, a "user does not exist" error message displays. 
    */
  var UserName: Username = js.native
}
object CreateUserRequest {
  
  @scala.inline
  def apply(AuthenticationType: AuthenticationType, UserName: Username): CreateUserRequest = {
    val __obj = js.Dynamic.literal(AuthenticationType = AuthenticationType.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUserRequest]
  }
  
  @scala.inline
  implicit class CreateUserRequestOps[Self <: CreateUserRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAuthenticationType(value: AuthenticationType): Self = this.set("AuthenticationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserName(value: Username): Self = this.set("UserName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstName(value: UserAttributeValue): Self = this.set("FirstName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstName: Self = this.set("FirstName", js.undefined)
    
    @scala.inline
    def setLastName(value: UserAttributeValue): Self = this.set("LastName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastName: Self = this.set("LastName", js.undefined)
    
    @scala.inline
    def setMessageAction(value: MessageAction): Self = this.set("MessageAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageAction: Self = this.set("MessageAction", js.undefined)
  }
}
