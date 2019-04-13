package typings
package awsDashSdkLib.clientsFirehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagDeliveryStreamInput extends js.Object {
  /**
    * The name of the delivery stream to which you want to add the tags.
    */
  var DeliveryStreamName: awsDashSdkLib.clientsFirehoseMod.DeliveryStreamName
  /**
    * A set of key-value pairs to use to create the tags.
    */
  var Tags: TagDeliveryStreamInputTagList
}

object TagDeliveryStreamInput {
  @scala.inline
  def apply(DeliveryStreamName: DeliveryStreamName, Tags: TagDeliveryStreamInputTagList): TagDeliveryStreamInput = {
    val __obj = js.Dynamic.literal(DeliveryStreamName = DeliveryStreamName, Tags = Tags)
  
    __obj.asInstanceOf[TagDeliveryStreamInput]
  }
}

