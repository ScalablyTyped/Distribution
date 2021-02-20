package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsOrdersV3PriceAttribute extends StObject {
  
  /**
    * Monetary amount.
    */
  var amount: js.UndefOr[GoogleActionsOrdersV3Money] = js.native
  
  /**
    * The percentage spec, to 1/1000th of a percent.
    * Eg: 8.750% is represented as 8750, negative percentages represent
    * percentage discounts.
    * Deprecating this field. Can consider adding back when a solid usecase is
    * required.
    */
  var amountMillipercentage: js.UndefOr[Double] = js.native
  
  /**
    * Required: User displayed string of the price attribute. This is sent and
    * localized by merchant.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Required: State of the price: Estimate vs Actual.
    */
  var state: js.UndefOr[GoogleActionsOrdersV3PriceAttributeState] = js.native
  
  /**
    * Whether the price is tax included.
    */
  var taxIncluded: js.UndefOr[Boolean] = js.native
  
  /**
    * Required: Type of money attribute.
    */
  var `type`: js.UndefOr[GoogleActionsOrdersV3PriceAttributeType] = js.native
}
object GoogleActionsOrdersV3PriceAttribute {
  
  @scala.inline
  def apply(): GoogleActionsOrdersV3PriceAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsOrdersV3PriceAttribute]
  }
  
  @scala.inline
  implicit class GoogleActionsOrdersV3PriceAttributeMutableBuilder[Self <: GoogleActionsOrdersV3PriceAttribute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: GoogleActionsOrdersV3Money): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmountMillipercentage(value: Double): Self = StObject.set(x, "amountMillipercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmountMillipercentageUndefined: Self = StObject.set(x, "amountMillipercentage", js.undefined)
    
    @scala.inline
    def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setState(value: GoogleActionsOrdersV3PriceAttributeState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setTaxIncluded(value: Boolean): Self = StObject.set(x, "taxIncluded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaxIncludedUndefined: Self = StObject.set(x, "taxIncluded", js.undefined)
    
    @scala.inline
    def setType(value: GoogleActionsOrdersV3PriceAttributeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
