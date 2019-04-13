package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateVpcEndpointConnectionNotificationResult extends js.Object {
  /**
    * Unique, case-sensitive identifier you provide to ensure the idempotency of the request.
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  /**
    * Information about the notification.
    */
  var ConnectionNotification: js.UndefOr[ConnectionNotification] = js.undefined
}

object CreateVpcEndpointConnectionNotificationResult {
  @scala.inline
  def apply(ClientToken: String = null, ConnectionNotification: ConnectionNotification = null): CreateVpcEndpointConnectionNotificationResult = {
    val __obj = js.Dynamic.literal()
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken)
    if (ConnectionNotification != null) __obj.updateDynamic("ConnectionNotification")(ConnectionNotification)
    __obj.asInstanceOf[CreateVpcEndpointConnectionNotificationResult]
  }
}

