package typings.awsDashSdk.clientsOrganizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Account extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the account. For more information about ARNs in Organizations, see ARN Formats Supported by Organizations in the AWS Organizations User Guide.
    */
  var Arn: js.UndefOr[AccountArn] = js.native
  /**
    * The email address associated with the AWS account. The regex pattern for this parameter is a string of characters that represents a standard internet email address.
    */
  var Email: js.UndefOr[typings.awsDashSdk.clientsOrganizationsMod.Email] = js.native
  /**
    * The unique identifier (ID) of the account. The regex pattern for an account ID string requires exactly 12 digits.
    */
  var Id: js.UndefOr[AccountId] = js.native
  /**
    * The method by which the account joined the organization.
    */
  var JoinedMethod: js.UndefOr[AccountJoinedMethod] = js.native
  /**
    * The date the account became a part of the organization.
    */
  var JoinedTimestamp: js.UndefOr[Timestamp] = js.native
  /**
    * The friendly name of the account. The regex pattern that is used to validate this parameter is a string of any of the characters in the ASCII character range.
    */
  var Name: js.UndefOr[AccountName] = js.native
  /**
    * The status of the account in the organization.
    */
  var Status: js.UndefOr[AccountStatus] = js.native
}

object Account {
  @scala.inline
  def apply(
    Arn: AccountArn = null,
    Email: Email = null,
    Id: AccountId = null,
    JoinedMethod: AccountJoinedMethod = null,
    JoinedTimestamp: Timestamp = null,
    Name: AccountName = null,
    Status: AccountStatus = null
  ): Account = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (Email != null) __obj.updateDynamic("Email")(Email.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (JoinedMethod != null) __obj.updateDynamic("JoinedMethod")(JoinedMethod.asInstanceOf[js.Any])
    if (JoinedTimestamp != null) __obj.updateDynamic("JoinedTimestamp")(JoinedTimestamp.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Account]
  }
}

