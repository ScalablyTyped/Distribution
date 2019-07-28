package typings.awsDashSdk.clientsXrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetGroupsResult extends js.Object {
  /**
    * The collection of all active groups.
    */
  var Groups: js.UndefOr[GroupSummaryList] = js.undefined
  /**
    * Pagination token. Not used.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object GetGroupsResult {
  @scala.inline
  def apply(Groups: GroupSummaryList = null, NextToken: String = null): GetGroupsResult = {
    val __obj = js.Dynamic.literal()
    if (Groups != null) __obj.updateDynamic("Groups")(Groups)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[GetGroupsResult]
  }
}

