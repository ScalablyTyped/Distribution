package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateWorkflowData extends Object {
  /**
    * An array of features to be updated. This is only relevant when there are multiple candidates to update.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-Workflow.html#UpdateWorkflowData)
    */
  var candidates: js.Array[Graphic]
  /**
    * The object that matches the feature being updated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-Workflow.html#UpdateWorkflowData)
    */
  var editableItem: EditableItem
  /**
    * The edits used to keep track of a feature being modified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-Workflow.html#UpdateWorkflowData)
    */
  var edits: Edits
  /**
    * The associated [EditorViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-EditorViewModel.html) for this workflow.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-Workflow.html#UpdateWorkflowData)
    */
  var viewModel: EditorViewModel
}

object UpdateWorkflowData {
  @scala.inline
  def apply(
    candidates: js.Array[Graphic],
    constructor: js.Function,
    editableItem: EditableItem,
    edits: Edits,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    viewModel: EditorViewModel
  ): UpdateWorkflowData = {
    val __obj = js.Dynamic.literal(candidates = candidates, constructor = constructor, editableItem = editableItem, edits = edits, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), viewModel = viewModel)
  
    __obj.asInstanceOf[UpdateWorkflowData]
  }
}

