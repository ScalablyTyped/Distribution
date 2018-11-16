package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlContextMenu extends js.Object

@JSGlobal("Outlook.OlContextMenu")
@js.native
object OlContextMenu extends js.Object {
  @js.native
  sealed trait olAttachmentContextMenu
    extends activexDashOutlookLib.OutlookNs.OlContextMenu
  
  @js.native
  sealed trait olFolderContextMenu
    extends activexDashOutlookLib.OutlookNs.OlContextMenu
  
  @js.native
  sealed trait olItemContextMenu
    extends activexDashOutlookLib.OutlookNs.OlContextMenu
  
  @js.native
  sealed trait olShortcutContextMenu
    extends activexDashOutlookLib.OutlookNs.OlContextMenu
  
  @js.native
  sealed trait olStoreContextMenu
    extends activexDashOutlookLib.OutlookNs.OlContextMenu
  
  @js.native
  sealed trait olViewContextMenu
    extends activexDashOutlookLib.OutlookNs.OlContextMenu
  
  /* 3 */ val olAttachmentContextMenu: olAttachmentContextMenu with scala.Double = js.native
  /* 2 */ val olFolderContextMenu: olFolderContextMenu with scala.Double = js.native
  /* 0 */ val olItemContextMenu: olItemContextMenu with scala.Double = js.native
  /* 5 */ val olShortcutContextMenu: olShortcutContextMenu with scala.Double = js.native
  /* 4 */ val olStoreContextMenu: olStoreContextMenu with scala.Double = js.native
  /* 1 */ val olViewContextMenu: olViewContextMenu with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlContextMenu with scala.Double] = js.native
}

