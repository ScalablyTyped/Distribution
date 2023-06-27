package typings.arcgisJsApi.esri

import typings.arcgisJsApi.anon.MapViewPropertiestype2d
import typings.arcgisJsApi.anon.SceneViewPropertiestype3d
import typings.arcgisJsApi.arcgisJsApiStrings.`create-features`
import typings.arcgisJsApi.arcgisJsApiStrings.create
import typings.arcgisJsApi.arcgisJsApiStrings.update
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditorViewModelProperties extends StObject {
  
  /**
  		 * An array of string values which specifies what end users are allowed to edit.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-EditorViewModel.html#allowedWorkflows)
  		 */
  var allowedWorkflows: js.UndefOr[`create-features` | create | update] = js.undefined
  
  /**
  		 * The [AttachmentsViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attachments-AttachmentsViewModel.html) for supporting the editor widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-EditorViewModel.html#attachmentsViewModel)
  		 */
  var attachmentsViewModel: js.UndefOr[AttachmentsViewModelProperties] = js.undefined
  
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
  		 * Options to configure the labels shown next to each segment of the geometry being created or updated.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-EditorViewModel.html#labelOptions)
  		 */
  var labelOptions: js.UndefOr[SketchLabelOptionsProperties] = js.undefined
  
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
  		 * The [SnappingOptions](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-interactive-snapping-SnappingOptions.html) for sketching.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-EditorViewModel.html#snappingOptions)
  		 */
  var snappingOptions: js.UndefOr[SnappingOptionsProperties] = js.undefined
  
  /**
  		 * Options to configure the tooltip shown next to the cursor when creating or updating graphics.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-EditorViewModel.html#tooltipOptions)
  		 */
  var tooltipOptions: js.UndefOr[SketchTooltipOptionsProperties] = js.undefined
  
  /**
  		 * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-EditorViewModel.html#view)
  		 */
  var view: js.UndefOr[MapViewPropertiestype2d | SceneViewPropertiestype3d] = js.undefined
}
object EditorViewModelProperties {
  
  inline def apply(): EditorViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorViewModelProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EditorViewModelProperties] (val x: Self) extends AnyVal {
    
    inline def setAllowedWorkflows(value: `create-features` | create | update): Self = StObject.set(x, "allowedWorkflows", value.asInstanceOf[js.Any])
    
    inline def setAllowedWorkflowsUndefined: Self = StObject.set(x, "allowedWorkflows", js.undefined)
    
    inline def setAttachmentsViewModel(value: AttachmentsViewModelProperties): Self = StObject.set(x, "attachmentsViewModel", value.asInstanceOf[js.Any])
    
    inline def setAttachmentsViewModelUndefined: Self = StObject.set(x, "attachmentsViewModel", js.undefined)
    
    inline def setFeatureFormViewModel(value: FeatureFormViewModelProperties): Self = StObject.set(x, "featureFormViewModel", value.asInstanceOf[js.Any])
    
    inline def setFeatureFormViewModelUndefined: Self = StObject.set(x, "featureFormViewModel", js.undefined)
    
    inline def setFeatureTemplatesViewModel(value: FeatureTemplatesViewModelProperties): Self = StObject.set(x, "featureTemplatesViewModel", value.asInstanceOf[js.Any])
    
    inline def setFeatureTemplatesViewModelUndefined: Self = StObject.set(x, "featureTemplatesViewModel", js.undefined)
    
    inline def setLabelOptions(value: SketchLabelOptionsProperties): Self = StObject.set(x, "labelOptions", value.asInstanceOf[js.Any])
    
    inline def setLabelOptionsUndefined: Self = StObject.set(x, "labelOptions", js.undefined)
    
    inline def setLayerInfos(value: js.Array[LayerInfo]): Self = StObject.set(x, "layerInfos", value.asInstanceOf[js.Any])
    
    inline def setLayerInfosUndefined: Self = StObject.set(x, "layerInfos", js.undefined)
    
    inline def setLayerInfosVarargs(value: LayerInfo*): Self = StObject.set(x, "layerInfos", js.Array(value*))
    
    inline def setSketchViewModel(value: SketchViewModelProperties): Self = StObject.set(x, "sketchViewModel", value.asInstanceOf[js.Any])
    
    inline def setSketchViewModelUndefined: Self = StObject.set(x, "sketchViewModel", js.undefined)
    
    inline def setSnappingOptions(value: SnappingOptionsProperties): Self = StObject.set(x, "snappingOptions", value.asInstanceOf[js.Any])
    
    inline def setSnappingOptionsUndefined: Self = StObject.set(x, "snappingOptions", js.undefined)
    
    inline def setTooltipOptions(value: SketchTooltipOptionsProperties): Self = StObject.set(x, "tooltipOptions", value.asInstanceOf[js.Any])
    
    inline def setTooltipOptionsUndefined: Self = StObject.set(x, "tooltipOptions", js.undefined)
    
    inline def setView(value: MapViewPropertiestype2d | SceneViewPropertiestype3d): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
