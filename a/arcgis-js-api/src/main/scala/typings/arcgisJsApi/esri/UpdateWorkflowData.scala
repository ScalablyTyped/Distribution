package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateWorkflowData extends js.Object {
  /**
    * An array of features to be updated. This is only relevant when there are multiple candidates to update.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-UpdateWorkflowData.html#candidates)
    */
  var candidates: js.Array[Graphic]
  /**
    * The object that matches the feature being updated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-UpdateWorkflowData.html#editableItem)
    */
  var editableItem: EditableItem
  /**
    * The [edits](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-Edits.html) used to keep track of a feature being modified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-UpdateWorkflowData.html#edits)
    */
  var edits: Edits
  /**
    * The associated [EditorViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-EditorViewModel.html) for this workflow.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-UpdateWorkflowData.html#viewModel)
    */
  var viewModel: EditorViewModel
}

object UpdateWorkflowData {
  @scala.inline
  def apply(
    candidates: js.Array[Graphic],
    editableItem: EditableItem,
    edits: Edits,
    viewModel: EditorViewModel
  ): UpdateWorkflowData = {
    val __obj = js.Dynamic.literal(candidates = candidates.asInstanceOf[js.Any], editableItem = editableItem.asInstanceOf[js.Any], edits = edits.asInstanceOf[js.Any], viewModel = viewModel.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateWorkflowData]
  }
}

