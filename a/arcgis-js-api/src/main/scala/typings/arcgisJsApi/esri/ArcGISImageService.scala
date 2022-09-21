package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.all
import typings.arcgisJsApi.arcgisJsApiStrings.any
import typings.arcgisJsApi.arcgisJsApiStrings.bilinear
import typings.arcgisJsApi.arcgisJsApiStrings.bmp
import typings.arcgisJsApi.arcgisJsApiStrings.cubic
import typings.arcgisJsApi.arcgisJsApiStrings.f32
import typings.arcgisJsApi.arcgisJsApiStrings.f64
import typings.arcgisJsApi.arcgisJsApiStrings.gif
import typings.arcgisJsApi.arcgisJsApiStrings.jpg
import typings.arcgisJsApi.arcgisJsApiStrings.jpgpng
import typings.arcgisJsApi.arcgisJsApiStrings.lerc
import typings.arcgisJsApi.arcgisJsApiStrings.majority
import typings.arcgisJsApi.arcgisJsApiStrings.nearest
import typings.arcgisJsApi.arcgisJsApiStrings.png
import typings.arcgisJsApi.arcgisJsApiStrings.png24
import typings.arcgisJsApi.arcgisJsApiStrings.png32
import typings.arcgisJsApi.arcgisJsApiStrings.png8
import typings.arcgisJsApi.arcgisJsApiStrings.s16
import typings.arcgisJsApi.arcgisJsApiStrings.s32
import typings.arcgisJsApi.arcgisJsApiStrings.s8
import typings.arcgisJsApi.arcgisJsApiStrings.tiff
import typings.arcgisJsApi.arcgisJsApiStrings.u16
import typings.arcgisJsApi.arcgisJsApiStrings.u32
import typings.arcgisJsApi.arcgisJsApiStrings.u8
import typings.arcgisJsApi.arcgisJsApiStrings.unknown
import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArcGISImageService extends StObject {
  
  /**
    * Defines a band combination using 0-based band indexes.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#bandIds)
    */
  var bandIds: js.Array[Double] = js.native
  
  /**
    * Describes the layer's supported capabilities.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#capabilities)
    */
  var capabilities: ArcGISImageServiceCapabilities = js.native
  
  /**
    * The compression quality value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#compressionQuality)
    */
  var compressionQuality: Double = js.native
  
  /**
    * Controls the tolerance of the lerc compression algorithm.
    *
    * @default 0.01
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#compressionTolerance)
    */
  var compressionTolerance: Double = js.native
  
  /**
    * Computes the rotation angle of a ImageryLayer at a given location.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#computeAngles)
    */
  def computeAngles(parameters: ImageAngleParameters): js.Promise[ImageAngleResult] = js.native
  def computeAngles(parameters: ImageAngleParametersProperties): js.Promise[ImageAngleResult] = js.native
  def computeAngles(parameters: ImageAngleParametersProperties, requestOptions: Any): js.Promise[ImageAngleResult] = js.native
  def computeAngles(parameters: ImageAngleParameters, requestOptions: Any): js.Promise[ImageAngleResult] = js.native
  
  /**
    * Computes histograms based on the provided [ImageHistogramParameters](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageHistogramParameters.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#computeHistograms)
    */
  def computeHistograms(parameters: ImageHistogramParameters): js.Promise[Any] = js.native
  def computeHistograms(parameters: ImageHistogramParametersProperties): js.Promise[Any] = js.native
  def computeHistograms(parameters: ImageHistogramParametersProperties, requestOptions: Any): js.Promise[Any] = js.native
  def computeHistograms(parameters: ImageHistogramParameters, requestOptions: Any): js.Promise[Any] = js.native
  
  /**
    * Computes the corresponding pixel location in columns and rows for an image based on input geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#computePixelSpaceLocations)
    */
  def computePixelSpaceLocations(parameters: ImagePixelLocationParameters): js.Promise[ImagePixelLocationResult] = js.native
  def computePixelSpaceLocations(parameters: ImagePixelLocationParameters, requestOptions: Any): js.Promise[ImagePixelLocationResult] = js.native
  
  /**
    * Computes [statistics](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html#RasterBandStatistics) and [histograms](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html#RasterHistogram) for the provided [ImageHistogramParameters](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageHistogramParameters.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#computeStatisticsHistograms)
    */
  def computeStatisticsHistograms(parameters: ImageHistogramParameters): js.Promise[Any] = js.native
  def computeStatisticsHistograms(parameters: ImageHistogramParametersProperties): js.Promise[Any] = js.native
  def computeStatisticsHistograms(parameters: ImageHistogramParametersProperties, requestOptions: Any): js.Promise[Any] = js.native
  def computeStatisticsHistograms(parameters: ImageHistogramParameters, requestOptions: Any): js.Promise[Any] = js.native
  
  /**
    * The copyright text as defined by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#copyright)
    */
  var copyright: String = js.native
  
  /**
    * The SQL where clause used to filter rasters.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#definitionExpression)
    */
  var definitionExpression: String = js.native
  
  /**
    * Returns an image using the [export REST operation](https://developers.arcgis.com/rest/services-reference/export-image.htm) that displays data from an [ImageryLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#fetchImage)
    */
  def fetchImage(extent: Extent, width: Double, height: Double): js.Promise[Any] = js.native
  def fetchImage(extent: Extent, width: Double, height: Double, options: ArcGISImageServiceFetchImageOptions): js.Promise[Any] = js.native
  
  /**
    * An array of fields in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#fields)
    */
  var fields: js.Array[Field] = js.native
  
  /**
    * A convenient property that can be used to make case-insensitive lookups for a [field](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#fields) by name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#fieldsIndex)
    */
  val fieldsIndex: FieldsIndex = js.native
  
  /**
    * The format of the exported image.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#format)
    */
  var format: png | png8 | png24 | png32 | jpg | bmp | gif | jpgpng | lerc | tiff = js.native
  
  /**
    * Generates raster info for the specified rendering rule.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#generateRasterInfo)
    */
  def generateRasterInfo(renderingRule: RasterFunction): js.Promise[RasterInfo] = js.native
  def generateRasterInfo(renderingRule: RasterFunctionProperties): js.Promise[RasterInfo] = js.native
  def generateRasterInfo(renderingRule: RasterFunctionProperties, abortOptions: AbortSignal): js.Promise[RasterInfo] = js.native
  def generateRasterInfo(renderingRule: RasterFunction, abortOptions: AbortSignal): js.Promise[RasterInfo] = js.native
  
  /**
    * Gets the [image coordinate system](https://developers.arcgis.com/rest/services-reference/raster-ics.htm) information of a catalog item in an image service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#getCatalogItemICSInfo)
    */
  def getCatalogItemICSInfo(rasterId: Double): js.Promise[Any] = js.native
  def getCatalogItemICSInfo(rasterId: Double, abortOptions: AbortSignal): js.Promise[Any] = js.native
  
  /**
    * Get the [raster info](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html) of a [catalog item](https://developers.arcgis.com/rest/services-reference/raster-catalog-item.htm) in an image service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#getCatalogItemRasterInfo)
    */
  def getCatalogItemRasterInfo(rasterId: Double): js.Promise[RasterInfo] = js.native
  def getCatalogItemRasterInfo(rasterId: Double, abortOptions: AbortSignal): js.Promise[RasterInfo] = js.native
  
  /**
    * Returns sample point locations, pixel values and corresponding resolutions of the source data for a given geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#getSamples)
    */
  def getSamples(parameters: ImageSampleParameters): js.Promise[ImageSampleResult] = js.native
  def getSamples(parameters: ImageSampleParametersProperties): js.Promise[ImageSampleResult] = js.native
  def getSamples(parameters: ImageSampleParametersProperties, requestOptions: Any): js.Promise[ImageSampleResult] = js.native
  def getSamples(parameters: ImageSampleParameters, requestOptions: Any): js.Promise[ImageSampleResult] = js.native
  
  /**
    * Indicates if the layer has [multidimensionalInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#multidimensionalInfo).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#hasMultidimensions)
    */
  var hasMultidimensions: Boolean = js.native
  
  /**
    * Sends a request to the ArcGIS REST image service to identify content based on the specified [ImageIdentifyParameters](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageIdentifyParameters.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#identify)
    */
  def identify(parameters: ImageIdentifyParameters): js.Promise[ImageIdentifyResult] = js.native
  def identify(parameters: ImageIdentifyParametersProperties): js.Promise[ImageIdentifyResult] = js.native
  def identify(parameters: ImageIdentifyParametersProperties, requestOptions: Any): js.Promise[ImageIdentifyResult] = js.native
  def identify(parameters: ImageIdentifyParameters, requestOptions: Any): js.Promise[ImageIdentifyResult] = js.native
  
  /**
    * Indicates the maximum height of the image exported by the service.
    *
    * @default 4100
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#imageMaxHeight)
    */
  var imageMaxHeight: Double = js.native
  
  /**
    * Indicates the maximum width of the image exported by the service.
    *
    * @default 15000
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#imageMaxWidth)
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
    * The multidimensional information associated with the layer if the layer's [hasMultidimensions](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#hasMultidimensions) property is `true`.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#multidimensionalInfo)
    */
  val multidimensionalInfo: RasterMultidimensionalInfo = js.native
  
  /**
    * The pixel value representing no available information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#noData)
    */
  var noData: Double | js.Array[Double] = js.native
  
  /**
    * Interpretation of the [noData](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#noData) setting.
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
    * A function that processes [pixelData](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-ImageryLayerView.html#pixelData).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#pixelFilter)
    */
  def pixelFilter(pixelData: PixelData): scala.Unit = js.native
  /**
    * A function that processes [pixelData](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-ImageryLayerView.html#pixelData).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#pixelFilter)
    */
  @JSName("pixelFilter")
  var pixelFilter_Original: PixelFilterFunction = js.native
  
  /**
    * Raster source pixel type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#pixelType)
    */
  var pixelType: unknown | s8 | s16 | s32 | u8 | u16 | u32 | f32 | f64 = js.native
  
  /**
    * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html) against the image service and returns an array of Object IDs for the rasters.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#queryObjectIds)
    */
  def queryObjectIds(): js.Promise[js.Array[Double]] = js.native
  def queryObjectIds(query: scala.Unit, requestOptions: Any): js.Promise[js.Array[Double]] = js.native
  def queryObjectIds(query: QueryProperties): js.Promise[js.Array[Double]] = js.native
  def queryObjectIds(query: QueryProperties, requestOptions: Any): js.Promise[js.Array[Double]] = js.native
  def queryObjectIds(query: Query_): js.Promise[js.Array[Double]] = js.native
  def queryObjectIds(query: Query_, requestOptions: Any): js.Promise[js.Array[Double]] = js.native
  
  /**
    * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html) against the image service and returns the number of rasters that satisfy the query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#queryRasterCount)
    */
  def queryRasterCount(): js.Promise[Double] = js.native
  def queryRasterCount(query: scala.Unit, requestOptions: Any): js.Promise[Double] = js.native
  def queryRasterCount(query: QueryProperties): js.Promise[Double] = js.native
  def queryRasterCount(query: QueryProperties, requestOptions: Any): js.Promise[Double] = js.native
  def queryRasterCount(query: Query_): js.Promise[Double] = js.native
  def queryRasterCount(query: Query_, requestOptions: Any): js.Promise[Double] = js.native
  
  def queryRasters(query: QueryProperties): js.Promise[FeatureSet] = js.native
  def queryRasters(query: QueryProperties, requestOptions: Any): js.Promise[FeatureSet] = js.native
  /**
    * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html) against an image service and returns a [FeatureSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-FeatureSet.html), which can be accessed using the `.then()` method once the promise resolves.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#queryRasters)
    */
  def queryRasters(query: Query_): js.Promise[FeatureSet] = js.native
  def queryRasters(query: Query_, requestOptions: Any): js.Promise[FeatureSet] = js.native
  
  /**
    * A complete list of fields that consists of raster attribute table fields, item pixel value, service pixel value, service pixel value with various server defined function templates, and raster attribute table fields.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#rasterFields)
    */
  val rasterFields: js.Array[Field] = js.native
  
  /**
    * Returns raster function information for the image services, including the name, description, help, function type, and a thumbnail of pre-configured raster function templates.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#rasterFunctionInfos)
    */
  val rasterFunctionInfos: js.Array[RasterFunctionInfo] = js.native
  
  /**
    * The renderer assigned to the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#renderer)
    */
  var renderer: ClassBreaksRenderer | UniqueValueRenderer | RasterStretchRenderer | RasterShadedReliefRenderer | RasterColormapRenderer | VectorFieldRenderer | FlowRenderer = js.native
  
  /**
    * Specifies the rule for how the requested image should be rendered.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#renderingRule)
    */
  var renderingRule: RasterFunction = js.native
  
  /**
    * Source raster information of the image service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#serviceRasterInfo)
    */
  val serviceRasterInfo: RasterInfo = js.native
  
  /**
    * The [image service's metadata JSON](https://developers.arcgis.com/rest/services-reference/image-service.htm) exposed by the ArcGIS REST API.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#sourceJSON)
    */
  var sourceJSON: Any = js.native
  
  /**
    * The spatial reference of the image service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#spatialReference)
    */
  val spatialReference: SpatialReference = js.native
  
  /**
    * The URL to the REST endpoint of the layer.
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
}
