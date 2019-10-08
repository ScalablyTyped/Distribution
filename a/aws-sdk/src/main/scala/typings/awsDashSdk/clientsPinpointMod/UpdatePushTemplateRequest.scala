package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdatePushTemplateRequest extends js.Object {
  /**
    * Updates an existing message template that you can use in messages that are sent through a push notification channel.
    */
  var PushNotificationTemplateRequest: typings.awsDashSdk.clientsPinpointMod.PushNotificationTemplateRequest
  /**
    * The name of the message template. A template name must start with an alphanumeric character and can contain a maximum of 128 characters. The characters can be alphanumeric characters, underscores (_), or hyphens (-). Template names are case sensitive.
    */
  var TemplateName: __string
}

object UpdatePushTemplateRequest {
  @scala.inline
  def apply(PushNotificationTemplateRequest: PushNotificationTemplateRequest, TemplateName: __string): UpdatePushTemplateRequest = {
    val __obj = js.Dynamic.literal(PushNotificationTemplateRequest = PushNotificationTemplateRequest, TemplateName = TemplateName)
  
    __obj.asInstanceOf[UpdatePushTemplateRequest]
  }
}

