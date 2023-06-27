package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`2Dot0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoverageDescriptionV201 extends StObject {
  
  /**
  		 * The WCS 2.0 Earth Observation coverage metadata.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV201)
  		 */
  var EOCoverageMetadata: CoverageDescriptionV201EOCoverageMetadata
  
  /**
  		 * Spatial and temporal extent of a coverage.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV201)
  		 */
  var boundedBy: CoverageDescriptionV201BoundedBy
  
  /**
  		 * Coverage function.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV201)
  		 */
  var coverageFunction: js.UndefOr[Any] = js.undefined
  
  /**
  		 * Coverage id.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV201)
  		 */
  var coverageId: String
  
  /**
  		 * Domains associated with a coverage.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV201)
  		 */
  var domainSet: CoverageDescriptionV201DomainSet
  
  /**
  		 * Coverage extension.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV201)
  		 */
  var `extension`: js.UndefOr[String] = js.undefined
  
  /**
  		 * Describes the semantics of the range set values supported by a coverage.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV201)
  		 */
  var rangeType: CoverageDescriptionV201RangeType
  
  /**
  		 * Service x,y resolution.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV201)
  		 */
  var resolution: CoverageDescriptionV201Resolution
  
  /**
  		 * Service parameters.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV201)
  		 */
  var serviceParameters: Any
  
  /**
  		 * Service version.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV201)
  		 */
  var version: `2Dot0`
}
object CoverageDescriptionV201 {
  
  inline def apply(
    EOCoverageMetadata: CoverageDescriptionV201EOCoverageMetadata,
    boundedBy: CoverageDescriptionV201BoundedBy,
    coverageId: String,
    domainSet: CoverageDescriptionV201DomainSet,
    rangeType: CoverageDescriptionV201RangeType,
    resolution: CoverageDescriptionV201Resolution,
    serviceParameters: Any
  ): CoverageDescriptionV201 = {
    val __obj = js.Dynamic.literal(EOCoverageMetadata = EOCoverageMetadata.asInstanceOf[js.Any], boundedBy = boundedBy.asInstanceOf[js.Any], coverageId = coverageId.asInstanceOf[js.Any], domainSet = domainSet.asInstanceOf[js.Any], rangeType = rangeType.asInstanceOf[js.Any], resolution = resolution.asInstanceOf[js.Any], serviceParameters = serviceParameters.asInstanceOf[js.Any], version = "2.0")
    __obj.asInstanceOf[CoverageDescriptionV201]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CoverageDescriptionV201] (val x: Self) extends AnyVal {
    
    inline def setBoundedBy(value: CoverageDescriptionV201BoundedBy): Self = StObject.set(x, "boundedBy", value.asInstanceOf[js.Any])
    
    inline def setCoverageFunction(value: Any): Self = StObject.set(x, "coverageFunction", value.asInstanceOf[js.Any])
    
    inline def setCoverageFunctionUndefined: Self = StObject.set(x, "coverageFunction", js.undefined)
    
    inline def setCoverageId(value: String): Self = StObject.set(x, "coverageId", value.asInstanceOf[js.Any])
    
    inline def setDomainSet(value: CoverageDescriptionV201DomainSet): Self = StObject.set(x, "domainSet", value.asInstanceOf[js.Any])
    
    inline def setEOCoverageMetadata(value: CoverageDescriptionV201EOCoverageMetadata): Self = StObject.set(x, "EOCoverageMetadata", value.asInstanceOf[js.Any])
    
    inline def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    inline def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
    
    inline def setRangeType(value: CoverageDescriptionV201RangeType): Self = StObject.set(x, "rangeType", value.asInstanceOf[js.Any])
    
    inline def setResolution(value: CoverageDescriptionV201Resolution): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    
    inline def setServiceParameters(value: Any): Self = StObject.set(x, "serviceParameters", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: `2Dot0`): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
