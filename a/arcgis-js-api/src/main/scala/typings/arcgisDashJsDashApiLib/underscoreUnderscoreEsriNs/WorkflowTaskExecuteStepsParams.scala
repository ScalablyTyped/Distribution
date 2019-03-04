package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkflowTaskExecuteStepsParams
  extends stdLib.Object {
  /**
    * Indicates whether to automatically execute as many steps as possible, based on the workflow configuration. The default is false, to execute only the current step.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#executeSteps)
    */
  var auto: scala.Boolean
  /**
    * The unique id of the job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#executeSteps)
    */
  var jobId: scala.Double
  /**
    * The array of unique step Ids.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#executeSteps)
    */
  var stepIds: js.Array[scala.Double]
  /**
    * The user name of the user executing the step.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#executeSteps)
    */
  var user: java.lang.String
}

object WorkflowTaskExecuteStepsParams {
  @scala.inline
  def apply(
    auto: scala.Boolean,
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    jobId: scala.Double,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    stepIds: js.Array[scala.Double],
    user: java.lang.String
  ): WorkflowTaskExecuteStepsParams = {
    val __obj = js.Dynamic.literal(auto = auto, constructor = constructor, hasOwnProperty = hasOwnProperty, jobId = jobId, propertyIsEnumerable = propertyIsEnumerable, stepIds = stepIds, user = user)
  
    __obj.asInstanceOf[WorkflowTaskExecuteStepsParams]
  }
}

