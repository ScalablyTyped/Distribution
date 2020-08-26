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
trait ImageryTileLayer
  extends Layer
     with PortalLayer
     with RefreshableLayer
     with ScaleRangeLayer {
  /**
    * Defines a band combination using 0-based band indexes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryTileLayer.html#bandIds)
    */
  var bandIds: js.Array[Double] = js.native
  /**
    * The copyright text as defined by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryTileLayer.html#copyright)
    */
  var copyright: String = js.native
  /**
    * Defines how to interpolate pixel values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryTileLayer.html#interpolation)
    *
    * @default "nearest"
    */
  var interpolation: nearest | bilinear | cubic | majority = js.native
  /**
    * Indicates whether the layer will be included in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryTileLayer.html#legendEnabled)
    *
    * @default true
    */
  var legendEnabled: Boolean = js.native
  /**
    * Indicates whether to display popups when features in the layer are clicked.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryTileLayer.html#popupEnabled)
    *
    * @default true
    */
  var popupEnabled: Boolean = js.native
  /**
    * The popup template for the layer. When set on the layer, the popupTemplate allows users to access attributes and display their values using text and/or charts in the [view's popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#popup) when a pixel is clicked. See [this sample](https://developers.arcgis.com/javascript/latest/sample-code/layers-imagery-popup/index.html) for an example of how [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) interacts with an [ImageryTileLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryTileLayer.html).  A default popup template is automatically used if no `popupTemplate` has been defined when [Popup.defaultPopupTemplateEnabled](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#defaultPopupTemplateEnabled) is set to `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryTileLayer.html#popupTemplate)
    */
  var popupTemplate: PopupTemplate = js.native
  /**
    * The renderer assigned to the layer. The renderer defines how to visualize pixels in the tile imagery layer. Depending on the renderer type, the pixels may be [stretched](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html) across the color ramp, [classified](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html), have [different symbols](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html) based on values, or show [shaded reliefs](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterShadedReliefRenderer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryTileLayer.html#renderer)
    */
  var renderer: ClassBreaksRenderer | UniqueValueRenderer | RasterStretchRenderer | RasterShadedReliefRenderer | RasterColormapRenderer = js.native
  /**
    * The [tiled image service's metadata JSON](https://developers.arcgis.com/rest/services-reference/image-service.htm) exposed by the ArcGIS REST API. While most commonly used [properties](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryTileLayer.html#properties-summary) are exposed on the ImageryTileLayer class directly, this property gives access to all information returned by the tiled image service. This property is useful if working in an application built using an older version of the API which requires access to image service properties from a more recent version.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryTileLayer.html#sourceJSON)
    */
  var sourceJSON: js.Any = js.native
  /**
    * The tiling scheme information for the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryTileLayer.html#tileInfo)
    */
  var tileInfo: TileInfo = js.native
  @JSName("type")
  val type_ImageryTileLayer: `imagery-tile` = js.native
  /**
    * The URL of the REST endpoint of the layer. The URL may either point to a resource on ArcGIS Enterprise or ArcGIS Online.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryTileLayer.html#url)
    */
  var url: String = js.native
  /**
    * The version of ArcGIS Server in which the image service is published.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryTileLayer.html#version)
    */
  val version: Double = js.native
  /**
    * Creates a default popup template for the layer, populated with all the fields of the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryTileLayer.html#createPopupTemplate)
    *
    * @param options Options for creating the popup template.
    *
    */
  def createPopupTemplate(): PopupTemplate = js.native
  def createPopupTemplate(options: CreatePopupTemplateOptions): PopupTemplate = js.native
  /**
    * Fetch pixels in a given extent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryTileLayer.html#fetchPixels)
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
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryTileLayer.html#fetchTile)
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
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryTileLayer.html#identify)
    *
    * @param pint The given location
    * @param options Optional settings for the tile request.
    *
    */
  def identify(pint: js.Any): js.Promise[_] = js.native
  def identify(pint: js.Any, options: js.Any): js.Promise[_] = js.native
}

