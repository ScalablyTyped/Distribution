package typings.awsDashSdk.clientsFirehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartDeliveryStreamEncryptionInput extends js.Object {
  /**
    * The name of the delivery stream for which you want to enable server-side encryption (SSE).
    */
  var DeliveryStreamName: typings.awsDashSdk.clientsFirehoseMod.DeliveryStreamName
}

object StartDeliveryStreamEncryptionInput {
  @scala.inline
  def apply(DeliveryStreamName: DeliveryStreamName): StartDeliveryStreamEncryptionInput = {
    val __obj = js.Dynamic.literal(DeliveryStreamName = DeliveryStreamName)
  
    __obj.asInstanceOf[StartDeliveryStreamEncryptionInput]
  }
}

