package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecuteInfo
  extends stdLib.Object {
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
  var errorCode: scala.Double
  /**
    * The description for the errors returned by the steps in the workflow.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#ExecuteInfo)
    */
  var errorDescription: java.lang.String
  /**
    * The result of a step execution.  **Possible Values:** executed | dependent-on-step | dependent-on-stage | dependent-on-status | job-on-hold | step-depends-on-step | check | step-assigned-to-other-user | step-assigned-to-other-group | job-assigned-to-others | job-closed | invalid-platform | invalid-step | dependent-on-job | not-current-step
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#ExecuteInfo)
    */
  var executionResult: java.lang.String
  /**
    * Indicates whether a step has conflicts.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#ExecuteInfo)
    */
  var hasConflicts: scala.Boolean
  /**
    * Indicates whether a step has return code.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#ExecuteInfo)
    */
  var hasReturnCode: scala.Boolean
  /**
    * The unique id of current job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#ExecuteInfo)
    */
  var jobID: scala.Double
  /**
    * The return code for the current workflow step.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#ExecuteInfo)
    */
  var returnCode: scala.Double
  /**
    * The unique id of the current step in the workflow.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#ExecuteInfo)
    */
  var stepID: scala.Double
  /**
    * Indicates whether the step threw an error during execution.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#ExecuteInfo)
    */
  var threwError: scala.Boolean
}

object ExecuteInfo {
  @scala.inline
  def apply(
    conflicts: WorkflowConflicts,
    constructor: js.Function,
    errorCode: scala.Double,
    errorDescription: java.lang.String,
    executionResult: java.lang.String,
    hasConflicts: scala.Boolean,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    hasReturnCode: scala.Boolean,
    jobID: scala.Double,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    returnCode: scala.Double,
    stepID: scala.Double,
    threwError: scala.Boolean
  ): ExecuteInfo = {
    val __obj = js.Dynamic.literal(conflicts = conflicts, constructor = constructor, errorCode = errorCode, errorDescription = errorDescription, executionResult = executionResult, hasConflicts = hasConflicts, hasOwnProperty = hasOwnProperty, hasReturnCode = hasReturnCode, jobID = jobID, propertyIsEnumerable = propertyIsEnumerable, returnCode = returnCode, stepID = stepID, threwError = threwError)
  
    __obj.asInstanceOf[ExecuteInfo]
  }
}

