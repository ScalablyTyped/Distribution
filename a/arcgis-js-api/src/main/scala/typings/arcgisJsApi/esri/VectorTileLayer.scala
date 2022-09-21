package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`vector-tile`
import typings.arcgisJsApi.arcgisJsApiStrings.none_
import typings.arcgisJsApi.arcgisJsApiStrings.visible
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
    * An authorization string used to access a resource or service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#apiKey)
    */
  var apiKey: String = js.native
  
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
    * A list of custom parameters appended to the URL of all resources fetched by the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#customParameters)
    */
  var customParameters: Any = js.native
  
  /**
    * Deletes the specified [style layer](https://www.mapbox.com/mapbox-gl-js/style-spec/#layers) from the VectorTileLayer's [currentStyleInfo.style](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#currentStyleInfo).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#deleteStyleLayer)
    */
  def deleteStyleLayer(layerId: String): scala.Unit = js.native
  
  /**
    * Returns an instance of [layout](https://www.mapbox.com/mapbox-gl-js/style-spec/#layer-layout) properties for the specified [style layer](https://www.mapbox.com/mapbox-gl-js/style-spec/#layers).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#getLayoutProperties)
    */
  def getLayoutProperties(layerId: String): Any = js.native
  
  /**
    * Returns an instance of [paint](https://www.mapbox.com/mapbox-gl-js/style-spec/#layer-paint) properties for the specified [style layer](https://www.mapbox.com/mapbox-gl-js/style-spec/#layers).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#getPaintProperties)
    */
  def getPaintProperties(layerId: String): Any = js.native
  
  /**
    * Returns an instance of a [style layer](https://docs.mapbox.com/mapbox-gl-js/style-spec/layers/) from the VectorTileLayer's [currentStyleInfo.style](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#currentStyleInfo).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#getStyleLayer)
    */
  def getStyleLayer(layerId: String): Any = js.native
  
  /**
    * Returns the layer [id](https://www.mapbox.com/mapbox-gl-js/style-spec/#layer-id) of the [style layer](https://www.mapbox.com/mapbox-gl-js/style-spec/#layers) based on its index.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#getStyleLayerId)
    */
  def getStyleLayerId(index: Double): String = js.native
  
  /**
    * Returns the index of the [style layer](https://www.mapbox.com/mapbox-gl-js/style-spec/#layers) from the VectorTileLayer's [currentStyleInfo.style](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#currentStyleInfo).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#getStyleLayerIndex)
    */
  def getStyleLayerIndex(layerId: String): Double = js.native
  
  /**
    * Gets the visibility of the specified [style layer](https://www.mapbox.com/mapbox-gl-js/style-spec/#layers) from the VectorTileLayer's [currentStyleInfo.style](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#currentStyleInfo).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#getStyleLayerVisibility)
    */
  def getStyleLayerVisibility(layerId: String): String = js.native
  
  /**
    * Loads a style to render a layer from the specified URL to a style resource or style JSON object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#loadStyle)
    */
  def loadStyle(style: String): js.Promise[Any] = js.native
  def loadStyle(style: String, options: VectorTileLayerLoadStyleOptions): js.Promise[Any] = js.native
  def loadStyle(style: Any): js.Promise[Any] = js.native
  def loadStyle(style: Any, options: VectorTileLayerLoadStyleOptions): js.Promise[Any] = js.native
  
  /**
    * The portal item from which the layer is loaded.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#portalItem)
    */
  var portalItem: PortalItem = js.native
  
  /**
    * Updates the [layout](https://www.mapbox.com/mapbox-gl-js/style-spec/#layer-layout) properties to the specified [style layer](https://www.mapbox.com/mapbox-gl-js/style-spec/#layers).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#setLayoutProperties)
    */
  def setLayoutProperties(layerId: String, layout: Any): scala.Unit = js.native
  
  /**
    * Updates the [paint](https://www.mapbox.com/mapbox-gl-js/style-spec/#layer-paint) properties to the specified [style layer](https://www.mapbox.com/mapbox-gl-js/style-spec/#layers).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#setPaintProperties)
    */
  def setPaintProperties(layerId: String, painter: Any): scala.Unit = js.native
  
  /**
    * Changes the sprite source associated with the VectorTileLayer's [current style](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#currentStyleInfo).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#setSpriteSource)
    */
  def setSpriteSource(spriteUrl: String): js.Promise[SpriteSource] = js.native
  
  /**
    * Changes the layer properties of the specified [style layer](https://www.mapbox.com/mapbox-gl-js/style-spec/#layers).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#setStyleLayer)
    */
  def setStyleLayer(layer: Any): scala.Unit = js.native
  def setStyleLayer(layer: Any, index: Double): scala.Unit = js.native
  
  /**
    * Toggles the visibility of the specified [style layer](https://www.mapbox.com/mapbox-gl-js/style-spec/#layers) in the VectorTileLayer's [currentStyleInfo.style](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#currentStyleInfo).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#setStyleLayerVisibility)
    */
  def setStyleLayerVisibility(layerId: String, visibility: none_ | visible): scala.Unit = js.native
  
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
  var style: Any = js.native
  
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
