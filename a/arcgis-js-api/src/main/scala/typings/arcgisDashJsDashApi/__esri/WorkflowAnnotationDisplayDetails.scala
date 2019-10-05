package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkflowAnnotationDisplayDetails extends Object {
  /**
    * The outline color.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#WorkflowAnnotationDisplayDetails)
    */
  var OutlineColor: Color
  /**
    * The X coordinate of the annotation object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#WorkflowAnnotationDisplayDetails)
    */
  var centerX: Double
  /**
    * The Y coordinate of the annotation object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#WorkflowAnnotationDisplayDetails)
    */
  var centerY: Double
  /**
    * The fill color of the annotation object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#WorkflowAnnotationDisplayDetails)
    */
  var fillColor: Color
  /**
    * The height of the annotation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#WorkflowAnnotationDisplayDetails)
    */
  var height: Double
  /**
    * The annotation text.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#WorkflowAnnotationDisplayDetails)
    */
  var label: String
  /**
    * The color of annotation label text.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#WorkflowAnnotationDisplayDetails)
    */
  var labelColor: Color
  /**
    * The width of the annotation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#WorkflowAnnotationDisplayDetails)
    */
  var width: Double
}

object WorkflowAnnotationDisplayDetails {
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
    width: Double
  ): WorkflowAnnotationDisplayDetails = {
    val __obj = js.Dynamic.literal(OutlineColor = OutlineColor, centerX = centerX, centerY = centerY, constructor = constructor, fillColor = fillColor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), height = height, label = label, labelColor = labelColor, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), width = width)
  
    __obj.asInstanceOf[WorkflowAnnotationDisplayDetails]
  }
}

