package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkflowTaskGetStepParams
  extends stdLib.Object {
  /**
    * The unique id of the job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#getStep)
    */
  var jobId: scala.Double
  /**
    * The unique id of the step.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#getStep)
    */
  var stepId: scala.Double
}

object WorkflowTaskGetStepParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    jobId: scala.Double,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    stepId: scala.Double
  ): WorkflowTaskGetStepParams = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = hasOwnProperty, jobId = jobId, propertyIsEnumerable = propertyIsEnumerable, stepId = stepId)
  
    __obj.asInstanceOf[WorkflowTaskGetStepParams]
  }
}

