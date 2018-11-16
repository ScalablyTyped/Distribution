package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlRuleExecuteOption extends js.Object

@JSGlobal("Outlook.OlRuleExecuteOption")
@js.native
object OlRuleExecuteOption extends js.Object {
  @js.native
  sealed trait olRuleExecuteAllMessages
    extends activexDashOutlookLib.OutlookNs.OlRuleExecuteOption
  
  @js.native
  sealed trait olRuleExecuteReadMessages
    extends activexDashOutlookLib.OutlookNs.OlRuleExecuteOption
  
  @js.native
  sealed trait olRuleExecuteUnreadMessages
    extends activexDashOutlookLib.OutlookNs.OlRuleExecuteOption
  
  /* 0 */ val olRuleExecuteAllMessages: olRuleExecuteAllMessages with scala.Double = js.native
  /* 1 */ val olRuleExecuteReadMessages: olRuleExecuteReadMessages with scala.Double = js.native
  /* 2 */ val olRuleExecuteUnreadMessages: olRuleExecuteUnreadMessages with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlRuleExecuteOption with scala.Double] = js.native
}

