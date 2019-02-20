package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DockingArea extends js.Object

/**
  * specifies different docking areas a frame based layout manager supports.
  *
  * A frame based layout manager supports four different docking areas where dockable user interface elements can be docked.
  * @see com.sun.star.frame.XLayoutManager
  * @since OOo 2.0
  */
@JSGlobal("com.sun.star.ui.DockingArea")
@js.native
object DockingArea extends js.Object {
  /** the bottom docking area above the status bar. */
  @js.native
  sealed trait DOCKINGAREA_BOTTOM
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.DockingArea
  
  /** a default docking area. It depends on the implementation how to treat this value. */
  @js.native
  sealed trait DOCKINGAREA_DEFAULT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.DockingArea
  
  /** the left side docking area. */
  @js.native
  sealed trait DOCKINGAREA_LEFT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.DockingArea
  
  /** the right side docking area. */
  @js.native
  sealed trait DOCKINGAREA_RIGHT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.DockingArea
  
  /** the top docking area below the menu bar. */
  @js.native
  sealed trait DOCKINGAREA_TOP
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.DockingArea
  
  /* 1 */ val DOCKINGAREA_BOTTOM: DOCKINGAREA_BOTTOM with scala.Double = js.native
  /* 4 */ val DOCKINGAREA_DEFAULT: DOCKINGAREA_DEFAULT with scala.Double = js.native
  /* 2 */ val DOCKINGAREA_LEFT: DOCKINGAREA_LEFT with scala.Double = js.native
  /* 3 */ val DOCKINGAREA_RIGHT: DOCKINGAREA_RIGHT with scala.Double = js.native
  /* 0 */ val DOCKINGAREA_TOP: DOCKINGAREA_TOP with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.DockingArea with scala.Double] = js.native
}

