package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SketchViewModelProperties extends StObject {
  
  /**
    * Default create options set for the Sketch widget.
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
    * The [GraphicsLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GraphicsLayer.html) associated with the SketchViewModel.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#layer)
    */
  var layer: js.UndefOr[GraphicsLayerProperties] = js.undefined
  
  /**
    * A  [SimpleMarkerSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleMarkerSymbol.html) or [PointSymbol3D](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PointSymbol3D.html) used for representing the point geometry that is being drawn.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#pointSymbol)
    */
  var pointSymbol: js.UndefOr[SimpleMarkerSymbolProperties | PointSymbol3DProperties] = js.undefined
  
  /**
    * A  [SimpleFillSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleFillSymbol.html) or [PolygonSymbol3D](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PolygonSymbol3D.html) used for representing the polygon geometry that is being drawn.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#polygonSymbol)
    */
  var polygonSymbol: js.UndefOr[SimpleFillSymbolProperties | PolygonSymbol3DProperties] = js.undefined
  
  /**
    * A  [SimpleLineSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleLineSymbol.html) or [LineSymbol3D](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbol3D.html) used for representing the polyline geometry that is being drawn.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#polylineSymbol)
    */
  var polylineSymbol: js.UndefOr[SimpleLineSymbolProperties | LineSymbol3DProperties] = js.undefined
  
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
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.undefined
}
object SketchViewModelProperties {
  
  @scala.inline
  def apply(): SketchViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SketchViewModelProperties]
  }
  
  @scala.inline
  implicit class SketchViewModelPropertiesMutableBuilder[Self <: SketchViewModelProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultCreateOptions(value: SketchViewModelDefaultCreateOptions): Self = StObject.set(x, "defaultCreateOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultCreateOptionsUndefined: Self = StObject.set(x, "defaultCreateOptions", js.undefined)
    
    @scala.inline
    def setDefaultUpdateOptions(value: SketchViewModelDefaultUpdateOptions): Self = StObject.set(x, "defaultUpdateOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultUpdateOptionsUndefined: Self = StObject.set(x, "defaultUpdateOptions", js.undefined)
    
    @scala.inline
    def setLayer(value: GraphicsLayerProperties): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerUndefined: Self = StObject.set(x, "layer", js.undefined)
    
    @scala.inline
    def setPointSymbol(value: SimpleMarkerSymbolProperties | PointSymbol3DProperties): Self = StObject.set(x, "pointSymbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointSymbolUndefined: Self = StObject.set(x, "pointSymbol", js.undefined)
    
    @scala.inline
    def setPolygonSymbol(value: SimpleFillSymbolProperties | PolygonSymbol3DProperties): Self = StObject.set(x, "polygonSymbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolygonSymbolUndefined: Self = StObject.set(x, "polygonSymbol", js.undefined)
    
    @scala.inline
    def setPolylineSymbol(value: SimpleLineSymbolProperties | LineSymbol3DProperties): Self = StObject.set(x, "polylineSymbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolylineSymbolUndefined: Self = StObject.set(x, "polylineSymbol", js.undefined)
    
    @scala.inline
    def setUpdateOnGraphicClick(value: Boolean): Self = StObject.set(x, "updateOnGraphicClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateOnGraphicClickUndefined: Self = StObject.set(x, "updateOnGraphicClick", js.undefined)
    
    @scala.inline
    def setView(value: MapViewProperties | SceneViewProperties): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
