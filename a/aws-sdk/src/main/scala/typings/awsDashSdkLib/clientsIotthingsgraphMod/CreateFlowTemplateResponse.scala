package typings
package awsDashSdkLib.clientsIotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateFlowTemplateResponse extends js.Object {
  /**
    * The summary object that describes the created workflow.
    */
  var summary: js.UndefOr[FlowTemplateSummary] = js.undefined
}

object CreateFlowTemplateResponse {
  @scala.inline
  def apply(summary: FlowTemplateSummary = null): CreateFlowTemplateResponse = {
    val __obj = js.Dynamic.literal()
    if (summary != null) __obj.updateDynamic("summary")(summary)
    __obj.asInstanceOf[CreateFlowTemplateResponse]
  }
}

