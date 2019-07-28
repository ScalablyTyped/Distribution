package typings.awsDashSdk.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserStackAssociation extends js.Object {
  /**
    * The authentication type for the user.
    */
  var AuthenticationType: typings.awsDashSdk.clientsAppstreamMod.AuthenticationType
  /**
    * Specifies whether a welcome email is sent to a user after the user is created in the user pool.
    */
  var SendEmailNotification: js.UndefOr[Boolean] = js.undefined
  /**
    * The name of the stack that is associated with the user.
    */
  var StackName: String
  /**
    * The email address of the user who is associated with the stack.  Users' email addresses are case-sensitive. 
    */
  var UserName: Username
}

object UserStackAssociation {
  @scala.inline
  def apply(
    AuthenticationType: AuthenticationType,
    StackName: String,
    UserName: Username,
    SendEmailNotification: js.UndefOr[Boolean] = js.undefined
  ): UserStackAssociation = {
    val __obj = js.Dynamic.literal(AuthenticationType = AuthenticationType.asInstanceOf[js.Any], StackName = StackName, UserName = UserName)
    if (!js.isUndefined(SendEmailNotification)) __obj.updateDynamic("SendEmailNotification")(SendEmailNotification)
    __obj.asInstanceOf[UserStackAssociation]
  }
}

