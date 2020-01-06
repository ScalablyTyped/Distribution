package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateVoiceTemplateResponse extends js.Object {
  var CreateTemplateMessageBody: typings.awsDashSdk.clientsPinpointMod.CreateTemplateMessageBody = js.native
}

object CreateVoiceTemplateResponse {
  @scala.inline
  def apply(CreateTemplateMessageBody: CreateTemplateMessageBody): CreateVoiceTemplateResponse = {
    val __obj = js.Dynamic.literal(CreateTemplateMessageBody = CreateTemplateMessageBody.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateVoiceTemplateResponse]
  }
}

