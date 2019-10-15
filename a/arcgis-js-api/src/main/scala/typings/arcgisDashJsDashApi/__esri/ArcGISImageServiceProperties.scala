package typings.arcgisDashJsDashApi.__esri

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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArcGISImageServiceProperties extends js.Object {
  /**
    * The compression quality value. Controls how much loss the image will be subjected to by the compression algorithm. Valid value ranges of compression quality are from 0 to 100. Only valid when using `jpg` or `jpgpng` [image format](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#format).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#compressionQuality)
    */
  var compressionQuality: js.UndefOr[Double] = js.undefined
  /**
    * Controls the tolerance of the lerc compression algorithm. The tolerance defines the maximum possible error of pixel values in the compressed image. It's a double value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#compressionTolerance)
    *
    * @default 0.01
    */
  var compressionTolerance: js.UndefOr[Double] = js.undefined
  /**
    * The copyright text as defined by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#copyright)
    */
  var copyright: js.UndefOr[String] = js.undefined
  /**
    * The SQL where clause used to filter rasters. Only the rasters that satisfy the definition expression are displayed in the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html). This property overrides the [mosaicRule's](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#mosaicRule) [where](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#where) property if both properties are set on the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#definitionExpression)
    */
  var definitionExpression: js.UndefOr[String] = js.undefined
  /**
    * An array of fields in the layer. Each field represents an attribute that may contain a value for each raster in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#fields)
    */
  var fields: js.UndefOr[js.Array[FieldProperties]] = js.undefined
  /**
    * The format of the exported image.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#format)
    */
  var format: js.UndefOr[png | png8 | png24 | png32 | jpg | jpgpng | lerc | tiff] = js.undefined
  /**
    * Indicates if the layer has [multidimensionalInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#multidimensionalInfo).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#hasMultidimensions)
    */
  var hasMultidimensions: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates the maximum height of the image exported by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#imageMaxHeight)
    *
    * @default 4100
    */
  var imageMaxHeight: js.UndefOr[Double] = js.undefined
  /**
    * Indicates the maximum width of the image exported by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#imageMaxWidth)
    *
    * @default 15000
    */
  var imageMaxWidth: js.UndefOr[Double] = js.undefined
  /**
    * Defines how to interpolate pixel values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#interpolation)
    */
  var interpolation: js.UndefOr[nearest | bilinear | cubic | majority] = js.undefined
  /**
    * Defines how overlapping images should be mosaicked.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#mosaicRule)
    */
  var mosaicRule: js.UndefOr[MosaicRuleProperties] = js.undefined
  /**
    * The multidimensional information associated with the layer if the layer's [hasMultidimensions](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#hasMultidimensions) property is `true`. If defined, multidimensional information contains various dimensions of data for a particular value, such as time, depth, altitude, etc. Defining slices of particular dimensions in the layer is handled with the [multidimensionalDefinition](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#multidimensionalDefinition) property of the [mosaicRule](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#mosaicRule).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#multidimensionalInfo)
    *
    * @default null
    */
  var multidimensionalInfo: js.UndefOr[js.Any] = js.undefined
  /**
    * The pixel value representing no available information. Can be a number (same value for all bands) or array (specific value for each band).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#noData)
    */
  var noData: js.UndefOr[Double | js.Array[Double]] = js.undefined
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
  var noDataInterpretation: js.UndefOr[any | all] = js.undefined
  /**
    * The name of an `oid` [field](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#fields) containing a unique value or identifier for each raster in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#objectIdField)
    */
  var objectIdField: js.UndefOr[String] = js.undefined
  /**
    * A function that processes [pixelData](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-ImageryLayerView.html#pixelData). The `pixelData` object contains a [pixelBlock](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-PixelBlock.html) property that gives you access to all of the pixels in the raster on the client.  Inside the `pixelFilter` you may loop through all the [pixels](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-PixelBlock.html#pixels) found in the `pixelBlock` property of the `pixelData` object and process them. This function may be used to hide some pixels from the view, alter their values, and change their color. The pixelFilter should be used when the imagery layer's [format](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#format) is `lerc` or `tiff` as these formats return raw pixel data to the client.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#pixelFilter)
    */
  var pixelFilter: js.UndefOr[js.Function] = js.undefined
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
  var pixelType: js.UndefOr[unknown | s8 | s16 | s32 | u8 | u16 | u32 | f32 | f64] = js.undefined
  /**
    * Prefix used to define the fields from the raster attribute table. It's primarily used for [popups](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#rasterAttributeTableFieldPrefix)
    */
  var rasterAttributeTableFieldPrefix: js.UndefOr[String] = js.undefined
  /**
    * The renderer assigned to the layer. The renderer defines how to visualize pixels in the layer. Depending on the renderer type, the pixels may be [stretched](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html) across the color ramp, [classified](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html) or have [different symbols](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html) based on values.  If both renderer and [pixelFilter](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#pixelFilter) is applied to an ImageryLayer then pixelFilter will override the renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#renderer)
    */
  var renderer: js.UndefOr[RendererProperties] = js.undefined
  /**
    * Specifies the rule for how the requested image should be rendered. When renderingRule applied, the server returns an updated service information that reflects a custom processing as defined by the rendering rule.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#renderingRule)
    */
  var renderingRule: js.UndefOr[RasterFunctionProperties] = js.undefined
  /**
    * The [image service's metadata JSON](https://developers.arcgis.com/rest/services-reference/image-service.htm) exposed by the ArcGIS REST API. While most commonly used [properties](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#properties-summary) are exposed on the ImageryLayer class directly, this property gives access to all information returned by the image service. This property is useful if working in an application built using an older version of the API which requires access to image service properties from a more recent version.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#sourceJSON)
    */
  var sourceJSON: js.UndefOr[js.Any] = js.undefined
  /**
    * The URL to the REST endpoint of the layer. The URL may either point to a resource on ArcGIS Enterprise or ArcGIS Online.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#url)
    */
  var url: js.UndefOr[String] = js.undefined
}

object ArcGISImageServiceProperties {
  @scala.inline
  def apply(
    compressionQuality: Int | Double = null,
    compressionTolerance: Int | Double = null,
    copyright: String = null,
    definitionExpression: String = null,
    fields: js.Array[FieldProperties] = null,
    format: png | png8 | png24 | png32 | jpg | jpgpng | lerc | tiff = null,
    hasMultidimensions: js.UndefOr[Boolean] = js.undefined,
    imageMaxHeight: Int | Double = null,
    imageMaxWidth: Int | Double = null,
    interpolation: nearest | bilinear | cubic | majority = null,
    mosaicRule: MosaicRuleProperties = null,
    multidimensionalInfo: js.Any = null,
    noData: Double | js.Array[Double] = null,
    noDataInterpretation: any | all = null,
    objectIdField: String = null,
    pixelFilter: js.Function = null,
    pixelType: unknown | s8 | s16 | s32 | u8 | u16 | u32 | f32 | f64 = null,
    rasterAttributeTableFieldPrefix: String = null,
    renderer: RendererProperties = null,
    renderingRule: RasterFunctionProperties = null,
    sourceJSON: js.Any = null,
    url: String = null
  ): ArcGISImageServiceProperties = {
    val __obj = js.Dynamic.literal()
    if (compressionQuality != null) __obj.updateDynamic("compressionQuality")(compressionQuality.asInstanceOf[js.Any])
    if (compressionTolerance != null) __obj.updateDynamic("compressionTolerance")(compressionTolerance.asInstanceOf[js.Any])
    if (copyright != null) __obj.updateDynamic("copyright")(copyright)
    if (definitionExpression != null) __obj.updateDynamic("definitionExpression")(definitionExpression)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(hasMultidimensions)) __obj.updateDynamic("hasMultidimensions")(hasMultidimensions)
    if (imageMaxHeight != null) __obj.updateDynamic("imageMaxHeight")(imageMaxHeight.asInstanceOf[js.Any])
    if (imageMaxWidth != null) __obj.updateDynamic("imageMaxWidth")(imageMaxWidth.asInstanceOf[js.Any])
    if (interpolation != null) __obj.updateDynamic("interpolation")(interpolation.asInstanceOf[js.Any])
    if (mosaicRule != null) __obj.updateDynamic("mosaicRule")(mosaicRule)
    if (multidimensionalInfo != null) __obj.updateDynamic("multidimensionalInfo")(multidimensionalInfo)
    if (noData != null) __obj.updateDynamic("noData")(noData.asInstanceOf[js.Any])
    if (noDataInterpretation != null) __obj.updateDynamic("noDataInterpretation")(noDataInterpretation.asInstanceOf[js.Any])
    if (objectIdField != null) __obj.updateDynamic("objectIdField")(objectIdField)
    if (pixelFilter != null) __obj.updateDynamic("pixelFilter")(pixelFilter)
    if (pixelType != null) __obj.updateDynamic("pixelType")(pixelType.asInstanceOf[js.Any])
    if (rasterAttributeTableFieldPrefix != null) __obj.updateDynamic("rasterAttributeTableFieldPrefix")(rasterAttributeTableFieldPrefix)
    if (renderer != null) __obj.updateDynamic("renderer")(renderer)
    if (renderingRule != null) __obj.updateDynamic("renderingRule")(renderingRule)
    if (sourceJSON != null) __obj.updateDynamic("sourceJSON")(sourceJSON)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[ArcGISImageServiceProperties]
  }
}

