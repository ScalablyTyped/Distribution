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

object XMenuListener {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    disposing: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject => scala.Unit,
    itemActivated: MenuEvent => scala.Unit,
    itemDeactivated: MenuEvent => scala.Unit,
    itemHighlighted: MenuEvent => scala.Unit,
    itemSelected: MenuEvent => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XMenuListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), itemActivated = js.Any.fromFunction1(itemActivated), itemDeactivated = js.Any.fromFunction1(itemDeactivated), itemHighlighted = js.Any.fromFunction1(itemHighlighted), itemSelected = js.Any.fromFunction1(itemSelected), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XMenuListener]
  }
}

