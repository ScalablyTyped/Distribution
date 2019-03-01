package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkflowAnnotationDisplayDetails
  extends stdLib.Object {
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
  var centerX: scala.Double
  /**
    * The Y coordinate of the annotation object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#WorkflowAnnotationDisplayDetails)
    */
  var centerY: scala.Double
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
  var height: scala.Double
  /**
    * The annotation text.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#WorkflowAnnotationDisplayDetails)
    */
  var label: java.lang.String
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
  var width: scala.Double
}

object WorkflowAnnotationDisplayDetails {
  @scala.inline
  def apply(
    OutlineColor: Color,
    centerX: scala.Double,
    centerY: scala.Double,
    constructor: js.Function,
    fillColor: Color,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    height: scala.Double,
    label: java.lang.String,
    labelColor: Color,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    width: scala.Double
  ): WorkflowAnnotationDisplayDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("OutlineColor")(OutlineColor)
    __obj.updateDynamic("centerX")(centerX)
    __obj.updateDynamic("centerY")(centerY)
    __obj.updateDynamic("constructor")(constructor)
    __obj.updateDynamic("fillColor")(fillColor)
    __obj.updateDynamic("hasOwnProperty")(hasOwnProperty)
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("label")(label)
    __obj.updateDynamic("labelColor")(labelColor)
    __obj.updateDynamic("propertyIsEnumerable")(propertyIsEnumerable)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[WorkflowAnnotationDisplayDetails]
  }
}

