package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateWorkflowRequest extends js.Object {
  /**
    * A collection of properties to be used as part of each execution of the workflow.
    */
  var DefaultRunProperties: js.UndefOr[WorkflowRunProperties] = js.native
  /**
    * The description of the workflow.
    */
  var Description: js.UndefOr[GenericString] = js.native
  /**
    * Name of the workflow to be updated.
    */
  var Name: NameString = js.native
}

object UpdateWorkflowRequest {
  @scala.inline
  def apply(
    Name: NameString,
    DefaultRunProperties: WorkflowRunProperties = null,
    Description: GenericString = null
  ): UpdateWorkflowRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    if (DefaultRunProperties != null) __obj.updateDynamic("DefaultRunProperties")(DefaultRunProperties.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateWorkflowRequest]
  }
}

