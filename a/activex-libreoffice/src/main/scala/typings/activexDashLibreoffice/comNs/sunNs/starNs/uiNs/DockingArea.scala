package typings.activexDashLibreoffice.comNs.sunNs.starNs.uiNs

import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`3`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies different docking areas a frame based layout manager supports.
  *
  * A frame based layout manager supports four different docking areas where dockable user interface elements can be docked.
  * @see com.sun.star.frame.XLayoutManager
  * @since OOo 2.0
  */
/* Rewritten from type alias, can be one of: 
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`4`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`3`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
*/
trait DockingArea extends js.Object

object DockingArea {
  /** the bottom docking area above the status bar. */
  @scala.inline
  def DOCKINGAREA_BOTTOM: `1` = this.cast(1)
  /** a default docking area. It depends on the implementation how to treat this value. */
  @scala.inline
  def DOCKINGAREA_DEFAULT: `4` = this.cast(4)
  /** the left side docking area. */
  @scala.inline
  def DOCKINGAREA_LEFT: `2` = this.cast(2)
  /** the right side docking area. */
  @scala.inline
  def DOCKINGAREA_RIGHT: `3` = this.cast(3)
  /** the top docking area below the menu bar. */
  @scala.inline
  def DOCKINGAREA_TOP: `0` = this.cast(0)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

