package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`imagery-tile`
import typings.arcgisJsApi.arcgisJsApiStrings.bilinear
import typings.arcgisJsApi.arcgisJsApiStrings.cubic
import typings.arcgisJsApi.arcgisJsApiStrings.majority
import typings.arcgisJsApi.arcgisJsApiStrings.nearest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TileImageryLayer
  extends Layer
     with PortalLayer
     with RefreshableLayer
     with ScaleRangeLayer {
  /**
    * Defines how to interpolate pixel values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-TileImageryLayer.html#interpolation)
    */
  var interpolation: nearest | bilinear | cubic | majority = js.native
  /**
    * The renderer assigned to the layer. The renderer defines how to visualize pixels in the layer. Depending on the renderer type, the pixels may be stretched across the color ramp, [classified](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html) or have [different symbols](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html) based on values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-TileImageryLayer.html#renderer)
    */
  var renderer: Renderer = js.native
  /**
    * The tiling scheme information for the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-TileImageryLayer.html#tileInfo)
    */
  var tileInfo: TileInfo = js.native
  @JSName("type")
  val type_TileImageryLayer: `imagery-tile` = js.native
  /**
    * The URL of the REST endpoint of the layer. The URL may either point to a resource on ArcGIS Enterprise or ArcGIS Online.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-TileImageryLayer.html#url)
    */
  var url: String = js.native
  /**
    * Creates a default popup template for the layer, populated with all the fields of the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-TileImageryLayer.html#createPopupTemplate)
    *
    * @param options the options.
    * @param options.ignoreFieldTypes field types to ignore when creating the popup. By default the `geometry`, `blob`, `raster`, `guid` and `xml` field types are ignored.
    *
    */
  def createPopupTemplate(): PopupTemplate = js.native
  def createPopupTemplate(options: TileImageryLayerCreatePopupTemplateOptions): PopupTemplate = js.native
  /**
    * Fetch pixels in a given extent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-TileImageryLayer.html#fetchPixels)
    *
    * @param extent
    * @param width
    * @param height
    * @param options
    *
    */
  def fetchPixels(extent: Unit, width: Unit, height: Unit, options: Unit): Unit = js.native
  /**
    * This method fetches a tile for the given level, row and column present in the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-TileImageryLayer.html#fetchTile)
    *
    * @param level Level of detail of the tile to fetch. This value is provided by [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html).
    * @param row The row(y) position of the tile fetch. This value is provided by [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html).
    * @param col The column(x) position of the tile to fetch. This value is provided by [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html).
    * @param options Optional settings for the tile request.
    *
    */
  def fetchTile(level: Double, row: Double, col: Double): js.Promise[_] = js.native
  def fetchTile(level: Double, row: Double, col: Double, options: js.Any): js.Promise[_] = js.native
  /**
    * Identify pixel value at a given location.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-TileImageryLayer.html#identify)
    *
    * @param pint The given location
    * @param options Optional settings for the tile request.
    *
    */
  def identify(pint: js.Any): js.Promise[_] = js.native
  def identify(pint: js.Any, options: js.Any): js.Promise[_] = js.native
}

