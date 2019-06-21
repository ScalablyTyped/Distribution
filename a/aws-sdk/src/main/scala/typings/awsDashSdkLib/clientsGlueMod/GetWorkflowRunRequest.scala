package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetWorkflowRunRequest extends js.Object {
  /**
    * Specifies whether to include the workflow graph in response or not.
    */
  var IncludeGraph: js.UndefOr[NullableBoolean] = js.undefined
  /**
    * Name of the workflow being run.
    */
  var Name: NameString
  /**
    * The ID of the workflow run.
    */
  var RunId: IdString
}

object GetWorkflowRunRequest {
  @scala.inline
  def apply(Name: NameString, RunId: IdString, IncludeGraph: js.UndefOr[NullableBoolean] = js.undefined): GetWorkflowRunRequest = {
    val __obj = js.Dynamic.literal(Name = Name, RunId = RunId)
    if (!js.isUndefined(IncludeGraph)) __obj.updateDynamic("IncludeGraph")(IncludeGraph)
    __obj.asInstanceOf[GetWorkflowRunRequest]
  }
}

