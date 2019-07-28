package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceDetail extends js.Object {
  /**
    * The source of the event, such as an AWS service, that triggers AWS Config to evaluate your AWS resources.
    */
  var EventSource: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.EventSource] = js.undefined
  /**
    * The frequency at which you want AWS Config to run evaluations for a custom rule with a periodic trigger. If you specify a value for MaximumExecutionFrequency, then MessageType must use the ScheduledNotification value.  By default, rules with a periodic trigger are evaluated every 24 hours. To change the frequency, specify a valid value for the MaximumExecutionFrequency parameter. Based on the valid value you choose, AWS Config runs evaluations once for each valid value. For example, if you choose Three_Hours, AWS Config runs evaluations once every three hours. In this case, Three_Hours is the frequency of this rule.  
    */
  var MaximumExecutionFrequency: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.MaximumExecutionFrequency] = js.undefined
  /**
    * The type of notification that triggers AWS Config to run an evaluation for a rule. You can specify the following notification types:    ConfigurationItemChangeNotification - Triggers an evaluation when AWS Config delivers a configuration item as a result of a resource change.    OversizedConfigurationItemChangeNotification - Triggers an evaluation when AWS Config delivers an oversized configuration item. AWS Config may generate this notification type when a resource changes and the notification exceeds the maximum size allowed by Amazon SNS.    ScheduledNotification - Triggers a periodic evaluation at the frequency specified for MaximumExecutionFrequency.    ConfigurationSnapshotDeliveryCompleted - Triggers a periodic evaluation when AWS Config delivers a configuration snapshot.   If you want your custom rule to be triggered by configuration changes, specify two SourceDetail objects, one for ConfigurationItemChangeNotification and one for OversizedConfigurationItemChangeNotification.
    */
  var MessageType: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.MessageType] = js.undefined
}

object SourceDetail {
  @scala.inline
  def apply(
    EventSource: EventSource = null,
    MaximumExecutionFrequency: MaximumExecutionFrequency = null,
    MessageType: MessageType = null
  ): SourceDetail = {
    val __obj = js.Dynamic.literal()
    if (EventSource != null) __obj.updateDynamic("EventSource")(EventSource.asInstanceOf[js.Any])
    if (MaximumExecutionFrequency != null) __obj.updateDynamic("MaximumExecutionFrequency")(MaximumExecutionFrequency.asInstanceOf[js.Any])
    if (MessageType != null) __obj.updateDynamic("MessageType")(MessageType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceDetail]
  }
}

