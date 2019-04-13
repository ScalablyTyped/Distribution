package typings
package awsDashSdkLib.clientsWorkdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeUsersResponse extends js.Object {
  /**
    * The marker to use when requesting the next set of results. If there are no additional results, the string is empty.
    */
  var Marker: js.UndefOr[PageMarkerType] = js.undefined
  /**
    * The total number of users included in the results.
    */
  var TotalNumberOfUsers: js.UndefOr[SizeType] = js.undefined
  /**
    * The users.
    */
  var Users: js.UndefOr[OrganizationUserList] = js.undefined
}

object DescribeUsersResponse {
  @scala.inline
  def apply(
    Marker: PageMarkerType = null,
    TotalNumberOfUsers: js.UndefOr[SizeType] = js.undefined,
    Users: OrganizationUserList = null
  ): DescribeUsersResponse = {
    val __obj = js.Dynamic.literal()
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (!js.isUndefined(TotalNumberOfUsers)) __obj.updateDynamic("TotalNumberOfUsers")(TotalNumberOfUsers)
    if (Users != null) __obj.updateDynamic("Users")(Users)
    __obj.asInstanceOf[DescribeUsersResponse]
  }
}

