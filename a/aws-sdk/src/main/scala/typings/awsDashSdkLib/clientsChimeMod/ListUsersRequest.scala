package typings
package awsDashSdkLib.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListUsersRequest extends js.Object {
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: NonEmptyString
  /**
    * The maximum number of results to return in a single call. Defaults to 100.
    */
  var MaxResults: js.UndefOr[ProfileServiceMaxResults] = js.undefined
  /**
    * The token to use to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * Optional. The user email address used to filter results. Maximum 1.
    */
  var UserEmail: js.UndefOr[EmailAddress] = js.undefined
}

object ListUsersRequest {
  @scala.inline
  def apply(
    AccountId: NonEmptyString,
    MaxResults: js.UndefOr[ProfileServiceMaxResults] = js.undefined,
    NextToken: String = null,
    UserEmail: EmailAddress = null
  ): ListUsersRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (UserEmail != null) __obj.updateDynamic("UserEmail")(UserEmail)
    __obj.asInstanceOf[ListUsersRequest]
  }
}

