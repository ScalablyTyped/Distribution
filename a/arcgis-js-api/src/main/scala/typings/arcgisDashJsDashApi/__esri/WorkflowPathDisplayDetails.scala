package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkflowPathDisplayDetails extends Object {
  /**
    * The unique id of the step to which the path will lead.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#WorkflowPathDisplayDetails)
    */
  var destStepId: Double
  /**
    * The label associated with the path.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#WorkflowPathDisplayDetails)
    */
  var label: String
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
  var labelX: Double
  /**
    * The Y coordinate of the label.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#WorkflowPathDisplayDetails)
    */
  var labelY: Double
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
  var sourceStepID: Double
}

object WorkflowPathDisplayDetails {
  @scala.inline
  def apply(
    constructor: js.Function,
    destStepId: Double,
    hasOwnProperty: PropertyKey => Boolean,
    label: String,
    labelColor: Color,
    labelX: Double,
    labelY: Double,
    lineColor: Color,
    pathObject: js.Any,
    propertyIsEnumerable: PropertyKey => Boolean,
    sourceStepID: Double
  ): WorkflowPathDisplayDetails = {
    val __obj = js.Dynamic.literal(constructor = constructor, destStepId = destStepId, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), label = label, labelColor = labelColor, labelX = labelX, labelY = labelY, lineColor = lineColor, pathObject = pathObject, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), sourceStepID = sourceStepID)
  
    __obj.asInstanceOf[WorkflowPathDisplayDetails]
  }
}

