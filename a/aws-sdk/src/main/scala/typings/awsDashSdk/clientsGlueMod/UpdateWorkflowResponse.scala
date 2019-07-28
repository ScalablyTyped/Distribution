package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateWorkflowResponse extends js.Object {
  /**
    * The name of the workflow which was specified in input.
    */
  var Name: js.UndefOr[NameString] = js.undefined
}

object UpdateWorkflowResponse {
  @scala.inline
  def apply(Name: NameString = null): UpdateWorkflowResponse = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[UpdateWorkflowResponse]
  }
}

