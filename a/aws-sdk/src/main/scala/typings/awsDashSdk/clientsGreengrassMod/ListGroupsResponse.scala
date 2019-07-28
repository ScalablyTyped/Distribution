package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListGroupsResponse extends js.Object {
  /**
    * Information about a group.
    */
  var Groups: js.UndefOr[__listOfGroupInformation] = js.undefined
  /**
    * The token for the next set of results, or ''null'' if there are no additional results.
    */
  var NextToken: js.UndefOr[__string] = js.undefined
}

object ListGroupsResponse {
  @scala.inline
  def apply(Groups: __listOfGroupInformation = null, NextToken: __string = null): ListGroupsResponse = {
    val __obj = js.Dynamic.literal()
    if (Groups != null) __obj.updateDynamic("Groups")(Groups)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListGroupsResponse]
  }
}

