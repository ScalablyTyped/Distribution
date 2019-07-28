package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListGroupsResponse extends js.Object {
  /**
    * The group objects for the groups.
    */
  var Groups: js.UndefOr[GroupListType] = js.undefined
  /**
    * An identifier that was returned from the previous call to this operation, which can be used to return the next set of items in the list.
    */
  var NextToken: js.UndefOr[PaginationKey] = js.undefined
}

object ListGroupsResponse {
  @scala.inline
  def apply(Groups: GroupListType = null, NextToken: PaginationKey = null): ListGroupsResponse = {
    val __obj = js.Dynamic.literal()
    if (Groups != null) __obj.updateDynamic("Groups")(Groups)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListGroupsResponse]
  }
}

