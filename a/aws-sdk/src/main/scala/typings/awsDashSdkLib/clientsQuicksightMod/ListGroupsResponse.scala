package typings
package awsDashSdkLib.clientsQuicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListGroupsResponse extends js.Object {
  /**
    * The list of the groups.
    */
  var GroupList: js.UndefOr[GroupList] = js.undefined
  /**
    * A pagination token that can be used in a subsequent request.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.undefined
  /**
    * The http status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.undefined
}

object ListGroupsResponse {
  @scala.inline
  def apply(
    GroupList: GroupList = null,
    NextToken: String = null,
    RequestId: String = null,
    Status: js.UndefOr[StatusCode] = js.undefined
  ): ListGroupsResponse = {
    val __obj = js.Dynamic.literal()
    if (GroupList != null) __obj.updateDynamic("GroupList")(GroupList)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (RequestId != null) __obj.updateDynamic("RequestId")(RequestId)
    if (!js.isUndefined(Status)) __obj.updateDynamic("Status")(Status)
    __obj.asInstanceOf[ListGroupsResponse]
  }
}

