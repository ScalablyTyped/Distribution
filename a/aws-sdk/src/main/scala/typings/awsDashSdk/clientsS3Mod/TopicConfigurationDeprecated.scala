package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TopicConfigurationDeprecated extends js.Object {
  /**
    * Bucket event for which to send notifications.
    */
  var Event: js.UndefOr[typings.awsDashSdk.clientsS3Mod.Event] = js.native
  /**
    * A collection of events related to objects
    */
  var Events: js.UndefOr[EventList] = js.native
  var Id: js.UndefOr[NotificationId] = js.native
  /**
    * Amazon SNS topic to which Amazon S3 will publish a message to report the specified events for the bucket.
    */
  var Topic: js.UndefOr[TopicArn] = js.native
}

object TopicConfigurationDeprecated {
  @scala.inline
  def apply(Event: Event = null, Events: EventList = null, Id: NotificationId = null, Topic: TopicArn = null): TopicConfigurationDeprecated = {
    val __obj = js.Dynamic.literal()
    if (Event != null) __obj.updateDynamic("Event")(Event.asInstanceOf[js.Any])
    if (Events != null) __obj.updateDynamic("Events")(Events.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (Topic != null) __obj.updateDynamic("Topic")(Topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicConfigurationDeprecated]
  }
}

