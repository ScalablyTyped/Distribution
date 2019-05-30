package typings
package awsDashSdkLib.clientsIotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateSystemTemplateResponse extends js.Object {
  /**
    * The summary object that describes the created system.
    */
  var summary: js.UndefOr[SystemTemplateSummary] = js.undefined
}

object CreateSystemTemplateResponse {
  @scala.inline
  def apply(summary: SystemTemplateSummary = null): CreateSystemTemplateResponse = {
    val __obj = js.Dynamic.literal()
    if (summary != null) __obj.updateDynamic("summary")(summary)
    __obj.asInstanceOf[CreateSystemTemplateResponse]
  }
}

