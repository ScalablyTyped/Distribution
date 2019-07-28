package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkflowConflicts extends Object {
  /**
    * The unique id of currently active job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#WorkflowConflicts)
    */
  var jobID: Double
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
  var spawnsConcurrency: Boolean
  /**
    * The unique id of the step.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#WorkflowConflicts)
    */
  var stepId: Double
}

object WorkflowConflicts {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    jobID: Double,
    options: js.Array[WorkflowOption],
    propertyIsEnumerable: PropertyKey => Boolean,
    spawnsConcurrency: Boolean,
    stepId: Double
  ): WorkflowConflicts = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), jobID = jobID, options = options, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), spawnsConcurrency = spawnsConcurrency, stepId = stepId)
  
    __obj.asInstanceOf[WorkflowConflicts]
  }
}

