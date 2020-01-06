package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPushTemplateResponse extends js.Object {
  var PushNotificationTemplateResponse: typings.awsDashSdk.clientsPinpointMod.PushNotificationTemplateResponse = js.native
}

object GetPushTemplateResponse {
  @scala.inline
  def apply(PushNotificationTemplateResponse: PushNotificationTemplateResponse): GetPushTemplateResponse = {
    val __obj = js.Dynamic.literal(PushNotificationTemplateResponse = PushNotificationTemplateResponse.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetPushTemplateResponse]
  }
}

