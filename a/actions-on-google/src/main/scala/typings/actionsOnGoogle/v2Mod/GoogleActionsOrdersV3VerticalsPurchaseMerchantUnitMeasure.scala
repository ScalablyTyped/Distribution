package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsOrdersV3VerticalsPurchaseMerchantUnitMeasure extends StObject {
  
  /**
    * Value: Example 1.2.
    */
  var measure: js.UndefOr[Double] = js.native
  
  /**
    * Unit: Example POUND, GRAM.
    */
  var unit: js.UndefOr[GoogleActionsOrdersV3VerticalsPurchaseMerchantUnitMeasureUnit] = js.native
}
object GoogleActionsOrdersV3VerticalsPurchaseMerchantUnitMeasure {
  
  @scala.inline
  def apply(): GoogleActionsOrdersV3VerticalsPurchaseMerchantUnitMeasure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsOrdersV3VerticalsPurchaseMerchantUnitMeasure]
  }
  
  @scala.inline
  implicit class GoogleActionsOrdersV3VerticalsPurchaseMerchantUnitMeasureMutableBuilder[Self <: GoogleActionsOrdersV3VerticalsPurchaseMerchantUnitMeasure] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMeasure(value: Double): Self = StObject.set(x, "measure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeasureUndefined: Self = StObject.set(x, "measure", js.undefined)
    
    @scala.inline
    def setUnit(value: GoogleActionsOrdersV3VerticalsPurchaseMerchantUnitMeasureUnit): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
  }
}
