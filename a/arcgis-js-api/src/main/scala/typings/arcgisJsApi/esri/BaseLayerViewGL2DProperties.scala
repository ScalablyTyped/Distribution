package typings.arcgisJsApi.esri

import typings.std.WebGLRenderingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseLayerViewGL2DProperties
  extends StObject
     with LayerViewProperties {
  
  /**
    * The WebGL rendering context associated to this layer view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#context)
    */
  var context: js.UndefOr[WebGLRenderingContext | js.Any] = js.undefined
  
  /**
    * The array of module:esri/views/2d/layers/BaseLayerViewGL2D#Tile objects computed to cover the MapView's visible area.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#tiles)
    */
  var tiles: js.UndefOr[js.Array[BaseLayerViewGL2DTile]] = js.undefined
  
  /**
    * References the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) this [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html) belongs to.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#view)
    */
  var view: js.UndefOr[MapViewProperties] = js.undefined
}
object BaseLayerViewGL2DProperties {
  
  @scala.inline
  def apply(): BaseLayerViewGL2DProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseLayerViewGL2DProperties]
  }
  
  @scala.inline
  implicit class BaseLayerViewGL2DPropertiesMutableBuilder[Self <: BaseLayerViewGL2DProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContext(value: WebGLRenderingContext | js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    @scala.inline
    def setTiles(value: js.Array[BaseLayerViewGL2DTile]): Self = StObject.set(x, "tiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTilesUndefined: Self = StObject.set(x, "tiles", js.undefined)
    
    @scala.inline
    def setTilesVarargs(value: BaseLayerViewGL2DTile*): Self = StObject.set(x, "tiles", js.Array(value :_*))
    
    @scala.inline
    def setView(value: MapViewProperties): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
