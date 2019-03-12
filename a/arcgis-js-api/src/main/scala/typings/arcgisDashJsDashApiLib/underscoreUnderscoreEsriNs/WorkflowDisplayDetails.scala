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
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    paths: js.Array[WorkflowPathDisplayDetails],
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    steps: js.Array[WorkflowStepDisplayDetails]
  ): WorkflowDisplayDetails = {
    val __obj = js.Dynamic.literal(annotations = annotations, constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), paths = paths, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), steps = steps)
  
    __obj.asInstanceOf[WorkflowDisplayDetails]
  }
}

