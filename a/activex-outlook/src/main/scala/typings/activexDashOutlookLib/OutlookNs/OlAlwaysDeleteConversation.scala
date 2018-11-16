package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlAlwaysDeleteConversation extends js.Object

@JSGlobal("Outlook.OlAlwaysDeleteConversation")
@js.native
object OlAlwaysDeleteConversation extends js.Object {
  @js.native
  sealed trait olAlwaysDelete
    extends activexDashOutlookLib.OutlookNs.OlAlwaysDeleteConversation
  
  @js.native
  sealed trait olAlwaysDeleteUnsupported
    extends activexDashOutlookLib.OutlookNs.OlAlwaysDeleteConversation
  
  @js.native
  sealed trait olDoNotDelete
    extends activexDashOutlookLib.OutlookNs.OlAlwaysDeleteConversation
  
  /* 1 */ val olAlwaysDelete: olAlwaysDelete with scala.Double = js.native
  /* 2 */ val olAlwaysDeleteUnsupported: olAlwaysDeleteUnsupported with scala.Double = js.native
  /* 0 */ val olDoNotDelete: olDoNotDelete with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlAlwaysDeleteConversation with scala.Double] = js.native
}

