package typings
package awsDashSdkLib.clientsIotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateFlowTemplateResponse extends js.Object {
  /**
    * An object containing summary information about the updated workflow.
    */
  var summary: js.UndefOr[FlowTemplateSummary] = js.undefined
}

object UpdateFlowTemplateResponse {
  @scala.inline
  def apply(summary: FlowTemplateSummary = null): UpdateFlowTemplateResponse = {
    val __obj = js.Dynamic.literal()
    if (summary != null) __obj.updateDynamic("summary")(summary)
    __obj.asInstanceOf[UpdateFlowTemplateResponse]
  }
}

