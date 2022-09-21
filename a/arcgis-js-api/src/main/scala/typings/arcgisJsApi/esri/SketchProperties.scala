package typings.arcgisJsApi.esri

import typings.arcgisJsApi.anon.MapViewPropertiestype2d
import typings.arcgisJsApi.anon.SceneViewPropertiestype3d
import typings.arcgisJsApi.arcgisJsApiStrings.continuous
import typings.arcgisJsApi.arcgisJsApiStrings.horizontal
import typings.arcgisJsApi.arcgisJsApiStrings.single
import typings.arcgisJsApi.arcgisJsApiStrings.update
import typings.arcgisJsApi.arcgisJsApiStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SketchProperties
  extends StObject
     with WidgetProperties {
  
  /**
    * Property controlling the visibility and order of create tool buttons.
    *
    * @default ["point", "polyline", "polygon", "rectangle", "circle"]
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#availableCreateTools)
    */
  var availableCreateTools: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Defines the default behavior once the [create](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#create) operation is completed.
    *
    * @default continuous
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#creationMode)
    */
  var creationMode: js.UndefOr[single | continuous | update] = js.undefined
  
  /**
    * Default create options set for the Sketch widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#defaultCreateOptions)
    */
  var defaultCreateOptions: js.UndefOr[SketchDefaultCreateOptions] = js.undefined
  
  /**
    * Default update options set for the Sketch widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#defaultUpdateOptions)
    */
  var defaultUpdateOptions: js.UndefOr[SketchDefaultUpdateOptions] = js.undefined
  
  /**
    * The Sketch widget's default CSS icon class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#iconClass)
    */
  var iconClass: js.UndefOr[String] = js.undefined
  
  /**
    * Options to configure the labels shown next to each segment of the geometry being created or updated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#labelOptions)
    */
  var labelOptions: js.UndefOr[SketchLabelOptionsProperties] = js.undefined
  
  /**
    * The [GraphicsLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GraphicsLayer.html) associated with the Sketch widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#layer)
    */
  var layer: js.UndefOr[GraphicsLayerProperties] = js.undefined
  
  /**
    * Determines the layout/orientation of the Sketch widget.
    *
    * @default horizontal
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#layout)
    */
  var layout: js.UndefOr[vertical | horizontal] = js.undefined
  
  /**
    * The [SnappingOptions](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-interactive-snapping-SnappingOptions.html) for sketching.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#snappingOptions)
    */
  var snappingOptions: js.UndefOr[SnappingOptionsProperties] = js.undefined
  
  /**
    * Options to configure the tooltip shown next to the cursor when creating or updating graphics.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#tooltipOptions)
    */
  var tooltipOptions: js.UndefOr[SketchTooltipOptionsProperties] = js.undefined
  
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#view)
    */
  var view: js.UndefOr[MapViewPropertiestype2d | SceneViewPropertiestype3d] = js.undefined
  
  /**
    * The view model for the Sketch widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#viewModel)
    */
  var viewModel: js.UndefOr[SketchViewModelProperties] = js.undefined
  
  /**
    * The visible elements that are displayed within the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#visibleElements)
    */
  var visibleElements: js.UndefOr[SketchVisibleElements] = js.undefined
}
object SketchProperties {
  
  inline def apply(): SketchProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SketchProperties]
  }
  
  extension [Self <: SketchProperties](x: Self) {
    
    inline def setAvailableCreateTools(value: js.Array[String]): Self = StObject.set(x, "availableCreateTools", value.asInstanceOf[js.Any])
    
    inline def setAvailableCreateToolsUndefined: Self = StObject.set(x, "availableCreateTools", js.undefined)
    
    inline def setAvailableCreateToolsVarargs(value: String*): Self = StObject.set(x, "availableCreateTools", js.Array(value*))
    
    inline def setCreationMode(value: single | continuous | update): Self = StObject.set(x, "creationMode", value.asInstanceOf[js.Any])
    
    inline def setCreationModeUndefined: Self = StObject.set(x, "creationMode", js.undefined)
    
    inline def setDefaultCreateOptions(value: SketchDefaultCreateOptions): Self = StObject.set(x, "defaultCreateOptions", value.asInstanceOf[js.Any])
    
    inline def setDefaultCreateOptionsUndefined: Self = StObject.set(x, "defaultCreateOptions", js.undefined)
    
    inline def setDefaultUpdateOptions(value: SketchDefaultUpdateOptions): Self = StObject.set(x, "defaultUpdateOptions", value.asInstanceOf[js.Any])
    
    inline def setDefaultUpdateOptionsUndefined: Self = StObject.set(x, "defaultUpdateOptions", js.undefined)
    
    inline def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
    
    inline def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
    
    inline def setLabelOptions(value: SketchLabelOptionsProperties): Self = StObject.set(x, "labelOptions", value.asInstanceOf[js.Any])
    
    inline def setLabelOptionsUndefined: Self = StObject.set(x, "labelOptions", js.undefined)
    
    inline def setLayer(value: GraphicsLayerProperties): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setLayerUndefined: Self = StObject.set(x, "layer", js.undefined)
    
    inline def setLayout(value: vertical | horizontal): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setSnappingOptions(value: SnappingOptionsProperties): Self = StObject.set(x, "snappingOptions", value.asInstanceOf[js.Any])
    
    inline def setSnappingOptionsUndefined: Self = StObject.set(x, "snappingOptions", js.undefined)
    
    inline def setTooltipOptions(value: SketchTooltipOptionsProperties): Self = StObject.set(x, "tooltipOptions", value.asInstanceOf[js.Any])
    
    inline def setTooltipOptionsUndefined: Self = StObject.set(x, "tooltipOptions", js.undefined)
    
    inline def setView(value: MapViewPropertiestype2d | SceneViewPropertiestype3d): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewModel(value: SketchViewModelProperties): Self = StObject.set(x, "viewModel", value.asInstanceOf[js.Any])
    
    inline def setViewModelUndefined: Self = StObject.set(x, "viewModel", js.undefined)
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    
    inline def setVisibleElements(value: SketchVisibleElements): Self = StObject.set(x, "visibleElements", value.asInstanceOf[js.Any])
    
    inline def setVisibleElementsUndefined: Self = StObject.set(x, "visibleElements", js.undefined)
  }
}
