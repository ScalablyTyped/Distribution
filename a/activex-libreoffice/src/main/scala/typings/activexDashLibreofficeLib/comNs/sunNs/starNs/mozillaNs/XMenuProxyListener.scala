package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.mozillaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Listens for changes in menu items. */
trait XMenuProxyListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** is called, if the content or graphical representation/state of the menu changes completely, for one or more menu items */
  def menuChangedMultiple(MenuMultipleChanges: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[MenuMultipleChange]): scala.Unit
  /** is called, if the content or graphical representation/state of the menu changes, by one property for one or more menu items */
  def menuChangedSingle(MenuSingleChanges: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[MenuSingleChange]): scala.Unit
  /**
    * is called, if one menu item designated by the ID, is deleted.
    * @param ID [in]: the menu item
    */
  def menuItemDeleted(ID: scala.Double): scala.Unit
}

object XMenuProxyListener {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    menuChangedMultiple: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[MenuMultipleChange] => scala.Unit,
    menuChangedSingle: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[MenuSingleChange] => scala.Unit,
    menuItemDeleted: scala.Double => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XMenuProxyListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), menuChangedMultiple = js.Any.fromFunction1(menuChangedMultiple), menuChangedSingle = js.Any.fromFunction1(menuChangedSingle), menuItemDeleted = js.Any.fromFunction1(menuItemDeleted), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XMenuProxyListener]
  }
}

