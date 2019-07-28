package typings.awsDashSdk.clientsFirehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UntagDeliveryStreamInput extends js.Object {
  /**
    * The name of the delivery stream.
    */
  var DeliveryStreamName: typings.awsDashSdk.clientsFirehoseMod.DeliveryStreamName
  /**
    * A list of tag keys. Each corresponding tag is removed from the delivery stream.
    */
  var TagKeys: TagKeyList
}

object UntagDeliveryStreamInput {
  @scala.inline
  def apply(DeliveryStreamName: DeliveryStreamName, TagKeys: TagKeyList): UntagDeliveryStreamInput = {
    val __obj = js.Dynamic.literal(DeliveryStreamName = DeliveryStreamName, TagKeys = TagKeys)
  
    __obj.asInstanceOf[UntagDeliveryStreamInput]
  }
}

