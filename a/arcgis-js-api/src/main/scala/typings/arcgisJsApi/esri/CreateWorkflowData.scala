package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateWorkflowData extends js.Object {
  /**
    * This provides the feature template and layer when creating a new feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-CreateWorkflowData.html#creationInfo)
    */
  var creationInfo: CreationInfo
  /**
    * The [edits](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-Edits.html) used to keep track of a feature being modified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-CreateWorkflowData.html#edits)
    */
  var edits: Edits
  /**
    * The associated [EditorViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-EditorViewModel.html) for this workflow.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-CreateWorkflowData.html#viewModel)
    */
  var viewModel: EditorViewModel
}

object CreateWorkflowData {
  @scala.inline
  def apply(creationInfo: CreationInfo, edits: Edits, viewModel: EditorViewModel): CreateWorkflowData = {
    val __obj = js.Dynamic.literal(creationInfo = creationInfo.asInstanceOf[js.Any], edits = edits.asInstanceOf[js.Any], viewModel = viewModel.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateWorkflowData]
  }
}

