package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlTaskResponse extends js.Object

@JSGlobal("Outlook.OlTaskResponse")
@js.native
object OlTaskResponse extends js.Object {
  @js.native
  sealed trait olTaskAccept
    extends activexDashOutlookLib.OutlookNs.OlTaskResponse
  
  @js.native
  sealed trait olTaskAssign
    extends activexDashOutlookLib.OutlookNs.OlTaskResponse
  
  @js.native
  sealed trait olTaskDecline
    extends activexDashOutlookLib.OutlookNs.OlTaskResponse
  
  @js.native
  sealed trait olTaskSimple
    extends activexDashOutlookLib.OutlookNs.OlTaskResponse
  
  /* 2 */ val olTaskAccept: olTaskAccept with scala.Double = js.native
  /* 1 */ val olTaskAssign: olTaskAssign with scala.Double = js.native
  /* 3 */ val olTaskDecline: olTaskDecline with scala.Double = js.native
  /* 0 */ val olTaskSimple: olTaskSimple with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlTaskResponse with scala.Double] = js.native
}

