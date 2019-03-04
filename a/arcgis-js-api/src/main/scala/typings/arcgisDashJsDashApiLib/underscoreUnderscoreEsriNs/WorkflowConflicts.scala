package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkflowConflicts
  extends stdLib.Object {
  /**
    * The unique id of currently active job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#WorkflowConflicts)
    */
  var jobID: scala.Double
  /**
    * The information about the step in the workflow returned as [WorkflowOption](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#WorkflowOption).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#WorkflowConflicts)
    */
  var options: js.Array[WorkflowOption]
  /**
    * Indicates whether the step will begin a concurrent path in the workflow.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#WorkflowConflicts)
    */
  var spawnsConcurrency: scala.Boolean
  /**
    * The unique id of the step.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#WorkflowConflicts)
    */
  var stepId: scala.Double
}

object WorkflowConflicts {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    jobID: scala.Double,
    options: js.Array[WorkflowOption],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    spawnsConcurrency: scala.Boolean,
    stepId: scala.Double
  ): WorkflowConflicts = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = hasOwnProperty, jobID = jobID, options = options, propertyIsEnumerable = propertyIsEnumerable, spawnsConcurrency = spawnsConcurrency, stepId = stepId)
  
    __obj.asInstanceOf[WorkflowConflicts]
  }
}

