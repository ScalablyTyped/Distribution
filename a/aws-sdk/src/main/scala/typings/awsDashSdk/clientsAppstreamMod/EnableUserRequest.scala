package typings.awsDashSdk.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnableUserRequest extends js.Object {
  /**
    * The authentication type for the user. You must specify USERPOOL.
    */
  var AuthenticationType: typings.awsDashSdk.clientsAppstreamMod.AuthenticationType
  /**
    * The email address of the user.  Users' email addresses are case-sensitive. During login, if they specify an email address that doesn't use the same capitalization as the email address specified when their user pool account was created, a "user does not exist" error message displays.  
    */
  var UserName: Username
}

object EnableUserRequest {
  @scala.inline
  def apply(AuthenticationType: AuthenticationType, UserName: Username): EnableUserRequest = {
    val __obj = js.Dynamic.literal(AuthenticationType = AuthenticationType.asInstanceOf[js.Any], UserName = UserName)
  
    __obj.asInstanceOf[EnableUserRequest]
  }
}

