package typings.awsSdk.clientsSagemakergeospatialMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VectorEnrichmentJobConfig extends StObject {
  
  /**
    * The input structure for Map Matching operation type.
    */
  var MapMatchingConfig: js.UndefOr[typings.awsSdk.clientsSagemakergeospatialMod.MapMatchingConfig] = js.undefined
  
  /**
    * The input structure for Reverse Geocoding operation type.
    */
  var ReverseGeocodingConfig: js.UndefOr[typings.awsSdk.clientsSagemakergeospatialMod.ReverseGeocodingConfig] = js.undefined
}
object VectorEnrichmentJobConfig {
  
  inline def apply(): VectorEnrichmentJobConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VectorEnrichmentJobConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VectorEnrichmentJobConfig] (val x: Self) extends AnyVal {
    
    inline def setMapMatchingConfig(value: MapMatchingConfig): Self = StObject.set(x, "MapMatchingConfig", value.asInstanceOf[js.Any])
    
    inline def setMapMatchingConfigUndefined: Self = StObject.set(x, "MapMatchingConfig", js.undefined)
    
    inline def setReverseGeocodingConfig(value: ReverseGeocodingConfig): Self = StObject.set(x, "ReverseGeocodingConfig", value.asInstanceOf[js.Any])
    
    inline def setReverseGeocodingConfigUndefined: Self = StObject.set(x, "ReverseGeocodingConfig", js.undefined)
  }
}
