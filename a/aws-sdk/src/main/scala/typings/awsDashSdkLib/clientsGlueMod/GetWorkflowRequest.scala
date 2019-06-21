package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetWorkflowRequest extends js.Object {
  /**
    * Specifies whether to include a graph when returning the workflow resource metadata.
    */
  var IncludeGraph: js.UndefOr[NullableBoolean] = js.undefined
  /**
    * The name of the workflow to retrieve.
    */
  var Name: NameString
}

object GetWorkflowRequest {
  @scala.inline
  def apply(Name: NameString, IncludeGraph: js.UndefOr[NullableBoolean] = js.undefined): GetWorkflowRequest = {
    val __obj = js.Dynamic.literal(Name = Name)
    if (!js.isUndefined(IncludeGraph)) __obj.updateDynamic("IncludeGraph")(IncludeGraph)
    __obj.asInstanceOf[GetWorkflowRequest]
  }
}

