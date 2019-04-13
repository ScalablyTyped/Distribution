package typings
package awsDashSdkLib.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateUserRequest extends js.Object {
  /**
    * The authentication type for the user. You must specify USERPOOL. 
    */
  var AuthenticationType: awsDashSdkLib.clientsAppstreamMod.AuthenticationType
  /**
    * The first name, or given name, of the user.
    */
  var FirstName: js.UndefOr[UserAttributeValue] = js.undefined
  /**
    * The last name, or surname, of the user.
    */
  var LastName: js.UndefOr[UserAttributeValue] = js.undefined
  /**
    * The action to take for the welcome email that is sent to a user after the user is created in the user pool. If you specify SUPPRESS, no email is sent. If you specify RESEND, do not specify the first name or last name of the user. If the value is null, the email is sent.   The temporary password in the welcome email is valid for only 7 days. If users don’t set their passwords within 7 days, you must send them a new welcome email. 
    */
  var MessageAction: js.UndefOr[MessageAction] = js.undefined
  /**
    * The email address of the user.
    */
  var UserName: Username
}

object CreateUserRequest {
  @scala.inline
  def apply(
    AuthenticationType: AuthenticationType,
    UserName: Username,
    FirstName: UserAttributeValue = null,
    LastName: UserAttributeValue = null,
    MessageAction: MessageAction = null
  ): CreateUserRequest = {
    val __obj = js.Dynamic.literal(AuthenticationType = AuthenticationType.asInstanceOf[js.Any], UserName = UserName)
    if (FirstName != null) __obj.updateDynamic("FirstName")(FirstName)
    if (LastName != null) __obj.updateDynamic("LastName")(LastName)
    if (MessageAction != null) __obj.updateDynamic("MessageAction")(MessageAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUserRequest]
  }
}

