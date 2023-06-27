package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoverageDescriptionV201EOCoverageMetadataObservation extends StObject {
  
  /**
  		 * Earth observation acquisition type.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV201)
  		 */
  var acquisitionType: js.UndefOr[String] = js.undefined
  
  /**
  		 * Earth observation footprint.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV201)
  		 */
  var footprint: js.UndefOr[Polygon] = js.undefined
  
  /**
  		 * Earth observation phenomenon time.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV201)
  		 */
  var phenomenonTime: js.UndefOr[TemporalDomain] = js.undefined
  
  /**
  		 * Earth observation resultTime.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV201)
  		 */
  var resultTime: js.UndefOr[TemporalDomain] = js.undefined
  
  /**
  		 * Earth observation status.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV201)
  		 */
  var status: js.UndefOr[String] = js.undefined
}
object CoverageDescriptionV201EOCoverageMetadataObservation {
  
  inline def apply(): CoverageDescriptionV201EOCoverageMetadataObservation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoverageDescriptionV201EOCoverageMetadataObservation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CoverageDescriptionV201EOCoverageMetadataObservation] (val x: Self) extends AnyVal {
    
    inline def setAcquisitionType(value: String): Self = StObject.set(x, "acquisitionType", value.asInstanceOf[js.Any])
    
    inline def setAcquisitionTypeUndefined: Self = StObject.set(x, "acquisitionType", js.undefined)
    
    inline def setFootprint(value: Polygon): Self = StObject.set(x, "footprint", value.asInstanceOf[js.Any])
    
    inline def setFootprintUndefined: Self = StObject.set(x, "footprint", js.undefined)
    
    inline def setPhenomenonTime(value: TemporalDomain): Self = StObject.set(x, "phenomenonTime", value.asInstanceOf[js.Any])
    
    inline def setPhenomenonTimeUndefined: Self = StObject.set(x, "phenomenonTime", js.undefined)
    
    inline def setResultTime(value: TemporalDomain): Self = StObject.set(x, "resultTime", value.asInstanceOf[js.Any])
    
    inline def setResultTimeUndefined: Self = StObject.set(x, "resultTime", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
