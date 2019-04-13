package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TopicConfigurationDeprecated extends js.Object {
  /**
    * Bucket event for which to send notifications.
    */
  var Event: js.UndefOr[Event] = js.undefined
  /**
    * 
    */
  var Events: js.UndefOr[EventList] = js.undefined
  var Id: js.UndefOr[NotificationId] = js.undefined
  /**
    * Amazon SNS topic to which Amazon S3 will publish a message to report the specified events for the bucket.
    */
  var Topic: js.UndefOr[TopicArn] = js.undefined
}

object TopicConfigurationDeprecated {
  @scala.inline
  def apply(Event: Event = null, Events: EventList = null, Id: NotificationId = null, Topic: TopicArn = null): TopicConfigurationDeprecated = {
    val __obj = js.Dynamic.literal()
    if (Event != null) __obj.updateDynamic("Event")(Event.asInstanceOf[js.Any])
    if (Events != null) __obj.updateDynamic("Events")(Events)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (Topic != null) __obj.updateDynamic("Topic")(Topic)
    __obj.asInstanceOf[TopicConfigurationDeprecated]
  }
}

