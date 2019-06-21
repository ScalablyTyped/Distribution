package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetWorkflowRunPropertiesResponse extends js.Object {
  /**
    * The workflow run properties which were set during the specified run.
    */
  var RunProperties: js.UndefOr[WorkflowRunProperties] = js.undefined
}

object GetWorkflowRunPropertiesResponse {
  @scala.inline
  def apply(RunProperties: WorkflowRunProperties = null): GetWorkflowRunPropertiesResponse = {
    val __obj = js.Dynamic.literal()
    if (RunProperties != null) __obj.updateDynamic("RunProperties")(RunProperties)
    __obj.asInstanceOf[GetWorkflowRunPropertiesResponse]
  }
}

