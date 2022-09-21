package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateWorkflowDataProperties extends StObject {
  
  /**
    * An array of features to be updated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-UpdateWorkflowData.html#candidates)
    */
  var candidates: js.UndefOr[js.Array[GraphicProperties]] = js.undefined
  
  /**
    * The object that matches the feature being updated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-UpdateWorkflowData.html#editableItem)
    */
  var editableItem: js.UndefOr[EditableItem] = js.undefined
  
  /**
    * The [edits](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-Edits.html) used to keep track of a feature being updated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-UpdateWorkflowData.html#edits)
    */
  var edits: js.UndefOr[EditsProperties] = js.undefined
  
  /**
    * The associated [EditorViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-EditorViewModel.html) for this workflow.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-UpdateWorkflowData.html#viewModel)
    */
  var viewModel: js.UndefOr[EditorViewModelProperties] = js.undefined
}
object UpdateWorkflowDataProperties {
  
  inline def apply(): UpdateWorkflowDataProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateWorkflowDataProperties]
  }
  
  extension [Self <: UpdateWorkflowDataProperties](x: Self) {
    
    inline def setCandidates(value: js.Array[GraphicProperties]): Self = StObject.set(x, "candidates", value.asInstanceOf[js.Any])
    
    inline def setCandidatesUndefined: Self = StObject.set(x, "candidates", js.undefined)
    
    inline def setCandidatesVarargs(value: GraphicProperties*): Self = StObject.set(x, "candidates", js.Array(value*))
    
    inline def setEditableItem(value: EditableItem): Self = StObject.set(x, "editableItem", value.asInstanceOf[js.Any])
    
    inline def setEditableItemUndefined: Self = StObject.set(x, "editableItem", js.undefined)
    
    inline def setEdits(value: EditsProperties): Self = StObject.set(x, "edits", value.asInstanceOf[js.Any])
    
    inline def setEditsUndefined: Self = StObject.set(x, "edits", js.undefined)
    
    inline def setViewModel(value: EditorViewModelProperties): Self = StObject.set(x, "viewModel", value.asInstanceOf[js.Any])
    
    inline def setViewModelUndefined: Self = StObject.set(x, "viewModel", js.undefined)
  }
}
