package typings.actionsOnGoogle.actionssdkMod

import typings.actionsOnGoogle.v2Mod.GoogleActionsOrdersV3OrderUpdate
import typings.actionsOnGoogle.v2Mod.GoogleActionsV2OrdersOrderUpdate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("actions-on-google/dist/service/actionssdk", "OrderUpdate")
@js.native
class OrderUpdate protected ()
  extends typings.actionsOnGoogle.conversationMod.OrderUpdate {
  def this(options: GoogleActionsOrdersV3OrderUpdate) = this()
  /**
    * @param options The raw {@link GoogleActionsV2OrdersOrderUpdate}
    *     or {@link GoogleActionsOrdersV3OrderUpdate}
    *     if using ordersv3
    * @public
    */
  def this(options: GoogleActionsV2OrdersOrderUpdate) = this()
}
