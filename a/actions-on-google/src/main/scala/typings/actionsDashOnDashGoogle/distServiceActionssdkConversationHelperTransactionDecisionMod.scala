package typings.actionsDashOnDashGoogle

import typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.actionsDOTintentDOTTRANSACTION_DECISION
import typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod.GoogleActionsTransactionsV3TransactionDecisionValueSpec
import typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2TransactionDecisionValueSpec
import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperHelperMod.Helper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/dist/service/actionssdk/conversation/helper/transaction/decision", JSImport.Namespace)
@js.native
object distServiceActionssdkConversationHelperTransactionDecisionMod extends js.Object {
  @js.native
  /**
    * @param options The raw {@link GoogleActionsV2TransactionDecisionValueSpec}
    *     or {@link GoogleActionsTransactionsV3TransactionDecisionValueSpec}
    *     if using ordersv3
    * @public
    */
  class TransactionDecision () extends Helper[
          actionsDOTintentDOTTRANSACTION_DECISION, 
          GoogleActionsV2TransactionDecisionValueSpec | GoogleActionsTransactionsV3TransactionDecisionValueSpec
        ] {
    def this(options: GoogleActionsTransactionsV3TransactionDecisionValueSpec) = this()
    def this(options: GoogleActionsV2TransactionDecisionValueSpec) = this()
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2TransactionDecisionValue
    - typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod.GoogleActionsTransactionsV3TransactionDecisionValue
  */
  trait TransactionDecisionArgument extends js.Object
  
}

