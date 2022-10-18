package typings.awsSdk.clientsEcrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CvssScoreAdjustment extends StObject {
  
  /**
    * The metric used to adjust the CVSS score.
    */
  var metric: js.UndefOr[Metric] = js.undefined
  
  /**
    * The reason the CVSS score has been adjustment.
    */
  var reason: js.UndefOr[Reason] = js.undefined
}
object CvssScoreAdjustment {
  
  inline def apply(): CvssScoreAdjustment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CvssScoreAdjustment]
  }
  
  extension [Self <: CvssScoreAdjustment](x: Self) {
    
    inline def setMetric(value: Metric): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
    
    inline def setMetricUndefined: Self = StObject.set(x, "metric", js.undefined)
    
    inline def setReason(value: Reason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
