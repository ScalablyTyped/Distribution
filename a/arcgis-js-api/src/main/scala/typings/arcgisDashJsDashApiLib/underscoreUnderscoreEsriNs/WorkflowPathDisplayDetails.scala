package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkflowPathDisplayDetails
  extends stdLib.Object {
  /**
    * The unique id of the step to which the path will lead.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#WorkflowPathDisplayDetails)
    */
  var destStepId: scala.Double
  /**
    * The label associated with the path.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#WorkflowPathDisplayDetails)
    */
  var label: java.lang.String
  /**
    * The color of the label on the path.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#WorkflowPathDisplayDetails)
    */
  var labelColor: Color
  /**
    * The X coordinate of the label.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#WorkflowPathDisplayDetails)
    */
  var labelX: scala.Double
  /**
    * The Y coordinate of the label.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#WorkflowPathDisplayDetails)
    */
  var labelY: scala.Double
  /**
    * The color of the line representing the path.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#WorkflowPathDisplayDetails)
    */
  var lineColor: Color
  /**
    * An object with following properties.
    *
    * Name | Type | Description
    * ---------|--------|-------------
    * isDefault | Boolean | Indicates whether this is the default path(only path) from the source step.
    * numReturnValues | Number[] | The number of possible return values for the path.
    * returnValueX | Number[] | The return values associated with the path.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#WorkflowPathDisplayDetails)
    */
  var pathObject: js.Any
  /**
    * The unique id of the step just executed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#WorkflowPathDisplayDetails)
    */
  var sourceStepID: scala.Double
}

object WorkflowPathDisplayDetails {
  @scala.inline
  def apply(
    constructor: js.Function,
    destStepId: scala.Double,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    label: java.lang.String,
    labelColor: Color,
    labelX: scala.Double,
    labelY: scala.Double,
    lineColor: Color,
    pathObject: js.Any,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    sourceStepID: scala.Double
  ): WorkflowPathDisplayDetails = {
    val __obj = js.Dynamic.literal(constructor = constructor, destStepId = destStepId, hasOwnProperty = hasOwnProperty, label = label, labelColor = labelColor, labelX = labelX, labelY = labelY, lineColor = lineColor, pathObject = pathObject, propertyIsEnumerable = propertyIsEnumerable, sourceStepID = sourceStepID)
  
    __obj.asInstanceOf[WorkflowPathDisplayDetails]
  }
}

