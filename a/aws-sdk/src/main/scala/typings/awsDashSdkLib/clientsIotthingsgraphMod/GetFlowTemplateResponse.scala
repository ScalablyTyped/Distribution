package typings
package awsDashSdkLib.clientsIotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetFlowTemplateResponse extends js.Object {
  /**
    * The object that describes the specified workflow.
    */
  var description: js.UndefOr[FlowTemplateDescription] = js.undefined
}

object GetFlowTemplateResponse {
  @scala.inline
  def apply(description: FlowTemplateDescription = null): GetFlowTemplateResponse = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[GetFlowTemplateResponse]
  }
}

