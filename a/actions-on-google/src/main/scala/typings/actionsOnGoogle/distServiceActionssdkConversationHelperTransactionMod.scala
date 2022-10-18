package typings.actionsOnGoogle

import typings.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsTransactionsV3CompletePurchaseValueSpec
import typings.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsTransactionsV3DigitalPurchaseCheckSpec
import typings.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsTransactionsV3TransactionDecisionValueSpec
import typings.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsTransactionsV3TransactionRequirementsCheckSpec
import typings.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2DeliveryAddressValueSpec
import typings.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2TransactionDecisionValueSpec
import typings.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2TransactionRequirementsCheckSpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServiceActionssdkConversationHelperTransactionMod {
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper/transaction", "CompletePurchase")
  @js.native
  /**
    * @param options The raw {@link GoogleActionsTransactionsV3CompletePurchaseValueSpec}
    * @public
    */
  open class CompletePurchase ()
    extends typings.actionsOnGoogle.distServiceActionssdkConversationHelperTransactionCompletepurchaseMod.CompletePurchase {
    def this(options: GoogleActionsTransactionsV3CompletePurchaseValueSpec) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper/transaction", "DeliveryAddress")
  @js.native
  /**
    * @param options The raw {@link GoogleActionsV2DeliveryAddressValueSpec}
    * @public
    */
  open class DeliveryAddress ()
    extends typings.actionsOnGoogle.distServiceActionssdkConversationHelperTransactionDeliveryaddressMod.DeliveryAddress {
    def this(options: GoogleActionsV2DeliveryAddressValueSpec) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper/transaction", "DigitalPurchaseCheck")
  @js.native
  /**
    * @param options The raw {@link GoogleActionsTransactionsV3DigitalPurchaseCheckSpec}
    * @public
    */
  open class DigitalPurchaseCheck ()
    extends typings.actionsOnGoogle.distServiceActionssdkConversationHelperTransactionDigitalpurchasecheckMod.DigitalPurchaseCheck {
    def this(options: GoogleActionsTransactionsV3DigitalPurchaseCheckSpec) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper/transaction", "TransactionDecision")
  @js.native
  /**
    * @param options The raw {@link GoogleActionsV2TransactionDecisionValueSpec}
    *     or {@link GoogleActionsTransactionsV3TransactionDecisionValueSpec}
    *     if using ordersv3
    * @public
    */
  open class TransactionDecision ()
    extends typings.actionsOnGoogle.distServiceActionssdkConversationHelperTransactionDecisionMod.TransactionDecision {
    def this(options: GoogleActionsTransactionsV3TransactionDecisionValueSpec) = this()
    def this(options: GoogleActionsV2TransactionDecisionValueSpec) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper/transaction", "TransactionRequirements")
  @js.native
  /**
    * @param options The raw {@link GoogleActionsV2TransactionRequirementsCheckSpec}
    *     or {@link GoogleActionsTransactionsV3TransactionRequirementsCheckSpec}
    *     if using ordersv3
    * @public
    */
  open class TransactionRequirements ()
    extends typings.actionsOnGoogle.distServiceActionssdkConversationHelperTransactionRequirementsMod.TransactionRequirements {
    def this(options: GoogleActionsTransactionsV3TransactionRequirementsCheckSpec) = this()
    def this(options: GoogleActionsV2TransactionRequirementsCheckSpec) = this()
  }
}
