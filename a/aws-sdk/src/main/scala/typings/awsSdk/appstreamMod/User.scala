package typings.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait User extends js.Object {
  /**
    * The ARN of the user.
    */
  var Arn: js.UndefOr[typings.awsSdk.appstreamMod.Arn] = js.native
  /**
    * The authentication type for the user.
    */
  var AuthenticationType: typings.awsSdk.appstreamMod.AuthenticationType = js.native
  /**
    * The date and time the user was created in the user pool.
    */
  var CreatedTime: js.UndefOr[Timestamp] = js.native
  /**
    * Specifies whether the user in the user pool is enabled.
    */
  var Enabled: js.UndefOr[Boolean] = js.native
  /**
    * The first name, or given name, of the user.
    */
  var FirstName: js.UndefOr[UserAttributeValue] = js.native
  /**
    * The last name, or surname, of the user.
    */
  var LastName: js.UndefOr[UserAttributeValue] = js.native
  /**
    * The status of the user in the user pool. The status can be one of the following:   UNCONFIRMED – The user is created but not confirmed.   CONFIRMED – The user is confirmed.   ARCHIVED – The user is no longer active.   COMPROMISED – The user is disabled because of a potential security threat.   UNKNOWN – The user status is not known.  
    */
  var Status: js.UndefOr[String] = js.native
  /**
    * The email address of the user.  Users' email addresses are case-sensitive. 
    */
  var UserName: js.UndefOr[Username] = js.native
}

object User {
  @scala.inline
  def apply(
    AuthenticationType: AuthenticationType,
    Arn: Arn = null,
    CreatedTime: Timestamp = null,
    Enabled: js.UndefOr[Boolean] = js.undefined,
    FirstName: UserAttributeValue = null,
    LastName: UserAttributeValue = null,
    Status: String = null,
    UserName: Username = null
  ): User = {
    val __obj = js.Dynamic.literal(AuthenticationType = AuthenticationType.asInstanceOf[js.Any])
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (CreatedTime != null) __obj.updateDynamic("CreatedTime")(CreatedTime.asInstanceOf[js.Any])
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled.get.asInstanceOf[js.Any])
    if (FirstName != null) __obj.updateDynamic("FirstName")(FirstName.asInstanceOf[js.Any])
    if (LastName != null) __obj.updateDynamic("LastName")(LastName.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (UserName != null) __obj.updateDynamic("UserName")(UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[User]
  }
}

