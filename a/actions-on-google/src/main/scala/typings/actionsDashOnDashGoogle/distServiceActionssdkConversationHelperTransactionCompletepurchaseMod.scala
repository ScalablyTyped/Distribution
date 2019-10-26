package typings.actionsDashOnDashGoogle

import typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.actionsDOTintentDOTCOMPLETE_PURCHASE
import typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod.GoogleActionsTransactionsV3CompletePurchaseValue
import typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod.GoogleActionsTransactionsV3CompletePurchaseValueSpec
import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperHelperMod.Helper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/dist/service/actionssdk/conversation/helper/transaction/completepurchase", JSImport.Namespace)
@js.native
object distServiceActionssdkConversationHelperTransactionCompletepurchaseMod extends js.Object {
  @js.native
  /**
    * @param options The raw {@link GoogleActionsTransactionsV3CompletePurchaseValueSpec}
    * @public
    */
  class CompletePurchase () extends Helper[
          actionsDOTintentDOTCOMPLETE_PURCHASE, 
          GoogleActionsTransactionsV3CompletePurchaseValueSpec
        ] {
    def this(options: GoogleActionsTransactionsV3CompletePurchaseValueSpec) = this()
  }
  
  type CompletePurchaseArgument = GoogleActionsTransactionsV3CompletePurchaseValue
}

