package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoverageDescriptionV100DomainSet extends StObject {
  
  /**
  		 * Spatial domain of a coverage.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV100)
  		 */
  var spatialDomain: CoverageDescriptionV100DomainSetSpatialDomain
  
  /**
  		 * Temporal domain or extent of a coverage.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV100)
  		 */
  var temporalDomain: js.UndefOr[TemporalDomain] = js.undefined
}
object CoverageDescriptionV100DomainSet {
  
  inline def apply(spatialDomain: CoverageDescriptionV100DomainSetSpatialDomain): CoverageDescriptionV100DomainSet = {
    val __obj = js.Dynamic.literal(spatialDomain = spatialDomain.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoverageDescriptionV100DomainSet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CoverageDescriptionV100DomainSet] (val x: Self) extends AnyVal {
    
    inline def setSpatialDomain(value: CoverageDescriptionV100DomainSetSpatialDomain): Self = StObject.set(x, "spatialDomain", value.asInstanceOf[js.Any])
    
    inline def setTemporalDomain(value: TemporalDomain): Self = StObject.set(x, "temporalDomain", value.asInstanceOf[js.Any])
    
    inline def setTemporalDomainUndefined: Self = StObject.set(x, "temporalDomain", js.undefined)
  }
}
