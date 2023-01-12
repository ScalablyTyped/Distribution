package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateWorkflowDataProperties extends StObject {
  
  /**
    * This provides the feature template and layer when creating a new feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-CreateWorkflowData.html#creationInfo)
    */
  var creationInfo: js.UndefOr[CreationInfo] = js.undefined
  
  /**
    * The [edits](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-Edits.html) used to keep track of a feature being modified.
    *
    * @deprecated since 4.23. Use {@link module:esri/widgets/Editor/CreateFeaturesWorkflow#pendingFeatures CreateFeaturesWorkflow.pendingFeatures} to access edits made to the workflow data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-CreateWorkflowData.html#edits)
    */
  var edits: js.UndefOr[EditsProperties] = js.undefined
  
  /**
    * The associated [EditorViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-EditorViewModel.html) for this workflow.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-CreateWorkflowData.html#viewModel)
    */
  var viewModel: js.UndefOr[EditorViewModelProperties] = js.undefined
}
object CreateWorkflowDataProperties {
  
  inline def apply(): CreateWorkflowDataProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateWorkflowDataProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateWorkflowDataProperties] (val x: Self) extends AnyVal {
    
    inline def setCreationInfo(value: CreationInfo): Self = StObject.set(x, "creationInfo", value.asInstanceOf[js.Any])
    
    inline def setCreationInfoUndefined: Self = StObject.set(x, "creationInfo", js.undefined)
    
    inline def setEdits(value: EditsProperties): Self = StObject.set(x, "edits", value.asInstanceOf[js.Any])
    
    inline def setEditsUndefined: Self = StObject.set(x, "edits", js.undefined)
    
    inline def setViewModel(value: EditorViewModelProperties): Self = StObject.set(x, "viewModel", value.asInstanceOf[js.Any])
    
    inline def setViewModelUndefined: Self = StObject.set(x, "viewModel", js.undefined)
  }
}
