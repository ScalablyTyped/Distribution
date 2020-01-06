package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSmsTemplateResponse extends js.Object {
  var CreateTemplateMessageBody: typings.awsDashSdk.clientsPinpointMod.CreateTemplateMessageBody = js.native
}

object CreateSmsTemplateResponse {
  @scala.inline
  def apply(CreateTemplateMessageBody: CreateTemplateMessageBody): CreateSmsTemplateResponse = {
    val __obj = js.Dynamic.literal(CreateTemplateMessageBody = CreateTemplateMessageBody.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateSmsTemplateResponse]
  }
}

