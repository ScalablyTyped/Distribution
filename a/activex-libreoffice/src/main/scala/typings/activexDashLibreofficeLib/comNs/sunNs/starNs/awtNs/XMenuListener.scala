package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to receive menu events on a window. */
trait XMenuListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /** is invoked when a menu is activated. */
  def itemActivated(aEvent: MenuEvent): scala.Unit
  /** is invoked when a menu is deactivated. */
  def itemDeactivated(aEvent: MenuEvent): scala.Unit
  /** is invoked when a menu item is highlighted. */
  def itemHighlighted(aEvent: MenuEvent): scala.Unit
  /** is invoked when a menu item is selected. */
  def itemSelected(aEvent: MenuEvent): scala.Unit
}

