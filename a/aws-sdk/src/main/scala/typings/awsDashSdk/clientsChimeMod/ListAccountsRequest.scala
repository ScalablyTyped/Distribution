package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListAccountsRequest extends js.Object {
  /**
    * The maximum number of results to return in a single call. Defaults to 100.
    */
  var MaxResults: js.UndefOr[ProfileServiceMaxResults] = js.undefined
  /**
    * Amazon Chime account name prefix with which to filter results.
    */
  var Name: js.UndefOr[AccountName] = js.undefined
  /**
    * The token to use to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * User email address with which to filter results.
    */
  var UserEmail: js.UndefOr[EmailAddress] = js.undefined
}

object ListAccountsRequest {
  @scala.inline
  def apply(
    MaxResults: Int | Double = null,
    Name: AccountName = null,
    NextToken: String = null,
    UserEmail: EmailAddress = null
  ): ListAccountsRequest = {
    val __obj = js.Dynamic.literal()
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (UserEmail != null) __obj.updateDynamic("UserEmail")(UserEmail)
    __obj.asInstanceOf[ListAccountsRequest]
  }
}

