package typings.actionsDashOnDashGoogle

import typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.actionsDOTintentDOTDIGITAL_PURCHASE_CHECK
import typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod.GoogleActionsTransactionsV3DigitalPurchaseCheckResult
import typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod.GoogleActionsTransactionsV3DigitalPurchaseCheckSpec
import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperHelperMod.Helper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/dist/service/actionssdk/conversation/helper/transaction/digitalpurchasecheck", JSImport.Namespace)
@js.native
object distServiceActionssdkConversationHelperTransactionDigitalpurchasecheckMod extends js.Object {
  @js.native
  /**
    * @param options The raw {@link GoogleActionsTransactionsV3DigitalPurchaseCheckSpec}
    * @public
    */
  class DigitalPurchaseCheck () extends Helper[
          actionsDOTintentDOTDIGITAL_PURCHASE_CHECK, 
          GoogleActionsTransactionsV3DigitalPurchaseCheckSpec
        ] {
    def this(options: GoogleActionsTransactionsV3DigitalPurchaseCheckSpec) = this()
  }
  
  type DigitalPurchaseCheckArgument = GoogleActionsTransactionsV3DigitalPurchaseCheckResult
}

