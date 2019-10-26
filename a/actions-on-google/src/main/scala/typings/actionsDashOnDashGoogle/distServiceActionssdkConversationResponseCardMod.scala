package typings.actionsDashOnDashGoogle

import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseCardBasicMod.BasicCardOptions
import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseCardButtonMod.ButtonOptions
import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseCardTableMod.TableOptions
import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseRichMod._RichResponseItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/dist/service/actionssdk/conversation/response/card", JSImport.Namespace)
@js.native
object distServiceActionssdkConversationResponseCardMod extends js.Object {
  @js.native
  class BasicCard protected ()
    extends typings.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseCardBasicMod.BasicCard
       with _RichResponseItem {
    /** @public */
    def this(options: BasicCardOptions) = this()
  }
  
  @js.native
  class Button protected ()
    extends typings.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseCardButtonMod.Button {
    /**
      * @param options Button options
      * @public
      */
    def this(options: ButtonOptions) = this()
  }
  
  @js.native
  class Table protected ()
    extends typings.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseCardTableMod.Table
       with _RichResponseItem {
    /** @public */
    def this(options: TableOptions) = this()
  }
  
}

