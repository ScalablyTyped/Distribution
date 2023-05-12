package typings.awsSdk.clientsCostexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Impact extends StObject {
  
  /**
    * The maximum dollar value that's observed for an anomaly.
    */
  var MaxImpact: GenericDouble
  
  /**
    * The cumulative dollar amount that was actually spent during the anomaly.
    */
  var TotalActualSpend: js.UndefOr[NullableNonNegativeDouble] = js.undefined
  
  /**
    * The cumulative dollar amount that was expected to be spent during the anomaly. It is calculated using advanced machine learning models to determine the typical spending pattern based on historical data for a customer.
    */
  var TotalExpectedSpend: js.UndefOr[NullableNonNegativeDouble] = js.undefined
  
  /**
    * The cumulative dollar difference between the total actual spend and total expected spend. It is calculated as TotalActualSpend - TotalExpectedSpend.
    */
  var TotalImpact: js.UndefOr[GenericDouble] = js.undefined
  
  /**
    * The cumulative percentage difference between the total actual spend and total expected spend. It is calculated as (TotalImpact / TotalExpectedSpend) * 100. When TotalExpectedSpend is zero, this field is omitted. Expected spend can be zero in situations such as when you start to use a service for the first time.
    */
  var TotalImpactPercentage: js.UndefOr[NullableNonNegativeDouble] = js.undefined
}
object Impact {
  
  inline def apply(MaxImpact: GenericDouble): Impact = {
    val __obj = js.Dynamic.literal(MaxImpact = MaxImpact.asInstanceOf[js.Any])
    __obj.asInstanceOf[Impact]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Impact] (val x: Self) extends AnyVal {
    
    inline def setMaxImpact(value: GenericDouble): Self = StObject.set(x, "MaxImpact", value.asInstanceOf[js.Any])
    
    inline def setTotalActualSpend(value: NullableNonNegativeDouble): Self = StObject.set(x, "TotalActualSpend", value.asInstanceOf[js.Any])
    
    inline def setTotalActualSpendUndefined: Self = StObject.set(x, "TotalActualSpend", js.undefined)
    
    inline def setTotalExpectedSpend(value: NullableNonNegativeDouble): Self = StObject.set(x, "TotalExpectedSpend", value.asInstanceOf[js.Any])
    
    inline def setTotalExpectedSpendUndefined: Self = StObject.set(x, "TotalExpectedSpend", js.undefined)
    
    inline def setTotalImpact(value: GenericDouble): Self = StObject.set(x, "TotalImpact", value.asInstanceOf[js.Any])
    
    inline def setTotalImpactPercentage(value: NullableNonNegativeDouble): Self = StObject.set(x, "TotalImpactPercentage", value.asInstanceOf[js.Any])
    
    inline def setTotalImpactPercentageUndefined: Self = StObject.set(x, "TotalImpactPercentage", js.undefined)
    
    inline def setTotalImpactUndefined: Self = StObject.set(x, "TotalImpact", js.undefined)
  }
}
