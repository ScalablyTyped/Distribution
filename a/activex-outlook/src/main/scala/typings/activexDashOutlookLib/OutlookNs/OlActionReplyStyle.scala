package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlActionReplyStyle extends js.Object

@JSGlobal("Outlook.OlActionReplyStyle")
@js.native
object OlActionReplyStyle extends js.Object {
  @js.native
  sealed trait olEmbedOriginalItem
    extends activexDashOutlookLib.OutlookNs.OlActionReplyStyle
  
  @js.native
  sealed trait olIncludeOriginalText
    extends activexDashOutlookLib.OutlookNs.OlActionReplyStyle
  
  @js.native
  sealed trait olIndentOriginalText
    extends activexDashOutlookLib.OutlookNs.OlActionReplyStyle
  
  @js.native
  sealed trait olLinkOriginalItem
    extends activexDashOutlookLib.OutlookNs.OlActionReplyStyle
  
  @js.native
  sealed trait olOmitOriginalText
    extends activexDashOutlookLib.OutlookNs.OlActionReplyStyle
  
  @js.native
  sealed trait olReplyTickOriginalText
    extends activexDashOutlookLib.OutlookNs.OlActionReplyStyle
  
  @js.native
  sealed trait olUserPreference
    extends activexDashOutlookLib.OutlookNs.OlActionReplyStyle
  
  /* 1 */ val olEmbedOriginalItem: olEmbedOriginalItem with scala.Double = js.native
  /* 2 */ val olIncludeOriginalText: olIncludeOriginalText with scala.Double = js.native
  /* 3 */ val olIndentOriginalText: olIndentOriginalText with scala.Double = js.native
  /* 4 */ val olLinkOriginalItem: olLinkOriginalItem with scala.Double = js.native
  /* 0 */ val olOmitOriginalText: olOmitOriginalText with scala.Double = js.native
  /* 1000 */ val olReplyTickOriginalText: olReplyTickOriginalText with scala.Double = js.native
  /* 5 */ val olUserPreference: olUserPreference with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlActionReplyStyle with scala.Double] = js.native
}

