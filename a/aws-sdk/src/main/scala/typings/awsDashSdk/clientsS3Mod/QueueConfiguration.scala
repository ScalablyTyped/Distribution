package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueueConfiguration extends js.Object {
  /**
    * A collection of bucket events for which to send notifications
    */
  var Events: EventList = js.native
  var Filter: js.UndefOr[NotificationConfigurationFilter] = js.native
  var Id: js.UndefOr[NotificationId] = js.native
  /**
    * The Amazon Resource Name (ARN) of the Amazon SQS queue to which Amazon S3 publishes a message when it detects events of the specified type.
    */
  var QueueArn: typings.awsDashSdk.clientsS3Mod.QueueArn = js.native
}

object QueueConfiguration {
  @scala.inline
  def apply(
    Events: EventList,
    QueueArn: QueueArn,
    Filter: NotificationConfigurationFilter = null,
    Id: NotificationId = null
  ): QueueConfiguration = {
    val __obj = js.Dynamic.literal(Events = Events.asInstanceOf[js.Any], QueueArn = QueueArn.asInstanceOf[js.Any])
    if (Filter != null) __obj.updateDynamic("Filter")(Filter.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueueConfiguration]
  }
}

