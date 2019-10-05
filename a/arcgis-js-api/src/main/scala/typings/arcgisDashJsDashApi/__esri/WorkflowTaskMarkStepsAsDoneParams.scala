package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkflowTaskMarkStepsAsDoneParams extends Object {
  /**
    * The unique id of the job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#markStepsAsDone)
    */
  var jobId: Double
  /**
    * The array of unique step Ids.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#markStepsAsDone)
    */
  var stepIds: js.Array[Double]
  /**
    * The user name of the user marking the step complete.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#markStepsAsDone)
    */
  var user: String
}

object WorkflowTaskMarkStepsAsDoneParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    jobId: Double,
    propertyIsEnumerable: PropertyKey => Boolean,
    stepIds: js.Array[Double],
    user: String
  ): WorkflowTaskMarkStepsAsDoneParams = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), jobId = jobId, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), stepIds = stepIds, user = user)
  
    __obj.asInstanceOf[WorkflowTaskMarkStepsAsDoneParams]
  }
}

