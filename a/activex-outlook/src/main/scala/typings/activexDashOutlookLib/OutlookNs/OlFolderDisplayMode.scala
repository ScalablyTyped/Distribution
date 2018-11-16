package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlFolderDisplayMode extends js.Object

@JSGlobal("Outlook.OlFolderDisplayMode")
@js.native
object OlFolderDisplayMode extends js.Object {
  @js.native
  sealed trait olFolderDisplayFolderOnly
    extends activexDashOutlookLib.OutlookNs.OlFolderDisplayMode
  
  @js.native
  sealed trait olFolderDisplayNoNavigation
    extends activexDashOutlookLib.OutlookNs.OlFolderDisplayMode
  
  @js.native
  sealed trait olFolderDisplayNormal
    extends activexDashOutlookLib.OutlookNs.OlFolderDisplayMode
  
  /* 1 */ val olFolderDisplayFolderOnly: olFolderDisplayFolderOnly with scala.Double = js.native
  /* 2 */ val olFolderDisplayNoNavigation: olFolderDisplayNoNavigation with scala.Double = js.native
  /* 0 */ val olFolderDisplayNormal: olFolderDisplayNormal with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlFolderDisplayMode with scala.Double] = js.native
}

