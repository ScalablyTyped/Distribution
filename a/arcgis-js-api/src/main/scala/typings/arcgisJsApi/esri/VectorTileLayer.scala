package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`vector-tile`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VectorTileLayer
  extends StObject
     with Layer
     with ScaleRangeLayer
     with BlendLayer {
  
  /**
    * The URL that points to the location of the layer's attribution data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#attributionDataUrl)
    */
  val attributionDataUrl: String = js.native
  
  /**
    * Indicates the layer's supported capabilities.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#capabilities)
    */
  val capabilities: VectorTileLayerCapabilities = js.native
  
  /**
    * The current style information of the VectorTileLayer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#currentStyleInfo)
    */
  val currentStyleInfo: VectorTileLayerCurrentStyleInfo = js.native
  
  /**
    * Returns an instance of [layout](https://www.mapbox.com/mapbox-gl-js/style-spec/#layer-layout) properties for the specified [style-layer](https://www.mapbox.com/mapbox-gl-js/style-spec/#layers).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#getLayoutProperties)
    */
  def getLayoutProperties(layer: String): js.Any = js.native
  
  /**
    * Returns an instance of [paint](https://www.mapbox.com/mapbox-gl-js/style-spec/#layer-paint) properties for the specified [style-layer](https://www.mapbox.com/mapbox-gl-js/style-spec/#layers).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#getPaintProperties)
    */
  def getPaintProperties(layer: String): js.Any = js.native
  
  /**
    * Returns the [id](https://www.mapbox.com/mapbox-gl-js/style-spec/#layer-id) of the [style-layer](https://www.mapbox.com/mapbox-gl-js/style-spec/#layers) based on its index.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#getStyleLayerId)
    */
  def getStyleLayerId(index: Double): String = js.native
  
  /**
    * Loads a style to render a layer from the specified URL to a style resource or style JSON object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#loadStyle)
    */
  def loadStyle(style: String): js.Promise[js.Any] = js.native
  def loadStyle(style: String, options: VectorTileLayerLoadStyleOptions): js.Promise[js.Any] = js.native
  def loadStyle(style: js.Any): js.Promise[js.Any] = js.native
  def loadStyle(style: js.Any, options: VectorTileLayerLoadStyleOptions): js.Promise[js.Any] = js.native
  
  /**
    * The portal item from which the layer is loaded.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#portalItem)
    */
  var portalItem: PortalItem = js.native
  
  /**
    * Assigns new [layout](https://www.mapbox.com/mapbox-gl-js/style-spec/#layer-layout) properties to the specified [style-layer](https://www.mapbox.com/mapbox-gl-js/style-spec/#layers).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#setLayoutProperties)
    */
  def setLayoutProperties(layer: String, layout: js.Any): Unit = js.native
  
  /**
    * Assigns new [paint](https://www.mapbox.com/mapbox-gl-js/style-spec/#layer-paint) properties to the specified [style-layer](https://www.mapbox.com/mapbox-gl-js/style-spec/#layers).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#setPaintProperties)
    */
  def setPaintProperties(layer: String, painter: js.Any): Unit = js.native
  
  /**
    * The spatial reference of the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#spatialReference)
    */
  var spatialReference: SpatialReference = js.native
  
  /**
    * A style JSON object of vector tiles that will be used to render the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#style)
    */
  var style: js.Any = js.native
  
  /**
    * The tiling scheme information for the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#tileInfo)
    */
  var tileInfo: TileInfo = js.native
  
  @JSName("type")
  val type_VectorTileLayer: `vector-tile` = js.native
  
  /**
    * The URL to the vector tile service, or the URL to the style resource of vector tiles that will be used to render the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#url)
    */
  var url: String = js.native
}
