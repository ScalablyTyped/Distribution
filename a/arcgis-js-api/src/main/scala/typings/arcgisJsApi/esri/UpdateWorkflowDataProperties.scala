package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateWorkflowDataProperties extends js.Object {
  
  /**
    * An array of features to be updated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-UpdateWorkflowData.html#candidates)
    */
  var candidates: js.UndefOr[js.Array[GraphicProperties]] = js.native
  
  /**
    * The object that matches the feature being updated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-UpdateWorkflowData.html#editableItem)
    */
  var editableItem: js.UndefOr[EditableItem] = js.native
  
  /**
    * The [edits](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-Edits.html) used to keep track of a feature being modified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-UpdateWorkflowData.html#edits)
    */
  var edits: js.UndefOr[EditsProperties] = js.native
  
  /**
    * The associated [EditorViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-EditorViewModel.html) for this workflow.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-UpdateWorkflowData.html#viewModel)
    */
  var viewModel: js.UndefOr[EditorViewModelProperties] = js.native
}
object UpdateWorkflowDataProperties {
  
  @scala.inline
  def apply(): UpdateWorkflowDataProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateWorkflowDataProperties]
  }
  
  @scala.inline
  implicit class UpdateWorkflowDataPropertiesOps[Self <: UpdateWorkflowDataProperties] (val x: Self) extends AnyVal {
    
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
    def setCandidatesVarargs(value: GraphicProperties*): Self = this.set("candidates", js.Array(value :_*))
    
    @scala.inline
    def setCandidates(value: js.Array[GraphicProperties]): Self = this.set("candidates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCandidates: Self = this.set("candidates", js.undefined)
    
    @scala.inline
    def setEditableItem(value: EditableItem): Self = this.set("editableItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditableItem: Self = this.set("editableItem", js.undefined)
    
    @scala.inline
    def setEdits(value: EditsProperties): Self = this.set("edits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEdits: Self = this.set("edits", js.undefined)
    
    @scala.inline
    def setViewModel(value: EditorViewModelProperties): Self = this.set("viewModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewModel: Self = this.set("viewModel", js.undefined)
  }
}
