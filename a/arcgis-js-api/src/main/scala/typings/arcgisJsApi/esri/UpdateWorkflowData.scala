package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.TopLevel
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

@JSGlobal("__esri.UpdateWorkflowData")
@js.native
object UpdateWorkflowData extends TopLevel[UpdateWorkflowData]

