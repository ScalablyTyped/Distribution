package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoverageDescriptionV201EOCoverageMetadata extends StObject {
  
  /**
  		 * Earth observation identifier.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV201)
  		 */
  var identifier: String
  
  /**
  		 * Earth observation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#CoverageDescriptionV201)
  		 */
  var observation: CoverageDescriptionV201EOCoverageMetadataObservation
}
object CoverageDescriptionV201EOCoverageMetadata {
  
  inline def apply(identifier: String, observation: CoverageDescriptionV201EOCoverageMetadataObservation): CoverageDescriptionV201EOCoverageMetadata = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], observation = observation.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoverageDescriptionV201EOCoverageMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CoverageDescriptionV201EOCoverageMetadata] (val x: Self) extends AnyVal {
    
    inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setObservation(value: CoverageDescriptionV201EOCoverageMetadataObservation): Self = StObject.set(x, "observation", value.asInstanceOf[js.Any])
  }
}
