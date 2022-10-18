package typings.awsSdk.clientsFrauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ATIMetricDataPoint extends StObject {
  
  /**
    *  The anomaly discovery rate. This metric quantifies the percentage of anomalies that can be detected by the model at the selected score threshold. A lower score threshold increases the percentage of anomalies captured by the model, but would also require challenging a larger percentage of login events, leading to a higher customer friction. 
    */
  var adr: js.UndefOr[float] = js.undefined
  
  /**
    *  The account takeover discovery rate. This metric quantifies the percentage of account compromise events that can be detected by the model at the selected score threshold. This metric is only available if 50 or more entities with at-least one labeled account takeover event is present in the ingested dataset. 
    */
  var atodr: js.UndefOr[float] = js.undefined
  
  /**
    *  The challenge rate. This indicates the percentage of login events that the model recommends to challenge such as one-time password, multi-factor authentication, and investigations. 
    */
  var cr: js.UndefOr[float] = js.undefined
  
  /**
    *  The model's threshold that specifies an acceptable fraud capture rate. For example, a threshold of 500 means any model score 500 or above is labeled as fraud. 
    */
  var threshold: js.UndefOr[float] = js.undefined
}
object ATIMetricDataPoint {
  
  inline def apply(): ATIMetricDataPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ATIMetricDataPoint]
  }
  
  extension [Self <: ATIMetricDataPoint](x: Self) {
    
    inline def setAdr(value: float): Self = StObject.set(x, "adr", value.asInstanceOf[js.Any])
    
    inline def setAdrUndefined: Self = StObject.set(x, "adr", js.undefined)
    
    inline def setAtodr(value: float): Self = StObject.set(x, "atodr", value.asInstanceOf[js.Any])
    
    inline def setAtodrUndefined: Self = StObject.set(x, "atodr", js.undefined)
    
    inline def setCr(value: float): Self = StObject.set(x, "cr", value.asInstanceOf[js.Any])
    
    inline def setCrUndefined: Self = StObject.set(x, "cr", js.undefined)
    
    inline def setThreshold(value: float): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    
    inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
  }
}
