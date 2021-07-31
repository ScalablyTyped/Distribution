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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArcGISImageServiceProperties extends StObject {
  
  /**
    * Describes the layer's supported capabilities.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#capabilities)
    */
  var capabilities: js.UndefOr[ArcGISImageServiceCapabilities] = js.undefined
  
  /**
    * The compression quality value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#compressionQuality)
    */
  var compressionQuality: js.UndefOr[Double] = js.undefined
  
  /**
    * Controls the tolerance of the lerc compression algorithm.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#compressionTolerance)
    */
  var compressionTolerance: js.UndefOr[Double] = js.undefined
  
  /**
    * The copyright text as defined by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#copyright)
    */
  var copyright: js.UndefOr[String] = js.undefined
  
  /**
    * The SQL where clause used to filter rasters.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#definitionExpression)
    */
  var definitionExpression: js.UndefOr[String] = js.undefined
  
  /**
    * An array of fields in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#fields)
    */
  var fields: js.UndefOr[js.Array[FieldProperties]] = js.undefined
  
  /**
    * The format of the exported image.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#format)
    */
  var format: js.UndefOr[png | png8 | png24 | png32 | jpg | bmp | gif | jpgpng | lerc | tiff] = js.undefined
  
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
    */
  var imageMaxHeight: js.UndefOr[Double] = js.undefined
  
  /**
    * Indicates the maximum width of the image exported by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#imageMaxWidth)
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
    * The multidimensional information associated with the layer if the layer's [hasMultidimensions](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#hasMultidimensions) property is `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#multidimensionalInfo)
    */
  var multidimensionalInfo: js.UndefOr[js.Any] = js.undefined
  
  /**
    * The pixel value representing no available information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#noData)
    */
  var noData: js.UndefOr[Double | js.Array[Double]] = js.undefined
  
  /**
    * Interpretation of the [noData](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#noData) setting.
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
    * A function that processes [pixelData](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-ImageryLayerView.html#pixelData).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#pixelFilter)
    */
  var pixelFilter: js.UndefOr[PixelFilterFunction] = js.undefined
  
  /**
    * Raster source pixel type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#pixelType)
    */
  var pixelType: js.UndefOr[unknown | s8 | s16 | s32 | u8 | u16 | u32 | f32 | f64] = js.undefined
  
  /**
    * Prefix used to define the fields from the raster attribute table.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#rasterAttributeTableFieldPrefix)
    */
  var rasterAttributeTableFieldPrefix: js.UndefOr[String] = js.undefined
  
  /**
    * The renderer assigned to the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#renderer)
    */
  var renderer: js.UndefOr[
    ClassBreaksRendererProperties | UniqueValueRendererProperties | RasterStretchRendererProperties | RasterShadedReliefRendererProperties | RasterColormapRendererProperties
  ] = js.undefined
  
  /**
    * Specifies the rule for how the requested image should be rendered.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#renderingRule)
    */
  var renderingRule: js.UndefOr[RasterFunctionProperties] = js.undefined
  
  /**
    * The [image service's metadata JSON](https://developers.arcgis.com/rest/services-reference/image-service.htm) exposed by the ArcGIS REST API.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#sourceJSON)
    */
  var sourceJSON: js.UndefOr[js.Any] = js.undefined
  
  /**
    * The URL to the REST endpoint of the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#url)
    */
  var url: js.UndefOr[String] = js.undefined
}
object ArcGISImageServiceProperties {
  
  @scala.inline
  def apply(): ArcGISImageServiceProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArcGISImageServiceProperties]
  }
  
  @scala.inline
  implicit class ArcGISImageServicePropertiesMutableBuilder[Self <: ArcGISImageServiceProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCapabilities(value: ArcGISImageServiceCapabilities): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapabilitiesUndefined: Self = StObject.set(x, "capabilities", js.undefined)
    
    @scala.inline
    def setCompressionQuality(value: Double): Self = StObject.set(x, "compressionQuality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompressionQualityUndefined: Self = StObject.set(x, "compressionQuality", js.undefined)
    
    @scala.inline
    def setCompressionTolerance(value: Double): Self = StObject.set(x, "compressionTolerance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompressionToleranceUndefined: Self = StObject.set(x, "compressionTolerance", js.undefined)
    
    @scala.inline
    def setCopyright(value: String): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyrightUndefined: Self = StObject.set(x, "copyright", js.undefined)
    
    @scala.inline
    def setDefinitionExpression(value: String): Self = StObject.set(x, "definitionExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinitionExpressionUndefined: Self = StObject.set(x, "definitionExpression", js.undefined)
    
    @scala.inline
    def setFields(value: js.Array[FieldProperties]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setFieldsVarargs(value: FieldProperties*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    @scala.inline
    def setFormat(value: png | png8 | png24 | png32 | jpg | bmp | gif | jpgpng | lerc | tiff): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setHasMultidimensions(value: Boolean): Self = StObject.set(x, "hasMultidimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasMultidimensionsUndefined: Self = StObject.set(x, "hasMultidimensions", js.undefined)
    
    @scala.inline
    def setImageMaxHeight(value: Double): Self = StObject.set(x, "imageMaxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageMaxHeightUndefined: Self = StObject.set(x, "imageMaxHeight", js.undefined)
    
    @scala.inline
    def setImageMaxWidth(value: Double): Self = StObject.set(x, "imageMaxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageMaxWidthUndefined: Self = StObject.set(x, "imageMaxWidth", js.undefined)
    
    @scala.inline
    def setInterpolation(value: nearest | bilinear | cubic | majority): Self = StObject.set(x, "interpolation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterpolationUndefined: Self = StObject.set(x, "interpolation", js.undefined)
    
    @scala.inline
    def setMosaicRule(value: MosaicRuleProperties): Self = StObject.set(x, "mosaicRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMosaicRuleUndefined: Self = StObject.set(x, "mosaicRule", js.undefined)
    
    @scala.inline
    def setMultidimensionalInfo(value: js.Any): Self = StObject.set(x, "multidimensionalInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultidimensionalInfoUndefined: Self = StObject.set(x, "multidimensionalInfo", js.undefined)
    
    @scala.inline
    def setNoData(value: Double | js.Array[Double]): Self = StObject.set(x, "noData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoDataInterpretation(value: any | all): Self = StObject.set(x, "noDataInterpretation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoDataInterpretationUndefined: Self = StObject.set(x, "noDataInterpretation", js.undefined)
    
    @scala.inline
    def setNoDataUndefined: Self = StObject.set(x, "noData", js.undefined)
    
    @scala.inline
    def setNoDataVarargs(value: Double*): Self = StObject.set(x, "noData", js.Array(value :_*))
    
    @scala.inline
    def setObjectIdField(value: String): Self = StObject.set(x, "objectIdField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdFieldUndefined: Self = StObject.set(x, "objectIdField", js.undefined)
    
    @scala.inline
    def setPixelFilter(value: /* pixelData */ PixelData => Unit): Self = StObject.set(x, "pixelFilter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPixelFilterUndefined: Self = StObject.set(x, "pixelFilter", js.undefined)
    
    @scala.inline
    def setPixelType(value: unknown | s8 | s16 | s32 | u8 | u16 | u32 | f32 | f64): Self = StObject.set(x, "pixelType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelTypeUndefined: Self = StObject.set(x, "pixelType", js.undefined)
    
    @scala.inline
    def setRasterAttributeTableFieldPrefix(value: String): Self = StObject.set(x, "rasterAttributeTableFieldPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRasterAttributeTableFieldPrefixUndefined: Self = StObject.set(x, "rasterAttributeTableFieldPrefix", js.undefined)
    
    @scala.inline
    def setRenderer(
      value: ClassBreaksRendererProperties | UniqueValueRendererProperties | RasterStretchRendererProperties | RasterShadedReliefRendererProperties | RasterColormapRendererProperties
    ): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
    
    @scala.inline
    def setRenderingRule(value: RasterFunctionProperties): Self = StObject.set(x, "renderingRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderingRuleUndefined: Self = StObject.set(x, "renderingRule", js.undefined)
    
    @scala.inline
    def setSourceJSON(value: js.Any): Self = StObject.set(x, "sourceJSON", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceJSONUndefined: Self = StObject.set(x, "sourceJSON", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
