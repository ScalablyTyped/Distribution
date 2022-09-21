package typings.arcgisJsApi.esri

import typings.arcgisJsApi.anon.CIMSymbolPropertiestypeci
import typings.arcgisJsApi.anon.LineSymbol3DPropertiestyp
import typings.arcgisJsApi.anon.MapViewPropertiestype2d
import typings.arcgisJsApi.anon.PointSymbol3DPropertiesty
import typings.arcgisJsApi.anon.SceneViewPropertiestype3d
import typings.arcgisJsApi.anon.SimpleFillSymbolPropertie
import typings.arcgisJsApi.anon.SimpleLineSymbolPropertie
import typings.arcgisJsApi.anon.SimpleMarkerSymbolPropert
import typings.arcgisJsApi.anon.TextSymbolPropertiestypet
import typings.arcgisJsApi.anon.WebStyleSymbolPropertiest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SketchViewModelProperties extends StObject {
  
  /**
    * The [SimpleFillSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleFillSymbol.html) displayed when actively creating a new `polygon` graphic using the [`polygon`](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#activeTool) tool.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#activeFillSymbol)
    */
  var activeFillSymbol: js.UndefOr[SimpleFillSymbolProperties] = js.undefined
  
  /**
    * Default create options set for the SketchViewModel.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#defaultCreateOptions)
    */
  var defaultCreateOptions: js.UndefOr[SketchViewModelDefaultCreateOptions] = js.undefined
  
  /**
    * Default update options set for the SketchViewModel.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#defaultUpdateOptions)
    */
  var defaultUpdateOptions: js.UndefOr[SketchViewModelDefaultUpdateOptions] = js.undefined
  
  /**
    * Options to configure the labels shown next to each segment of the geometry being created or updated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#labelOptions)
    */
  var labelOptions: js.UndefOr[SketchLabelOptionsProperties] = js.undefined
  
  /**
    * The [GraphicsLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GraphicsLayer.html) associated with the SketchViewModel.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#layer)
    */
  var layer: js.UndefOr[GraphicsLayerProperties] = js.undefined
  
  /**
    * A [SimpleMarkerSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleMarkerSymbol.html), [PointSymbol3D](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PointSymbol3D.html), [TextSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html), [CIMSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html), or [WebStyleSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WebStyleSymbol.html) used for representing the point geometry that is being drawn.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#pointSymbol)
    */
  var pointSymbol: js.UndefOr[
    SimpleMarkerSymbolPropert | PointSymbol3DPropertiesty | TextSymbolPropertiestypet | CIMSymbolPropertiestypeci | WebStyleSymbolPropertiest
  ] = js.undefined
  
  /**
    * A [SimpleFillSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleFillSymbol.html), [PolygonSymbol3D](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PolygonSymbol3D.html), or [CIMSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html) used for representing the polygon geometry that is being drawn.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#polygonSymbol)
    */
  var polygonSymbol: js.UndefOr[
    SimpleFillSymbolPropertie | typings.arcgisJsApi.anon.PolygonSymbol3DProperties | CIMSymbolPropertiestypeci
  ] = js.undefined
  
  /**
    * A [SimpleLineSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleLineSymbol.html), [LineSymbol3D](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbol3D.html), or [CIMSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html) used for representing the polyline geometry that is being drawn.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#polylineSymbol)
    */
  var polylineSymbol: js.UndefOr[
    SimpleLineSymbolPropertie | LineSymbol3DPropertiestyp | CIMSymbolPropertiestypeci
  ] = js.undefined
  
  /**
    * The [SnappingOptions](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-interactive-snapping-SnappingOptions.html) for sketching.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#snappingOptions)
    */
  var snappingOptions: js.UndefOr[SnappingOptionsProperties] = js.undefined
  
  /**
    * Options to configure the tooltip shown next to the cursor when creating or updating graphics.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#tooltipOptions)
    */
  var tooltipOptions: js.UndefOr[SketchTooltipOptionsProperties] = js.undefined
  
  /**
    * Indicates if a graphic can be selected to be updated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#updateOnGraphicClick)
    */
  var updateOnGraphicClick: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The view in which geometries will be sketched by the user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#view)
    */
  var view: js.UndefOr[MapViewPropertiestype2d | SceneViewPropertiestype3d] = js.undefined
}
object SketchViewModelProperties {
  
  inline def apply(): SketchViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SketchViewModelProperties]
  }
  
  extension [Self <: SketchViewModelProperties](x: Self) {
    
    inline def setActiveFillSymbol(value: SimpleFillSymbolProperties): Self = StObject.set(x, "activeFillSymbol", value.asInstanceOf[js.Any])
    
    inline def setActiveFillSymbolUndefined: Self = StObject.set(x, "activeFillSymbol", js.undefined)
    
    inline def setDefaultCreateOptions(value: SketchViewModelDefaultCreateOptions): Self = StObject.set(x, "defaultCreateOptions", value.asInstanceOf[js.Any])
    
    inline def setDefaultCreateOptionsUndefined: Self = StObject.set(x, "defaultCreateOptions", js.undefined)
    
    inline def setDefaultUpdateOptions(value: SketchViewModelDefaultUpdateOptions): Self = StObject.set(x, "defaultUpdateOptions", value.asInstanceOf[js.Any])
    
    inline def setDefaultUpdateOptionsUndefined: Self = StObject.set(x, "defaultUpdateOptions", js.undefined)
    
    inline def setLabelOptions(value: SketchLabelOptionsProperties): Self = StObject.set(x, "labelOptions", value.asInstanceOf[js.Any])
    
    inline def setLabelOptionsUndefined: Self = StObject.set(x, "labelOptions", js.undefined)
    
    inline def setLayer(value: GraphicsLayerProperties): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setLayerUndefined: Self = StObject.set(x, "layer", js.undefined)
    
    inline def setPointSymbol(
      value: SimpleMarkerSymbolPropert | PointSymbol3DPropertiesty | TextSymbolPropertiestypet | CIMSymbolPropertiestypeci | WebStyleSymbolPropertiest
    ): Self = StObject.set(x, "pointSymbol", value.asInstanceOf[js.Any])
    
    inline def setPointSymbolUndefined: Self = StObject.set(x, "pointSymbol", js.undefined)
    
    inline def setPolygonSymbol(
      value: SimpleFillSymbolPropertie | typings.arcgisJsApi.anon.PolygonSymbol3DProperties | CIMSymbolPropertiestypeci
    ): Self = StObject.set(x, "polygonSymbol", value.asInstanceOf[js.Any])
    
    inline def setPolygonSymbolUndefined: Self = StObject.set(x, "polygonSymbol", js.undefined)
    
    inline def setPolylineSymbol(value: SimpleLineSymbolPropertie | LineSymbol3DPropertiestyp | CIMSymbolPropertiestypeci): Self = StObject.set(x, "polylineSymbol", value.asInstanceOf[js.Any])
    
    inline def setPolylineSymbolUndefined: Self = StObject.set(x, "polylineSymbol", js.undefined)
    
    inline def setSnappingOptions(value: SnappingOptionsProperties): Self = StObject.set(x, "snappingOptions", value.asInstanceOf[js.Any])
    
    inline def setSnappingOptionsUndefined: Self = StObject.set(x, "snappingOptions", js.undefined)
    
    inline def setTooltipOptions(value: SketchTooltipOptionsProperties): Self = StObject.set(x, "tooltipOptions", value.asInstanceOf[js.Any])
    
    inline def setTooltipOptionsUndefined: Self = StObject.set(x, "tooltipOptions", js.undefined)
    
    inline def setUpdateOnGraphicClick(value: Boolean): Self = StObject.set(x, "updateOnGraphicClick", value.asInstanceOf[js.Any])
    
    inline def setUpdateOnGraphicClickUndefined: Self = StObject.set(x, "updateOnGraphicClick", js.undefined)
    
    inline def setView(value: MapViewPropertiestype2d | SceneViewPropertiestype3d): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
