package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlPane extends js.Object

@JSGlobal("Outlook.OlPane")
@js.native
object OlPane extends js.Object {
  @js.native
  sealed trait olFolderList
    extends activexDashOutlookLib.OutlookNs.OlPane
  
  @js.native
  sealed trait olNavigationPane
    extends activexDashOutlookLib.OutlookNs.OlPane
  
  @js.native
  sealed trait olOutlookBar
    extends activexDashOutlookLib.OutlookNs.OlPane
  
  @js.native
  sealed trait olPreview
    extends activexDashOutlookLib.OutlookNs.OlPane
  
  @js.native
  sealed trait olToDoBar
    extends activexDashOutlookLib.OutlookNs.OlPane
  
  /* 2 */ val olFolderList: olFolderList with scala.Double = js.native
  /* 4 */ val olNavigationPane: olNavigationPane with scala.Double = js.native
  /* 1 */ val olOutlookBar: olOutlookBar with scala.Double = js.native
  /* 3 */ val olPreview: olPreview with scala.Double = js.native
  /* 5 */ val olToDoBar: olToDoBar with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlPane with scala.Double] = js.native
}

