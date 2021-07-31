package typings.actionsOnGoogle

import typings.actionsOnGoogle.richMod._RichResponseItem
import typings.actionsOnGoogle.v2Mod.GoogleActionsOrdersV3OrderUpdate
import typings.actionsOnGoogle.v2Mod.GoogleActionsV2OrdersOrderUpdate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object orderMod {
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/response/order", "OrderUpdate")
  @js.native
  class OrderUpdate protected ()
    extends StObject
       with GoogleActionsV2OrdersOrderUpdate
       with _RichResponseItem {
    def this(options: GoogleActionsOrdersV3OrderUpdate) = this()
    /**
      * @param options The raw {@link GoogleActionsV2OrdersOrderUpdate}
      *     or {@link GoogleActionsOrdersV3OrderUpdate}
      *     if using ordersv3
      * @public
      */
    def this(options: GoogleActionsV2OrdersOrderUpdate) = this()
  }
}
