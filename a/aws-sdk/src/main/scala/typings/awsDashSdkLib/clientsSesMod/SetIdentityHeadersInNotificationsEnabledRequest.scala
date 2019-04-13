package typings
package awsDashSdkLib.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetIdentityHeadersInNotificationsEnabledRequest extends js.Object {
  /**
    * Sets whether Amazon SES includes the original email headers in Amazon SNS notifications of the specified notification type. A value of true specifies that Amazon SES will include headers in notifications, and a value of false specifies that Amazon SES will not include headers in notifications. This value can only be set when NotificationType is already set to use a particular Amazon SNS topic.
    */
  var Enabled: awsDashSdkLib.clientsSesMod.Enabled
  /**
    * The identity for which to enable or disable headers in notifications. Examples: user@example.com, example.com.
    */
  var Identity: awsDashSdkLib.clientsSesMod.Identity
  /**
    * The notification type for which to enable or disable headers in notifications. 
    */
  var NotificationType: awsDashSdkLib.clientsSesMod.NotificationType
}

object SetIdentityHeadersInNotificationsEnabledRequest {
  @scala.inline
  def apply(Enabled: Enabled, Identity: Identity, NotificationType: NotificationType): SetIdentityHeadersInNotificationsEnabledRequest = {
    val __obj = js.Dynamic.literal(Enabled = Enabled, Identity = Identity, NotificationType = NotificationType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SetIdentityHeadersInNotificationsEnabledRequest]
  }
}

