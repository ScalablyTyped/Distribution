package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.all
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.any
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.bilinear
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.cubic
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.f32
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.f64
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.jpg
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.jpgpng
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.lerc
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.majority
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.nearest
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.png
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.png24
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.png32
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.png8
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.s16
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.s32
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.s8
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.tiff
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.u16
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.u32
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.u8
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.unknown
import typings.std.AbortSignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArcGISImageService extends js.Object {
  /**
    * The compression quality value. Controls how much loss the image will be subjected to by the compression algorithm. Valid value ranges of compression quality are from 0 to 100. Only valid when using `jpg` or `jpgpng` [image format](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#format).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#compressionQuality)
    */
  var compressionQuality: Double = js.native
  /**
    * Controls the tolerance of the lerc compression algorithm. The tolerance defines the maximum possible error of pixel values in the compressed image. It's a double value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#compressionTolerance)
    *
    * @default 0.01
    */
  var compressionTolerance: Double = js.native
  /**
    * The copyright text as defined by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#copyright)
    */
  var copyright: String = js.native
  /**
    * The SQL where clause used to filter rasters. Only the rasters that satisfy the definition expression are displayed in the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html). This property overrides the [mosaicRule's](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#mosaicRule) [where](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#where) property if both properties are set on the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#definitionExpression)
    */
  var definitionExpression: String = js.native
  /**
    * An array of fields in the layer. Each field represents an attribute that may contain a value for each raster in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#fields)
    */
  var fields: js.Array[Field] = js.native
  /**
    * The format of the exported image.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#format)
    */
  var format: png | png8 | png24 | png32 | jpg | jpgpng | lerc | tiff = js.native
  /**
    * Indicates if the layer has [multidimensionalInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#multidimensionalInfo).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#hasMultidimensions)
    */
  var hasMultidimensions: Boolean = js.native
  /**
    * Indicates the maximum height of the image exported by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#imageMaxHeight)
    *
    * @default 4100
    */
  var imageMaxHeight: Double = js.native
  /**
    * Indicates the maximum width of the image exported by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#imageMaxWidth)
    *
    * @default 15000
    */
  var imageMaxWidth: Double = js.native
  /**
    * Defines how to interpolate pixel values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#interpolation)
    */
  var interpolation: nearest | bilinear | cubic | majority = js.native
  /**
    * Defines how overlapping images should be mosaicked.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#mosaicRule)
    */
  var mosaicRule: MosaicRule = js.native
  /**
    * The multidimensional information associated with the layer if the layer's [hasMultidimensions](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#hasMultidimensions) property is `true`. If defined, multidimensional information contains various dimensions of data for a particular value, such as time, depth, altitude, etc. Defining slices of particular dimensions in the layer is handled with the [multidimensionalDefinition](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#multidimensionalDefinition) property of the [mosaicRule](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#mosaicRule).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#multidimensionalInfo)
    *
    * @default null
    */
  var multidimensionalInfo: js.Any = js.native
  /**
    * The pixel value representing no available information. Can be a number (same value for all bands) or array (specific value for each band).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#noData)
    */
  var noData: Double | js.Array[Double] = js.native
  /**
    * Interpretation of the [noData](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#noData) setting.
    *
    * Value | Description |
    * ----- | ----------- |
    * any | Pixel is transparent if any band matches `noData` value.
    * all | Pixel is transparent only if all bands match `noData` value.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#noDataInterpretation)
    */
  var noDataInterpretation: any | all = js.native
  /**
    * The name of an `oid` [field](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#fields) containing a unique value or identifier for each raster in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#objectIdField)
    */
  var objectIdField: String = js.native
  /**
    * A function that processes [pixelData](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-ImageryLayerView.html#pixelData). The `pixelData` object contains a [pixelBlock](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-PixelBlock.html) property that gives you access to all of the pixels in the raster on the client.  Inside the `pixelFilter` you may loop through all the [pixels](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-PixelBlock.html#pixels) found in the `pixelBlock` property of the `pixelData` object and process them. This function may be used to hide some pixels from the view, alter their values, and change their color. The pixelFilter should be used when the imagery layer's [format](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#format) is `lerc` or `tiff` as these formats return raw pixel data to the client.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#pixelFilter)
    */
  var pixelFilter: js.Function = js.native
  /**
    * Raster source pixel type.
    *
    * Value | Range of values that each cell can contain |
    * ----- | ------------------------------------------- |
    * unknown | Pixel type is unknown |
    * s8 | -128 to 127 |
    * s16 | -32768 to 32767 |
    * s32 | -2147483648 to 2147483647 |
    * u8 | 0 to 255 |
    * u16 | 0 to 65535
    * u32 | 0 to 4294967295
    * f32 | -3.402823466e+38 to 3.402823466e+38
    * f64 | 0 to 18446744073709551616
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#pixelType)
    */
  var pixelType: unknown | s8 | s16 | s32 | u8 | u16 | u32 | f32 | f64 = js.native
  /**
    * Prefix used to define the fields from the raster attribute table. It's primarily used for [popups](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#rasterAttributeTableFieldPrefix)
    */
  var rasterAttributeTableFieldPrefix: String = js.native
  /**
    * A complete list of fields that consists of raster catalog fields, item pixel value, service pixel value, service pixel value with various server defined function templates, and raster attribute table fields. This list is used for layer's [popupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html#popupTemplate).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#rasterFields)
    */
  val rasterFields: js.Array[Field] = js.native
  /**
    * The renderer assigned to the layer. The renderer defines how to visualize pixels in the layer. Depending on the renderer type, the pixels may be [stretched](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html) across the color ramp, [classified](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html) or have [different symbols](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html) based on values.  If both renderer and [pixelFilter](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#pixelFilter) is applied to an ImageryLayer then pixelFilter will override the renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#renderer)
    */
  var renderer: Renderer = js.native
  /**
    * Specifies the rule for how the requested image should be rendered. When renderingRule applied, the server returns an updated service information that reflects a custom processing as defined by the rendering rule.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#renderingRule)
    */
  var renderingRule: RasterFunction = js.native
  /**
    * Source raster information of the image service. The layer must be [loaded](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html#loaded) before serviceRasterInfo can be accessed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#serviceRasterInfo)
    */
  val serviceRasterInfo: RasterInfo = js.native
  /**
    * The [image service's metadata JSON](https://developers.arcgis.com/rest/services-reference/image-service.htm) exposed by the ArcGIS REST API. While most commonly used [properties](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#properties-summary) are exposed on the ImageryLayer class directly, this property gives access to all information returned by the image service. This property is useful if working in an application built using an older version of the API which requires access to image service properties from a more recent version.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#sourceJSON)
    */
  var sourceJSON: js.Any = js.native
  /**
    * The spatial reference of the image service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#spatialReference)
    */
  val spatialReference: SpatialReference = js.native
  /**
    * The URL to the REST endpoint of the layer. The URL may either point to a resource on ArcGIS Enterprise or ArcGIS Online.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#url)
    */
  var url: String = js.native
  /**
    * The version of ArcGIS Server in which the image service is published.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#version)
    */
  val version: Double = js.native
  /**
    * Returns an image using the [export REST operation](https://developers.arcgis.com/rest/services-reference/export-image.htm) that displays data from an [ImageryLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#fetchImage)
    *
    * @param extent The extent of the image to export.
    * @param width The width of the image in pixels.
    * @param height The height of the image in pixels.
    * @param options The parameter options is an object with the following properties.
    * @param options.signal An [AbortSignal](https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal) to abort the request. If canceled, the promise will be rejected with an error named `AbortError`. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController).
    *
    */
  def fetchImage(extent: Extent, width: Double, height: Double): js.Promise[_] = js.native
  def fetchImage(extent: Extent, width: Double, height: Double, options: ArcGISImageServiceFetchImageOptions): js.Promise[_] = js.native
  /**
    * Generates raster info for the specified rendering rule.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#generateRasterInfo)
    *
    * @param renderingRule Rendering rule for the requested raster info.
    *
    */
  def generateRasterInfo(renderingRule: RasterFunction): js.Promise[RasterInfo] = js.native
  /**
    * Gets the [image coordinate system](https://developers.arcgis.com/rest/services-reference/raster-ics.htm) information of a catalog item in an image service. The returned object can be used to set the 2D MapView's [spatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#spatialReference) and [extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#extent) so that the image can be displayed in its original coordinate system. The image service must have a catalog capability.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#getCatalogItemICSInfo)
    *
    * @param rasterId Raster catalog id.
    * @param abortOptions Signal object that can be used to abort the asynchronous task.
    *
    */
  def getCatalogItemICSInfo(rasterId: Double): js.Promise[_] = js.native
  def getCatalogItemICSInfo(rasterId: Double, abortOptions: AbortSignal): js.Promise[_] = js.native
  /**
    * Get the [raster info](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html) of a [catalog item](https://developers.arcgis.com/rest/services-reference/raster-catalog-item.htm) in an image service. Each raster catalog item represents a feature in the raster catalog. Each such feature has an associated raster. The image service must have a catalog capability.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#getCatalogItemRasterInfo)
    *
    * @param rasterId Raster catalog id.
    * @param abortOptions Signal object that can be used to abort the asynchronous task.
    *
    */
  def getCatalogItemRasterInfo(rasterId: Double): js.Promise[RasterInfo] = js.native
  def getCatalogItemRasterInfo(rasterId: Double, abortOptions: AbortSignal): js.Promise[RasterInfo] = js.native
}

@JSGlobal("__esri.ArcGISImageService")
@js.native
object ArcGISImageService extends TopLevel[ArcGISImageServiceConstructor]

