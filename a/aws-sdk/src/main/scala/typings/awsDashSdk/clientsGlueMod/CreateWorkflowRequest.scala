package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateWorkflowRequest extends js.Object {
  /**
    * A collection of properties to be used as part of each execution of the workflow.
    */
  var DefaultRunProperties: js.UndefOr[WorkflowRunProperties] = js.undefined
  /**
    * A description of the workflow.
    */
  var Description: js.UndefOr[GenericString] = js.undefined
  /**
    * The name to be assigned to the workflow. It should be unique within your account.
    */
  var Name: NameString
  /**
    * The tags to be used with this workflow.
    */
  var Tags: js.UndefOr[TagsMap] = js.undefined
}

object CreateWorkflowRequest {
  @scala.inline
  def apply(
    Name: NameString,
    DefaultRunProperties: WorkflowRunProperties = null,
    Description: GenericString = null,
    Tags: TagsMap = null
  ): CreateWorkflowRequest = {
    val __obj = js.Dynamic.literal(Name = Name)
    if (DefaultRunProperties != null) __obj.updateDynamic("DefaultRunProperties")(DefaultRunProperties)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[CreateWorkflowRequest]
  }
}

