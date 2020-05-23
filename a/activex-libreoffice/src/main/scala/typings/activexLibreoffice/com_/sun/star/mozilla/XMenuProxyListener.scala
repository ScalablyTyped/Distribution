package typings.activexLibreoffice.com_.sun.star.mozilla

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Listens for changes in menu items. */
trait XMenuProxyListener extends XInterface {
  /** is called, if the content or graphical representation/state of the menu changes completely, for one or more menu items */
  def menuChangedMultiple(MenuMultipleChanges: SeqEquiv[MenuMultipleChange]): Unit
  /** is called, if the content or graphical representation/state of the menu changes, by one property for one or more menu items */
  def menuChangedSingle(MenuSingleChanges: SeqEquiv[MenuSingleChange]): Unit
  /**
    * is called, if one menu item designated by the ID, is deleted.
    * @param ID [in]: the menu item
    */
  def menuItemDeleted(ID: Double): Unit
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
}

