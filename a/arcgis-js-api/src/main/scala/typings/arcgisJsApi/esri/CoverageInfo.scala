package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`1Dot0Dot0`
import typings.arcgisJsApi.arcgisJsApiStrings.`1Dot1Dot0`
import typings.arcgisJsApi.arcgisJsApiStrings.`1Dot1Dot1`
import typings.arcgisJsApi.arcgisJsApiStrings.`1Dot1Dot2`
import typings.arcgisJsApi.arcgisJsApiStrings.`2Dot0Dot1`
import typings.arcgisJsApi.arcgisJsApiStrings.bilinear
import typings.arcgisJsApi.arcgisJsApiStrings.cubic
import typings.arcgisJsApi.arcgisJsApiStrings.majority
import typings.arcgisJsApi.arcgisJsApiStrings.nearest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoverageInfo extends StObject {
  
  /**
    * Coverage band names.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageInfo)
    */
  var bandNames: js.Array[String]
  
  /**
    * Coverage description for different versions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageInfo)
    */
  var coverageDescription: CoverageDescriptionV100 | CoverageDescriptionV110 | CoverageDescriptionV201
  
  /**
    * Service coverage description.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageInfo)
    */
  var description: String
  
  /**
    * Service coverage id.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageInfo)
    */
  var id: String
  
  /**
    * Spatial extent of the coverage.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageInfo)
    */
  var lonLatEnvelope: Extent
  
  /**
    * Coverage raster info.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageInfo)
    */
  var rasterInfo: RasterInfo
  
  /**
    * Formats supported by a service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageInfo)
    */
  var supportedFormats: js.Array[String]
  
  /**
    * Interpolation supported by a service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageInfo)
    */
  var supportedInterpolations: nearest | bilinear | cubic | majority
  
  /**
    * Service coverage title.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageInfo)
    */
  var title: String
  
  /**
    * Indicates if the EPSG axis is used.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageInfo)
    */
  var useEPSGAxis: Boolean
  
  /**
    * The service version.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageInfo)
    */
  var version: `1Dot0Dot0` | `1Dot1Dot0` | `1Dot1Dot1` | `1Dot1Dot2` | `2Dot0Dot1`
}
object CoverageInfo {
  
  inline def apply(
    bandNames: js.Array[String],
    coverageDescription: CoverageDescriptionV100 | CoverageDescriptionV110 | CoverageDescriptionV201,
    description: String,
    id: String,
    lonLatEnvelope: Extent,
    rasterInfo: RasterInfo,
    supportedFormats: js.Array[String],
    supportedInterpolations: nearest | bilinear | cubic | majority,
    title: String,
    useEPSGAxis: Boolean,
    version: `1Dot0Dot0` | `1Dot1Dot0` | `1Dot1Dot1` | `1Dot1Dot2` | `2Dot0Dot1`
  ): CoverageInfo = {
    val __obj = js.Dynamic.literal(bandNames = bandNames.asInstanceOf[js.Any], coverageDescription = coverageDescription.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lonLatEnvelope = lonLatEnvelope.asInstanceOf[js.Any], rasterInfo = rasterInfo.asInstanceOf[js.Any], supportedFormats = supportedFormats.asInstanceOf[js.Any], supportedInterpolations = supportedInterpolations.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], useEPSGAxis = useEPSGAxis.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoverageInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CoverageInfo] (val x: Self) extends AnyVal {
    
    inline def setBandNames(value: js.Array[String]): Self = StObject.set(x, "bandNames", value.asInstanceOf[js.Any])
    
    inline def setBandNamesVarargs(value: String*): Self = StObject.set(x, "bandNames", js.Array(value*))
    
    inline def setCoverageDescription(value: CoverageDescriptionV100 | CoverageDescriptionV110 | CoverageDescriptionV201): Self = StObject.set(x, "coverageDescription", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLonLatEnvelope(value: Extent): Self = StObject.set(x, "lonLatEnvelope", value.asInstanceOf[js.Any])
    
    inline def setRasterInfo(value: RasterInfo): Self = StObject.set(x, "rasterInfo", value.asInstanceOf[js.Any])
    
    inline def setSupportedFormats(value: js.Array[String]): Self = StObject.set(x, "supportedFormats", value.asInstanceOf[js.Any])
    
    inline def setSupportedFormatsVarargs(value: String*): Self = StObject.set(x, "supportedFormats", js.Array(value*))
    
    inline def setSupportedInterpolations(value: nearest | bilinear | cubic | majority): Self = StObject.set(x, "supportedInterpolations", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setUseEPSGAxis(value: Boolean): Self = StObject.set(x, "useEPSGAxis", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: `1Dot0Dot0` | `1Dot1Dot0` | `1Dot1Dot1` | `1Dot1Dot2` | `2Dot0Dot1`): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
