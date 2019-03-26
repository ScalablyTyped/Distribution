package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.ArcGISImageService because var conflicts: fullExtent. Inlined compressionQuality, compressionTolerance, copyright, definitionExpression, domainFields, fields, format, hasMultidimensions, hasRasterAttributeTable, imageMaxHeight, imageMaxWidth, mosaicRule, multidimensionalInfo, pixelType, popupTemplate, rasterAttributeTable, rasterAttributeTableFieldPrefix, rasterFields, renderingRule, spatialReference, url, version, fetchImage */ @js.native
trait ImageryLayer
  extends Layer
     with ScaleRangeLayer
     with RefreshableLayer {
  /**
    * The compression quality value. This controls how much loss the image will be subjected to. Only valid when using `jpg` [image format](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#format).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#compressionQuality)
    */
  var compressionQuality: scala.Double = js.native
  /**
    * The output image compression tolerance value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#compressionTolerance)
    *
    * @default 0.01
    */
  var compressionTolerance: scala.Double = js.native
  /**
    * The copyright text as defined by the image service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#copyright)
    */
  var copyright: java.lang.String = js.native
  /**
    * The SQL where clause used to filter rasters on the client. Only the rasters that satisfy the definition expression are displayed in the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#definitionExpression)
    */
  var definitionExpression: java.lang.String = js.native
  /**
    * An array of fields in the layer for which a [Domain](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Domain.html) has been defined.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#domainFields)
    */
  var domainFields: js.Array[Field] = js.native
  /**
    * An array of fields in the layer. Each field represents an attribute that may contain a value for each raster in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#fields)
    */
  var fields: js.Array[Field] = js.native
  /**
    * The output image type. The default value is `lerc` if a [pixelFilter](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#pixelFilter) is set on the layer.  **Possible Values:** png | png8 | png24 | png32 | jpg | bmp | gif | jpgpng | lerc
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#format)
    *
    * @default jpgpng
    */
  var format: java.lang.String = js.native
  /**
    * Indicates if the Image Service has [multidimensionalInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#multidimensionalInfo).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#hasMultidimensions)
    */
  var hasMultidimensions: scala.Boolean = js.native
  /**
    * Indicates if the Image Service has a [raster attribute table](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#rasterAttributeTable). If `true`, the raster attribute table can be accessed with the [rasterAttributeTable](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#rasterAttributeTable) property after the layer has [loaded](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#loaded).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#hasRasterAttributeTable)
    */
  var hasRasterAttributeTable: scala.Boolean = js.native
  /**
    * Indicates the maximum height of the image exported by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#imageMaxHeight)
    *
    * @default 4100
    */
  var imageMaxHeight: scala.Double = js.native
  /**
    * Indicates the maximum width of the image exported by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#imageMaxWidth)
    *
    * @default 15000
    */
  var imageMaxWidth: scala.Double = js.native
  /**
    * Defines how overlapping images should be mosaicked.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#mosaicRule)
    */
  var mosaicRule: MosaicRule = js.native
  /**
    * The multidimensional information associated with the service. This will have a value if `serviceInfo` has `hasMultidimensionalInfo = true`.  If defined, multidimensional information contains various "dimensions" of data for a particular value, such as time, depth, altitude, etc. Defining slices of particular dimensions in the layer is handled with the [multidimensionalDefinition](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#multidimensionalDefinition) property of the [mosaicRule](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#mosaicRule).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#multidimensionalInfo)
    */
  var multidimensionalInfo: js.Any = js.native
  /**
    * A function that processes [pixelData](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-ImageryLayerView.html#pixelData). The `pixelData` object contains a [pixelBlock](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-PixelBlock.html) property that gives you access to all of the pixels in the raster on the client.  Inside the `pixelFilter` you may loop through all the [pixels](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-PixelBlock.html#pixels) found in the `pixelBlock` property of the `pixelData` object and process them. This function may be used to hide some pixels from the view, alter their values, and change their color.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html#pixelFilter)
    */
  var pixelFilter: js.Function = js.native
  /**
    * The pixel type.  **Possible Values:** s8 | s16 | s32 | u8 | u16 | u32 | f32 | f64
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#pixelType)
    */
  var pixelType: java.lang.String = js.native
  /**
    * Indicates whether to display popups when the layer is clicked.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html#popupEnabled)
    *
    * @default true
    */
  var popupEnabled: scala.Boolean = js.native
  /**
    * The popup template for the layer. When set on the layer, the popupTemplate allows users to access attributes and display their values using text and/or charts in the [view's popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#popup) when a pixel is clicked. See [this sample](https://developers.arcgis.com/javascript/latest/sample-code/layers-imagery-popup/index.html) for an example of how [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) interacts with an [ImageryLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#popupTemplate)
    */
  var popupTemplate: PopupTemplate = js.native
  /**
    * The portal item from which the layer is loaded.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html#portalItem)
    */
  var portalItem: PortalItem = js.native
  /**
    * The raster attribute table associated with the service. To access the raster attribute table, the layer must be [loaded](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#loaded).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#rasterAttributeTable)
    */
  var rasterAttributeTable: js.Any = js.native
  /**
    * Prefix used to define the fields from the raster attribute table. It's primarily used for [popups](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#rasterAttributeTableFieldPrefix)
    *
    * @default Raster.
    */
  var rasterAttributeTableFieldPrefix: java.lang.String = js.native
  /**
    * A complete list of fields that consists of fields from the layer, pixel value fields and the attribute table fields.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#rasterFields)
    */
  var rasterFields: js.Array[Field] = js.native
  /**
    * Specifies the rule for how the requested image should be rendered.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#renderingRule)
    */
  var renderingRule: RasterFunction = js.native
  /**
    * The spatial reference of the image service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#spatialReference)
    */
  val spatialReference: SpatialReference = js.native
  /**
    * Token generated by the token service using the specified userId and password. The recommended approach to pass a token on a layer is to use [IdentityManager.registerToken()](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-IdentityManager.html#registerToken).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html#token)
    */
  val token: java.lang.String = js.native
  /**
    * The URL to the REST endpoint of the layer. The URL may either point to a resource on ArcGIS Enterprise or ArcGIS Online.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#url)
    */
  var url: java.lang.String = js.native
  /**
    * The version of ArcGIS Server in which the image service is published.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#version)
    */
  val version: scala.Double = js.native
  /**
    * Returns an image using the [export REST operation](https://developers.arcgis.com/rest/services-reference/export-image.htm) that displays data from an [ImageryLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#fetchImage)
    *
    * @param extent The extent of the image to export.
    * @param width The width of the image in pixels.
    * @param height The height of the image in pixels.
    *
    */
  def fetchImage(extent: Extent, width: scala.Double, height: scala.Double): arcgisDashJsDashApiLib.IPromise[_] = js.native
  @JSName("on")
  def `on_layerview-create`(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`layerview-create`,
    eventHandler: ImageryLayerLayerviewCreateEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
  @JSName("on")
  def `on_layerview-destroy`(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`layerview-destroy`,
    eventHandler: ImageryLayerLayerviewDestroyEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
  /**
    * Executes the [pixelFilter](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html#pixelFilter) function and redraws the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html#redraw)
    *
    *
    */
  def redraw(): scala.Unit = js.native
}

@JSGlobal("__esri.ImageryLayer")
@js.native
/**
  * Represents an image service resource as a layer. An ImageryLayer retrieves and displays data from image services. ImageryLayer allows you to and apply client side [pixel filtering](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html#pixelFilter), server defined or client-defined [rendering rules](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html#renderingRule) (e.g. remap, colormap), and [mosaic rules](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html#mosaicRule). This layer is particularly useful when you need to interactively change pixel manipulation criteria and get an immediate response on the client.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html)
  */
class ImageryLayerCls () extends ImageryLayer {
  def this(properties: ImageryLayerProperties) = this()
  /**
    * The maximum scale (most zoomed in) at which the layer is visible in the view. If the map is zoomed in beyond this scale, the layer will not be visible. A value of `0` means the layer does not have a maximum scale. The maxScale value should always be smaller than the [minScale](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ScaleRangeLayer.html#minScale) value, and greater than or equal to the service specification.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ScaleRangeLayer.html#maxScale)
    *
    * @default 0
    */
  /* CompleteClass */
  override var maxScale: scala.Double = js.native
  /**
    * The minimum scale (most zoomed out) at which the layer is visible in the view. If the map is zoomed out beyond this scale, the layer will not be visible. A value of `0` means the layer does not have a minimum scale. The minScale value should always be larger than the [maxScale](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ScaleRangeLayer.html#maxScale) value, and lesser than or equal to the service specification.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ScaleRangeLayer.html#minScale)
    *
    * @default 0
    */
  /* CompleteClass */
  override var minScale: scala.Double = js.native
  /**
    * Refresh interval of the layer in minutes. Minimum refresh interval is 0.1 minute (6 seconds). Value of `0` indicates no refresh.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-RefreshableLayer.html#refreshInterval)
    *
    * @default 0
    */
  /* CompleteClass */
  override var refreshInterval: scala.Double = js.native
  /**
    * Fetches all the data for the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-RefreshableLayer.html#refresh)
    *
    *
    */
  /* CompleteClass */
  override def refresh(): scala.Unit = js.native
}

