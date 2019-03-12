package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkflowTaskGetStepDescriptionParams
  extends stdLib.Object {
  /**
    * The unique id of the job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#getStepDescription)
    */
  var jobId: scala.Double
  /**
    * The unique id of the step.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#getStepDescription)
    */
  var stepId: scala.Double
}

object WorkflowTaskGetStepDescriptionParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    jobId: scala.Double,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    stepId: scala.Double
  ): WorkflowTaskGetStepDescriptionParams = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), jobId = jobId, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), stepId = stepId)
  
    __obj.asInstanceOf[WorkflowTaskGetStepDescriptionParams]
  }
}

