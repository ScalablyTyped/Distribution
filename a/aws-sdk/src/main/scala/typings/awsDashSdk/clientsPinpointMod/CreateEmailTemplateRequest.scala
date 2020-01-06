package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateEmailTemplateRequest extends js.Object {
  var EmailTemplateRequest: typings.awsDashSdk.clientsPinpointMod.EmailTemplateRequest = js.native
  /**
    * The name of the message template. A template name must start with an alphanumeric character and can contain a maximum of 128 characters. The characters can be alphanumeric characters, underscores (_), or hyphens (-). Template names are case sensitive.
    */
  var TemplateName: __string = js.native
}

object CreateEmailTemplateRequest {
  @scala.inline
  def apply(EmailTemplateRequest: EmailTemplateRequest, TemplateName: __string): CreateEmailTemplateRequest = {
    val __obj = js.Dynamic.literal(EmailTemplateRequest = EmailTemplateRequest.asInstanceOf[js.Any], TemplateName = TemplateName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateEmailTemplateRequest]
  }
}

