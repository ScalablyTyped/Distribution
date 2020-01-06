package typings.awsDashSdk.clientsSnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTopicAttributesInput extends js.Object {
  /**
    * The ARN of the topic whose properties you want to get.
    */
  var TopicArn: topicARN = js.native
}

object GetTopicAttributesInput {
  @scala.inline
  def apply(TopicArn: topicARN): GetTopicAttributesInput = {
    val __obj = js.Dynamic.literal(TopicArn = TopicArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetTopicAttributesInput]
  }
}

