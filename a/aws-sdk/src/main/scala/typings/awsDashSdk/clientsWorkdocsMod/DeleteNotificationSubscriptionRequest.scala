package typings.awsDashSdk.clientsWorkdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteNotificationSubscriptionRequest extends js.Object {
  /**
    * The ID of the organization.
    */
  var OrganizationId: IdType
  /**
    * The ID of the subscription.
    */
  var SubscriptionId: IdType
}

object DeleteNotificationSubscriptionRequest {
  @scala.inline
  def apply(OrganizationId: IdType, SubscriptionId: IdType): DeleteNotificationSubscriptionRequest = {
    val __obj = js.Dynamic.literal(OrganizationId = OrganizationId, SubscriptionId = SubscriptionId)
  
    __obj.asInstanceOf[DeleteNotificationSubscriptionRequest]
  }
}

