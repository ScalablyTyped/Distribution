package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** gives access to the items of a combo box and makes it possible to register item and action event listeners. */
trait XComboBox
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** returns the number of visible lines in the drop down mode. */
  var DropDownLineCount: scala.Double
  /** returns the number of items in the combo box. */
  val ItemCount: scala.Double
  /** returns all items of the combo box. */
  val Items: activexDashInteropLib.SafeArray[java.lang.String]
  /** registers a listener for action events. */
  def addActionListener(l: XActionListener): scala.Unit
  /** adds an item at the specified position. */
  def addItem(aItem: java.lang.String, nPos: scala.Double): scala.Unit
  /** registers a listener for item events. */
  def addItemListener(l: XItemListener): scala.Unit
  /** adds multiple items at the specified position. */
  def addItems(aItems: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], nPos: scala.Double): scala.Unit
  /** returns the number of visible lines in the drop down mode. */
  def getDropDownLineCount(): scala.Double
  /** returns the item at the specified position. */
  def getItem(nPos: scala.Double): java.lang.String
  /** returns the number of items in the combo box. */
  def getItemCount(): scala.Double
  /** returns all items of the combo box. */
  def getItems(): activexDashInteropLib.SafeArray[java.lang.String]
  /** unregisters a listener for action events. */
  def removeActionListener(l: XActionListener): scala.Unit
  /** unregisters a listener for item events. */
  def removeItemListener(l: XItemListener): scala.Unit
  /** removes a number of items at the specified position. */
  def removeItems(nPos: scala.Double, nCount: scala.Double): scala.Unit
  /** sets the number of visible lines for drop down mode. */
  def setDropDownLineCount(nLines: scala.Double): scala.Unit
}

