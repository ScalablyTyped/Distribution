package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Step
  extends stdLib.Object {
  /**
    * The user or group to whom the step is assigned.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#Step)
    */
  var assignedTo: java.lang.String
  /**
    * Indicates whether the job is assigned to a user, group or unassigned.  **Possible Values:** none | unassigned | user | group
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#Step)
    */
  var assignedType: java.lang.String
  /**
    * Indicates whether the step can be run asynchronously.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#Step)
    */
  var async: scala.Boolean
  /**
    * Indicates whether the step can be automatically executed when reached.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#Step)
    */
  var autoRun: scala.Boolean
  /**
    * Indicates whether the step can be skipped without executing it.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#Step)
    */
  var canSkip: scala.Boolean
  /**
    * Indicates whether the step can start parallel execution of other steps.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#Step)
    */
  var canSpawnConcurrency: scala.Boolean
  /**
    * The unique id of step type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#Step)
    */
  var commonId: scala.Double
  /**
    * The default percentage completion of the job once step is reached.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#Step)
    */
  var defaultPercentComplete: scala.Double
  /**
    * Indicates whether the step has already been executed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#Step)
    */
  var hasBeenExecuted: scala.Boolean
  /**
    * Indicates whether the step has been started.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#Step)
    */
  var hasBeenStarted: scala.Boolean
  /**
    * The unique id generated as the step Id.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#Step)
    */
  var id: scala.Double
  /**
    * The name of the step.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#Step)
    */
  var name: java.lang.String
  /**
    * The type of notification that will be sent when the step finishes execution.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#Step)
    */
  var notificationType: java.lang.String
  /**
    * Indicates whether the step will be automatically marked as complete when complete.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#Step)
    */
  var selfCheck: scala.Boolean
  /**
    * The unique numeric status value configured as the status of the job once step is reached.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#Step)
    */
  var statusId: scala.Double
  /**
    * The percentage completion of the step.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#Step)
    */
  var stepPercentComplete: scala.Double
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
    assignedTo: java.lang.String,
    assignedType: java.lang.String,
    async: scala.Boolean,
    autoRun: scala.Boolean,
    canSkip: scala.Boolean,
    canSpawnConcurrency: scala.Boolean,
    commonId: scala.Double,
    constructor: js.Function,
    defaultPercentComplete: scala.Double,
    hasBeenExecuted: scala.Boolean,
    hasBeenStarted: scala.Boolean,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    id: scala.Double,
    name: java.lang.String,
    notificationType: java.lang.String,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    selfCheck: scala.Boolean,
    statusId: scala.Double,
    stepPercentComplete: scala.Double,
    stepType: StepType
  ): Step = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("assignedTo")(assignedTo)
    __obj.updateDynamic("assignedType")(assignedType)
    __obj.updateDynamic("async")(async)
    __obj.updateDynamic("autoRun")(autoRun)
    __obj.updateDynamic("canSkip")(canSkip)
    __obj.updateDynamic("canSpawnConcurrency")(canSpawnConcurrency)
    __obj.updateDynamic("commonId")(commonId)
    __obj.updateDynamic("constructor")(constructor)
    __obj.updateDynamic("defaultPercentComplete")(defaultPercentComplete)
    __obj.updateDynamic("hasBeenExecuted")(hasBeenExecuted)
    __obj.updateDynamic("hasBeenStarted")(hasBeenStarted)
    __obj.updateDynamic("hasOwnProperty")(hasOwnProperty)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("notificationType")(notificationType)
    __obj.updateDynamic("propertyIsEnumerable")(propertyIsEnumerable)
    __obj.updateDynamic("selfCheck")(selfCheck)
    __obj.updateDynamic("statusId")(statusId)
    __obj.updateDynamic("stepPercentComplete")(stepPercentComplete)
    __obj.updateDynamic("stepType")(stepType)
    __obj.asInstanceOf[Step]
  }
}

