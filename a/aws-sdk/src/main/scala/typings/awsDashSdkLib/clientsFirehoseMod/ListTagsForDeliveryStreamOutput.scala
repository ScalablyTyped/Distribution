package typings
package awsDashSdkLib.clientsFirehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagsForDeliveryStreamOutput extends js.Object {
  /**
    * If this is true in the response, more tags are available. To list the remaining tags, set ExclusiveStartTagKey to the key of the last tag returned and call ListTagsForDeliveryStream again.
    */
  var HasMoreTags: BooleanObject
  /**
    * A list of tags associated with DeliveryStreamName, starting with the first tag after ExclusiveStartTagKey and up to the specified Limit.
    */
  var Tags: ListTagsForDeliveryStreamOutputTagList
}

object ListTagsForDeliveryStreamOutput {
  @scala.inline
  def apply(HasMoreTags: BooleanObject, Tags: ListTagsForDeliveryStreamOutputTagList): ListTagsForDeliveryStreamOutput = {
    val __obj = js.Dynamic.literal(HasMoreTags = HasMoreTags, Tags = Tags)
  
    __obj.asInstanceOf[ListTagsForDeliveryStreamOutput]
  }
}

