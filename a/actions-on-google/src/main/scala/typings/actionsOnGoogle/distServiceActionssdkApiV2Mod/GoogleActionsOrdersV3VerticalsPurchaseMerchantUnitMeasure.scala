package typings.actionsOnGoogle.distServiceActionssdkApiV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsOrdersV3VerticalsPurchaseMerchantUnitMeasure extends StObject {
  
  /**
    * Value: Example 1.2.
    */
  var measure: js.UndefOr[Double] = js.undefined
  
  /**
    * Unit: Example POUND, GRAM.
    */
  var unit: js.UndefOr[GoogleActionsOrdersV3VerticalsPurchaseMerchantUnitMeasureUnit] = js.undefined
}
object GoogleActionsOrdersV3VerticalsPurchaseMerchantUnitMeasure {
  
  inline def apply(): GoogleActionsOrdersV3VerticalsPurchaseMerchantUnitMeasure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsOrdersV3VerticalsPurchaseMerchantUnitMeasure]
  }
  
  extension [Self <: GoogleActionsOrdersV3VerticalsPurchaseMerchantUnitMeasure](x: Self) {
    
    inline def setMeasure(value: Double): Self = StObject.set(x, "measure", value.asInstanceOf[js.Any])
    
    inline def setMeasureUndefined: Self = StObject.set(x, "measure", js.undefined)
    
    inline def setUnit(value: GoogleActionsOrdersV3VerticalsPurchaseMerchantUnitMeasureUnit): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
  }
}
