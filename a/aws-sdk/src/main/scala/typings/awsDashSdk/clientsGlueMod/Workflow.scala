package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Workflow extends js.Object {
  /**
    * The date and time when the workflow was created.
    */
  var CreatedOn: js.UndefOr[TimestampValue] = js.undefined
  /**
    * A collection of properties to be used as part of each execution of the workflow.
    */
  var DefaultRunProperties: js.UndefOr[WorkflowRunProperties] = js.undefined
  /**
    * A description of the workflow.
    */
  var Description: js.UndefOr[GenericString] = js.undefined
  /**
    * The graph representing all the AWS Glue components that belong to the workflow as nodes and directed connections between them as edges.
    */
  var Graph: js.UndefOr[WorkflowGraph] = js.undefined
  /**
    * The date and time when the workflow was last modified.
    */
  var LastModifiedOn: js.UndefOr[TimestampValue] = js.undefined
  /**
    * The information about the last execution of the workflow.
    */
  var LastRun: js.UndefOr[WorkflowRun] = js.undefined
  /**
    * The name of the workflow representing the flow.
    */
  var Name: js.UndefOr[NameString] = js.undefined
}

object Workflow {
  @scala.inline
  def apply(
    CreatedOn: TimestampValue = null,
    DefaultRunProperties: WorkflowRunProperties = null,
    Description: GenericString = null,
    Graph: WorkflowGraph = null,
    LastModifiedOn: TimestampValue = null,
    LastRun: WorkflowRun = null,
    Name: NameString = null
  ): Workflow = {
    val __obj = js.Dynamic.literal()
    if (CreatedOn != null) __obj.updateDynamic("CreatedOn")(CreatedOn)
    if (DefaultRunProperties != null) __obj.updateDynamic("DefaultRunProperties")(DefaultRunProperties)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (Graph != null) __obj.updateDynamic("Graph")(Graph)
    if (LastModifiedOn != null) __obj.updateDynamic("LastModifiedOn")(LastModifiedOn)
    if (LastRun != null) __obj.updateDynamic("LastRun")(LastRun)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[Workflow]
  }
}

