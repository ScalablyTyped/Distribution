package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateWorkflowData extends js.Object {
  /**
    * This provides the feature template and layer when creating a new feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-CreateWorkflowData.html#creationInfo)
    */
  var creationInfo: CreationInfo = js.native
  /**
    * The [edits](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-Edits.html) used to keep track of a feature being modified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-CreateWorkflowData.html#edits)
    */
  var edits: Edits = js.native
  /**
    * The associated [EditorViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-EditorViewModel.html) for this workflow.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-CreateWorkflowData.html#viewModel)
    */
  var viewModel: EditorViewModel = js.native
}

object CreateWorkflowData {
  @scala.inline
  def apply(creationInfo: CreationInfo, edits: Edits, viewModel: EditorViewModel): CreateWorkflowData = {
    val __obj = js.Dynamic.literal(creationInfo = creationInfo.asInstanceOf[js.Any], edits = edits.asInstanceOf[js.Any], viewModel = viewModel.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateWorkflowData]
  }
  @scala.inline
  implicit class CreateWorkflowDataOps[Self <: CreateWorkflowData] (val x: Self) extends AnyVal {
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
    def setCreationInfo(value: CreationInfo): Self = this.set("creationInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def setEdits(value: Edits): Self = this.set("edits", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewModel(value: EditorViewModel): Self = this.set("viewModel", value.asInstanceOf[js.Any])
  }
  
}

