package typings.activexLibreoffice.com_.sun.star.frame

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.XPopupMenu
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides data to a pop-up menu controller implementation to fill and update a pop-up menu dynamically.
  *
  * A pop-up menu controller gets a {@link com.sun.star.awt.XPopupMenu} from its parent menu implementation. The controller has to fill this pop-up menu
  * with a set of menu items and/or sub menus. The parent menu implementation briefs the controller whenever the pop-up menu gets activated by a user.
  * @since OOo 2.0
  */
trait XPopupMenuController
  extends StObject
     with XInterface {
  
  /**
    * provides a {@link com.sun.star.awt.XPopupMenu} to a pop-up menu controller implementation. The controller must fill this pop-up menu with its
    * functions.
    * @param PopupMenu An empty pop-up menu that must be filled by the pop-up menu controller.
    */
  def setPopupMenu(PopupMenu: XPopupMenu): Unit
  
  /**
    * briefs the pop-up menu controller to update the contents of the provided pop-up menu to reflect the current state.
    *
    * A controller should **never** update the pop-up menu structure on its own to prevent performance problems. A better way would be that a controller
    * registers itself as status listener to for a command URL and immediately deregister after that. Therefore status updates will not be send regularly
    * for a non visible pop-up menu.
    */
  def updatePopupMenu(): Unit
}
object XPopupMenuController {
  
  inline def apply(
    acquire: () => Unit,
    queryInterface: `type` => Any,
    release: () => Unit,
    setPopupMenu: XPopupMenu => Unit,
    updatePopupMenu: () => Unit
  ): XPopupMenuController = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setPopupMenu = js.Any.fromFunction1(setPopupMenu), updatePopupMenu = js.Any.fromFunction0(updatePopupMenu))
    __obj.asInstanceOf[XPopupMenuController]
  }
  
  extension [Self <: XPopupMenuController](x: Self) {
    
    inline def setSetPopupMenu(value: XPopupMenu => Unit): Self = StObject.set(x, "setPopupMenu", js.Any.fromFunction1(value))
    
    inline def setUpdatePopupMenu(value: () => Unit): Self = StObject.set(x, "updatePopupMenu", js.Any.fromFunction0(value))
  }
}
