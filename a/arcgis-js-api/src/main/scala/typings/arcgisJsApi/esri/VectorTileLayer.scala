package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisJsApi.arcgisJsApiStrings.`vector-tile`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VectorTileLayer
  extends Layer
     with ScaleRangeLayer {
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
    * The current style information of the VectorTileLayer. See the object specification below.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#currentStyleInfo)
    */
  val currentStyleInfo: VectorTileLayerCurrentStyleInfo = js.native
  /**
    * The portal item from which the layer is loaded. This will load the layer from the portal item, not the vector tile service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#portalItem)
    */
  var portalItem: PortalItem = js.native
  /**
    * The spatial reference of the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#spatialReference)
    */
  var spatialReference: SpatialReference = js.native
  /**
    * A style JSON object of vector tiles that will be used to render the layer. If initializing the layer with a style JSON object, the tiles are fetched from the tile servers specified in the style object.
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
    * The URL to the vector tile service, or the URL to the style resource of vector tiles that will be used to render the layer. If specifying a URL to a style, the tiles are fetched from the tile servers specified in the style object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#url)
    */
  var url: String = js.native
  /**
    * Returns an instance of [layout](https://www.mapbox.com/mapbox-gl-js/style-spec/#layer-layout) properties for the specified [style-layer](https://www.mapbox.com/mapbox-gl-js/style-spec/#layers).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#getLayoutProperties)
    *
    * @param layer The style-layer [id](https://www.mapbox.com/mapbox-gl-js/style-spec/#layer-id) in the VectorTileLayer's [currentStyleInfo.style](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#currentStyleInfo).
    *
    */
  def getLayoutProperties(layer: String): js.Any = js.native
  /**
    * Returns an instance of [paint](https://www.mapbox.com/mapbox-gl-js/style-spec/#layer-paint) properties for the specified [style-layer](https://www.mapbox.com/mapbox-gl-js/style-spec/#layers).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#getPaintProperties)
    *
    * @param layer The style-layer [id](https://www.mapbox.com/mapbox-gl-js/style-spec/#layer-id) in the VectorTileLayer's [currentStyleInfo.style](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#currentStyleInfo).
    *
    */
  def getPaintProperties(layer: String): js.Any = js.native
  /**
    * Returns the [id](https://www.mapbox.com/mapbox-gl-js/style-spec/#layer-id) of the [style-layer](https://www.mapbox.com/mapbox-gl-js/style-spec/#layers) based on its index.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#getStyleLayerId)
    *
    * @param index Index of the style-layer in the VectorTileLayer's [currentStyleInfo.style](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#currentStyleInfo).
    *
    */
  def getStyleLayerId(index: Double): String = js.native
  /**
    * Loads a style to render a layer from the specified URL to a style resource or style JSON object. It is equivalent of changing the entire CSS style sheet for web page. When loading a style, it is the developer's responsibility to make sure that any relative urls in the style resolve correctly.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#loadStyle)
    *
    * @param style The URL to a style of vector tiles or style JSON object.
    * @param options An object with the following properties.
    * @param options.signal Signal object that can be used to abort the asynchronous task. The returned promise will be rejected with an [Error](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Error.html) named `AbortError` when an abort is signaled. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController) for more information on how to construct a controller that can be used to deliver abort signals.
    *
    */
  def loadStyle(style: String): js.Promise[_] = js.native
  def loadStyle(style: String, options: VectorTileLayerLoadStyleOptions): js.Promise[_] = js.native
  def loadStyle(style: js.Any): js.Promise[_] = js.native
  def loadStyle(style: js.Any, options: VectorTileLayerLoadStyleOptions): js.Promise[_] = js.native
  /**
    * Assigns new [layout](https://www.mapbox.com/mapbox-gl-js/style-spec/#layer-layout) properties to the specified [style-layer](https://www.mapbox.com/mapbox-gl-js/style-spec/#layers).
    * > **Known Limitations**  This method is only supported in 2D [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#setLayoutProperties)
    *
    * @param layer The style-layer [id](https://www.mapbox.com/mapbox-gl-js/style-spec/#layer-id) in the VectorTileLayer's [currentStyleInfo.style](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#currentStyleInfo).
    * @param layout An instance of layout properties to assign to the style-layer.
    *
    */
  def setLayoutProperties(layer: String, layout: js.Any): Unit = js.native
  /**
    * Assigns new [paint](https://www.mapbox.com/mapbox-gl-js/style-spec/#layer-paint) properties to the specified [style-layer](https://www.mapbox.com/mapbox-gl-js/style-spec/#layers).
    * > **Known Limitations**  This method is only supported in 2D [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#setPaintProperties)
    *
    * @param layer The style-layer [id](https://www.mapbox.com/mapbox-gl-js/style-spec/#layer-id) in the VectorTileLayer's [currentStyleInfo.style](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#currentStyleInfo).
    * @param painter An instance of paint properties to assign to the specified style-layer.
    *
    */
  def setPaintProperties(layer: String, painter: js.Any): Unit = js.native
}

@JSGlobal("__esri.VectorTileLayer")
@js.native
object VectorTileLayer extends TopLevel[VectorTileLayerConstructor]

