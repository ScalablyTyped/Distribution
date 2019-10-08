package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateEmailTemplateRequest extends js.Object {
  var EmailTemplateRequest: typings.awsDashSdk.clientsPinpointMod.EmailTemplateRequest
  /**
    * The name of the message template. A template name must start with an alphanumeric character and can contain a maximum of 128 characters. The characters can be alphanumeric characters, underscores (_), or hyphens (-). Template names are case sensitive.
    */
  var TemplateName: __string
}

object UpdateEmailTemplateRequest {
  @scala.inline
  def apply(EmailTemplateRequest: EmailTemplateRequest, TemplateName: __string): UpdateEmailTemplateRequest = {
    val __obj = js.Dynamic.literal(EmailTemplateRequest = EmailTemplateRequest, TemplateName = TemplateName)
  
    __obj.asInstanceOf[UpdateEmailTemplateRequest]
  }
}

