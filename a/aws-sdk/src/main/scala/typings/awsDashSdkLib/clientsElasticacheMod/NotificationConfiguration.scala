package typings
package awsDashSdkLib.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationConfiguration extends js.Object {
  /**
    * The Amazon Resource Name (ARN) that identifies the topic.
    */
  var TopicArn: js.UndefOr[String] = js.undefined
  /**
    * The current state of the topic.
    */
  var TopicStatus: js.UndefOr[String] = js.undefined
}

object NotificationConfiguration {
  @scala.inline
  def apply(TopicArn: String = null, TopicStatus: String = null): NotificationConfiguration = {
    val __obj = js.Dynamic.literal()
    if (TopicArn != null) __obj.updateDynamic("TopicArn")(TopicArn)
    if (TopicStatus != null) __obj.updateDynamic("TopicStatus")(TopicStatus)
    __obj.asInstanceOf[NotificationConfiguration]
  }
}

