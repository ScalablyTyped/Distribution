package typings.awsSdk.budgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Spend extends js.Object {
  /**
    * The cost or usage amount that is associated with a budget forecast, actual spend, or budget threshold.
    */
  var Amount: NumericValue = js.native
  /**
    * The unit of measurement that is used for the budget forecast, actual spend, or budget threshold, such as dollars or GB.
    */
  var Unit: UnitValue = js.native
}

object Spend {
  @scala.inline
  def apply(Amount: NumericValue, Unit: UnitValue): Spend = {
    val __obj = js.Dynamic.literal(Amount = Amount.asInstanceOf[js.Any], Unit = Unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Spend]
  }
  @scala.inline
  implicit class SpendOps[Self <: Spend] (val x: Self) extends AnyVal {
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
    def setAmount(value: NumericValue): Self = this.set("Amount", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnit(value: UnitValue): Self = this.set("Unit", value.asInstanceOf[js.Any])
  }
  
}

