package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkflowOption
  extends stdLib.Object {
  /**
    * The return code generated from a step execution.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#WorkflowOption)
    */
  var returnCode: scala.Double
  /**
    * The collection of [descriptions for workflow steps](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#WorkflowStepInfo).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#WorkflowOption)
    */
  var steps: js.Array[WorkflowStepInfo]
}

object WorkflowOption {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    returnCode: scala.Double,
    steps: js.Array[WorkflowStepInfo]
  ): WorkflowOption = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = hasOwnProperty, propertyIsEnumerable = propertyIsEnumerable, returnCode = returnCode, steps = steps)
  
    __obj.asInstanceOf[WorkflowOption]
  }
}

