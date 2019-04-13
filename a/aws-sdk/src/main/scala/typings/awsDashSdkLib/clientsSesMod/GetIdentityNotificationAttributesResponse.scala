package typings
package awsDashSdkLib.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetIdentityNotificationAttributesResponse extends js.Object {
  /**
    * A map of Identity to IdentityNotificationAttributes.
    */
  var NotificationAttributes: awsDashSdkLib.clientsSesMod.NotificationAttributes
}

object GetIdentityNotificationAttributesResponse {
  @scala.inline
  def apply(NotificationAttributes: NotificationAttributes): GetIdentityNotificationAttributesResponse = {
    val __obj = js.Dynamic.literal(NotificationAttributes = NotificationAttributes)
  
    __obj.asInstanceOf[GetIdentityNotificationAttributesResponse]
  }
}

