package typings.awsDashSdk.clientsDirectconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeInterconnectsRequest extends js.Object {
  /**
    * The ID of the interconnect.
    */
  var interconnectId: js.UndefOr[InterconnectId] = js.native
}

object DescribeInterconnectsRequest {
  @scala.inline
  def apply(interconnectId: InterconnectId = null): DescribeInterconnectsRequest = {
    val __obj = js.Dynamic.literal()
    if (interconnectId != null) __obj.updateDynamic("interconnectId")(interconnectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeInterconnectsRequest]
  }
}

