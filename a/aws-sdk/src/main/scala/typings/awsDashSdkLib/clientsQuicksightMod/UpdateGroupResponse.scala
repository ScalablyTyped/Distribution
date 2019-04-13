package typings
package awsDashSdkLib.clientsQuicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateGroupResponse extends js.Object {
  /**
    * The name of the group.
    */
  var Group: js.UndefOr[Group] = js.undefined
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.undefined
  /**
    * The http status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.undefined
}

object UpdateGroupResponse {
  @scala.inline
  def apply(Group: Group = null, RequestId: String = null, Status: js.UndefOr[StatusCode] = js.undefined): UpdateGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (Group != null) __obj.updateDynamic("Group")(Group)
    if (RequestId != null) __obj.updateDynamic("RequestId")(RequestId)
    if (!js.isUndefined(Status)) __obj.updateDynamic("Status")(Status)
    __obj.asInstanceOf[UpdateGroupResponse]
  }
}

