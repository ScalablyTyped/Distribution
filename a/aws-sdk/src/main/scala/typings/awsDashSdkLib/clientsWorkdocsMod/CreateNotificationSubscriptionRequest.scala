package typings
package awsDashSdkLib.clientsWorkdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateNotificationSubscriptionRequest extends js.Object {
  /**
    * The endpoint to receive the notifications. If the protocol is HTTPS, the endpoint is a URL that begins with https.
    */
  var Endpoint: SubscriptionEndPointType
  /**
    * The ID of the organization.
    */
  var OrganizationId: IdType
  /**
    * The protocol to use. The supported value is https, which delivers JSON-encoded messages using HTTPS POST.
    */
  var Protocol: SubscriptionProtocolType
  /**
    * The notification type.
    */
  var SubscriptionType: awsDashSdkLib.clientsWorkdocsMod.SubscriptionType
}

object CreateNotificationSubscriptionRequest {
  @scala.inline
  def apply(
    Endpoint: SubscriptionEndPointType,
    OrganizationId: IdType,
    Protocol: SubscriptionProtocolType,
    SubscriptionType: SubscriptionType
  ): CreateNotificationSubscriptionRequest = {
    val __obj = js.Dynamic.literal(Endpoint = Endpoint, OrganizationId = OrganizationId, Protocol = Protocol.asInstanceOf[js.Any], SubscriptionType = SubscriptionType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateNotificationSubscriptionRequest]
  }
}

