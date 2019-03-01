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
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    jobId: scala.Double,
    optionReturnCode: scala.Double,
    optionStepIds: js.Array[scala.Double],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    stepId: scala.Double,
    user: java.lang.String
  ): WorkflowTaskResolveConflictParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("constructor")(constructor)
    __obj.updateDynamic("hasOwnProperty")(hasOwnProperty)
    __obj.updateDynamic("jobId")(jobId)
    __obj.updateDynamic("optionReturnCode")(optionReturnCode)
    __obj.updateDynamic("optionStepIds")(optionStepIds)
    __obj.updateDynamic("propertyIsEnumerable")(propertyIsEnumerable)
    __obj.updateDynamic("stepId")(stepId)
    __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[WorkflowTaskResolveConflictParams]
  }
}

