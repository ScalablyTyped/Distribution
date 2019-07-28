package typings.awsDashSdk.clientsIotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateSystemTemplateResponse extends js.Object {
  /**
    * An object containing summary information about the updated system.
    */
  var summary: js.UndefOr[SystemTemplateSummary] = js.undefined
}

object UpdateSystemTemplateResponse {
  @scala.inline
  def apply(summary: SystemTemplateSummary = null): UpdateSystemTemplateResponse = {
    val __obj = js.Dynamic.literal()
    if (summary != null) __obj.updateDynamic("summary")(summary)
    __obj.asInstanceOf[UpdateSystemTemplateResponse]
  }
}

