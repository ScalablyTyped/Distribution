package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkflowDisplayDetails
  extends stdLib.Object {
  /**
    * The properties of how the [annotations are displayed](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#WorkflowAnnotationDisplayDetails).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#WorkflowDisplayDetails)
    */
  var annotations: js.Array[WorkflowAnnotationDisplayDetails]
  /**
    * The properties of how the [path are displayed](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#WorkflowPathDisplayDetails).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#WorkflowDisplayDetails)
    */
  var paths: js.Array[WorkflowPathDisplayDetails]
  /**
    * The properties of how the [step are displayed](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#WorkflowStepDisplayDetails).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-WorkflowTask.html#WorkflowDisplayDetails)
    */
  var steps: js.Array[WorkflowStepDisplayDetails]
}

object WorkflowDisplayDetails {
  @scala.inline
  def apply(
    annotations: js.Array[WorkflowAnnotationDisplayDetails],
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    paths: js.Array[WorkflowPathDisplayDetails],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    steps: js.Array[WorkflowStepDisplayDetails]
  ): WorkflowDisplayDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("annotations")(annotations)
    __obj.updateDynamic("constructor")(constructor)
    __obj.updateDynamic("hasOwnProperty")(hasOwnProperty)
    __obj.updateDynamic("paths")(paths)
    __obj.updateDynamic("propertyIsEnumerable")(propertyIsEnumerable)
    __obj.updateDynamic("steps")(steps)
    __obj.asInstanceOf[WorkflowDisplayDetails]
  }
}

