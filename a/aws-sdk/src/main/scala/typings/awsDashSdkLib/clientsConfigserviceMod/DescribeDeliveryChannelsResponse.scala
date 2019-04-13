package typings
package awsDashSdkLib.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeDeliveryChannelsResponse extends js.Object {
  /**
    * A list that contains the descriptions of the specified delivery channel.
    */
  var DeliveryChannels: js.UndefOr[DeliveryChannelList] = js.undefined
}

object DescribeDeliveryChannelsResponse {
  @scala.inline
  def apply(DeliveryChannels: DeliveryChannelList = null): DescribeDeliveryChannelsResponse = {
    val __obj = js.Dynamic.literal()
    if (DeliveryChannels != null) __obj.updateDynamic("DeliveryChannels")(DeliveryChannels)
    __obj.asInstanceOf[DescribeDeliveryChannelsResponse]
  }
}

