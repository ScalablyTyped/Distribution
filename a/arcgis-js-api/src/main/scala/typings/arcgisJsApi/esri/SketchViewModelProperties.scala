package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SketchViewModelProperties extends js.Object {
  
  /**
    * Default create options set for the Sketch widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#defaultCreateOptions)
    */
  var defaultCreateOptions: js.UndefOr[SketchViewModelDefaultCreateOptions] = js.native
  
  /**
    * Default update options set for the SketchViewModel.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#defaultUpdateOptions)
    */
  var defaultUpdateOptions: js.UndefOr[SketchViewModelDefaultUpdateOptions] = js.native
  
  /**
    * The [GraphicsLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GraphicsLayer.html) associated with the SketchViewModel.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#layer)
    */
  var layer: js.UndefOr[GraphicsLayerProperties] = js.native
  
  /**
    * A  [SimpleMarkerSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleMarkerSymbol.html) or [PointSymbol3D](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PointSymbol3D.html) used for representing the point geometry that is being drawn.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#pointSymbol)
    */
  var pointSymbol: js.UndefOr[SimpleMarkerSymbolProperties | PointSymbol3DProperties] = js.native
  
  /**
    * A  [SimpleFillSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleFillSymbol.html) or [PolygonSymbol3D](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PolygonSymbol3D.html) used for representing the polygon geometry that is being drawn.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#polygonSymbol)
    */
  var polygonSymbol: js.UndefOr[SimpleFillSymbolProperties | PolygonSymbol3DProperties] = js.native
  
  /**
    * A  [SimpleLineSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleLineSymbol.html) or [LineSymbol3D](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbol3D.html) used for representing the polyline geometry that is being drawn.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#polylineSymbol)
    */
  var polylineSymbol: js.UndefOr[SimpleLineSymbolProperties | LineSymbol3DProperties] = js.native
  
  /**
    * Indicates if a graphic can be selected to be updated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#updateOnGraphicClick)
    */
  var updateOnGraphicClick: js.UndefOr[Boolean] = js.native
  
  /**
    * The view in which geometries will be sketched by the user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.native
}
object SketchViewModelProperties {
  
  @scala.inline
  def apply(): SketchViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SketchViewModelProperties]
  }
  
  @scala.inline
  implicit class SketchViewModelPropertiesOps[Self <: SketchViewModelProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDefaultCreateOptions(value: SketchViewModelDefaultCreateOptions): Self = this.set("defaultCreateOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultCreateOptions: Self = this.set("defaultCreateOptions", js.undefined)
    
    @scala.inline
    def setDefaultUpdateOptions(value: SketchViewModelDefaultUpdateOptions): Self = this.set("defaultUpdateOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultUpdateOptions: Self = this.set("defaultUpdateOptions", js.undefined)
    
    @scala.inline
    def setLayer(value: GraphicsLayerProperties): Self = this.set("layer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayer: Self = this.set("layer", js.undefined)
    
    @scala.inline
    def setPointSymbol(value: SimpleMarkerSymbolProperties | PointSymbol3DProperties): Self = this.set("pointSymbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointSymbol: Self = this.set("pointSymbol", js.undefined)
    
    @scala.inline
    def setPolygonSymbol(value: SimpleFillSymbolProperties | PolygonSymbol3DProperties): Self = this.set("polygonSymbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolygonSymbol: Self = this.set("polygonSymbol", js.undefined)
    
    @scala.inline
    def setPolylineSymbol(value: SimpleLineSymbolProperties | LineSymbol3DProperties): Self = this.set("polylineSymbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolylineSymbol: Self = this.set("polylineSymbol", js.undefined)
    
    @scala.inline
    def setUpdateOnGraphicClick(value: Boolean): Self = this.set("updateOnGraphicClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateOnGraphicClick: Self = this.set("updateOnGraphicClick", js.undefined)
    
    @scala.inline
    def setView(value: MapViewProperties | SceneViewProperties): Self = this.set("view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
  }
}
