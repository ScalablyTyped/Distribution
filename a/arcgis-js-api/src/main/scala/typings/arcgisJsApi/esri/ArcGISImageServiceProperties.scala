package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.all
import typings.arcgisJsApi.arcgisJsApiStrings.any
import typings.arcgisJsApi.arcgisJsApiStrings.bilinear
import typings.arcgisJsApi.arcgisJsApiStrings.cubic
import typings.arcgisJsApi.arcgisJsApiStrings.f32
import typings.arcgisJsApi.arcgisJsApiStrings.f64
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArcGISImageServiceProperties extends js.Object {
  /**
    * Describes the layer's supported capabilities.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#capabilities)
    */
  var capabilities: js.UndefOr[ArcGISImageServiceCapabilities] = js.native
  /**
    * The compression quality value. Controls how much loss the image will be subjected to by the compression algorithm. Valid value ranges of compression quality are from 0 to 100. Only valid when using `jpg` or `jpgpng` [image format](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#format).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#compressionQuality)
    */
  var compressionQuality: js.UndefOr[Double] = js.native
  /**
    * Controls the tolerance of the lerc compression algorithm. The tolerance defines the maximum possible error of pixel values in the compressed image. It's a double value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#compressionTolerance)
    *
    * @default 0.01
    */
  var compressionTolerance: js.UndefOr[Double] = js.native
  /**
    * The copyright text as defined by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#copyright)
    */
  var copyright: js.UndefOr[String] = js.native
  /**
    * The SQL where clause used to filter rasters. Only the rasters that satisfy the definition expression are displayed in the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html). This property overrides the [mosaicRule's](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#mosaicRule) [where](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#where) property if both properties are set on the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#definitionExpression)
    */
  var definitionExpression: js.UndefOr[String] = js.native
  /**
    * An array of fields in the layer. Each field represents an attribute that may contain a value for each raster in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#fields)
    */
  var fields: js.UndefOr[js.Array[FieldProperties]] = js.native
  /**
    * The format of the exported image.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#format)
    */
  var format: js.UndefOr[png | png8 | png24 | png32 | jpg | jpgpng | lerc | tiff] = js.native
  /**
    * Indicates if the layer has [multidimensionalInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#multidimensionalInfo).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#hasMultidimensions)
    */
  var hasMultidimensions: js.UndefOr[Boolean] = js.native
  /**
    * Indicates the maximum height of the image exported by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#imageMaxHeight)
    *
    * @default 4100
    */
  var imageMaxHeight: js.UndefOr[Double] = js.native
  /**
    * Indicates the maximum width of the image exported by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#imageMaxWidth)
    *
    * @default 15000
    */
  var imageMaxWidth: js.UndefOr[Double] = js.native
  /**
    * Defines how to interpolate pixel values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#interpolation)
    */
  var interpolation: js.UndefOr[nearest | bilinear | cubic | majority] = js.native
  /**
    * Defines how overlapping images should be mosaicked.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#mosaicRule)
    */
  var mosaicRule: js.UndefOr[MosaicRuleProperties] = js.native
  /**
    * The multidimensional information associated with the layer if the layer's [hasMultidimensions](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#hasMultidimensions) property is `true`. If defined, multidimensional information contains various dimensions of data for a particular value, such as time, depth, altitude, etc. Defining slices of particular dimensions in the layer is handled with the [multidimensionalDefinition](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#multidimensionalDefinition) property of the [mosaicRule](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#mosaicRule).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#multidimensionalInfo)
    *
    * @default null
    */
  var multidimensionalInfo: js.UndefOr[js.Any] = js.native
  /**
    * The pixel value representing no available information. Can be a number (same value for all bands) or array (specific value for each band).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#noData)
    */
  var noData: js.UndefOr[Double | js.Array[Double]] = js.native
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
  var noDataInterpretation: js.UndefOr[any | all] = js.native
  /**
    * The name of an `oid` [field](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#fields) containing a unique value or identifier for each raster in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#objectIdField)
    */
  var objectIdField: js.UndefOr[String] = js.native
  /**
    * A function that processes [pixelData](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-ImageryLayerView.html#pixelData). The `pixelData` object contains a [pixelBlock](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-PixelBlock.html) property that gives you access to all of the pixels in the raster on the client.  Inside the `pixelFilter` you may loop through all the [pixels](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-PixelBlock.html#pixels) found in the `pixelBlock` property of the `pixelData` object and process them. This function may be used to hide some pixels from the view, alter their values, and change their color. The pixelFilter should be used when the imagery layer's [format](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#format) is `lerc` or `tiff` as these formats return raw pixel data to the client.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#pixelFilter)
    */
  var pixelFilter: js.UndefOr[js.Function] = js.native
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
  var pixelType: js.UndefOr[unknown | s8 | s16 | s32 | u8 | u16 | u32 | f32 | f64] = js.native
  /**
    * Prefix used to define the fields from the raster attribute table. It's primarily used for [popups](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#rasterAttributeTableFieldPrefix)
    */
  var rasterAttributeTableFieldPrefix: js.UndefOr[String] = js.native
  /**
    * The renderer assigned to the layer. The renderer defines how to visualize pixels in the tile imagery layer. Depending on the renderer type, the pixels may be [stretched](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html) across the color ramp, [classified](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html), have [different symbols](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html) based on values, or show [shaded reliefs](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterShadedReliefRenderer.html).  If both renderer and [pixelFilter](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#pixelFilter) is applied to an ImageryLayer then pixelFilter will override the renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#renderer)
    */
  var renderer: js.UndefOr[
    ClassBreaksRendererProperties | UniqueValueRendererProperties | RasterStretchRendererProperties | RasterShadedReliefRendererProperties | RasterColormapRendererProperties
  ] = js.native
  /**
    * Specifies the rule for how the requested image should be rendered. When renderingRule applied, the server returns an updated service information that reflects a custom processing as defined by the rendering rule.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#renderingRule)
    */
  var renderingRule: js.UndefOr[RasterFunctionProperties] = js.native
  /**
    * The [image service's metadata JSON](https://developers.arcgis.com/rest/services-reference/image-service.htm) exposed by the ArcGIS REST API. While most commonly used [properties](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#properties-summary) are exposed on the ImageryLayer class directly, this property gives access to all information returned by the image service. This property is useful if working in an application built using an older version of the API which requires access to image service properties from a more recent version.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#sourceJSON)
    */
  var sourceJSON: js.UndefOr[js.Any] = js.native
  /**
    * The URL to the REST endpoint of the layer. The URL may either point to a resource on ArcGIS Enterprise or ArcGIS Online.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#url)
    */
  var url: js.UndefOr[String] = js.native
}

object ArcGISImageServiceProperties {
  @scala.inline
  def apply(): ArcGISImageServiceProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArcGISImageServiceProperties]
  }
  @scala.inline
  implicit class ArcGISImageServicePropertiesOps[Self <: ArcGISImageServiceProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCapabilities(value: ArcGISImageServiceCapabilities): Self = this.set("capabilities", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCapabilities: Self = this.set("capabilities", js.undefined)
    @scala.inline
    def setCompressionQuality(value: Double): Self = this.set("compressionQuality", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompressionQuality: Self = this.set("compressionQuality", js.undefined)
    @scala.inline
    def setCompressionTolerance(value: Double): Self = this.set("compressionTolerance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompressionTolerance: Self = this.set("compressionTolerance", js.undefined)
    @scala.inline
    def setCopyright(value: String): Self = this.set("copyright", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCopyright: Self = this.set("copyright", js.undefined)
    @scala.inline
    def setDefinitionExpression(value: String): Self = this.set("definitionExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefinitionExpression: Self = this.set("definitionExpression", js.undefined)
    @scala.inline
    def setFieldsVarargs(value: FieldProperties*): Self = this.set("fields", js.Array(value :_*))
    @scala.inline
    def setFields(value: js.Array[FieldProperties]): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    @scala.inline
    def setFormat(value: png | png8 | png24 | png32 | jpg | jpgpng | lerc | tiff): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setHasMultidimensions(value: Boolean): Self = this.set("hasMultidimensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasMultidimensions: Self = this.set("hasMultidimensions", js.undefined)
    @scala.inline
    def setImageMaxHeight(value: Double): Self = this.set("imageMaxHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageMaxHeight: Self = this.set("imageMaxHeight", js.undefined)
    @scala.inline
    def setImageMaxWidth(value: Double): Self = this.set("imageMaxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageMaxWidth: Self = this.set("imageMaxWidth", js.undefined)
    @scala.inline
    def setInterpolation(value: nearest | bilinear | cubic | majority): Self = this.set("interpolation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterpolation: Self = this.set("interpolation", js.undefined)
    @scala.inline
    def setMosaicRule(value: MosaicRuleProperties): Self = this.set("mosaicRule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMosaicRule: Self = this.set("mosaicRule", js.undefined)
    @scala.inline
    def setMultidimensionalInfo(value: js.Any): Self = this.set("multidimensionalInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultidimensionalInfo: Self = this.set("multidimensionalInfo", js.undefined)
    @scala.inline
    def setNoDataVarargs(value: Double*): Self = this.set("noData", js.Array(value :_*))
    @scala.inline
    def setNoData(value: Double | js.Array[Double]): Self = this.set("noData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoData: Self = this.set("noData", js.undefined)
    @scala.inline
    def setNoDataInterpretation(value: any | all): Self = this.set("noDataInterpretation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoDataInterpretation: Self = this.set("noDataInterpretation", js.undefined)
    @scala.inline
    def setObjectIdField(value: String): Self = this.set("objectIdField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectIdField: Self = this.set("objectIdField", js.undefined)
    @scala.inline
    def setPixelFilter(value: js.Function): Self = this.set("pixelFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePixelFilter: Self = this.set("pixelFilter", js.undefined)
    @scala.inline
    def setPixelType(value: unknown | s8 | s16 | s32 | u8 | u16 | u32 | f32 | f64): Self = this.set("pixelType", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePixelType: Self = this.set("pixelType", js.undefined)
    @scala.inline
    def setRasterAttributeTableFieldPrefix(value: String): Self = this.set("rasterAttributeTableFieldPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRasterAttributeTableFieldPrefix: Self = this.set("rasterAttributeTableFieldPrefix", js.undefined)
    @scala.inline
    def setRenderer(
      value: ClassBreaksRendererProperties | UniqueValueRendererProperties | RasterStretchRendererProperties | RasterShadedReliefRendererProperties | RasterColormapRendererProperties
    ): Self = this.set("renderer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderer: Self = this.set("renderer", js.undefined)
    @scala.inline
    def setRenderingRule(value: RasterFunctionProperties): Self = this.set("renderingRule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderingRule: Self = this.set("renderingRule", js.undefined)
    @scala.inline
    def setSourceJSON(value: js.Any): Self = this.set("sourceJSON", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceJSON: Self = this.set("sourceJSON", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

