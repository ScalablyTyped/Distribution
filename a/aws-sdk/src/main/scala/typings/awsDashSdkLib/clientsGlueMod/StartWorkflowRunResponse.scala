package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartWorkflowRunResponse extends js.Object {
  /**
    * An Id for the new run.
    */
  var RunId: js.UndefOr[IdString] = js.undefined
}

object StartWorkflowRunResponse {
  @scala.inline
  def apply(RunId: IdString = null): StartWorkflowRunResponse = {
    val __obj = js.Dynamic.literal()
    if (RunId != null) __obj.updateDynamic("RunId")(RunId)
    __obj.asInstanceOf[StartWorkflowRunResponse]
  }
}

