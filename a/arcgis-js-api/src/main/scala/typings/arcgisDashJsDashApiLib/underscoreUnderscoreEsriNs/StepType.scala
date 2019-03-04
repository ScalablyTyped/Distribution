package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StepType
  extends stdLib.Object {
  /**
    * The step arguments required at runtime.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#StepType)
    */
  var arguments: java.lang.String
  /**
    * The description of the step type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#StepType)
    */
  var description: java.lang.String
  /**
    * The type of execution for the step.  **Possible Values:** executable | function | procedural | launch-url | question | open-file
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#StepType)
    */
  var executionType: java.lang.String
  /**
    * The unique id for the step type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#StepType)
    */
  var id: scala.Double
  /**
    * The name of the step type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#StepType)
    */
  var name: java.lang.String
  /**
    * The program/application/code that will be executed on this step.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#StepType)
    */
  var program: java.lang.String
  /**
    * The path/URL of the step description.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#StepType)
    */
  var stepDescriptionLink: java.lang.String
  /**
    * The type of step description.  **Possible Values:** none | embedded-html | link
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#StepType)
    */
  var stepDescriptionType: java.lang.String
  /**
    * The shape of the step as it will appear in a workflow graphic.  **Possible Values:** rounded-rectangle | rectangle | oval | diamond | parallelogram
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#StepType)
    */
  var stepIndicatorType: java.lang.String
  /**
    * The platform on which the step can be executed.  **Possible Values:** desktop | server | both
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#StepType)
    */
  var supportedPlatform: java.lang.String
  /**
    * Indicates whether Workflow Manager will be minimized and hidden during step execution.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#StepType)
    */
  var visible: scala.Boolean
}

object StepType {
  @scala.inline
  def apply(
    arguments: java.lang.String,
    constructor: js.Function,
    description: java.lang.String,
    executionType: java.lang.String,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    id: scala.Double,
    name: java.lang.String,
    program: java.lang.String,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    stepDescriptionLink: java.lang.String,
    stepDescriptionType: java.lang.String,
    stepIndicatorType: java.lang.String,
    supportedPlatform: java.lang.String,
    visible: scala.Boolean
  ): StepType = {
    val __obj = js.Dynamic.literal(arguments = arguments, constructor = constructor, description = description, executionType = executionType, hasOwnProperty = hasOwnProperty, id = id, name = name, program = program, propertyIsEnumerable = propertyIsEnumerable, stepDescriptionLink = stepDescriptionLink, stepDescriptionType = stepDescriptionType, stepIndicatorType = stepIndicatorType, supportedPlatform = supportedPlatform, visible = visible)
  
    __obj.asInstanceOf[StepType]
  }
}

