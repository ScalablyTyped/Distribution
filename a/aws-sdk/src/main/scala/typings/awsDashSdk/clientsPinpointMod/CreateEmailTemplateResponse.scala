package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateEmailTemplateResponse extends js.Object {
  var CreateTemplateMessageBody: typings.awsDashSdk.clientsPinpointMod.CreateTemplateMessageBody = js.native
}

object CreateEmailTemplateResponse {
  @scala.inline
  def apply(CreateTemplateMessageBody: CreateTemplateMessageBody): CreateEmailTemplateResponse = {
    val __obj = js.Dynamic.literal(CreateTemplateMessageBody = CreateTemplateMessageBody.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateEmailTemplateResponse]
  }
}

