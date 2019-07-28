package typings.awsDashSdk.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentityNotificationAttributes extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the Amazon SNS topic where Amazon SES will publish bounce notifications.
    */
  var BounceTopic: NotificationTopic
  /**
    * The Amazon Resource Name (ARN) of the Amazon SNS topic where Amazon SES will publish complaint notifications.
    */
  var ComplaintTopic: NotificationTopic
  /**
    * The Amazon Resource Name (ARN) of the Amazon SNS topic where Amazon SES will publish delivery notifications.
    */
  var DeliveryTopic: NotificationTopic
  /**
    * Describes whether Amazon SES will forward bounce and complaint notifications as email. true indicates that Amazon SES will forward bounce and complaint notifications as email, while false indicates that bounce and complaint notifications will be published only to the specified bounce and complaint Amazon SNS topics.
    */
  var ForwardingEnabled: Enabled
  /**
    * Describes whether Amazon SES includes the original email headers in Amazon SNS notifications of type Bounce. A value of true specifies that Amazon SES will include headers in bounce notifications, and a value of false specifies that Amazon SES will not include headers in bounce notifications.
    */
  var HeadersInBounceNotificationsEnabled: js.UndefOr[Enabled] = js.undefined
  /**
    * Describes whether Amazon SES includes the original email headers in Amazon SNS notifications of type Complaint. A value of true specifies that Amazon SES will include headers in complaint notifications, and a value of false specifies that Amazon SES will not include headers in complaint notifications.
    */
  var HeadersInComplaintNotificationsEnabled: js.UndefOr[Enabled] = js.undefined
  /**
    * Describes whether Amazon SES includes the original email headers in Amazon SNS notifications of type Delivery. A value of true specifies that Amazon SES will include headers in delivery notifications, and a value of false specifies that Amazon SES will not include headers in delivery notifications.
    */
  var HeadersInDeliveryNotificationsEnabled: js.UndefOr[Enabled] = js.undefined
}

object IdentityNotificationAttributes {
  @scala.inline
  def apply(
    BounceTopic: NotificationTopic,
    ComplaintTopic: NotificationTopic,
    DeliveryTopic: NotificationTopic,
    ForwardingEnabled: Enabled,
    HeadersInBounceNotificationsEnabled: js.UndefOr[Enabled] = js.undefined,
    HeadersInComplaintNotificationsEnabled: js.UndefOr[Enabled] = js.undefined,
    HeadersInDeliveryNotificationsEnabled: js.UndefOr[Enabled] = js.undefined
  ): IdentityNotificationAttributes = {
    val __obj = js.Dynamic.literal(BounceTopic = BounceTopic, ComplaintTopic = ComplaintTopic, DeliveryTopic = DeliveryTopic, ForwardingEnabled = ForwardingEnabled)
    if (!js.isUndefined(HeadersInBounceNotificationsEnabled)) __obj.updateDynamic("HeadersInBounceNotificationsEnabled")(HeadersInBounceNotificationsEnabled)
    if (!js.isUndefined(HeadersInComplaintNotificationsEnabled)) __obj.updateDynamic("HeadersInComplaintNotificationsEnabled")(HeadersInComplaintNotificationsEnabled)
    if (!js.isUndefined(HeadersInDeliveryNotificationsEnabled)) __obj.updateDynamic("HeadersInDeliveryNotificationsEnabled")(HeadersInDeliveryNotificationsEnabled)
    __obj.asInstanceOf[IdentityNotificationAttributes]
  }
}

