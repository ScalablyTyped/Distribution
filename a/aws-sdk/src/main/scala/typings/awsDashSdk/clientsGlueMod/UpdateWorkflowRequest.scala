package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateWorkflowRequest extends js.Object {
  /**
    * A collection of properties to be used as part of each execution of the workflow.
    */
  var DefaultRunProperties: js.UndefOr[WorkflowRunProperties] = js.undefined
  /**
    * The description of the workflow.
    */
  var Description: js.UndefOr[GenericString] = js.undefined
  /**
    * Name of the workflow to be updated.
    */
  var Name: NameString
}

object UpdateWorkflowRequest {
  @scala.inline
  def apply(
    Name: NameString,
    DefaultRunProperties: WorkflowRunProperties = null,
    Description: GenericString = null
  ): UpdateWorkflowRequest = {
    val __obj = js.Dynamic.literal(Name = Name)
    if (DefaultRunProperties != null) __obj.updateDynamic("DefaultRunProperties")(DefaultRunProperties)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    __obj.asInstanceOf[UpdateWorkflowRequest]
  }
}

