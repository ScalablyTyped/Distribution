package typings.awsDashSdk.clientsNeptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventSubscription extends js.Object {
  /**
    * The event notification subscription Id.
    */
  var CustSubscriptionId: js.UndefOr[String] = js.undefined
  /**
    * The AWS customer account associated with the event notification subscription.
    */
  var CustomerAwsId: js.UndefOr[String] = js.undefined
  /**
    * A Boolean value indicating if the subscription is enabled. True indicates the subscription is enabled.
    */
  var Enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * A list of event categories for the event notification subscription.
    */
  var EventCategoriesList: js.UndefOr[typings.awsDashSdk.clientsNeptuneMod.EventCategoriesList] = js.undefined
  /**
    * The Amazon Resource Name (ARN) for the event subscription.
    */
  var EventSubscriptionArn: js.UndefOr[String] = js.undefined
  /**
    * The topic ARN of the event notification subscription.
    */
  var SnsTopicArn: js.UndefOr[String] = js.undefined
  /**
    * A list of source IDs for the event notification subscription.
    */
  var SourceIdsList: js.UndefOr[typings.awsDashSdk.clientsNeptuneMod.SourceIdsList] = js.undefined
  /**
    * The source type for the event notification subscription.
    */
  var SourceType: js.UndefOr[String] = js.undefined
  /**
    * The status of the event notification subscription. Constraints: Can be one of the following: creating | modifying | deleting | active | no-permission | topic-not-exist The status "no-permission" indicates that Neptune no longer has permission to post to the SNS topic. The status "topic-not-exist" indicates that the topic was deleted after the subscription was created.
    */
  var Status: js.UndefOr[String] = js.undefined
  /**
    * The time the event notification subscription was created.
    */
  var SubscriptionCreationTime: js.UndefOr[String] = js.undefined
}

object EventSubscription {
  @scala.inline
  def apply(
    CustSubscriptionId: String = null,
    CustomerAwsId: String = null,
    Enabled: js.UndefOr[scala.Boolean] = js.undefined,
    EventCategoriesList: EventCategoriesList = null,
    EventSubscriptionArn: String = null,
    SnsTopicArn: String = null,
    SourceIdsList: SourceIdsList = null,
    SourceType: String = null,
    Status: String = null,
    SubscriptionCreationTime: String = null
  ): EventSubscription = {
    val __obj = js.Dynamic.literal()
    if (CustSubscriptionId != null) __obj.updateDynamic("CustSubscriptionId")(CustSubscriptionId)
    if (CustomerAwsId != null) __obj.updateDynamic("CustomerAwsId")(CustomerAwsId)
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled)
    if (EventCategoriesList != null) __obj.updateDynamic("EventCategoriesList")(EventCategoriesList)
    if (EventSubscriptionArn != null) __obj.updateDynamic("EventSubscriptionArn")(EventSubscriptionArn)
    if (SnsTopicArn != null) __obj.updateDynamic("SnsTopicArn")(SnsTopicArn)
    if (SourceIdsList != null) __obj.updateDynamic("SourceIdsList")(SourceIdsList)
    if (SourceType != null) __obj.updateDynamic("SourceType")(SourceType)
    if (Status != null) __obj.updateDynamic("Status")(Status)
    if (SubscriptionCreationTime != null) __obj.updateDynamic("SubscriptionCreationTime")(SubscriptionCreationTime)
    __obj.asInstanceOf[EventSubscription]
  }
}

