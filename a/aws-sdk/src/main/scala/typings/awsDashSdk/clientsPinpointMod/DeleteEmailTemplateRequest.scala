package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteEmailTemplateRequest extends js.Object {
  /**
    * The name of the message template. A template name must start with an alphanumeric character and can contain a maximum of 128 characters. The characters can be alphanumeric characters, underscores (_), or hyphens (-). Template names are case sensitive.
    */
  var TemplateName: __string
}

object DeleteEmailTemplateRequest {
  @scala.inline
  def apply(TemplateName: __string): DeleteEmailTemplateRequest = {
    val __obj = js.Dynamic.literal(TemplateName = TemplateName)
  
    __obj.asInstanceOf[DeleteEmailTemplateRequest]
  }
}

