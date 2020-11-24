package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsOrdersV3VerticalsPurchaseMerchantUnitMeasure extends js.Object {
  
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
  implicit class GoogleActionsOrdersV3VerticalsPurchaseMerchantUnitMeasureOps[Self <: GoogleActionsOrdersV3VerticalsPurchaseMerchantUnitMeasure] (val x: Self) extends AnyVal {
    
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
    def setMeasure(value: Double): Self = this.set("measure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeasure: Self = this.set("measure", js.undefined)
    
    @scala.inline
    def setUnit(value: GoogleActionsOrdersV3VerticalsPurchaseMerchantUnitMeasureUnit): Self = this.set("unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnit: Self = this.set("unit", js.undefined)
  }
}
