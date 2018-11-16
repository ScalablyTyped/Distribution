package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlInspectorClose extends js.Object

@JSGlobal("Outlook.OlInspectorClose")
@js.native
object OlInspectorClose extends js.Object {
  @js.native
  sealed trait olDiscard
    extends activexDashOutlookLib.OutlookNs.OlInspectorClose
  
  @js.native
  sealed trait olPromptForSave
    extends activexDashOutlookLib.OutlookNs.OlInspectorClose
  
  @js.native
  sealed trait olSave
    extends activexDashOutlookLib.OutlookNs.OlInspectorClose
  
  /* 1 */ val olDiscard: olDiscard with scala.Double = js.native
  /* 2 */ val olPromptForSave: olPromptForSave with scala.Double = js.native
  /* 0 */ val olSave: olSave with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlInspectorClose with scala.Double] = js.native
}

