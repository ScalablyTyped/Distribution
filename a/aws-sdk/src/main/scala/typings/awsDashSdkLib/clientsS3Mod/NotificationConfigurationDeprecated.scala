package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationConfigurationDeprecated extends js.Object {
  /**
    * 
    */
  var CloudFunctionConfiguration: js.UndefOr[CloudFunctionConfiguration] = js.undefined
  /**
    * 
    */
  var QueueConfiguration: js.UndefOr[QueueConfigurationDeprecated] = js.undefined
  /**
    * 
    */
  var TopicConfiguration: js.UndefOr[TopicConfigurationDeprecated] = js.undefined
}

object NotificationConfigurationDeprecated {
  @scala.inline
  def apply(
    CloudFunctionConfiguration: CloudFunctionConfiguration = null,
    QueueConfiguration: QueueConfigurationDeprecated = null,
    TopicConfiguration: TopicConfigurationDeprecated = null
  ): NotificationConfigurationDeprecated = {
    val __obj = js.Dynamic.literal()
    if (CloudFunctionConfiguration != null) __obj.updateDynamic("CloudFunctionConfiguration")(CloudFunctionConfiguration)
    if (QueueConfiguration != null) __obj.updateDynamic("QueueConfiguration")(QueueConfiguration)
    if (TopicConfiguration != null) __obj.updateDynamic("TopicConfiguration")(TopicConfiguration)
    __obj.asInstanceOf[NotificationConfigurationDeprecated]
  }
}

