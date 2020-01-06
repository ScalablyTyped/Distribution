package typings.awsDashSdk.clientsInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssessmentRunNotification extends js.Object {
  /**
    * The date of the notification.
    */
  var date: Timestamp = js.native
  /**
    * The Boolean value that specifies whether the notification represents an error.
    */
  var error: Bool = js.native
  /**
    * The event for which a notification is sent.
    */
  var event: InspectorEvent = js.native
  /**
    * The message included in the notification.
    */
  var message: js.UndefOr[Message] = js.native
  /**
    * The status code of the SNS notification.
    */
  var snsPublishStatusCode: js.UndefOr[AssessmentRunNotificationSnsStatusCode] = js.native
  /**
    * The SNS topic to which the SNS notification is sent.
    */
  var snsTopicArn: js.UndefOr[Arn] = js.native
}

object AssessmentRunNotification {
  @scala.inline
  def apply(
    date: Timestamp,
    error: Bool,
    event: InspectorEvent,
    message: Message = null,
    snsPublishStatusCode: AssessmentRunNotificationSnsStatusCode = null,
    snsTopicArn: Arn = null
  ): AssessmentRunNotification = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (snsPublishStatusCode != null) __obj.updateDynamic("snsPublishStatusCode")(snsPublishStatusCode.asInstanceOf[js.Any])
    if (snsTopicArn != null) __obj.updateDynamic("snsTopicArn")(snsTopicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssessmentRunNotification]
  }
}

