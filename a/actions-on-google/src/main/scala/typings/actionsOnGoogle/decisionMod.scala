package typings.actionsOnGoogle

import typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotTRANSACTION_DECISION
import typings.actionsOnGoogle.helperHelperMod.SoloHelper
import typings.actionsOnGoogle.v2Mod.GoogleActionsTransactionsV3TransactionDecisionValueSpec
import typings.actionsOnGoogle.v2Mod.GoogleActionsV2TransactionDecisionValueSpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object decisionMod {
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper/transaction/decision", "TransactionDecision")
  @js.native
  /**
    * @param options The raw {@link GoogleActionsV2TransactionDecisionValueSpec}
    *     or {@link GoogleActionsTransactionsV3TransactionDecisionValueSpec}
    *     if using ordersv3
    * @public
    */
  class TransactionDecision () extends SoloHelper[
          actionsDotintentDotTRANSACTION_DECISION, 
          GoogleActionsV2TransactionDecisionValueSpec | GoogleActionsTransactionsV3TransactionDecisionValueSpec
        ] {
    def this(options: GoogleActionsTransactionsV3TransactionDecisionValueSpec) = this()
    def this(options: GoogleActionsV2TransactionDecisionValueSpec) = this()
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.actionsOnGoogle.v2Mod.GoogleActionsV2TransactionDecisionValue
    - typings.actionsOnGoogle.v2Mod.GoogleActionsTransactionsV3TransactionDecisionValue
  */
  trait TransactionDecisionArgument extends StObject
  object TransactionDecisionArgument {
    
    @scala.inline
    def GoogleActionsTransactionsV3TransactionDecisionValue(): typings.actionsOnGoogle.v2Mod.GoogleActionsTransactionsV3TransactionDecisionValue = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.actionsOnGoogle.v2Mod.GoogleActionsTransactionsV3TransactionDecisionValue]
    }
    
    @scala.inline
    def GoogleActionsV2TransactionDecisionValue(): typings.actionsOnGoogle.v2Mod.GoogleActionsV2TransactionDecisionValue = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.actionsOnGoogle.v2Mod.GoogleActionsV2TransactionDecisionValue]
    }
  }
}
