package typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod

import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperTransactionDecisionMod.TransactionDecisionArgument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2TransactionDecisionValue extends TransactionDecisionArgument {
  /**
    * If `check_result` is NOT `ResultType.OK`, the rest of the fields in
    * this message should be ignored.
    */
  var checkResult: js.UndefOr[GoogleActionsV2TransactionRequirementsCheckResult] = js.undefined
  /**
    * If user requests for delivery address update, this field includes the
    * new delivery address. This field will be present only when `user_decision`
    * is `DELIVERY_ADDRESS_UPDATED`.
    */
  var deliveryAddress: js.UndefOr[GoogleActionsV2Location] = js.undefined
  /**
    * The order that user has approved. This field will be present only when
    * `user_decision` is `ORDER_ACCEPTED`.
    */
  var order: js.UndefOr[GoogleActionsV2OrdersOrder] = js.undefined
  /**
    * User decision regarding the proposed order.
    */
  var userDecision: js.UndefOr[GoogleActionsV2TransactionDecisionValueUserDecision] = js.undefined
}

object GoogleActionsV2TransactionDecisionValue {
  @scala.inline
  def apply(
    checkResult: GoogleActionsV2TransactionRequirementsCheckResult = null,
    deliveryAddress: GoogleActionsV2Location = null,
    order: GoogleActionsV2OrdersOrder = null,
    userDecision: GoogleActionsV2TransactionDecisionValueUserDecision = null
  ): GoogleActionsV2TransactionDecisionValue = {
    val __obj = js.Dynamic.literal()
    if (checkResult != null) __obj.updateDynamic("checkResult")(checkResult.asInstanceOf[js.Any])
    if (deliveryAddress != null) __obj.updateDynamic("deliveryAddress")(deliveryAddress.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (userDecision != null) __obj.updateDynamic("userDecision")(userDecision.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsV2TransactionDecisionValue]
  }
}

