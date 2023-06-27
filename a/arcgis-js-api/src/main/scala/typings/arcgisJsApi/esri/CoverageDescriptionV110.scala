package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`1Dot1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoverageDescriptionV110 extends StObject {
  
  /**
  		 * Coverage abstract.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV110)
  		 */
  var `abstract`: String
  
  /**
  		 * Describes the spatial and temporal domain of a coverage.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV110)
  		 */
  var domain: CoverageDescriptionV110Domain
  
  /**
  		 * Specifies spatial resolution of the coordinate reference system.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV110)
  		 */
  var gridBaseCRS: String
  
  /**
  		 * Coverage identifier.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV110)
  		 */
  var identifier: String
  
  /**
  		 * Coverage metadata.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV110)
  		 */
  var metadata: js.UndefOr[String] = js.undefined
  
  /**
  		 * Defines the properties (categories, measures, or values) assigned to each location in the domain.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV110)
  		 */
  var range: CoverageDescriptionV110Range
  
  /**
  		 * Resolution x, y.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV110)
  		 */
  var resolution: CoverageDescriptionV110Resolution
  
  /**
  		 * Coordinate reference systems supported by a coverage.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV110)
  		 */
  var supportedCRSs: js.Array[String]
  
  /**
  		 * Formats supported by a coverage.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV110)
  		 */
  var supportedFormats: js.Array[String]
  
  /**
  		 * Temporal domain or extent of the coverage.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV110)
  		 */
  var temporalDomain: TemporalDomain
  
  /**
  		 * Coverage title.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV110)
  		 */
  var title: String
  
  /**
  		 * Indicates if the EPSG axis is used.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV110)
  		 */
  var useEPSGAxis: Boolean
  
  /**
  		 * Coverage version.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV110)
  		 */
  var version: `1Dot1`
}
object CoverageDescriptionV110 {
  
  inline def apply(
    `abstract`: String,
    domain: CoverageDescriptionV110Domain,
    gridBaseCRS: String,
    identifier: String,
    range: CoverageDescriptionV110Range,
    resolution: CoverageDescriptionV110Resolution,
    supportedCRSs: js.Array[String],
    supportedFormats: js.Array[String],
    temporalDomain: TemporalDomain,
    title: String,
    useEPSGAxis: Boolean
  ): CoverageDescriptionV110 = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], gridBaseCRS = gridBaseCRS.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], resolution = resolution.asInstanceOf[js.Any], supportedCRSs = supportedCRSs.asInstanceOf[js.Any], supportedFormats = supportedFormats.asInstanceOf[js.Any], temporalDomain = temporalDomain.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], useEPSGAxis = useEPSGAxis.asInstanceOf[js.Any], version = "1.1")
    __obj.updateDynamic("abstract")(`abstract`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoverageDescriptionV110]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CoverageDescriptionV110] (val x: Self) extends AnyVal {
    
    inline def setAbstract(value: String): Self = StObject.set(x, "abstract", value.asInstanceOf[js.Any])
    
    inline def setDomain(value: CoverageDescriptionV110Domain): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setGridBaseCRS(value: String): Self = StObject.set(x, "gridBaseCRS", value.asInstanceOf[js.Any])
    
    inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: String): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setRange(value: CoverageDescriptionV110Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setResolution(value: CoverageDescriptionV110Resolution): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    
    inline def setSupportedCRSs(value: js.Array[String]): Self = StObject.set(x, "supportedCRSs", value.asInstanceOf[js.Any])
    
    inline def setSupportedCRSsVarargs(value: String*): Self = StObject.set(x, "supportedCRSs", js.Array(value*))
    
    inline def setSupportedFormats(value: js.Array[String]): Self = StObject.set(x, "supportedFormats", value.asInstanceOf[js.Any])
    
    inline def setSupportedFormatsVarargs(value: String*): Self = StObject.set(x, "supportedFormats", js.Array(value*))
    
    inline def setTemporalDomain(value: TemporalDomain): Self = StObject.set(x, "temporalDomain", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setUseEPSGAxis(value: Boolean): Self = StObject.set(x, "useEPSGAxis", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: `1Dot1`): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
