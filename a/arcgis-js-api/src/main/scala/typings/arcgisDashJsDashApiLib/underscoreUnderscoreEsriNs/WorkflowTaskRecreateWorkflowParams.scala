package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkflowTaskRecreateWorkflowParams
  extends stdLib.Object {
  /**
    * The unique id of the job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#recreateWorkflow)
    */
  var jobId: scala.Double
  /**
    * The user name of the user recreating the workflow.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#recreateWorkflow)
    */
  var user: java.lang.String
}

object WorkflowTaskRecreateWorkflowParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    jobId: scala.Double,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    user: java.lang.String
  ): WorkflowTaskRecreateWorkflowParams = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), jobId = jobId, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), user = user)
  
    __obj.asInstanceOf[WorkflowTaskRecreateWorkflowParams]
  }
}

