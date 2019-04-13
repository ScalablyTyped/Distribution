package typings
package awsDashSdkLib.clientsDirectconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeInterconnectsRequest extends js.Object {
  /**
    * The ID of the interconnect.
    */
  var interconnectId: js.UndefOr[InterconnectId] = js.undefined
}

object DescribeInterconnectsRequest {
  @scala.inline
  def apply(interconnectId: InterconnectId = null): DescribeInterconnectsRequest = {
    val __obj = js.Dynamic.literal()
    if (interconnectId != null) __obj.updateDynamic("interconnectId")(interconnectId)
    __obj.asInstanceOf[DescribeInterconnectsRequest]
  }
}

