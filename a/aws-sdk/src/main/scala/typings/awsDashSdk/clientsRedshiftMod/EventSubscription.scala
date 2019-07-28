package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventSubscription extends js.Object {
  /**
    * The name of the Amazon Redshift event notification subscription.
    */
  var CustSubscriptionId: js.UndefOr[String] = js.undefined
  /**
    * The AWS customer account associated with the Amazon Redshift event notification subscription.
    */
  var CustomerAwsId: js.UndefOr[String] = js.undefined
  /**
    * A boolean value indicating whether the subscription is enabled; true indicates that the subscription is enabled.
    */
  var Enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The list of Amazon Redshift event categories specified in the event notification subscription. Values: Configuration, Management, Monitoring, Security
    */
  var EventCategoriesList: js.UndefOr[typings.awsDashSdk.clientsRedshiftMod.EventCategoriesList] = js.undefined
  /**
    * The event severity specified in the Amazon Redshift event notification subscription. Values: ERROR, INFO
    */
  var Severity: js.UndefOr[String] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the Amazon SNS topic used by the event notification subscription.
    */
  var SnsTopicArn: js.UndefOr[String] = js.undefined
  /**
    * A list of the sources that publish events to the Amazon Redshift event notification subscription.
    */
  var SourceIdsList: js.UndefOr[typings.awsDashSdk.clientsRedshiftMod.SourceIdsList] = js.undefined
  /**
    * The source type of the events returned the Amazon Redshift event notification, such as cluster, or cluster-snapshot.
    */
  var SourceType: js.UndefOr[String] = js.undefined
  /**
    * The status of the Amazon Redshift event notification subscription. Constraints:   Can be one of the following: active | no-permission | topic-not-exist   The status "no-permission" indicates that Amazon Redshift no longer has permission to post to the Amazon SNS topic. The status "topic-not-exist" indicates that the topic was deleted after the subscription was created.  
    */
  var Status: js.UndefOr[String] = js.undefined
  /**
    * The date and time the Amazon Redshift event notification subscription was created.
    */
  var SubscriptionCreationTime: js.UndefOr[TStamp] = js.undefined
  /**
    * The list of tags for the event subscription.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}

object EventSubscription {
  @scala.inline
  def apply(
    CustSubscriptionId: String = null,
    CustomerAwsId: String = null,
    Enabled: js.UndefOr[Boolean] = js.undefined,
    EventCategoriesList: EventCategoriesList = null,
    Severity: String = null,
    SnsTopicArn: String = null,
    SourceIdsList: SourceIdsList = null,
    SourceType: String = null,
    Status: String = null,
    SubscriptionCreationTime: TStamp = null,
    Tags: TagList = null
  ): EventSubscription = {
    val __obj = js.Dynamic.literal()
    if (CustSubscriptionId != null) __obj.updateDynamic("CustSubscriptionId")(CustSubscriptionId)
    if (CustomerAwsId != null) __obj.updateDynamic("CustomerAwsId")(CustomerAwsId)
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled)
    if (EventCategoriesList != null) __obj.updateDynamic("EventCategoriesList")(EventCategoriesList)
    if (Severity != null) __obj.updateDynamic("Severity")(Severity)
    if (SnsTopicArn != null) __obj.updateDynamic("SnsTopicArn")(SnsTopicArn)
    if (SourceIdsList != null) __obj.updateDynamic("SourceIdsList")(SourceIdsList)
    if (SourceType != null) __obj.updateDynamic("SourceType")(SourceType)
    if (Status != null) __obj.updateDynamic("Status")(Status)
    if (SubscriptionCreationTime != null) __obj.updateDynamic("SubscriptionCreationTime")(SubscriptionCreationTime)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[EventSubscription]
  }
}

