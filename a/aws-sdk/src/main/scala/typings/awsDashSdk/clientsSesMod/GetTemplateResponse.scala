package typings.awsDashSdk.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTemplateResponse extends js.Object {
  var Template: js.UndefOr[typings.awsDashSdk.clientsSesMod.Template] = js.undefined
}

object GetTemplateResponse {
  @scala.inline
  def apply(Template: Template = null): GetTemplateResponse = {
    val __obj = js.Dynamic.literal()
    if (Template != null) __obj.updateDynamic("Template")(Template)
    __obj.asInstanceOf[GetTemplateResponse]
  }
}

