package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisDashJsDashApi.IHandle
import typings.arcgisDashJsDashApi.IPromise
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`layerview-create-error`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`layerview-create`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`layerview-destroy`
import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.arcgisDashJsDashApi.__esri.ArcGISMapService because var conflicts: fullExtent. Inlined capabilities, copyright, legendEnabled, spatialReference, version */ @js.native
trait MapImageLayer
  extends Layer
     with SublayersOwner
     with ScaleRangeLayer
     with RefreshableLayer
     with TemporalLayer {
  /**
    * A flat [Collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) of all the [sublayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html#sublayers) in the MapImageLayer including the sublayers of its sublayers. All sublayers are referenced in the order in which they are drawn in the view (bottom to top).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html#allSublayers)
    */
  val allSublayers: Collection[Sublayer] = js.native
  /**
    * Indicates the layer's supported capabilities.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISMapService.html#capabilities)
    */
  val capabilities: ArcGISMapServiceCapabilities = js.native
  /**
    * The copyright text as defined by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISMapService.html#copyright)
    */
  var copyright: String = js.native
  /**
    * The output dots per inch (DPI) of the MapImageLayer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html#dpi)
    *
    * @default 96
    */
  var dpi: Double = js.native
  /**
    * The version of the geodatabase of the map service data. Read the [Overview of versioning](https://desktop.arcgis.com/en/arcmap/latest/manage-data/geodatabases/an-overview-of-versioning.htm) topic for more details about this capability.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html#gdbVersion)
    */
  var gdbVersion: String = js.native
  /**
    * The output image type.  **Possible Values:** png | png8 | png24 | png32 | jpg | pdf | bmp | gif | svg | pngjpg
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html#imageFormat)
    *
    * @default png24
    */
  var imageFormat: String = js.native
  /**
    * Indicates the maximum height of the image exported by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html#imageMaxHeight)
    *
    * @default 2048
    */
  var imageMaxHeight: Double = js.native
  /**
    * Indicates the maximum width of the image exported by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html#imageMaxWidth)
    *
    * @default 2048
    */
  var imageMaxWidth: Double = js.native
  /**
    * Indicates whether the background of the image exported by the service is transparent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html#imageTransparency)
    *
    * @default true
    */
  var imageTransparency: Boolean = js.native
  /**
    * Indicates whether the layer will be included in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISMapService.html#legendEnabled)
    *
    * @default true
    */
  var legendEnabled: Boolean = js.native
  /**
    * The portal item from which the layer is loaded. This will load the layer along with any overridden properties (e.g. renderers, definition expressions, etc.) saved to the portal item, not the map service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html#portalItem)
    */
  var portalItem: PortalItem = js.native
  /**
    * The spatial reference of the layer as defined by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISMapService.html#spatialReference)
    */
  val spatialReference: SpatialReference = js.native
  /**
    * A [Collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) of [Sublayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html) objects that allow you to alter the properties of one or more sublayers of the MapImageLayer. If this property is not specified, all the sublayers from the service are displayed as defined in the service. If an empty array is passed to this property then none of the sublayers from the service are displayed in the layer.  All sublayers are referenced in the order in which they are drawn in the view (bottom to top). They may be [added](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html#add), [removed](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html#remove), or [reordered](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html#reorder) using the [Collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) methods. Because [Sublayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html) extends [Accessor](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Accessor.html), its properties may be [watched](https://developers.arcgis.com/javascript/latest/guide/working-with-props/index.html#watchProperties).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html#sublayers)
    */
  var sublayers: Collection[Sublayer] = js.native
  /**
    * The URL to the REST endpoint of the map service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html#url)
    */
  var url: String = js.native
  /**
    * The version of ArcGIS Server in which the map service is published.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISMapService.html#version)
    */
  val version: Double = js.native
  /**
    * Gets the parameters of the exported image to use when calling the [export REST operation](https://developers.arcgis.com/rest/services-reference/export-map.htm).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html#createExportImageParameters)
    *
    * @param extent The extent of the exported image
    * @param width The width of the exported image
    * @param height The height of the exported image
    * @param options The parameter options is an object with the following properties.
    * @param options.rotation The rotation in degrees of the exported image. Available since ArcGIS Server 10.3.
    * @param options.pixelRatio The pixel ratio to apply to the dpi of the exported image.
    * @param options.timeExtent The time instant or time extent of content to render.
    *
    */
  def createExportImageParameters(extent: Extent, width: Double, height: Double): js.Any = js.native
  def createExportImageParameters(
    extent: Extent,
    width: Double,
    height: Double,
    options: MapImageLayerCreateExportImageParametersOptions
  ): js.Any = js.native
  /**
    * This method fetches the image for the specified extent and size.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html#fetchImage)
    *
    * @param extent The extent of the view.
    * @param width The width of the view in pixels.
    * @param height The height of the view in pixels.
    * @param options The parameter options is an object with the following properties.
    * @param options.rotation The rotation in degrees of the exported image. Available since ArcGIS Server 10.3.
    * @param options.pixelRatio The ratio of the resolution in physical pixels of the image to the resolution it will be displayed at.
    * @param options.timeExtent The time instant or time extent of content to render.
    * @param options.signal An [AbortSignal](https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal) to abort the request. If canceled, the promise will be rejected with an error named `AbortError`. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController).
    *
    */
  def fetchImage(extent: Extent, width: Double, height: Double): IPromise[HTMLImageElement] = js.native
  def fetchImage(extent: Extent, width: Double, height: Double, options: MapImageLayerFetchImageOptions): IPromise[HTMLImageElement] = js.native
  /**
    * This method returns a URL to an image for a given extent, width and height.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html#getImageUrl)
    *
    * @param extent The extent of the exported image.
    * @param width The width of the view in pixels.
    * @param height The height of the view in pixels.
    * @param options The parameter options is an object with the following properties.
    * @param options.pixelRatio The ratio of the resolution in physical pixels of the image to the resolution it will be displayed at.
    * @param options.rotation The rotation in degrees of the exported image. Available since ArcGIS Server 10.3.
    *
    */
  def getImageUrl(extent: Extent, width: Double, height: Double): IPromise[String] | String = js.native
  def getImageUrl(extent: Extent, width: Double, height: Double, options: MapImageLayerGetImageUrlOptions): IPromise[String] | String = js.native
  @JSName("on")
  def on_layerviewcreate(name: `layerview-create`, eventHandler: MapImageLayerLayerviewCreateEventHandler): IHandle = js.native
  @JSName("on")
  def on_layerviewcreateerror(name: `layerview-create-error`, eventHandler: MapImageLayerLayerviewCreateErrorEventHandler): IHandle = js.native
  @JSName("on")
  def on_layerviewdestroy(name: `layerview-destroy`, eventHandler: MapImageLayerLayerviewDestroyEventHandler): IHandle = js.native
}

@JSGlobal("__esri.MapImageLayer")
@js.native
object MapImageLayer extends TopLevel[MapImageLayerConstructor]

