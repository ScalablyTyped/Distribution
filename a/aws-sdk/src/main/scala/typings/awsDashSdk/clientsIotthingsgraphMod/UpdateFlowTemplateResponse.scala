package typings.awsDashSdk.clientsIotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateFlowTemplateResponse extends js.Object {
  /**
    * An object containing summary information about the updated workflow.
    */
  var summary: js.UndefOr[FlowTemplateSummary] = js.native
}

object UpdateFlowTemplateResponse {
  @scala.inline
  def apply(summary: FlowTemplateSummary = null): UpdateFlowTemplateResponse = {
    val __obj = js.Dynamic.literal()
    if (summary != null) __obj.updateDynamic("summary")(summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFlowTemplateResponse]
  }
}

