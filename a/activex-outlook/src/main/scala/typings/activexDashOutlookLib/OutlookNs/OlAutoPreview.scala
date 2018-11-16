package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlAutoPreview extends js.Object

@JSGlobal("Outlook.OlAutoPreview")
@js.native
object OlAutoPreview extends js.Object {
  @js.native
  sealed trait olAutoPreviewAll
    extends activexDashOutlookLib.OutlookNs.OlAutoPreview
  
  @js.native
  sealed trait olAutoPreviewNone
    extends activexDashOutlookLib.OutlookNs.OlAutoPreview
  
  @js.native
  sealed trait olAutoPreviewUnread
    extends activexDashOutlookLib.OutlookNs.OlAutoPreview
  
  /* 0 */ val olAutoPreviewAll: olAutoPreviewAll with scala.Double = js.native
  /* 2 */ val olAutoPreviewNone: olAutoPreviewNone with scala.Double = js.native
  /* 1 */ val olAutoPreviewUnread: olAutoPreviewUnread with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlAutoPreview with scala.Double] = js.native
}

