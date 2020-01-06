package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteSmsTemplateResponse extends js.Object {
  var MessageBody: typings.awsDashSdk.clientsPinpointMod.MessageBody = js.native
}

object DeleteSmsTemplateResponse {
  @scala.inline
  def apply(MessageBody: MessageBody): DeleteSmsTemplateResponse = {
    val __obj = js.Dynamic.literal(MessageBody = MessageBody.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteSmsTemplateResponse]
  }
}

