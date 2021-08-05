package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsOrdersV3PriceAttribute extends StObject {
  
  /**
    * Monetary amount.
    */
  var amount: js.UndefOr[GoogleActionsOrdersV3Money] = js.undefined
  
  /**
    * The percentage spec, to 1/1000th of a percent.
    * Eg: 8.750% is represented as 8750, negative percentages represent
    * percentage discounts.
    * Deprecating this field. Can consider adding back when a solid usecase is
    * required.
    */
  var amountMillipercentage: js.UndefOr[Double] = js.undefined
  
  /**
    * Required: User displayed string of the price attribute. This is sent and
    * localized by merchant.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Required: State of the price: Estimate vs Actual.
    */
  var state: js.UndefOr[GoogleActionsOrdersV3PriceAttributeState] = js.undefined
  
  /**
    * Whether the price is tax included.
    */
  var taxIncluded: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Required: Type of money attribute.
    */
  var `type`: js.UndefOr[GoogleActionsOrdersV3PriceAttributeType] = js.undefined
}
object GoogleActionsOrdersV3PriceAttribute {
  
  inline def apply(): GoogleActionsOrdersV3PriceAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsOrdersV3PriceAttribute]
  }
  
  extension [Self <: GoogleActionsOrdersV3PriceAttribute](x: Self) {
    
    inline def setAmount(value: GoogleActionsOrdersV3Money): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountMillipercentage(value: Double): Self = StObject.set(x, "amountMillipercentage", value.asInstanceOf[js.Any])
    
    inline def setAmountMillipercentageUndefined: Self = StObject.set(x, "amountMillipercentage", js.undefined)
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setState(value: GoogleActionsOrdersV3PriceAttributeState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTaxIncluded(value: Boolean): Self = StObject.set(x, "taxIncluded", value.asInstanceOf[js.Any])
    
    inline def setTaxIncludedUndefined: Self = StObject.set(x, "taxIncluded", js.undefined)
    
    inline def setType(value: GoogleActionsOrdersV3PriceAttributeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
