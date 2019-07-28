package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationConfiguration extends js.Object {
  /**
    * Describes the AWS Lambda functions to invoke and the events for which to invoke them.
    */
  var LambdaFunctionConfigurations: js.UndefOr[LambdaFunctionConfigurationList] = js.undefined
  /**
    * The Amazon Simple Queue Service queues to publish messages to and the events for which to publish messages.
    */
  var QueueConfigurations: js.UndefOr[QueueConfigurationList] = js.undefined
  /**
    * The topic to which notifications are sent and the events for which notifications are generated.
    */
  var TopicConfigurations: js.UndefOr[TopicConfigurationList] = js.undefined
}

object NotificationConfiguration {
  @scala.inline
  def apply(
    LambdaFunctionConfigurations: LambdaFunctionConfigurationList = null,
    QueueConfigurations: QueueConfigurationList = null,
    TopicConfigurations: TopicConfigurationList = null
  ): NotificationConfiguration = {
    val __obj = js.Dynamic.literal()
    if (LambdaFunctionConfigurations != null) __obj.updateDynamic("LambdaFunctionConfigurations")(LambdaFunctionConfigurations)
    if (QueueConfigurations != null) __obj.updateDynamic("QueueConfigurations")(QueueConfigurations)
    if (TopicConfigurations != null) __obj.updateDynamic("TopicConfigurations")(TopicConfigurations)
    __obj.asInstanceOf[NotificationConfiguration]
  }
}

