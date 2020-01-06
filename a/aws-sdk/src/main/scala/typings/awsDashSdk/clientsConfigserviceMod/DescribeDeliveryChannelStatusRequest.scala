package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDeliveryChannelStatusRequest extends js.Object {
  /**
    * A list of delivery channel names.
    */
  var DeliveryChannelNames: js.UndefOr[DeliveryChannelNameList] = js.native
}

object DescribeDeliveryChannelStatusRequest {
  @scala.inline
  def apply(DeliveryChannelNames: DeliveryChannelNameList = null): DescribeDeliveryChannelStatusRequest = {
    val __obj = js.Dynamic.literal()
    if (DeliveryChannelNames != null) __obj.updateDynamic("DeliveryChannelNames")(DeliveryChannelNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDeliveryChannelStatusRequest]
  }
}

