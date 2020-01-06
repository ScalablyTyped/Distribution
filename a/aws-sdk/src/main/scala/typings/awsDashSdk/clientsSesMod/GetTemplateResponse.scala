package typings.awsDashSdk.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTemplateResponse extends js.Object {
  var Template: js.UndefOr[typings.awsDashSdk.clientsSesMod.Template] = js.native
}

object GetTemplateResponse {
  @scala.inline
  def apply(Template: Template = null): GetTemplateResponse = {
    val __obj = js.Dynamic.literal()
    if (Template != null) __obj.updateDynamic("Template")(Template.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTemplateResponse]
  }
}

