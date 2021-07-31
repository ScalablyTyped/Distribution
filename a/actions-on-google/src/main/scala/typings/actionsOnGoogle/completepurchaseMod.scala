package typings.actionsOnGoogle

import typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotCOMPLETE_PURCHASE
import typings.actionsOnGoogle.helperHelperMod.SoloHelper
import typings.actionsOnGoogle.v2Mod.GoogleActionsTransactionsV3CompletePurchaseValue
import typings.actionsOnGoogle.v2Mod.GoogleActionsTransactionsV3CompletePurchaseValueSpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object completepurchaseMod {
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper/transaction/completepurchase", "CompletePurchase")
  @js.native
  /**
    * @param options The raw {@link GoogleActionsTransactionsV3CompletePurchaseValueSpec}
    * @public
    */
  class CompletePurchase () extends SoloHelper[
          actionsDotintentDotCOMPLETE_PURCHASE, 
          GoogleActionsTransactionsV3CompletePurchaseValueSpec
        ] {
    def this(options: GoogleActionsTransactionsV3CompletePurchaseValueSpec) = this()
  }
  
  type CompletePurchaseArgument = GoogleActionsTransactionsV3CompletePurchaseValue
}
