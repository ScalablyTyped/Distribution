package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeDeliveryChannelStatusResponse extends js.Object {
  /**
    * A list that contains the status of a specified delivery channel.
    */
  var DeliveryChannelsStatus: js.UndefOr[DeliveryChannelStatusList] = js.undefined
}

object DescribeDeliveryChannelStatusResponse {
  @scala.inline
  def apply(DeliveryChannelsStatus: DeliveryChannelStatusList = null): DescribeDeliveryChannelStatusResponse = {
    val __obj = js.Dynamic.literal()
    if (DeliveryChannelsStatus != null) __obj.updateDynamic("DeliveryChannelsStatus")(DeliveryChannelsStatus)
    __obj.asInstanceOf[DescribeDeliveryChannelStatusResponse]
  }
}

