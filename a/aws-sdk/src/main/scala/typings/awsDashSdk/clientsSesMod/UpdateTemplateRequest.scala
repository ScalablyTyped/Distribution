package typings.awsDashSdk.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateTemplateRequest extends js.Object {
  var Template: typings.awsDashSdk.clientsSesMod.Template = js.native
}

object UpdateTemplateRequest {
  @scala.inline
  def apply(Template: Template): UpdateTemplateRequest = {
    val __obj = js.Dynamic.literal(Template = Template.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateTemplateRequest]
  }
}

