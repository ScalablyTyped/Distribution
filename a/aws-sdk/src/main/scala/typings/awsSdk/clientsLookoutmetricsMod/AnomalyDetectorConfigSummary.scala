package typings.awsSdk.clientsLookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnomalyDetectorConfigSummary extends StObject {
  
  /**
    * The interval at which the detector analyzes its source data.
    */
  var AnomalyDetectorFrequency: js.UndefOr[Frequency] = js.undefined
}
object AnomalyDetectorConfigSummary {
  
  inline def apply(): AnomalyDetectorConfigSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnomalyDetectorConfigSummary]
  }
  
  extension [Self <: AnomalyDetectorConfigSummary](x: Self) {
    
    inline def setAnomalyDetectorFrequency(value: Frequency): Self = StObject.set(x, "AnomalyDetectorFrequency", value.asInstanceOf[js.Any])
    
    inline def setAnomalyDetectorFrequencyUndefined: Self = StObject.set(x, "AnomalyDetectorFrequency", js.undefined)
  }
}
