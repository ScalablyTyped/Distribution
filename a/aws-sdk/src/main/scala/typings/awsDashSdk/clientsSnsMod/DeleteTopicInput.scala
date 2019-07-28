package typings.awsDashSdk.clientsSnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteTopicInput extends js.Object {
  /**
    * The ARN of the topic you want to delete.
    */
  var TopicArn: topicARN
}

object DeleteTopicInput {
  @scala.inline
  def apply(TopicArn: topicARN): DeleteTopicInput = {
    val __obj = js.Dynamic.literal(TopicArn = TopicArn)
  
    __obj.asInstanceOf[DeleteTopicInput]
  }
}

