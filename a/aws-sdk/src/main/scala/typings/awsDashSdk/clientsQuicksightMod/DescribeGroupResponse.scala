package typings.awsDashSdk.clientsQuicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeGroupResponse extends js.Object {
  /**
    * The name of the group.
    */
  var Group: js.UndefOr[typings.awsDashSdk.clientsQuicksightMod.Group] = js.undefined
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.undefined
  /**
    * The http status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.undefined
}

object DescribeGroupResponse {
  @scala.inline
  def apply(Group: Group = null, RequestId: String = null, Status: Int | Double = null): DescribeGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (Group != null) __obj.updateDynamic("Group")(Group)
    if (RequestId != null) __obj.updateDynamic("RequestId")(RequestId)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeGroupResponse]
  }
}

