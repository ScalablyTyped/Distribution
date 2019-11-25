package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateWorkflowData extends Object {
  /**
    * The [creationInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#CreationInfo) provides the feature template and layer when creating a new feature.
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
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    viewModel: EditorViewModel
  ): CreateWorkflowData = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], creationInfo = creationInfo.asInstanceOf[js.Any], edits = edits.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), viewModel = viewModel.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateWorkflowData]
  }
}

