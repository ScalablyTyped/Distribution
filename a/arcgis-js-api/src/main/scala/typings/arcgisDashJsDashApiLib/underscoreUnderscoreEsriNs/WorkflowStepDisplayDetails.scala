package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkflowStepDisplayDetails
  extends stdLib.Object {
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
  var centerX: scala.Double
  /**
    * The Y coordinate of the step.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#WorkflowStepDisplayDetails)
    */
  var centerY: scala.Double
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
  var height: scala.Double
  /**
    * The step text.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#WorkflowStepDisplayDetails)
    */
  var label: java.lang.String
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
  var shape: java.lang.String
  /**
    * The unique id of the step.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#WorkflowStepDisplayDetails)
    */
  var stepId: scala.Double
  /**
    * The step execution type.  **Possible Values:** executable | function | procedural | launch-url | question | open-file
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#WorkflowStepDisplayDetails)
    */
  var stepType: java.lang.String
  /**
    * The width of the annotation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#WorkflowStepDisplayDetails)
    */
  var width: scala.Double
}

object WorkflowStepDisplayDetails {
  @scala.inline
  def apply(
    OutlineColor: Color,
    centerX: scala.Double,
    centerY: scala.Double,
    constructor: js.Function,
    fillColor: Color,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    height: scala.Double,
    label: java.lang.String,
    labelColor: Color,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    shape: java.lang.String,
    stepId: scala.Double,
    stepType: java.lang.String,
    width: scala.Double
  ): WorkflowStepDisplayDetails = {
    val __obj = js.Dynamic.literal(OutlineColor = OutlineColor, centerX = centerX, centerY = centerY, constructor = constructor, fillColor = fillColor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), height = height, label = label, labelColor = labelColor, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), shape = shape, stepId = stepId, stepType = stepType, width = width)
  
    __obj.asInstanceOf[WorkflowStepDisplayDetails]
  }
}

