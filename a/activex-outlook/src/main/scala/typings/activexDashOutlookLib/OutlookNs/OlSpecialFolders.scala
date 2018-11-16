package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlSpecialFolders extends js.Object

@JSGlobal("Outlook.OlSpecialFolders")
@js.native
object OlSpecialFolders extends js.Object {
  @js.native
  sealed trait olSpecialFolderAllTasks
    extends activexDashOutlookLib.OutlookNs.OlSpecialFolders
  
  @js.native
  sealed trait olSpecialFolderReminders
    extends activexDashOutlookLib.OutlookNs.OlSpecialFolders
  
  /* 0 */ val olSpecialFolderAllTasks: olSpecialFolderAllTasks with scala.Double = js.native
  /* 1 */ val olSpecialFolderReminders: olSpecialFolderReminders with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlSpecialFolders with scala.Double] = js.native
}

