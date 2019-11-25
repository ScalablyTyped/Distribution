package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkflowTaskResolveConflictParams extends Object {
  /**
    * The unique id of the job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#resolveConflict)
    */
  var jobId: Double
  /**
    * A numeric value representing the return code from the step where the conflict was encountered.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#resolveConflict)
    */
  var optionReturnCode: Double
  /**
    * An array of unique step IDs of all the possible next steps.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#resolveConflict)
    */
  var optionStepIds: js.Array[Double]
  /**
    * The unique id of the step.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#resolveConflict)
    */
  var stepId: Double
  /**
    * The user name of the user resolving the conflict.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#resolveConflict)
    */
  var user: String
}

object WorkflowTaskResolveConflictParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    jobId: Double,
    optionReturnCode: Double,
    optionStepIds: js.Array[Double],
    propertyIsEnumerable: PropertyKey => Boolean,
    stepId: Double,
    user: String
  ): WorkflowTaskResolveConflictParams = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), jobId = jobId.asInstanceOf[js.Any], optionReturnCode = optionReturnCode.asInstanceOf[js.Any], optionStepIds = optionStepIds.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), stepId = stepId.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WorkflowTaskResolveConflictParams]
  }
}

