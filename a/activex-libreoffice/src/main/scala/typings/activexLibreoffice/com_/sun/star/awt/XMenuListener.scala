package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to receive menu events on a window. */
trait XMenuListener
  extends StObject
     with XEventListener {
  
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
  
  inline def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    itemActivated: MenuEvent => Unit,
    itemDeactivated: MenuEvent => Unit,
    itemHighlighted: MenuEvent => Unit,
    itemSelected: MenuEvent => Unit,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XMenuListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), itemActivated = js.Any.fromFunction1(itemActivated), itemDeactivated = js.Any.fromFunction1(itemDeactivated), itemHighlighted = js.Any.fromFunction1(itemHighlighted), itemSelected = js.Any.fromFunction1(itemSelected), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XMenuListener]
  }
  
  extension [Self <: XMenuListener](x: Self) {
    
    inline def setItemActivated(value: MenuEvent => Unit): Self = StObject.set(x, "itemActivated", js.Any.fromFunction1(value))
    
    inline def setItemDeactivated(value: MenuEvent => Unit): Self = StObject.set(x, "itemDeactivated", js.Any.fromFunction1(value))
    
    inline def setItemHighlighted(value: MenuEvent => Unit): Self = StObject.set(x, "itemHighlighted", js.Any.fromFunction1(value))
    
    inline def setItemSelected(value: MenuEvent => Unit): Self = StObject.set(x, "itemSelected", js.Any.fromFunction1(value))
  }
}
