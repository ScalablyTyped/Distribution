package typings
package awsDashSdkLib.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeUsersResult extends js.Object {
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages, this value is null.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * Information about users in the user pool.
    */
  var Users: js.UndefOr[UserList] = js.undefined
}

object DescribeUsersResult {
  @scala.inline
  def apply(NextToken: String = null, Users: UserList = null): DescribeUsersResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Users != null) __obj.updateDynamic("Users")(Users)
    __obj.asInstanceOf[DescribeUsersResult]
  }
}

