package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAccountsRequest extends js.Object {
  /**
    * The maximum number of results to return in a single call. Defaults to 100.
    */
  var MaxResults: js.UndefOr[ProfileServiceMaxResults] = js.native
  /**
    * Amazon Chime account name prefix with which to filter results.
    */
  var Name: js.UndefOr[AccountName] = js.native
  /**
    * The token to use to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * User email address with which to filter results.
    */
  var UserEmail: js.UndefOr[EmailAddress] = js.native
}

object ListAccountsRequest {
  @scala.inline
  def apply(
    MaxResults: js.UndefOr[ProfileServiceMaxResults] = js.undefined,
    Name: AccountName = null,
    NextToken: String = null,
    UserEmail: EmailAddress = null
  ): ListAccountsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (UserEmail != null) __obj.updateDynamic("UserEmail")(UserEmail.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAccountsRequest]
  }
}

