package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditorViewModelProperties extends StObject {
  
  /**
    * An array of string values which specifies what end users are allowed to edit.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-EditorViewModel.html#allowedWorkflows)
    */
  var allowedWorkflows: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The [FeatureFormViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FeatureFormViewModel.html) for supporting the editor widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-EditorViewModel.html#featureFormViewModel)
    */
  var featureFormViewModel: js.UndefOr[FeatureFormViewModelProperties] = js.undefined
  
  /**
    * The [FeatureTemplatesViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-FeatureTemplatesViewModel.html) for supporting the editor widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-EditorViewModel.html#featureTemplatesViewModel)
    */
  var featureTemplatesViewModel: js.UndefOr[FeatureTemplatesViewModelProperties] = js.undefined
  
  /**
    * An array of editing configurations for individual layers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-EditorViewModel.html#layerInfos)
    */
  var layerInfos: js.UndefOr[js.Array[LayerInfo]] = js.undefined
  
  /**
    * The [SketchViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html) for supporting the editor widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-EditorViewModel.html#sketchViewModel)
    */
  var sketchViewModel: js.UndefOr[SketchViewModelProperties] = js.undefined
  
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-EditorViewModel.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.undefined
}
object EditorViewModelProperties {
  
  inline def apply(): EditorViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorViewModelProperties]
  }
  
  extension [Self <: EditorViewModelProperties](x: Self) {
    
    inline def setAllowedWorkflows(value: js.Array[String]): Self = StObject.set(x, "allowedWorkflows", value.asInstanceOf[js.Any])
    
    inline def setAllowedWorkflowsUndefined: Self = StObject.set(x, "allowedWorkflows", js.undefined)
    
    inline def setAllowedWorkflowsVarargs(value: String*): Self = StObject.set(x, "allowedWorkflows", js.Array(value :_*))
    
    inline def setFeatureFormViewModel(value: FeatureFormViewModelProperties): Self = StObject.set(x, "featureFormViewModel", value.asInstanceOf[js.Any])
    
    inline def setFeatureFormViewModelUndefined: Self = StObject.set(x, "featureFormViewModel", js.undefined)
    
    inline def setFeatureTemplatesViewModel(value: FeatureTemplatesViewModelProperties): Self = StObject.set(x, "featureTemplatesViewModel", value.asInstanceOf[js.Any])
    
    inline def setFeatureTemplatesViewModelUndefined: Self = StObject.set(x, "featureTemplatesViewModel", js.undefined)
    
    inline def setLayerInfos(value: js.Array[LayerInfo]): Self = StObject.set(x, "layerInfos", value.asInstanceOf[js.Any])
    
    inline def setLayerInfosUndefined: Self = StObject.set(x, "layerInfos", js.undefined)
    
    inline def setLayerInfosVarargs(value: LayerInfo*): Self = StObject.set(x, "layerInfos", js.Array(value :_*))
    
    inline def setSketchViewModel(value: SketchViewModelProperties): Self = StObject.set(x, "sketchViewModel", value.asInstanceOf[js.Any])
    
    inline def setSketchViewModelUndefined: Self = StObject.set(x, "sketchViewModel", js.undefined)
    
    inline def setView(value: MapViewProperties | SceneViewProperties): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
