package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteDeliveryChannelRequest extends js.Object {
  /**
    * The name of the delivery channel to delete.
    */
  var DeliveryChannelName: ChannelName
}

object DeleteDeliveryChannelRequest {
  @scala.inline
  def apply(DeliveryChannelName: ChannelName): DeleteDeliveryChannelRequest = {
    val __obj = js.Dynamic.literal(DeliveryChannelName = DeliveryChannelName)
  
    __obj.asInstanceOf[DeleteDeliveryChannelRequest]
  }
}

