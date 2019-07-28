package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkflowRun extends js.Object {
  /**
    * The date and time when the workflow run completed.
    */
  var CompletedOn: js.UndefOr[TimestampValue] = js.undefined
  /**
    * The graph representing all the AWS Glue components that belong to the workflow as nodes and directed connections between them as edges.
    */
  var Graph: js.UndefOr[WorkflowGraph] = js.undefined
  /**
    * Name of the workflow which was executed.
    */
  var Name: js.UndefOr[NameString] = js.undefined
  /**
    * The date and time when the workflow run was started.
    */
  var StartedOn: js.UndefOr[TimestampValue] = js.undefined
  /**
    * The statistics of the run.
    */
  var Statistics: js.UndefOr[WorkflowRunStatistics] = js.undefined
  /**
    * The status of the workflow run.
    */
  var Status: js.UndefOr[WorkflowRunStatus] = js.undefined
  /**
    * The ID of this workflow run.
    */
  var WorkflowRunId: js.UndefOr[IdString] = js.undefined
  /**
    * The workflow run properties which were set during the run.
    */
  var WorkflowRunProperties: js.UndefOr[typings.awsDashSdk.clientsGlueMod.WorkflowRunProperties] = js.undefined
}

object WorkflowRun {
  @scala.inline
  def apply(
    CompletedOn: TimestampValue = null,
    Graph: WorkflowGraph = null,
    Name: NameString = null,
    StartedOn: TimestampValue = null,
    Statistics: WorkflowRunStatistics = null,
    Status: WorkflowRunStatus = null,
    WorkflowRunId: IdString = null,
    WorkflowRunProperties: WorkflowRunProperties = null
  ): WorkflowRun = {
    val __obj = js.Dynamic.literal()
    if (CompletedOn != null) __obj.updateDynamic("CompletedOn")(CompletedOn)
    if (Graph != null) __obj.updateDynamic("Graph")(Graph)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (StartedOn != null) __obj.updateDynamic("StartedOn")(StartedOn)
    if (Statistics != null) __obj.updateDynamic("Statistics")(Statistics)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (WorkflowRunId != null) __obj.updateDynamic("WorkflowRunId")(WorkflowRunId)
    if (WorkflowRunProperties != null) __obj.updateDynamic("WorkflowRunProperties")(WorkflowRunProperties)
    __obj.asInstanceOf[WorkflowRun]
  }
}

