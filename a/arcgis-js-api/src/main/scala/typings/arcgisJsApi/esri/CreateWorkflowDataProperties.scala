package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateWorkflowDataProperties extends StObject {
  
  /**
    * This provides the feature template and layer when creating a new feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-CreateWorkflowData.html#creationInfo)
    */
  var creationInfo: js.UndefOr[CreationInfo] = js.native
  
  /**
    * The [edits](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-Edits.html) used to keep track of a feature being modified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-CreateWorkflowData.html#edits)
    */
  var edits: js.UndefOr[EditsProperties] = js.native
  
  /**
    * The associated [EditorViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-EditorViewModel.html) for this workflow.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-CreateWorkflowData.html#viewModel)
    */
  var viewModel: js.UndefOr[EditorViewModelProperties] = js.native
}
object CreateWorkflowDataProperties {
  
  @scala.inline
  def apply(): CreateWorkflowDataProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateWorkflowDataProperties]
  }
  
  @scala.inline
  implicit class CreateWorkflowDataPropertiesMutableBuilder[Self <: CreateWorkflowDataProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationInfo(value: CreationInfo): Self = StObject.set(x, "creationInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationInfoUndefined: Self = StObject.set(x, "creationInfo", js.undefined)
    
    @scala.inline
    def setEdits(value: EditsProperties): Self = StObject.set(x, "edits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditsUndefined: Self = StObject.set(x, "edits", js.undefined)
    
    @scala.inline
    def setViewModel(value: EditorViewModelProperties): Self = StObject.set(x, "viewModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewModelUndefined: Self = StObject.set(x, "viewModel", js.undefined)
  }
}
