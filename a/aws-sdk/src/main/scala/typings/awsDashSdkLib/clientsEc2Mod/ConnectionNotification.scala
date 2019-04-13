package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionNotification extends js.Object {
  /**
    * The events for the notification. Valid values are Accept, Connect, Delete, and Reject.
    */
  var ConnectionEvents: js.UndefOr[ValueStringList] = js.undefined
  /**
    * The ARN of the SNS topic for the notification.
    */
  var ConnectionNotificationArn: js.UndefOr[String] = js.undefined
  /**
    * The ID of the notification.
    */
  var ConnectionNotificationId: js.UndefOr[String] = js.undefined
  /**
    * The state of the notification.
    */
  var ConnectionNotificationState: js.UndefOr[ConnectionNotificationState] = js.undefined
  /**
    * The type of notification.
    */
  var ConnectionNotificationType: js.UndefOr[ConnectionNotificationType] = js.undefined
  /**
    * The ID of the endpoint service.
    */
  var ServiceId: js.UndefOr[String] = js.undefined
  /**
    * The ID of the VPC endpoint.
    */
  var VpcEndpointId: js.UndefOr[String] = js.undefined
}

object ConnectionNotification {
  @scala.inline
  def apply(
    ConnectionEvents: ValueStringList = null,
    ConnectionNotificationArn: String = null,
    ConnectionNotificationId: String = null,
    ConnectionNotificationState: ConnectionNotificationState = null,
    ConnectionNotificationType: ConnectionNotificationType = null,
    ServiceId: String = null,
    VpcEndpointId: String = null
  ): ConnectionNotification = {
    val __obj = js.Dynamic.literal()
    if (ConnectionEvents != null) __obj.updateDynamic("ConnectionEvents")(ConnectionEvents)
    if (ConnectionNotificationArn != null) __obj.updateDynamic("ConnectionNotificationArn")(ConnectionNotificationArn)
    if (ConnectionNotificationId != null) __obj.updateDynamic("ConnectionNotificationId")(ConnectionNotificationId)
    if (ConnectionNotificationState != null) __obj.updateDynamic("ConnectionNotificationState")(ConnectionNotificationState.asInstanceOf[js.Any])
    if (ConnectionNotificationType != null) __obj.updateDynamic("ConnectionNotificationType")(ConnectionNotificationType.asInstanceOf[js.Any])
    if (ServiceId != null) __obj.updateDynamic("ServiceId")(ServiceId)
    if (VpcEndpointId != null) __obj.updateDynamic("VpcEndpointId")(VpcEndpointId)
    __obj.asInstanceOf[ConnectionNotification]
  }
}

