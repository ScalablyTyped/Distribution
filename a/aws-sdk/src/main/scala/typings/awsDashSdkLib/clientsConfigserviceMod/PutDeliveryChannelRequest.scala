package typings
package awsDashSdkLib.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutDeliveryChannelRequest extends js.Object {
  /**
    * The configuration delivery channel object that delivers the configuration information to an Amazon S3 bucket and to an Amazon SNS topic.
    */
  var DeliveryChannel: awsDashSdkLib.clientsConfigserviceMod.DeliveryChannel
}

object PutDeliveryChannelRequest {
  @scala.inline
  def apply(DeliveryChannel: DeliveryChannel): PutDeliveryChannelRequest = {
    val __obj = js.Dynamic.literal(DeliveryChannel = DeliveryChannel)
  
    __obj.asInstanceOf[PutDeliveryChannelRequest]
  }
}

