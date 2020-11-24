package typings.activexLibreoffice.com_.sun.star.mozilla

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Listens for changes in menu items. */
@js.native
trait XMenuProxyListener extends XInterface {
  
  /** is called, if the content or graphical representation/state of the menu changes completely, for one or more menu items */
  def menuChangedMultiple(MenuMultipleChanges: SeqEquiv[MenuMultipleChange]): Unit = js.native
  
  /** is called, if the content or graphical representation/state of the menu changes, by one property for one or more menu items */
  def menuChangedSingle(MenuSingleChanges: SeqEquiv[MenuSingleChange]): Unit = js.native
  
  /**
    * is called, if one menu item designated by the ID, is deleted.
    * @param ID [in]: the menu item
    */
  def menuItemDeleted(ID: Double): Unit = js.native
}
object XMenuProxyListener {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    menuChangedMultiple: SeqEquiv[MenuMultipleChange] => Unit,
    menuChangedSingle: SeqEquiv[MenuSingleChange] => Unit,
    menuItemDeleted: Double => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XMenuProxyListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), menuChangedMultiple = js.Any.fromFunction1(menuChangedMultiple), menuChangedSingle = js.Any.fromFunction1(menuChangedSingle), menuItemDeleted = js.Any.fromFunction1(menuItemDeleted), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XMenuProxyListener]
  }
  
  @scala.inline
  implicit class XMenuProxyListenerOps[Self <: XMenuProxyListener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMenuChangedMultiple(value: SeqEquiv[MenuMultipleChange] => Unit): Self = this.set("menuChangedMultiple", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMenuChangedSingle(value: SeqEquiv[MenuSingleChange] => Unit): Self = this.set("menuChangedSingle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMenuItemDeleted(value: Double => Unit): Self = this.set("menuItemDeleted", js.Any.fromFunction1(value))
  }
}
