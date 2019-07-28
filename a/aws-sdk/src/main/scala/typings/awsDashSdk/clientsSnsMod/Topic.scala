package typings.awsDashSdk.clientsSnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Topic extends js.Object {
  /**
    * The topic's ARN.
    */
  var TopicArn: js.UndefOr[topicARN] = js.undefined
}

object Topic {
  @scala.inline
  def apply(TopicArn: topicARN = null): Topic = {
    val __obj = js.Dynamic.literal()
    if (TopicArn != null) __obj.updateDynamic("TopicArn")(TopicArn)
    __obj.asInstanceOf[Topic]
  }
}

