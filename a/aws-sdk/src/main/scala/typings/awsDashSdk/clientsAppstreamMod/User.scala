package typings.awsDashSdk.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait User extends js.Object {
  /**
    * The ARN of the user.
    */
  var Arn: js.UndefOr[typings.awsDashSdk.clientsAppstreamMod.Arn] = js.undefined
  /**
    * The authentication type for the user.
    */
  var AuthenticationType: typings.awsDashSdk.clientsAppstreamMod.AuthenticationType
  /**
    * The date and time the user was created in the user pool.
    */
  var CreatedTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * Specifies whether the user in the user pool is enabled.
    */
  var Enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The first name, or given name, of the user.
    */
  var FirstName: js.UndefOr[UserAttributeValue] = js.undefined
  /**
    * The last name, or surname, of the user.
    */
  var LastName: js.UndefOr[UserAttributeValue] = js.undefined
  /**
    * The status of the user in the user pool. The status can be one of the following:   UNCONFIRMED – The user is created but not confirmed.   CONFIRMED – The user is confirmed.   ARCHIVED – The user is no longer active.   COMPROMISED – The user is disabled because of a potential security threat.   UNKNOWN – The user status is not known.  
    */
  var Status: js.UndefOr[String] = js.undefined
  /**
    * The email address of the user.  Users' email addresses are case-sensitive. 
    */
  var UserName: js.UndefOr[Username] = js.undefined
}

object User {
  @scala.inline
  def apply(
    AuthenticationType: AuthenticationType,
    Arn: Arn = null,
    CreatedTime: Timestamp = null,
    Enabled: js.UndefOr[scala.Boolean] = js.undefined,
    FirstName: UserAttributeValue = null,
    LastName: UserAttributeValue = null,
    Status: String = null,
    UserName: Username = null
  ): User = {
    val __obj = js.Dynamic.literal(AuthenticationType = AuthenticationType.asInstanceOf[js.Any])
    if (Arn != null) __obj.updateDynamic("Arn")(Arn)
    if (CreatedTime != null) __obj.updateDynamic("CreatedTime")(CreatedTime)
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled)
    if (FirstName != null) __obj.updateDynamic("FirstName")(FirstName)
    if (LastName != null) __obj.updateDynamic("LastName")(LastName)
    if (Status != null) __obj.updateDynamic("Status")(Status)
    if (UserName != null) __obj.updateDynamic("UserName")(UserName)
    __obj.asInstanceOf[User]
  }
}

