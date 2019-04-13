package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueueConfiguration extends js.Object {
  /**
    * 
    */
  var Events: EventList
  var Filter: js.UndefOr[NotificationConfigurationFilter] = js.undefined
  var Id: js.UndefOr[NotificationId] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the Amazon SQS queue to which Amazon S3 will publish a message when it detects events of the specified type.
    */
  var QueueArn: awsDashSdkLib.clientsS3Mod.QueueArn
}

object QueueConfiguration {
  @scala.inline
  def apply(
    Events: EventList,
    QueueArn: QueueArn,
    Filter: NotificationConfigurationFilter = null,
    Id: NotificationId = null
  ): QueueConfiguration = {
    val __obj = js.Dynamic.literal(Events = Events, QueueArn = QueueArn)
    if (Filter != null) __obj.updateDynamic("Filter")(Filter)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    __obj.asInstanceOf[QueueConfiguration]
  }
}

