package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Step extends Object {
  /**
    * The user or group to whom the step is assigned.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#Step)
    */
  var assignedTo: String
  /**
    * Indicates whether the job is assigned to a user, group or unassigned.  **Possible Values:** none | unassigned | user | group
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#Step)
    */
  var assignedType: String
  /**
    * Indicates whether the step can be run asynchronously.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#Step)
    */
  var async: Boolean
  /**
    * Indicates whether the step can be automatically executed when reached.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#Step)
    */
  var autoRun: Boolean
  /**
    * Indicates whether the step can be skipped without executing it.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#Step)
    */
  var canSkip: Boolean
  /**
    * Indicates whether the step can start parallel execution of other steps.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#Step)
    */
  var canSpawnConcurrency: Boolean
  /**
    * The unique id of step type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#Step)
    */
  var commonId: Double
  /**
    * The default percentage completion of the job once step is reached.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#Step)
    */
  var defaultPercentComplete: Double
  /**
    * Indicates whether the step has already been executed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#Step)
    */
  var hasBeenExecuted: Boolean
  /**
    * Indicates whether the step has been started.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#Step)
    */
  var hasBeenStarted: Boolean
  /**
    * The unique id generated as the step Id.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#Step)
    */
  var id: Double
  /**
    * The name of the step.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#Step)
    */
  var name: String
  /**
    * The type of notification that will be sent when the step finishes execution.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#Step)
    */
  var notificationType: String
  /**
    * Indicates whether the step will be automatically marked as complete when complete.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#Step)
    */
  var selfCheck: Boolean
  /**
    * The unique numeric status value configured as the status of the job once step is reached.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#Step)
    */
  var statusId: Double
  /**
    * The percentage completion of the step.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#Step)
    */
  var stepPercentComplete: Double
  /**
    * The [step template](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#StepType) for current step.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#Step)
    */
  var stepType: StepType
}

object Step {
  @scala.inline
  def apply(
    assignedTo: String,
    assignedType: String,
    async: Boolean,
    autoRun: Boolean,
    canSkip: Boolean,
    canSpawnConcurrency: Boolean,
    commonId: Double,
    constructor: js.Function,
    defaultPercentComplete: Double,
    hasBeenExecuted: Boolean,
    hasBeenStarted: Boolean,
    hasOwnProperty: PropertyKey => Boolean,
    id: Double,
    name: String,
    notificationType: String,
    propertyIsEnumerable: PropertyKey => Boolean,
    selfCheck: Boolean,
    statusId: Double,
    stepPercentComplete: Double,
    stepType: StepType
  ): Step = {
    val __obj = js.Dynamic.literal(assignedTo = assignedTo, assignedType = assignedType, async = async, autoRun = autoRun, canSkip = canSkip, canSpawnConcurrency = canSpawnConcurrency, commonId = commonId, constructor = constructor, defaultPercentComplete = defaultPercentComplete, hasBeenExecuted = hasBeenExecuted, hasBeenStarted = hasBeenStarted, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), id = id, name = name, notificationType = notificationType, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), selfCheck = selfCheck, statusId = statusId, stepPercentComplete = stepPercentComplete, stepType = stepType)
  
    __obj.asInstanceOf[Step]
  }
}

