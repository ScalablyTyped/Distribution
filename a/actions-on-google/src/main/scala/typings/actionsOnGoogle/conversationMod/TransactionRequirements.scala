package typings.actionsOnGoogle.conversationMod

import typings.actionsOnGoogle.v2Mod.GoogleActionsTransactionsV3TransactionRequirementsCheckSpec
import typings.actionsOnGoogle.v2Mod.GoogleActionsV2TransactionRequirementsCheckSpec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/dist/service/actionssdk/conversation", "TransactionRequirements")
@js.native
/**
  * @param options The raw {@link GoogleActionsV2TransactionRequirementsCheckSpec}
  *     or {@link GoogleActionsTransactionsV3TransactionRequirementsCheckSpec}
  *     if using ordersv3
  * @public
  */
class TransactionRequirements ()
  extends typings.actionsOnGoogle.helperMod.TransactionRequirements {
  def this(options: GoogleActionsTransactionsV3TransactionRequirementsCheckSpec) = this()
  def this(options: GoogleActionsV2TransactionRequirementsCheckSpec) = this()
}

