package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePushTemplateResponse extends js.Object {
  var CreateTemplateMessageBody: typings.awsDashSdk.clientsPinpointMod.CreateTemplateMessageBody = js.native
}

object CreatePushTemplateResponse {
  @scala.inline
  def apply(CreateTemplateMessageBody: CreateTemplateMessageBody): CreatePushTemplateResponse = {
    val __obj = js.Dynamic.literal(CreateTemplateMessageBody = CreateTemplateMessageBody.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreatePushTemplateResponse]
  }
}

