package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeDeliveryChannelsRequest extends js.Object {
  /**
    * A list of delivery channel names.
    */
  var DeliveryChannelNames: js.UndefOr[DeliveryChannelNameList] = js.undefined
}

object DescribeDeliveryChannelsRequest {
  @scala.inline
  def apply(DeliveryChannelNames: DeliveryChannelNameList = null): DescribeDeliveryChannelsRequest = {
    val __obj = js.Dynamic.literal()
    if (DeliveryChannelNames != null) __obj.updateDynamic("DeliveryChannelNames")(DeliveryChannelNames)
    __obj.asInstanceOf[DescribeDeliveryChannelsRequest]
  }
}

