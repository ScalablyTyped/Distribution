package typings.awsSdk.clientsFrauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ATIModelPerformance extends StObject {
  
  /**
    *  The anomaly separation index (ASI) score. This metric summarizes the overall ability of the model to separate anomalous activities from the normal behavior. Depending on the business, a large fraction of these anomalous activities can be malicious and correspond to the account takeover attacks. A model with no separability power will have the lowest possible ASI score of 0.5, whereas the a model with a high separability power will have the highest possible ASI score of 1.0 
    */
  var asi: js.UndefOr[float] = js.undefined
}
object ATIModelPerformance {
  
  inline def apply(): ATIModelPerformance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ATIModelPerformance]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ATIModelPerformance] (val x: Self) extends AnyVal {
    
    inline def setAsi(value: float): Self = StObject.set(x, "asi", value.asInstanceOf[js.Any])
    
    inline def setAsiUndefined: Self = StObject.set(x, "asi", js.undefined)
  }
}
