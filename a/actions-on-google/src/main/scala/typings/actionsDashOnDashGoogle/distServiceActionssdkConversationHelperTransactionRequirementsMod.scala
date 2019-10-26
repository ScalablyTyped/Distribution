package typings.actionsDashOnDashGoogle

import typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.actionsDOTintentDOTTRANSACTION_REQUIREMENTS_CHECK
import typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod.GoogleActionsTransactionsV3TransactionRequirementsCheckSpec
import typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2TransactionRequirementsCheckSpec
import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperHelperMod.Helper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/dist/service/actionssdk/conversation/helper/transaction/requirements", JSImport.Namespace)
@js.native
object distServiceActionssdkConversationHelperTransactionRequirementsMod extends js.Object {
  @js.native
  /**
    * @param options The raw {@link GoogleActionsV2TransactionRequirementsCheckSpec}
    *     or {@link GoogleActionsTransactionsV3TransactionRequirementsCheckSpec}
    *     if using ordersv3
    * @public
    */
  class TransactionRequirements () extends Helper[
          actionsDOTintentDOTTRANSACTION_REQUIREMENTS_CHECK, 
          GoogleActionsV2TransactionRequirementsCheckSpec | GoogleActionsTransactionsV3TransactionRequirementsCheckSpec
        ] {
    def this(options: GoogleActionsTransactionsV3TransactionRequirementsCheckSpec) = this()
    def this(options: GoogleActionsV2TransactionRequirementsCheckSpec) = this()
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2TransactionRequirementsCheckResult
    - typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod.GoogleActionsTransactionsV3TransactionRequirementsCheckResult
  */
  trait TransactionRequirementsArgument extends js.Object
  
}

