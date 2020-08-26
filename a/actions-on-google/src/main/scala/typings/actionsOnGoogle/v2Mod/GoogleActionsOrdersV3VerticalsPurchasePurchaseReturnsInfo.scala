package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsOrdersV3VerticalsPurchasePurchaseReturnsInfo extends js.Object {
  /**
    * Return is allowed within that many days.
    */
  var daysToReturn: js.UndefOr[Double] = js.native
  /**
    * If true, return is allowed.
    */
  var isReturnable: js.UndefOr[Boolean] = js.native
  /**
    * Link to the return policy.
    */
  var policyUrl: js.UndefOr[String] = js.native
}

object GoogleActionsOrdersV3VerticalsPurchasePurchaseReturnsInfo {
  @scala.inline
  def apply(): GoogleActionsOrdersV3VerticalsPurchasePurchaseReturnsInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsOrdersV3VerticalsPurchasePurchaseReturnsInfo]
  }
  @scala.inline
  implicit class GoogleActionsOrdersV3VerticalsPurchasePurchaseReturnsInfoOps[Self <: GoogleActionsOrdersV3VerticalsPurchasePurchaseReturnsInfo] (val x: Self) extends AnyVal {
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
    def setDaysToReturn(value: Double): Self = this.set("daysToReturn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDaysToReturn: Self = this.set("daysToReturn", js.undefined)
    @scala.inline
    def setIsReturnable(value: Boolean): Self = this.set("isReturnable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsReturnable: Self = this.set("isReturnable", js.undefined)
    @scala.inline
    def setPolicyUrl(value: String): Self = this.set("policyUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicyUrl: Self = this.set("policyUrl", js.undefined)
  }
  
}

