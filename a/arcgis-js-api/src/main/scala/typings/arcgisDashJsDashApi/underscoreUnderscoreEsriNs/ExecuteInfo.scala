package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecuteInfo extends Object {
  /**
    * Information about [conflicts](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#WorkflowConflicts) in workflow step progression.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#ExecuteInfo)
    */
  var conflicts: WorkflowConflicts
  /**
    * The error code returned by the steps in the workflow.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#ExecuteInfo)
    */
  var errorCode: Double
  /**
    * The description for the errors returned by the steps in the workflow.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#ExecuteInfo)
    */
  var errorDescription: String
  /**
    * The result of a step execution.  **Possible Values:** executed | dependent-on-step | dependent-on-stage | dependent-on-status | job-on-hold | step-depends-on-step | check | step-assigned-to-other-user | step-assigned-to-other-group | job-assigned-to-others | job-closed | invalid-platform | invalid-step | dependent-on-job | not-current-step
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#ExecuteInfo)
    */
  var executionResult: String
  /**
    * Indicates whether a step has conflicts.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#ExecuteInfo)
    */
  var hasConflicts: Boolean
  /**
    * Indicates whether a step has return code.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#ExecuteInfo)
    */
  var hasReturnCode: Boolean
  /**
    * The unique id of current job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#ExecuteInfo)
    */
  var jobID: Double
  /**
    * The return code for the current workflow step.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#ExecuteInfo)
    */
  var returnCode: Double
  /**
    * The unique id of the current step in the workflow.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#ExecuteInfo)
    */
  var stepID: Double
  /**
    * Indicates whether the step threw an error during execution.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#ExecuteInfo)
    */
  var threwError: Boolean
}

object ExecuteInfo {
  @scala.inline
  def apply(
    conflicts: WorkflowConflicts,
    constructor: js.Function,
    errorCode: Double,
    errorDescription: String,
    executionResult: String,
    hasConflicts: Boolean,
    hasOwnProperty: PropertyKey => Boolean,
    hasReturnCode: Boolean,
    jobID: Double,
    propertyIsEnumerable: PropertyKey => Boolean,
    returnCode: Double,
    stepID: Double,
    threwError: Boolean
  ): ExecuteInfo = {
    val __obj = js.Dynamic.literal(conflicts = conflicts, constructor = constructor, errorCode = errorCode, errorDescription = errorDescription, executionResult = executionResult, hasConflicts = hasConflicts, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), hasReturnCode = hasReturnCode, jobID = jobID, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), returnCode = returnCode, stepID = stepID, threwError = threwError)
  
    __obj.asInstanceOf[ExecuteInfo]
  }
}

