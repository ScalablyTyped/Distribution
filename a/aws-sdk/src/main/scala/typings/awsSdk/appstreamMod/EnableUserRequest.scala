package typings.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnableUserRequest extends js.Object {
  /**
    * The authentication type for the user. You must specify USERPOOL.
    */
  var AuthenticationType: typings.awsSdk.appstreamMod.AuthenticationType = js.native
  /**
    * The email address of the user.  Users' email addresses are case-sensitive. During login, if they specify an email address that doesn't use the same capitalization as the email address specified when their user pool account was created, a "user does not exist" error message displays.  
    */
  var UserName: Username = js.native
}

object EnableUserRequest {
  @scala.inline
  def apply(AuthenticationType: AuthenticationType, UserName: Username): EnableUserRequest = {
    val __obj = js.Dynamic.literal(AuthenticationType = AuthenticationType.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableUserRequest]
  }
  @scala.inline
  implicit class EnableUserRequestOps[Self <: EnableUserRequest] (val x: Self) extends AnyVal {
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
  }
  
}

