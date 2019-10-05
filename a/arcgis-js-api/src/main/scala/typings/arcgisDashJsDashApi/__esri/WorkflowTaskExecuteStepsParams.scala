package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkflowTaskExecuteStepsParams extends Object {
  /**
    * Indicates whether to automatically execute as many steps as possible, based on the workflow configuration. The default is false, to execute only the current step.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#executeSteps)
    */
  var auto: Boolean
  /**
    * The unique id of the job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#executeSteps)
    */
  var jobId: Double
  /**
    * The array of unique step Ids.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#executeSteps)
    */
  var stepIds: js.Array[Double]
  /**
    * The user name of the user executing the step.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#executeSteps)
    */
  var user: String
}

object WorkflowTaskExecuteStepsParams {
  @scala.inline
  def apply(
    auto: Boolean,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    jobId: Double,
    propertyIsEnumerable: PropertyKey => Boolean,
    stepIds: js.Array[Double],
    user: String
  ): WorkflowTaskExecuteStepsParams = {
    val __obj = js.Dynamic.literal(auto = auto, constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), jobId = jobId, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), stepIds = stepIds, user = user)
  
    __obj.asInstanceOf[WorkflowTaskExecuteStepsParams]
  }
}

