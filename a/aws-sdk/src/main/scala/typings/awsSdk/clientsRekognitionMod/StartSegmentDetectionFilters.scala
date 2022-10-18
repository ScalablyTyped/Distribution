package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartSegmentDetectionFilters extends StObject {
  
  /**
    * Filters that are specific to shot detections.
    */
  var ShotFilter: js.UndefOr[StartShotDetectionFilter] = js.undefined
  
  /**
    * Filters that are specific to technical cues.
    */
  var TechnicalCueFilter: js.UndefOr[StartTechnicalCueDetectionFilter] = js.undefined
}
object StartSegmentDetectionFilters {
  
  inline def apply(): StartSegmentDetectionFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartSegmentDetectionFilters]
  }
  
  extension [Self <: StartSegmentDetectionFilters](x: Self) {
    
    inline def setShotFilter(value: StartShotDetectionFilter): Self = StObject.set(x, "ShotFilter", value.asInstanceOf[js.Any])
    
    inline def setShotFilterUndefined: Self = StObject.set(x, "ShotFilter", js.undefined)
    
    inline def setTechnicalCueFilter(value: StartTechnicalCueDetectionFilter): Self = StObject.set(x, "TechnicalCueFilter", value.asInstanceOf[js.Any])
    
    inline def setTechnicalCueFilterUndefined: Self = StObject.set(x, "TechnicalCueFilter", js.undefined)
  }
}
