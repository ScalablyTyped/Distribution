package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkflowTaskMoveToNextStepParams
  extends stdLib.Object {
  /**
    * The unique id of the job Id.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#moveToNextStep)
    */
  var jobId: scala.Double
  /**
    * A numeric value representing the return code.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#moveToNextStep)
    */
  var returnCode: scala.Double
  /**
    * The unique id of the step.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#moveToNextStep)
    */
  var stepId: scala.Double
  /**
    * The user name of the user advancing the workflow to the next step.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#moveToNextStep)
    */
  var user: java.lang.String
}

object WorkflowTaskMoveToNextStepParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    jobId: scala.Double,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    returnCode: scala.Double,
    stepId: scala.Double,
    user: java.lang.String
  ): WorkflowTaskMoveToNextStepParams = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = hasOwnProperty, jobId = jobId, propertyIsEnumerable = propertyIsEnumerable, returnCode = returnCode, stepId = stepId, user = user)
  
    __obj.asInstanceOf[WorkflowTaskMoveToNextStepParams]
  }
}

