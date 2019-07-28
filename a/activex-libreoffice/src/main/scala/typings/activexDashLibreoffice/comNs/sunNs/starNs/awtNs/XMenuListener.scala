package typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to receive menu events on a window. */
trait XMenuListener extends XEventListener {
  /** is invoked when a menu is activated. */
  def itemActivated(aEvent: MenuEvent): Unit
  /** is invoked when a menu is deactivated. */
  def itemDeactivated(aEvent: MenuEvent): Unit
  /** is invoked when a menu item is highlighted. */
  def itemHighlighted(aEvent: MenuEvent): Unit
  /** is invoked when a menu item is selected. */
  def itemSelected(aEvent: MenuEvent): Unit
}

object XMenuListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    itemActivated: MenuEvent => Unit,
    itemDeactivated: MenuEvent => Unit,
    itemHighlighted: MenuEvent => Unit,
    itemSelected: MenuEvent => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XMenuListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), itemActivated = js.Any.fromFunction1(itemActivated), itemDeactivated = js.Any.fromFunction1(itemDeactivated), itemHighlighted = js.Any.fromFunction1(itemHighlighted), itemSelected = js.Any.fromFunction1(itemSelected), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XMenuListener]
  }
}

