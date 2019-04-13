package typings
package awsDashSdkLib.clientsConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListUsersResponse extends js.Object {
  /**
    * A string returned in the response. Use the value returned in the response as the value of the NextToken in a subsequent request to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * An array of UserSummary objects that contain information about the users in your instance.
    */
  var UserSummaryList: js.UndefOr[UserSummaryList] = js.undefined
}

object ListUsersResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, UserSummaryList: UserSummaryList = null): ListUsersResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (UserSummaryList != null) __obj.updateDynamic("UserSummaryList")(UserSummaryList)
    __obj.asInstanceOf[ListUsersResponse]
  }
}

