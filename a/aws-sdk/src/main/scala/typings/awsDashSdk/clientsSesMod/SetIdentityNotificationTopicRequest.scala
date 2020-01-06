package typings.awsDashSdk.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetIdentityNotificationTopicRequest extends js.Object {
  /**
    * The identity (email address or domain) that you want to set the Amazon SNS topic for.  You can only specify a verified identity for this parameter.  You can specify an identity by using its name or by using its Amazon Resource Name (ARN). The following examples are all valid identities: sender@example.com, example.com, arn:aws:ses:us-east-1:123456789012:identity/example.com.
    */
  var Identity: typings.awsDashSdk.clientsSesMod.Identity = js.native
  /**
    * The type of notifications that will be published to the specified Amazon SNS topic.
    */
  var NotificationType: typings.awsDashSdk.clientsSesMod.NotificationType = js.native
  /**
    * The Amazon Resource Name (ARN) of the Amazon SNS topic. If the parameter is omitted from the request or a null value is passed, SnsTopic is cleared and publishing is disabled.
    */
  var SnsTopic: js.UndefOr[NotificationTopic] = js.native
}

object SetIdentityNotificationTopicRequest {
  @scala.inline
  def apply(Identity: Identity, NotificationType: NotificationType, SnsTopic: NotificationTopic = null): SetIdentityNotificationTopicRequest = {
    val __obj = js.Dynamic.literal(Identity = Identity.asInstanceOf[js.Any], NotificationType = NotificationType.asInstanceOf[js.Any])
    if (SnsTopic != null) __obj.updateDynamic("SnsTopic")(SnsTopic.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetIdentityNotificationTopicRequest]
  }
}

