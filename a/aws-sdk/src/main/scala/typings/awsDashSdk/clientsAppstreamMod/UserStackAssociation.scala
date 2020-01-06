package typings.awsDashSdk.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserStackAssociation extends js.Object {
  /**
    * The authentication type for the user.
    */
  var AuthenticationType: typings.awsDashSdk.clientsAppstreamMod.AuthenticationType = js.native
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
  def apply(
    AuthenticationType: AuthenticationType,
    StackName: String,
    UserName: Username,
    SendEmailNotification: js.UndefOr[scala.Boolean] = js.undefined
  ): UserStackAssociation = {
    val __obj = js.Dynamic.literal(AuthenticationType = AuthenticationType.asInstanceOf[js.Any], StackName = StackName.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    if (!js.isUndefined(SendEmailNotification)) __obj.updateDynamic("SendEmailNotification")(SendEmailNotification.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserStackAssociation]
  }
}

