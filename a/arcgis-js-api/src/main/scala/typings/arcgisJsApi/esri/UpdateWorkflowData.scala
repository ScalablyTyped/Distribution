package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateWorkflowData extends js.Object {
  /**
    * An array of features to be updated. This is only relevant when there are multiple candidates to update.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-UpdateWorkflowData.html#candidates)
    */
  var candidates: js.Array[Graphic] = js.native
  /**
    * The object that matches the feature being updated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-UpdateWorkflowData.html#editableItem)
    */
  var editableItem: EditableItem = js.native
  /**
    * The [edits](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-Edits.html) used to keep track of a feature being modified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-UpdateWorkflowData.html#edits)
    */
  var edits: Edits = js.native
  /**
    * The associated [EditorViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-EditorViewModel.html) for this workflow.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-UpdateWorkflowData.html#viewModel)
    */
  var viewModel: EditorViewModel = js.native
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
  @scala.inline
  implicit class UpdateWorkflowDataOps[Self <: UpdateWorkflowData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCandidatesVarargs(value: Graphic*): Self = this.set("candidates", js.Array(value :_*))
    @scala.inline
    def setCandidates(value: js.Array[Graphic]): Self = this.set("candidates", value.asInstanceOf[js.Any])
    @scala.inline
    def setEditableItem(value: EditableItem): Self = this.set("editableItem", value.asInstanceOf[js.Any])
    @scala.inline
    def setEdits(value: Edits): Self = this.set("edits", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewModel(value: EditorViewModel): Self = this.set("viewModel", value.asInstanceOf[js.Any])
  }
  
}

