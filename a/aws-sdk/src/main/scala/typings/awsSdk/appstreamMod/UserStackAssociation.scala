package typings.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserStackAssociation extends js.Object {
  /**
    * The authentication type for the user.
    */
  var AuthenticationType: typings.awsSdk.appstreamMod.AuthenticationType = js.native
  /**
    * Specifies whether a welcome email is sent to a user after the user is created in the user pool.
    */
  var SendEmailNotification: js.UndefOr[Boolean] = js.native
  /**
    * The name of the stack that is associated with the user.
    */
  var StackName: String = js.native
  /**
    * The email address of the user who is associated with the stack.  Users' email addresses are case-sensitive. 
    */
  var UserName: Username = js.native
}

object UserStackAssociation {
  @scala.inline
  def apply(AuthenticationType: AuthenticationType, StackName: String, UserName: Username): UserStackAssociation = {
    val __obj = js.Dynamic.literal(AuthenticationType = AuthenticationType.asInstanceOf[js.Any], StackName = StackName.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserStackAssociation]
  }
  @scala.inline
  implicit class UserStackAssociationOps[Self <: UserStackAssociation] (val x: Self) extends AnyVal {
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
    def setStackName(value: String): Self = this.set("StackName", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserName(value: Username): Self = this.set("UserName", value.asInstanceOf[js.Any])
    @scala.inline
    def setSendEmailNotification(value: Boolean): Self = this.set("SendEmailNotification", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSendEmailNotification: Self = this.set("SendEmailNotification", js.undefined)
  }
  
}

