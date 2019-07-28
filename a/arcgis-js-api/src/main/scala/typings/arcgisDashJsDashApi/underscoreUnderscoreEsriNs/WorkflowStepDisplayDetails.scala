package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkflowStepDisplayDetails extends Object {
  /**
    * The outline color.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#WorkflowStepDisplayDetails)
    */
  var OutlineColor: Color
  /**
    * The X coordinate of the step.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#WorkflowStepDisplayDetails)
    */
  var centerX: Double
  /**
    * The Y coordinate of the step.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#WorkflowStepDisplayDetails)
    */
  var centerY: Double
  /**
    * The fill color of the step.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#WorkflowStepDisplayDetails)
    */
  var fillColor: Color
  /**
    * The height of the step.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#WorkflowStepDisplayDetails)
    */
  var height: Double
  /**
    * The step text.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#WorkflowStepDisplayDetails)
    */
  var label: String
  /**
    * The color of step label text.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#WorkflowStepDisplayDetails)
    */
  var labelColor: Color
  /**
    * The shape of the step.  **Possible Values:** rounded-rectangle | rectangle | oval | diamond | parallelogram
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#WorkflowStepDisplayDetails)
    */
  var shape: String
  /**
    * The unique id of the step.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#WorkflowStepDisplayDetails)
    */
  var stepId: Double
  /**
    * The step execution type.  **Possible Values:** executable | function | procedural | launch-url | question | open-file
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#WorkflowStepDisplayDetails)
    */
  var stepType: String
  /**
    * The width of the annotation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#WorkflowStepDisplayDetails)
    */
  var width: Double
}

object WorkflowStepDisplayDetails {
  @scala.inline
  def apply(
    OutlineColor: Color,
    centerX: Double,
    centerY: Double,
    constructor: js.Function,
    fillColor: Color,
    hasOwnProperty: PropertyKey => Boolean,
    height: Double,
    label: String,
    labelColor: Color,
    propertyIsEnumerable: PropertyKey => Boolean,
    shape: String,
    stepId: Double,
    stepType: String,
    width: Double
  ): WorkflowStepDisplayDetails = {
    val __obj = js.Dynamic.literal(OutlineColor = OutlineColor, centerX = centerX, centerY = centerY, constructor = constructor, fillColor = fillColor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), height = height, label = label, labelColor = labelColor, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), shape = shape, stepId = stepId, stepType = stepType, width = width)
  
    __obj.asInstanceOf[WorkflowStepDisplayDetails]
  }
}

