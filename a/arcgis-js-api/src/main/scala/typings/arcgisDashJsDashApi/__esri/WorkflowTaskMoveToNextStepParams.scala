package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkflowTaskMoveToNextStepParams extends Object {
  /**
    * The unique id of the job Id.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#moveToNextStep)
    */
  var jobId: Double
  /**
    * A numeric value representing the return code.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#moveToNextStep)
    */
  var returnCode: Double
  /**
    * The unique id of the step.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#moveToNextStep)
    */
  var stepId: Double
  /**
    * The user name of the user advancing the workflow to the next step.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#moveToNextStep)
    */
  var user: String
}

object WorkflowTaskMoveToNextStepParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    jobId: Double,
    propertyIsEnumerable: PropertyKey => Boolean,
    returnCode: Double,
    stepId: Double,
    user: String
  ): WorkflowTaskMoveToNextStepParams = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), jobId = jobId.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), returnCode = returnCode.asInstanceOf[js.Any], stepId = stepId.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WorkflowTaskMoveToNextStepParams]
  }
}

