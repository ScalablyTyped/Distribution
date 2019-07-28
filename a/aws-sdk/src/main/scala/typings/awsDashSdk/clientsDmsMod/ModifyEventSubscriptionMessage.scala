package typings.awsDashSdk.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyEventSubscriptionMessage extends js.Object {
  /**
    *  A Boolean value; set to true to activate the subscription. 
    */
  var Enabled: js.UndefOr[BooleanOptional] = js.undefined
  /**
    *  A list of event categories for a source type that you want to subscribe to. Use the DescribeEventCategories action to see a list of event categories. 
    */
  var EventCategories: js.UndefOr[EventCategoriesList] = js.undefined
  /**
    *  The Amazon Resource Name (ARN) of the Amazon SNS topic created for event notification. The ARN is created by Amazon SNS when you create a topic and subscribe to it.
    */
  var SnsTopicArn: js.UndefOr[String] = js.undefined
  /**
    *  The type of AWS DMS resource that generates the events you want to subscribe to.  Valid values: replication-instance | replication-task
    */
  var SourceType: js.UndefOr[String] = js.undefined
  /**
    * The name of the AWS DMS event notification subscription to be modified.
    */
  var SubscriptionName: String
}

object ModifyEventSubscriptionMessage {
  @scala.inline
  def apply(
    SubscriptionName: String,
    Enabled: js.UndefOr[BooleanOptional] = js.undefined,
    EventCategories: EventCategoriesList = null,
    SnsTopicArn: String = null,
    SourceType: String = null
  ): ModifyEventSubscriptionMessage = {
    val __obj = js.Dynamic.literal(SubscriptionName = SubscriptionName)
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled)
    if (EventCategories != null) __obj.updateDynamic("EventCategories")(EventCategories)
    if (SnsTopicArn != null) __obj.updateDynamic("SnsTopicArn")(SnsTopicArn)
    if (SourceType != null) __obj.updateDynamic("SourceType")(SourceType)
    __obj.asInstanceOf[ModifyEventSubscriptionMessage]
  }
}

