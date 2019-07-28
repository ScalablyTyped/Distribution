package typings.awsDashSdk.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestRenderTemplateResponse extends js.Object {
  /**
    * The complete MIME message rendered by applying the data in the TemplateData parameter to the template specified in the TemplateName parameter.
    */
  var RenderedTemplate: js.UndefOr[typings.awsDashSdk.clientsSesMod.RenderedTemplate] = js.undefined
}

object TestRenderTemplateResponse {
  @scala.inline
  def apply(RenderedTemplate: RenderedTemplate = null): TestRenderTemplateResponse = {
    val __obj = js.Dynamic.literal()
    if (RenderedTemplate != null) __obj.updateDynamic("RenderedTemplate")(RenderedTemplate)
    __obj.asInstanceOf[TestRenderTemplateResponse]
  }
}

