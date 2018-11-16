package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlMatchEntry extends js.Object

@JSGlobal("Outlook.OlMatchEntry")
@js.native
object OlMatchEntry extends js.Object {
  @js.native
  sealed trait olMatchEntryComplete
    extends activexDashOutlookLib.OutlookNs.OlMatchEntry
  
  @js.native
  sealed trait olMatchEntryFirstLetter
    extends activexDashOutlookLib.OutlookNs.OlMatchEntry
  
  @js.native
  sealed trait olMatchEntryNone
    extends activexDashOutlookLib.OutlookNs.OlMatchEntry
  
  /* 1 */ val olMatchEntryComplete: olMatchEntryComplete with scala.Double = js.native
  /* 0 */ val olMatchEntryFirstLetter: olMatchEntryFirstLetter with scala.Double = js.native
  /* 2 */ val olMatchEntryNone: olMatchEntryNone with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlMatchEntry with scala.Double] = js.native
}

