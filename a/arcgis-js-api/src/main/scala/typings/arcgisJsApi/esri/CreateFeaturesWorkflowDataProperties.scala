package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFeaturesWorkflowDataProperties extends StObject {
  
  /**
    * This provides the feature template and layer when creating a new feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-CreateFeaturesWorkflowData.html#creationInfo)
    */
  var creationInfo: js.UndefOr[CreationInfo] = js.undefined
  
  /**
    * The associated [EditorViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-EditorViewModel.html) for this workflow.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-CreateFeaturesWorkflowData.html#viewModel)
    */
  var viewModel: js.UndefOr[EditorViewModelProperties] = js.undefined
}
object CreateFeaturesWorkflowDataProperties {
  
  inline def apply(): CreateFeaturesWorkflowDataProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFeaturesWorkflowDataProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateFeaturesWorkflowDataProperties] (val x: Self) extends AnyVal {
    
    inline def setCreationInfo(value: CreationInfo): Self = StObject.set(x, "creationInfo", value.asInstanceOf[js.Any])
    
    inline def setCreationInfoUndefined: Self = StObject.set(x, "creationInfo", js.undefined)
    
    inline def setViewModel(value: EditorViewModelProperties): Self = StObject.set(x, "viewModel", value.asInstanceOf[js.Any])
    
    inline def setViewModelUndefined: Self = StObject.set(x, "viewModel", js.undefined)
  }
}
