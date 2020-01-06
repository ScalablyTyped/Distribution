package typings.awsDashSdk.clientsSnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTopicResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) assigned to the created topic.
    */
  var TopicArn: js.UndefOr[topicARN] = js.native
}

object CreateTopicResponse {
  @scala.inline
  def apply(TopicArn: topicARN = null): CreateTopicResponse = {
    val __obj = js.Dynamic.literal()
    if (TopicArn != null) __obj.updateDynamic("TopicArn")(TopicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTopicResponse]
  }
}

