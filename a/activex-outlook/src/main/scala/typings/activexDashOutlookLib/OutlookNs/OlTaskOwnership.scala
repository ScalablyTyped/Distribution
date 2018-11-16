package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlTaskOwnership extends js.Object

@JSGlobal("Outlook.OlTaskOwnership")
@js.native
object OlTaskOwnership extends js.Object {
  @js.native
  sealed trait olDelegatedTask
    extends activexDashOutlookLib.OutlookNs.OlTaskOwnership
  
  @js.native
  sealed trait olNewTask
    extends activexDashOutlookLib.OutlookNs.OlTaskOwnership
  
  @js.native
  sealed trait olOwnTask
    extends activexDashOutlookLib.OutlookNs.OlTaskOwnership
  
  /* 1 */ val olDelegatedTask: olDelegatedTask with scala.Double = js.native
  /* 0 */ val olNewTask: olNewTask with scala.Double = js.native
  /* 2 */ val olOwnTask: olOwnTask with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlTaskOwnership with scala.Double] = js.native
}

