package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchUsersResponse extends js.Object {
  /**
    * The token returned to indicate that there is more data available.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.NextToken] = js.undefined
  /**
    * The total number of users returned.
    */
  var TotalCount: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.TotalCount] = js.undefined
  /**
    * The users that meet the specified set of filter criteria, in sort order.
    */
  var Users: js.UndefOr[UserDataList] = js.undefined
}

object SearchUsersResponse {
  @scala.inline
  def apply(
    NextToken: NextToken = null,
    TotalCount: js.UndefOr[TotalCount] = js.undefined,
    Users: UserDataList = null
  ): SearchUsersResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (!js.isUndefined(TotalCount)) __obj.updateDynamic("TotalCount")(TotalCount)
    if (Users != null) __obj.updateDynamic("Users")(Users)
    __obj.asInstanceOf[SearchUsersResponse]
  }
}

