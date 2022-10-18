package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartTextDetectionFilters extends StObject {
  
  /**
    * Filter focusing on a certain area of the frame. Uses a BoundingBox object to set the region of the screen.
    */
  var RegionsOfInterest: js.UndefOr[typings.awsSdk.clientsRekognitionMod.RegionsOfInterest] = js.undefined
  
  /**
    * Filters focusing on qualities of the text, such as confidence or size.
    */
  var WordFilter: js.UndefOr[DetectionFilter] = js.undefined
}
object StartTextDetectionFilters {
  
  inline def apply(): StartTextDetectionFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartTextDetectionFilters]
  }
  
  extension [Self <: StartTextDetectionFilters](x: Self) {
    
    inline def setRegionsOfInterest(value: RegionsOfInterest): Self = StObject.set(x, "RegionsOfInterest", value.asInstanceOf[js.Any])
    
    inline def setRegionsOfInterestUndefined: Self = StObject.set(x, "RegionsOfInterest", js.undefined)
    
    inline def setRegionsOfInterestVarargs(value: RegionOfInterest*): Self = StObject.set(x, "RegionsOfInterest", js.Array(value*))
    
    inline def setWordFilter(value: DetectionFilter): Self = StObject.set(x, "WordFilter", value.asInstanceOf[js.Any])
    
    inline def setWordFilterUndefined: Self = StObject.set(x, "WordFilter", js.undefined)
  }
}
