package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlRuleType extends js.Object

@JSGlobal("Outlook.OlRuleType")
@js.native
object OlRuleType extends js.Object {
  @js.native
  sealed trait olRuleReceive
    extends activexDashOutlookLib.OutlookNs.OlRuleType
  
  @js.native
  sealed trait olRuleSend
    extends activexDashOutlookLib.OutlookNs.OlRuleType
  
  /* 0 */ val olRuleReceive: olRuleReceive with scala.Double = js.native
  /* 1 */ val olRuleSend: olRuleSend with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlRuleType with scala.Double] = js.native
}

