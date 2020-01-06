package typings.awsDashSdk.clientsSnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Topic extends js.Object {
  /**
    * The topic's ARN.
    */
  var TopicArn: js.UndefOr[topicARN] = js.native
}

object Topic {
  @scala.inline
  def apply(TopicArn: topicARN = null): Topic = {
    val __obj = js.Dynamic.literal()
    if (TopicArn != null) __obj.updateDynamic("TopicArn")(TopicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Topic]
  }
}

