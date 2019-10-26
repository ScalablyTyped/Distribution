package typings.actionsDashOnDashGoogle.distServiceActionssdkConversationMod

import typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod.GoogleActionsTransactionsV3TransactionDecisionValueSpec
import typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2TransactionDecisionValueSpec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/dist/service/actionssdk/conversation", "TransactionDecision")
@js.native
/**
  * @param options The raw {@link GoogleActionsV2TransactionDecisionValueSpec}
  *     or {@link GoogleActionsTransactionsV3TransactionDecisionValueSpec}
  *     if using ordersv3
  * @public
  */
class TransactionDecision ()
  extends typings.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperMod.TransactionDecision {
  def this(options: GoogleActionsTransactionsV3TransactionDecisionValueSpec) = this()
  def this(options: GoogleActionsV2TransactionDecisionValueSpec) = this()
}

