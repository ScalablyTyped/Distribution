package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListUsersRequest extends js.Object {
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: NonEmptyString = js.native
  /**
    * The maximum number of results to return in a single call. Defaults to 100.
    */
  var MaxResults: js.UndefOr[ProfileServiceMaxResults] = js.native
  /**
    * The token to use to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * Optional. The user email address used to filter results. Maximum 1.
    */
  var UserEmail: js.UndefOr[EmailAddress] = js.native
  /**
    * The user type.
    */
  var UserType: js.UndefOr[typings.awsSdk.chimeMod.UserType] = js.native
}

object ListUsersRequest {
  @scala.inline
  def apply(
    AccountId: NonEmptyString,
    MaxResults: js.UndefOr[ProfileServiceMaxResults] = js.undefined,
    NextToken: String = null,
    UserEmail: EmailAddress = null,
    UserType: UserType = null
  ): ListUsersRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (UserEmail != null) __obj.updateDynamic("UserEmail")(UserEmail.asInstanceOf[js.Any])
    if (UserType != null) __obj.updateDynamic("UserType")(UserType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListUsersRequest]
  }
}

