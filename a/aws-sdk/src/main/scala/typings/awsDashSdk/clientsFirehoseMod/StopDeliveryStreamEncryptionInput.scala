package typings.awsDashSdk.clientsFirehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopDeliveryStreamEncryptionInput extends js.Object {
  /**
    * The name of the delivery stream for which you want to disable server-side encryption (SSE).
    */
  var DeliveryStreamName: typings.awsDashSdk.clientsFirehoseMod.DeliveryStreamName
}

object StopDeliveryStreamEncryptionInput {
  @scala.inline
  def apply(DeliveryStreamName: DeliveryStreamName): StopDeliveryStreamEncryptionInput = {
    val __obj = js.Dynamic.literal(DeliveryStreamName = DeliveryStreamName)
  
    __obj.asInstanceOf[StopDeliveryStreamEncryptionInput]
  }
}

