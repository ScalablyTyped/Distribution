package typings.awsSdk.clientsFrauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TFIModelPerformance extends StObject {
  
  /**
    *  The area under the curve (auc). This summarizes the total positive rate (tpr) and false positive rate (FPR) across all possible model score thresholds. 
    */
  var auc: js.UndefOr[float] = js.undefined
  
  /**
    *  Indicates the range of area under curve (auc) expected from the TFI model. A range greater than 0.1 indicates higher model uncertainity. 
    */
  var uncertaintyRange: js.UndefOr[UncertaintyRange] = js.undefined
}
object TFIModelPerformance {
  
  inline def apply(): TFIModelPerformance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TFIModelPerformance]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TFIModelPerformance] (val x: Self) extends AnyVal {
    
    inline def setAuc(value: float): Self = StObject.set(x, "auc", value.asInstanceOf[js.Any])
    
    inline def setAucUndefined: Self = StObject.set(x, "auc", js.undefined)
    
    inline def setUncertaintyRange(value: UncertaintyRange): Self = StObject.set(x, "uncertaintyRange", value.asInstanceOf[js.Any])
    
    inline def setUncertaintyRangeUndefined: Self = StObject.set(x, "uncertaintyRange", js.undefined)
  }
}
