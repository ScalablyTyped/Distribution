package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateSmsTemplateRequest extends js.Object {
  var SMSTemplateRequest: typings.awsDashSdk.clientsPinpointMod.SMSTemplateRequest
  /**
    * The name of the message template. A template name must start with an alphanumeric character and can contain a maximum of 128 characters. The characters can be alphanumeric characters, underscores (_), or hyphens (-). Template names are case sensitive.
    */
  var TemplateName: __string
}

object UpdateSmsTemplateRequest {
  @scala.inline
  def apply(SMSTemplateRequest: SMSTemplateRequest, TemplateName: __string): UpdateSmsTemplateRequest = {
    val __obj = js.Dynamic.literal(SMSTemplateRequest = SMSTemplateRequest, TemplateName = TemplateName)
  
    __obj.asInstanceOf[UpdateSmsTemplateRequest]
  }
}

