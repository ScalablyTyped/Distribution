package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlEnterFieldBehavior extends js.Object

@JSGlobal("Outlook.OlEnterFieldBehavior")
@js.native
object OlEnterFieldBehavior extends js.Object {
  @js.native
  sealed trait olEnterFieldBehaviorRecallSelection
    extends activexDashOutlookLib.OutlookNs.OlEnterFieldBehavior
  
  @js.native
  sealed trait olEnterFieldBehaviorSelectAll
    extends activexDashOutlookLib.OutlookNs.OlEnterFieldBehavior
  
  /* 1 */ val olEnterFieldBehaviorRecallSelection: olEnterFieldBehaviorRecallSelection with scala.Double = js.native
  /* 0 */ val olEnterFieldBehaviorSelectAll: olEnterFieldBehaviorSelectAll with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlEnterFieldBehavior with scala.Double] = js.native
}

