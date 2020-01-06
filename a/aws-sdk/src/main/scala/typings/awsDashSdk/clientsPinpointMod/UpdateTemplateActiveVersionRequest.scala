package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateTemplateActiveVersionRequest extends js.Object {
  var TemplateActiveVersionRequest: typings.awsDashSdk.clientsPinpointMod.TemplateActiveVersionRequest = js.native
  /**
    * The name of the message template. A template name must start with an alphanumeric character and can contain a maximum of 128 characters. The characters can be alphanumeric characters, underscores (_), or hyphens (-). Template names are case sensitive.
    */
  var TemplateName: __string = js.native
  /**
    * The type of channel that the message template is designed for. Valid values are: EMAIL, PUSH, SMS, and VOICE.
    */
  var TemplateType: __string = js.native
}

object UpdateTemplateActiveVersionRequest {
  @scala.inline
  def apply(
    TemplateActiveVersionRequest: TemplateActiveVersionRequest,
    TemplateName: __string,
    TemplateType: __string
  ): UpdateTemplateActiveVersionRequest = {
    val __obj = js.Dynamic.literal(TemplateActiveVersionRequest = TemplateActiveVersionRequest.asInstanceOf[js.Any], TemplateName = TemplateName.asInstanceOf[js.Any], TemplateType = TemplateType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateTemplateActiveVersionRequest]
  }
}

