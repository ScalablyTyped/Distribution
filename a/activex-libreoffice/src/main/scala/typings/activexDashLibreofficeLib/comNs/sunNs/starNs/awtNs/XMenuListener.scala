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
    acquire: js.Function0[scala.Unit],
    disposing: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    itemActivated: js.Function1[MenuEvent, scala.Unit],
    itemDeactivated: js.Function1[MenuEvent, scala.Unit],
    itemHighlighted: js.Function1[MenuEvent, scala.Unit],
    itemSelected: js.Function1[MenuEvent, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XMenuListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("disposing")(disposing)
    __obj.updateDynamic("itemActivated")(itemActivated)
    __obj.updateDynamic("itemDeactivated")(itemDeactivated)
    __obj.updateDynamic("itemHighlighted")(itemHighlighted)
    __obj.updateDynamic("itemSelected")(itemSelected)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XMenuListener]
  }
}

