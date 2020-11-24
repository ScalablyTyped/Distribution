package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsOrdersV3PriceAttribute extends js.Object {
  
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
  implicit class GoogleActionsOrdersV3PriceAttributeOps[Self <: GoogleActionsOrdersV3PriceAttribute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAmount(value: GoogleActionsOrdersV3Money): Self = this.set("amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmount: Self = this.set("amount", js.undefined)
    
    @scala.inline
    def setAmountMillipercentage(value: Double): Self = this.set("amountMillipercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmountMillipercentage: Self = this.set("amountMillipercentage", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setState(value: GoogleActionsOrdersV3PriceAttributeState): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setTaxIncluded(value: Boolean): Self = this.set("taxIncluded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTaxIncluded: Self = this.set("taxIncluded", js.undefined)
    
    @scala.inline
    def setType(value: GoogleActionsOrdersV3PriceAttributeType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
