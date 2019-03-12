package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkflowTaskResolveConflictParams
  extends stdLib.Object {
  /**
    * The unique id of the job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#resolveConflict)
    */
  var jobId: scala.Double
  /**
    * A numeric value representing the return code from the step where the conflict was encountered.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#resolveConflict)
    */
  var optionReturnCode: scala.Double
  /**
    * An array of unique step IDs of all the possible next steps.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#resolveConflict)
    */
  var optionStepIds: js.Array[scala.Double]
  /**
    * The unique id of the step.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#resolveConflict)
    */
  var stepId: scala.Double
  /**
    * The user name of the user resolving the conflict.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#resolveConflict)
    */
  var user: java.lang.String
}

object WorkflowTaskResolveConflictParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    jobId: scala.Double,
    optionReturnCode: scala.Double,
    optionStepIds: js.Array[scala.Double],
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    stepId: scala.Double,
    user: java.lang.String
  ): WorkflowTaskResolveConflictParams = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), jobId = jobId, optionReturnCode = optionReturnCode, optionStepIds = optionStepIds, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), stepId = stepId, user = user)
  
    __obj.asInstanceOf[WorkflowTaskResolveConflictParams]
  }
}

