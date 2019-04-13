package typings
package awsDashSdkLib.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdminListGroupsForUserResponse extends js.Object {
  /**
    * The groups that the user belongs to.
    */
  var Groups: js.UndefOr[GroupListType] = js.undefined
  /**
    * An identifier that was returned from the previous call to this operation, which can be used to return the next set of items in the list.
    */
  var NextToken: js.UndefOr[PaginationKey] = js.undefined
}

object AdminListGroupsForUserResponse {
  @scala.inline
  def apply(Groups: GroupListType = null, NextToken: PaginationKey = null): AdminListGroupsForUserResponse = {
    val __obj = js.Dynamic.literal()
    if (Groups != null) __obj.updateDynamic("Groups")(Groups)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[AdminListGroupsForUserResponse]
  }
}

