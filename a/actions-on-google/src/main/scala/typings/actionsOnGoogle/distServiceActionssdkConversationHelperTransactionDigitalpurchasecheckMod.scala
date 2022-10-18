package typings.actionsOnGoogle

import typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotDIGITAL_PURCHASE_CHECK
import typings.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsTransactionsV3DigitalPurchaseCheckResult
import typings.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsTransactionsV3DigitalPurchaseCheckSpec
import typings.actionsOnGoogle.distServiceActionssdkConversationHelperHelperMod.SoloHelper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServiceActionssdkConversationHelperTransactionDigitalpurchasecheckMod {
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper/transaction/digitalpurchasecheck", "DigitalPurchaseCheck")
  @js.native
  /**
    * @param options The raw {@link GoogleActionsTransactionsV3DigitalPurchaseCheckSpec}
    * @public
    */
  open class DigitalPurchaseCheck () extends SoloHelper[
          actionsDotintentDotDIGITAL_PURCHASE_CHECK, 
          GoogleActionsTransactionsV3DigitalPurchaseCheckSpec
        ] {
    def this(options: GoogleActionsTransactionsV3DigitalPurchaseCheckSpec) = this()
  }
  
  type DigitalPurchaseCheckArgument = GoogleActionsTransactionsV3DigitalPurchaseCheckResult
}
