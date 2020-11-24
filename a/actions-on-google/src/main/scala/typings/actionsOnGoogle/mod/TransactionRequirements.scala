package typings.actionsOnGoogle.mod

import typings.actionsOnGoogle.v2Mod.GoogleActionsTransactionsV3TransactionRequirementsCheckSpec
import typings.actionsOnGoogle.v2Mod.GoogleActionsV2TransactionRequirementsCheckSpec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("actions-on-google", "TransactionRequirements")
@js.native
/**
  * @param options The raw {@link GoogleActionsV2TransactionRequirementsCheckSpec}
  *     or {@link GoogleActionsTransactionsV3TransactionRequirementsCheckSpec}
  *     if using ordersv3
  * @public
  */
class TransactionRequirements ()
  extends typings.actionsOnGoogle.actionssdkMod.TransactionRequirements {
  def this(options: GoogleActionsTransactionsV3TransactionRequirementsCheckSpec) = this()
  def this(options: GoogleActionsV2TransactionRequirementsCheckSpec) = this()
}
