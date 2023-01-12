package typings.awsSdk.clientsFrauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrainingMetricsV2 extends StObject {
  
  /**
    *  The Account Takeover Insights (ATI) model training metric details. 
    */
  var ati: js.UndefOr[ATITrainingMetricsValue] = js.undefined
  
  /**
    *  The Online Fraud Insights (OFI) model training metric details. 
    */
  var ofi: js.UndefOr[OFITrainingMetricsValue] = js.undefined
  
  /**
    *  The Transaction Fraud Insights (TFI) model training metric details. 
    */
  var tfi: js.UndefOr[TFITrainingMetricsValue] = js.undefined
}
object TrainingMetricsV2 {
  
  inline def apply(): TrainingMetricsV2 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrainingMetricsV2]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TrainingMetricsV2] (val x: Self) extends AnyVal {
    
    inline def setAti(value: ATITrainingMetricsValue): Self = StObject.set(x, "ati", value.asInstanceOf[js.Any])
    
    inline def setAtiUndefined: Self = StObject.set(x, "ati", js.undefined)
    
    inline def setOfi(value: OFITrainingMetricsValue): Self = StObject.set(x, "ofi", value.asInstanceOf[js.Any])
    
    inline def setOfiUndefined: Self = StObject.set(x, "ofi", js.undefined)
    
    inline def setTfi(value: TFITrainingMetricsValue): Self = StObject.set(x, "tfi", value.asInstanceOf[js.Any])
    
    inline def setTfiUndefined: Self = StObject.set(x, "tfi", js.undefined)
  }
}
