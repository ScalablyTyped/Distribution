package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationConfig extends js.Object {
  /**
    * An Amazon Resource Name (ARN) for an Amazon Simple Notification Service (Amazon SNS) topic. Run Command pushes notifications about command status changes to this topic.
    */
  var NotificationArn: js.UndefOr[NotificationArn] = js.undefined
  /**
    * The different events for which you can receive notifications. These events include the following: All (events), InProgress, Success, TimedOut, Cancelled, Failed. To learn more about these events, see Configuring Amazon SNS Notifications for AWS Systems Manager in the AWS Systems Manager User Guide.
    */
  var NotificationEvents: js.UndefOr[NotificationEventList] = js.undefined
  /**
    * Command: Receive notification when the status of a command changes. Invocation: For commands sent to multiple instances, receive notification on a per-instance basis when the status of a command changes. 
    */
  var NotificationType: js.UndefOr[NotificationType] = js.undefined
}

object NotificationConfig {
  @scala.inline
  def apply(
    NotificationArn: NotificationArn = null,
    NotificationEvents: NotificationEventList = null,
    NotificationType: NotificationType = null
  ): NotificationConfig = {
    val __obj = js.Dynamic.literal()
    if (NotificationArn != null) __obj.updateDynamic("NotificationArn")(NotificationArn)
    if (NotificationEvents != null) __obj.updateDynamic("NotificationEvents")(NotificationEvents)
    if (NotificationType != null) __obj.updateDynamic("NotificationType")(NotificationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationConfig]
  }
}

