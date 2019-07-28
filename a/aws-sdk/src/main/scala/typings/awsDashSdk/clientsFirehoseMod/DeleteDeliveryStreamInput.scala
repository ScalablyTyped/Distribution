package typings.awsDashSdk.clientsFirehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteDeliveryStreamInput extends js.Object {
  /**
    * The name of the delivery stream.
    */
  var DeliveryStreamName: typings.awsDashSdk.clientsFirehoseMod.DeliveryStreamName
}

object DeleteDeliveryStreamInput {
  @scala.inline
  def apply(DeliveryStreamName: DeliveryStreamName): DeleteDeliveryStreamInput = {
    val __obj = js.Dynamic.literal(DeliveryStreamName = DeliveryStreamName)
  
    __obj.asInstanceOf[DeleteDeliveryStreamInput]
  }
}

