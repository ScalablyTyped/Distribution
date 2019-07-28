package typings.awsDashSdk.clientsWorkspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeAccountModificationsResult extends js.Object {
  /**
    * The list of modifications to the configuration of BYOL.
    */
  var AccountModifications: js.UndefOr[AccountModificationList] = js.undefined
  /**
    * The token to use to retrieve the next set of results, or null if no more results are available.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}

object DescribeAccountModificationsResult {
  @scala.inline
  def apply(AccountModifications: AccountModificationList = null, NextToken: PaginationToken = null): DescribeAccountModificationsResult = {
    val __obj = js.Dynamic.literal()
    if (AccountModifications != null) __obj.updateDynamic("AccountModifications")(AccountModifications)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeAccountModificationsResult]
  }
}

