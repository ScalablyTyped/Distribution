package typings.awsSdk.clientsForecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WeightedQuantileLoss extends StObject {
  
  /**
    * The difference between the predicted value and the actual value over the quantile, weighted (normalized) by dividing by the sum over all quantiles.
    */
  var LossValue: js.UndefOr[Double] = js.undefined
  
  /**
    * The quantile. Quantiles divide a probability distribution into regions of equal probability. For example, if the distribution was divided into 5 regions of equal probability, the quantiles would be 0.2, 0.4, 0.6, and 0.8.
    */
  var Quantile: js.UndefOr[Double] = js.undefined
}
object WeightedQuantileLoss {
  
  inline def apply(): WeightedQuantileLoss = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeightedQuantileLoss]
  }
  
  extension [Self <: WeightedQuantileLoss](x: Self) {
    
    inline def setLossValue(value: Double): Self = StObject.set(x, "LossValue", value.asInstanceOf[js.Any])
    
    inline def setLossValueUndefined: Self = StObject.set(x, "LossValue", js.undefined)
    
    inline def setQuantile(value: Double): Self = StObject.set(x, "Quantile", value.asInstanceOf[js.Any])
    
    inline def setQuantileUndefined: Self = StObject.set(x, "Quantile", js.undefined)
  }
}
