package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsTransactionsV3DigitalPurchaseCheckResult extends js.Object {
  /**
    * Result type for digital purchase check result.
    */
  var resultType: js.UndefOr[GoogleActionsTransactionsV3DigitalPurchaseCheckResultResultType] = js.native
}

object GoogleActionsTransactionsV3DigitalPurchaseCheckResult {
  @scala.inline
  def apply(): GoogleActionsTransactionsV3DigitalPurchaseCheckResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsTransactionsV3DigitalPurchaseCheckResult]
  }
  @scala.inline
  implicit class GoogleActionsTransactionsV3DigitalPurchaseCheckResultOps[Self <: GoogleActionsTransactionsV3DigitalPurchaseCheckResult] (val x: Self) extends AnyVal {
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
    def setResultType(value: GoogleActionsTransactionsV3DigitalPurchaseCheckResultResultType): Self = this.set("resultType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResultType: Self = this.set("resultType", js.undefined)
  }
  
}

