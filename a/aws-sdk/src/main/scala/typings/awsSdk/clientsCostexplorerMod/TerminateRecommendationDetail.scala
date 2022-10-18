package typings.awsSdk.clientsCostexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TerminateRecommendationDetail extends StObject {
  
  /**
    * The currency code that Amazon Web Services used to calculate the costs for this instance.
    */
  var CurrencyCode: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The estimated savings that result from modification, on a monthly basis.
    */
  var EstimatedMonthlySavings: js.UndefOr[GenericString] = js.undefined
}
object TerminateRecommendationDetail {
  
  inline def apply(): TerminateRecommendationDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TerminateRecommendationDetail]
  }
  
  extension [Self <: TerminateRecommendationDetail](x: Self) {
    
    inline def setCurrencyCode(value: GenericString): Self = StObject.set(x, "CurrencyCode", value.asInstanceOf[js.Any])
    
    inline def setCurrencyCodeUndefined: Self = StObject.set(x, "CurrencyCode", js.undefined)
    
    inline def setEstimatedMonthlySavings(value: GenericString): Self = StObject.set(x, "EstimatedMonthlySavings", value.asInstanceOf[js.Any])
    
    inline def setEstimatedMonthlySavingsUndefined: Self = StObject.set(x, "EstimatedMonthlySavings", js.undefined)
  }
}
