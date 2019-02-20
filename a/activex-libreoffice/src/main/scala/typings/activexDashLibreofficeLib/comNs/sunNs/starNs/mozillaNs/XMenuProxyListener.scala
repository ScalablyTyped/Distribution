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

