package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlViewSaveOption extends js.Object

@JSGlobal("Outlook.OlViewSaveOption")
@js.native
object OlViewSaveOption extends js.Object {
  @js.native
  sealed trait olViewSaveOptionAllFoldersOfType
    extends activexDashOutlookLib.OutlookNs.OlViewSaveOption
  
  @js.native
  sealed trait olViewSaveOptionThisFolderEveryone
    extends activexDashOutlookLib.OutlookNs.OlViewSaveOption
  
  @js.native
  sealed trait olViewSaveOptionThisFolderOnlyMe
    extends activexDashOutlookLib.OutlookNs.OlViewSaveOption
  
  /* 2 */ val olViewSaveOptionAllFoldersOfType: olViewSaveOptionAllFoldersOfType with scala.Double = js.native
  /* 0 */ val olViewSaveOptionThisFolderEveryone: olViewSaveOptionThisFolderEveryone with scala.Double = js.native
  /* 1 */ val olViewSaveOptionThisFolderOnlyMe: olViewSaveOptionThisFolderOnlyMe with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlViewSaveOption with scala.Double] = js.native
}

