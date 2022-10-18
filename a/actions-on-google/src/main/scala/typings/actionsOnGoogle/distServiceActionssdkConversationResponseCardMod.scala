package typings.actionsOnGoogle

import typings.actionsOnGoogle.distServiceActionssdkConversationResponseCardBasicMod.BasicCardOptions
import typings.actionsOnGoogle.distServiceActionssdkConversationResponseCardButtonMod.ButtonOptions
import typings.actionsOnGoogle.distServiceActionssdkConversationResponseCardTableMod.TableOptions
import typings.actionsOnGoogle.distServiceActionssdkConversationResponseRichMod._RichResponseItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServiceActionssdkConversationResponseCardMod {
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/response/card", "BasicCard")
  @js.native
  open class BasicCard protected ()
    extends typings.actionsOnGoogle.distServiceActionssdkConversationResponseCardBasicMod.BasicCard
       with _RichResponseItem {
    /** @public */
    def this(options: BasicCardOptions) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/response/card", "Button")
  @js.native
  open class Button protected ()
    extends typings.actionsOnGoogle.distServiceActionssdkConversationResponseCardButtonMod.Button {
    /**
      * @param options Button options
      * @public
      */
    def this(options: ButtonOptions) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/response/card", "Table")
  @js.native
  open class Table protected ()
    extends typings.actionsOnGoogle.distServiceActionssdkConversationResponseCardTableMod.Table
       with _RichResponseItem {
    /** @public */
    def this(options: TableOptions) = this()
  }
}
