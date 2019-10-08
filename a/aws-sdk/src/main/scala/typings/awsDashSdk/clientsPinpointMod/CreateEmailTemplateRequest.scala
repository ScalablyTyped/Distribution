package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateEmailTemplateRequest extends js.Object {
  /**
    * Creates a new message template that you can use in messages that are sent through the email channel.
    */
  var EmailTemplateRequest: typings.awsDashSdk.clientsPinpointMod.EmailTemplateRequest
  /**
    * The name of the message template. A template name must start with an alphanumeric character and can contain a maximum of 128 characters. The characters can be alphanumeric characters, underscores (_), or hyphens (-). Template names are case sensitive.
    */
  var TemplateName: __string
}

object CreateEmailTemplateRequest {
  @scala.inline
  def apply(EmailTemplateRequest: EmailTemplateRequest, TemplateName: __string): CreateEmailTemplateRequest = {
    val __obj = js.Dynamic.literal(EmailTemplateRequest = EmailTemplateRequest, TemplateName = TemplateName)
  
    __obj.asInstanceOf[CreateEmailTemplateRequest]
  }
}

