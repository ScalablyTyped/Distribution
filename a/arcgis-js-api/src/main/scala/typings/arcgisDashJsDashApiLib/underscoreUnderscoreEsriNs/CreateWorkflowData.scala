package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateWorkflowData
  extends stdLib.Object {
  /**
    * The [creationInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#CreationInfo) associated with the workflow.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-Workflow.html#CreateWorkflowData)
    */
  var creationInfo: CreationInfo
  /**
    * The edits used to keep track of a feature being modified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-Workflow.html#CreateWorkflowData)
    */
  var edits: Edits
  /**
    * The associated [EditorViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-EditorViewModel.html) for this workflow.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-Workflow.html#CreateWorkflowData)
    */
  var viewModel: EditorViewModel
}

object CreateWorkflowData {
  @scala.inline
  def apply(
    constructor: js.Function,
    creationInfo: CreationInfo,
    edits: Edits,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    viewModel: EditorViewModel
  ): CreateWorkflowData = {
    val __obj = js.Dynamic.literal(constructor = constructor, creationInfo = creationInfo, edits = edits, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), viewModel = viewModel)
  
    __obj.asInstanceOf[CreateWorkflowData]
  }
}

