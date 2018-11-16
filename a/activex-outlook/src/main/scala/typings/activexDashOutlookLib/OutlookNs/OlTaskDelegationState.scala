package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlTaskDelegationState extends js.Object

@JSGlobal("Outlook.OlTaskDelegationState")
@js.native
object OlTaskDelegationState extends js.Object {
  @js.native
  sealed trait olTaskDelegationAccepted
    extends activexDashOutlookLib.OutlookNs.OlTaskDelegationState
  
  @js.native
  sealed trait olTaskDelegationDeclined
    extends activexDashOutlookLib.OutlookNs.OlTaskDelegationState
  
  @js.native
  sealed trait olTaskDelegationUnknown
    extends activexDashOutlookLib.OutlookNs.OlTaskDelegationState
  
  @js.native
  sealed trait olTaskNotDelegated
    extends activexDashOutlookLib.OutlookNs.OlTaskDelegationState
  
  /* 2 */ val olTaskDelegationAccepted: olTaskDelegationAccepted with scala.Double = js.native
  /* 3 */ val olTaskDelegationDeclined: olTaskDelegationDeclined with scala.Double = js.native
  /* 1 */ val olTaskDelegationUnknown: olTaskDelegationUnknown with scala.Double = js.native
  /* 0 */ val olTaskNotDelegated: olTaskNotDelegated with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlTaskDelegationState with scala.Double] = js.native
}

