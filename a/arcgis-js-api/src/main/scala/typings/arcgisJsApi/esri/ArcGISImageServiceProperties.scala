package typings.arcgisJsApi.esri

import typings.arcgisJsApi.anon.ClassBreaksRendererProper
import typings.arcgisJsApi.anon.FlowRendererPropertiestyp
import typings.arcgisJsApi.anon.RasterColormapRendererPro
import typings.arcgisJsApi.anon.RasterShadedReliefRendere
import typings.arcgisJsApi.anon.RasterStretchRendererProp
import typings.arcgisJsApi.anon.UniqueValueRendererProper
import typings.arcgisJsApi.anon.VectorFieldRendererProper
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
  		 * Defines a band combination using 0-based band indexes.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#bandIds)
  		 */
  var bandIds: js.UndefOr[js.Array[Double]] = js.undefined
  
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
  		 * @default 0.01
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
  		 * @default 4100
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#imageMaxHeight)
  		 */
  var imageMaxHeight: js.UndefOr[Double] = js.undefined
  
  /**
  		 * Indicates the maximum width of the image exported by the service.
  		 *
  		 * @default 15000
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
  		 * Represents a multidimensional subset of raster data.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#multidimensionalSubset)
  		 */
  var multidimensionalSubset: js.UndefOr[MultidimensionalSubsetProperties] = js.undefined
  
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
  		 * Specifies the rule for how the requested image should be processed.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#rasterFunction)
  		 */
  var rasterFunction: js.UndefOr[RasterFunctionProperties] = js.undefined
  
  /**
  		 * The renderer assigned to the layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#renderer)
  		 */
  var renderer: js.UndefOr[
    ClassBreaksRendererProper | UniqueValueRendererProper | RasterStretchRendererProp | RasterShadedReliefRendere | RasterColormapRendererPro | VectorFieldRendererProper | FlowRendererPropertiestyp
  ] = js.undefined
  
  /**
  		 * Specifies the rule for how the requested image should be rendered.
  		 *
  		 * @deprecated since 4.27. Use {@link module:esri/layers/ImageryLayer#rasterFunction rasterFunction} instead.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#renderingRule)
  		 */
  var renderingRule: js.UndefOr[RasterFunctionProperties] = js.undefined
  
  /**
  		 * The [image service's metadata JSON](https://developers.arcgis.com/rest/services-reference/image-service.htm) exposed by the ArcGIS REST API.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#sourceJSON)
  		 */
  var sourceJSON: js.UndefOr[Any] = js.undefined
  
  /**
  		 * The URL to the REST endpoint of the layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#url)
  		 */
  var url: js.UndefOr[String] = js.undefined
}
object ArcGISImageServiceProperties {
  
  inline def apply(): ArcGISImageServiceProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArcGISImageServiceProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArcGISImageServiceProperties] (val x: Self) extends AnyVal {
    
    inline def setBandIds(value: js.Array[Double]): Self = StObject.set(x, "bandIds", value.asInstanceOf[js.Any])
    
    inline def setBandIdsUndefined: Self = StObject.set(x, "bandIds", js.undefined)
    
    inline def setBandIdsVarargs(value: Double*): Self = StObject.set(x, "bandIds", js.Array(value*))
    
    inline def setCapabilities(value: ArcGISImageServiceCapabilities): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
    
    inline def setCapabilitiesUndefined: Self = StObject.set(x, "capabilities", js.undefined)
    
    inline def setCompressionQuality(value: Double): Self = StObject.set(x, "compressionQuality", value.asInstanceOf[js.Any])
    
    inline def setCompressionQualityUndefined: Self = StObject.set(x, "compressionQuality", js.undefined)
    
    inline def setCompressionTolerance(value: Double): Self = StObject.set(x, "compressionTolerance", value.asInstanceOf[js.Any])
    
    inline def setCompressionToleranceUndefined: Self = StObject.set(x, "compressionTolerance", js.undefined)
    
    inline def setCopyright(value: String): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
    
    inline def setCopyrightUndefined: Self = StObject.set(x, "copyright", js.undefined)
    
    inline def setDefinitionExpression(value: String): Self = StObject.set(x, "definitionExpression", value.asInstanceOf[js.Any])
    
    inline def setDefinitionExpressionUndefined: Self = StObject.set(x, "definitionExpression", js.undefined)
    
    inline def setFields(value: js.Array[FieldProperties]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: FieldProperties*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setFormat(value: png | png8 | png24 | png32 | jpg | bmp | gif | jpgpng | lerc | tiff): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setHasMultidimensions(value: Boolean): Self = StObject.set(x, "hasMultidimensions", value.asInstanceOf[js.Any])
    
    inline def setHasMultidimensionsUndefined: Self = StObject.set(x, "hasMultidimensions", js.undefined)
    
    inline def setImageMaxHeight(value: Double): Self = StObject.set(x, "imageMaxHeight", value.asInstanceOf[js.Any])
    
    inline def setImageMaxHeightUndefined: Self = StObject.set(x, "imageMaxHeight", js.undefined)
    
    inline def setImageMaxWidth(value: Double): Self = StObject.set(x, "imageMaxWidth", value.asInstanceOf[js.Any])
    
    inline def setImageMaxWidthUndefined: Self = StObject.set(x, "imageMaxWidth", js.undefined)
    
    inline def setInterpolation(value: nearest | bilinear | cubic | majority): Self = StObject.set(x, "interpolation", value.asInstanceOf[js.Any])
    
    inline def setInterpolationUndefined: Self = StObject.set(x, "interpolation", js.undefined)
    
    inline def setMosaicRule(value: MosaicRuleProperties): Self = StObject.set(x, "mosaicRule", value.asInstanceOf[js.Any])
    
    inline def setMosaicRuleUndefined: Self = StObject.set(x, "mosaicRule", js.undefined)
    
    inline def setMultidimensionalSubset(value: MultidimensionalSubsetProperties): Self = StObject.set(x, "multidimensionalSubset", value.asInstanceOf[js.Any])
    
    inline def setMultidimensionalSubsetUndefined: Self = StObject.set(x, "multidimensionalSubset", js.undefined)
    
    inline def setNoData(value: Double | js.Array[Double]): Self = StObject.set(x, "noData", value.asInstanceOf[js.Any])
    
    inline def setNoDataInterpretation(value: any | all): Self = StObject.set(x, "noDataInterpretation", value.asInstanceOf[js.Any])
    
    inline def setNoDataInterpretationUndefined: Self = StObject.set(x, "noDataInterpretation", js.undefined)
    
    inline def setNoDataUndefined: Self = StObject.set(x, "noData", js.undefined)
    
    inline def setNoDataVarargs(value: Double*): Self = StObject.set(x, "noData", js.Array(value*))
    
    inline def setObjectIdField(value: String): Self = StObject.set(x, "objectIdField", value.asInstanceOf[js.Any])
    
    inline def setObjectIdFieldUndefined: Self = StObject.set(x, "objectIdField", js.undefined)
    
    inline def setPixelFilter(value: /* pixelData */ PixelData => scala.Unit): Self = StObject.set(x, "pixelFilter", js.Any.fromFunction1(value))
    
    inline def setPixelFilterUndefined: Self = StObject.set(x, "pixelFilter", js.undefined)
    
    inline def setPixelType(value: unknown | s8 | s16 | s32 | u8 | u16 | u32 | f32 | f64): Self = StObject.set(x, "pixelType", value.asInstanceOf[js.Any])
    
    inline def setPixelTypeUndefined: Self = StObject.set(x, "pixelType", js.undefined)
    
    inline def setRasterFunction(value: RasterFunctionProperties): Self = StObject.set(x, "rasterFunction", value.asInstanceOf[js.Any])
    
    inline def setRasterFunctionUndefined: Self = StObject.set(x, "rasterFunction", js.undefined)
    
    inline def setRenderer(
      value: ClassBreaksRendererProper | UniqueValueRendererProper | RasterStretchRendererProp | RasterShadedReliefRendere | RasterColormapRendererPro | VectorFieldRendererProper | FlowRendererPropertiestyp
    ): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
    
    inline def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
    
    inline def setRenderingRule(value: RasterFunctionProperties): Self = StObject.set(x, "renderingRule", value.asInstanceOf[js.Any])
    
    inline def setRenderingRuleUndefined: Self = StObject.set(x, "renderingRule", js.undefined)
    
    inline def setSourceJSON(value: Any): Self = StObject.set(x, "sourceJSON", value.asInstanceOf[js.Any])
    
    inline def setSourceJSONUndefined: Self = StObject.set(x, "sourceJSON", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
