package typings.actionsOnGoogle.distServiceActionssdkMod

import typings.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsTransactionsV3TransactionDecisionValueSpec
import typings.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2TransactionDecisionValueSpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("actions-on-google/dist/service/actionssdk", "TransactionDecision")
@js.native
/**
  * @param options The raw {@link GoogleActionsV2TransactionDecisionValueSpec}
  *     or {@link GoogleActionsTransactionsV3TransactionDecisionValueSpec}
  *     if using ordersv3
  * @public
  */
open class TransactionDecision ()
  extends typings.actionsOnGoogle.distServiceActionssdkConversationMod.TransactionDecision {
  def this(options: GoogleActionsTransactionsV3TransactionDecisionValueSpec) = this()
  def this(options: GoogleActionsV2TransactionDecisionValueSpec) = this()
}
