package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides data to a pop-up menu controller implementation to fill and update a pop-up menu dynamically.
  *
  * A pop-up menu controller gets a {@link com.sun.star.awt.XPopupMenu} from its parent menu implementation. The controller has to fill this pop-up menu
  * with a set of menu items and/or sub menus. The parent menu implementation briefs the controller whenever the pop-up menu gets activated by a user.
  * @since OOo 2.0
  */
trait XPopupMenuController
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * provides a {@link com.sun.star.awt.XPopupMenu} to a pop-up menu controller implementation. The controller must fill this pop-up menu with its
    * functions.
    * @param PopupMenu An empty pop-up menu that must be filled by the pop-up menu controller.
    */
  def setPopupMenu(PopupMenu: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XPopupMenu): scala.Unit
  /**
    * briefs the pop-up menu controller to update the contents of the provided pop-up menu to reflect the current state.
    *
    * A controller should **never** update the pop-up menu structure on its own to prevent performance problems. A better way would be that a controller
    * registers itself as status listener to for a command URL and immediately deregister after that. Therefore status updates will not be send regularly
    * for a non visible pop-up menu.
    */
  def updatePopupMenu(): scala.Unit
}

object XPopupMenuController {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setPopupMenu: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XPopupMenu, scala.Unit],
    updatePopupMenu: js.Function0[scala.Unit]
  ): XPopupMenuController = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("setPopupMenu")(setPopupMenu)
    __obj.updateDynamic("updatePopupMenu")(updatePopupMenu)
    __obj.asInstanceOf[XPopupMenuController]
  }
}

