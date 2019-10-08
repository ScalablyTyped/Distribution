package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateSmsTemplateRequest extends js.Object {
  /**
    * Creates a message template that you can use in messages that are sent through the SMS channel.
    */
  var SMSTemplateRequest: typings.awsDashSdk.clientsPinpointMod.SMSTemplateRequest
  /**
    * The name of the message template. A template name must start with an alphanumeric character and can contain a maximum of 128 characters. The characters can be alphanumeric characters, underscores (_), or hyphens (-). Template names are case sensitive.
    */
  var TemplateName: __string
}

object CreateSmsTemplateRequest {
  @scala.inline
  def apply(SMSTemplateRequest: SMSTemplateRequest, TemplateName: __string): CreateSmsTemplateRequest = {
    val __obj = js.Dynamic.literal(SMSTemplateRequest = SMSTemplateRequest, TemplateName = TemplateName)
  
    __obj.asInstanceOf[CreateSmsTemplateRequest]
  }
}

