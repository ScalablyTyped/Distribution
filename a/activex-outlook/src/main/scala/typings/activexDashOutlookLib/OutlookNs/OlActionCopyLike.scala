package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlActionCopyLike extends js.Object

@JSGlobal("Outlook.OlActionCopyLike")
@js.native
object OlActionCopyLike extends js.Object {
  @js.native
  sealed trait olForward
    extends activexDashOutlookLib.OutlookNs.OlActionCopyLike
  
  @js.native
  sealed trait olReply
    extends activexDashOutlookLib.OutlookNs.OlActionCopyLike
  
  @js.native
  sealed trait olReplyAll
    extends activexDashOutlookLib.OutlookNs.OlActionCopyLike
  
  @js.native
  sealed trait olReplyFolder
    extends activexDashOutlookLib.OutlookNs.OlActionCopyLike
  
  @js.native
  sealed trait olRespond
    extends activexDashOutlookLib.OutlookNs.OlActionCopyLike
  
  /* 2 */ val olForward: olForward with scala.Double = js.native
  /* 0 */ val olReply: olReply with scala.Double = js.native
  /* 1 */ val olReplyAll: olReplyAll with scala.Double = js.native
  /* 3 */ val olReplyFolder: olReplyFolder with scala.Double = js.native
  /* 4 */ val olRespond: olRespond with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlActionCopyLike with scala.Double] = js.native
}

