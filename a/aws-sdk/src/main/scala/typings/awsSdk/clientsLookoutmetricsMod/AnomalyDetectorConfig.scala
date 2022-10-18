package typings.awsSdk.clientsLookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnomalyDetectorConfig extends StObject {
  
  /**
    * The frequency at which the detector analyzes its source data.
    */
  var AnomalyDetectorFrequency: js.UndefOr[Frequency] = js.undefined
}
object AnomalyDetectorConfig {
  
  inline def apply(): AnomalyDetectorConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnomalyDetectorConfig]
  }
  
  extension [Self <: AnomalyDetectorConfig](x: Self) {
    
    inline def setAnomalyDetectorFrequency(value: Frequency): Self = StObject.set(x, "AnomalyDetectorFrequency", value.asInstanceOf[js.Any])
    
    inline def setAnomalyDetectorFrequencyUndefined: Self = StObject.set(x, "AnomalyDetectorFrequency", js.undefined)
  }
}
