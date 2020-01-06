package typings.awsDashSdk.clientsDaxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationConfiguration extends js.Object {
  /**
    * The Amazon Resource Name (ARN) that identifies the topic. 
    */
  var TopicArn: js.UndefOr[String] = js.native
  /**
    * The current state of the topic.
    */
  var TopicStatus: js.UndefOr[String] = js.native
}

object NotificationConfiguration {
  @scala.inline
  def apply(TopicArn: String = null, TopicStatus: String = null): NotificationConfiguration = {
    val __obj = js.Dynamic.literal()
    if (TopicArn != null) __obj.updateDynamic("TopicArn")(TopicArn.asInstanceOf[js.Any])
    if (TopicStatus != null) __obj.updateDynamic("TopicStatus")(TopicStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationConfiguration]
  }
}

