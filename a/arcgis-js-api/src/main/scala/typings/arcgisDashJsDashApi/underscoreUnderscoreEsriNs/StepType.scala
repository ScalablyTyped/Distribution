package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StepType extends Object {
  /**
    * The step arguments required at runtime.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#StepType)
    */
  var arguments: String
  /**
    * The description of the step type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#StepType)
    */
  var description: String
  /**
    * The type of execution for the step.  **Possible Values:** executable | function | procedural | launch-url | question | open-file
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#StepType)
    */
  var executionType: String
  /**
    * The unique id for the step type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#StepType)
    */
  var id: Double
  /**
    * The name of the step type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#StepType)
    */
  var name: String
  /**
    * The program/application/code that will be executed on this step.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#StepType)
    */
  var program: String
  /**
    * The path/URL of the step description.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#StepType)
    */
  var stepDescriptionLink: String
  /**
    * The type of step description.  **Possible Values:** none | embedded-html | link
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#StepType)
    */
  var stepDescriptionType: String
  /**
    * The shape of the step as it will appear in a workflow graphic.  **Possible Values:** rounded-rectangle | rectangle | oval | diamond | parallelogram
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#StepType)
    */
  var stepIndicatorType: String
  /**
    * The platform on which the step can be executed.  **Possible Values:** desktop | server | both
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#StepType)
    */
  var supportedPlatform: String
  /**
    * Indicates whether Workflow Manager will be minimized and hidden during step execution.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#StepType)
    */
  var visible: Boolean
}

object StepType {
  @scala.inline
  def apply(
    arguments: String,
    constructor: js.Function,
    description: String,
    executionType: String,
    hasOwnProperty: PropertyKey => Boolean,
    id: Double,
    name: String,
    program: String,
    propertyIsEnumerable: PropertyKey => Boolean,
    stepDescriptionLink: String,
    stepDescriptionType: String,
    stepIndicatorType: String,
    supportedPlatform: String,
    visible: Boolean
  ): StepType = {
    val __obj = js.Dynamic.literal(arguments = arguments, constructor = constructor, description = description, executionType = executionType, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), id = id, name = name, program = program, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), stepDescriptionLink = stepDescriptionLink, stepDescriptionType = stepDescriptionType, stepIndicatorType = stepIndicatorType, supportedPlatform = supportedPlatform, visible = visible)
  
    __obj.asInstanceOf[StepType]
  }
}

