package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlAttachmentBlockLevel extends js.Object

@JSGlobal("Outlook.OlAttachmentBlockLevel")
@js.native
object OlAttachmentBlockLevel extends js.Object {
  @js.native
  sealed trait olAttachmentBlockLevelNone
    extends activexDashOutlookLib.OutlookNs.OlAttachmentBlockLevel
  
  @js.native
  sealed trait olAttachmentBlockLevelOpen
    extends activexDashOutlookLib.OutlookNs.OlAttachmentBlockLevel
  
  /* 0 */ val olAttachmentBlockLevelNone: olAttachmentBlockLevelNone with scala.Double = js.native
  /* 1 */ val olAttachmentBlockLevelOpen: olAttachmentBlockLevelOpen with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlAttachmentBlockLevel with scala.Double] = js.native
}

