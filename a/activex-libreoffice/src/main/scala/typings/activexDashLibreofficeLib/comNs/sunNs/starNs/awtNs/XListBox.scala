package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** gives access to the items of a list box and makes it possible to register item and action event listeners. */
trait XListBox
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** returns the number of visible lines in drop down mode. */
  var DropDownLineCount: scala.Double
  /** returns the number of items in the listbox. */
  val ItemCount: scala.Double
  /** returns all items of the list box. */
  val Items: stdLib.SafeArray[java.lang.String]
  /**
    * returns the currently selected item. When multiple items are selected, the first one is returned. When nothing is selected, an empty string is
    * returned.
    */
  val SelectedItem: java.lang.String
  /**
    * returns the position of the currently selected item. When multiple items are selected, the position of the first one is returned. When nothing is
    * selected, -1 is returned.
    */
  val SelectedItemPos: scala.Double
  /** returns all currently selected items. */
  val SelectedItems: stdLib.SafeArray[java.lang.String]
  /** returns the positions of all currently selected items. */
  val SelectedItemsPos: stdLib.SafeArray[scala.Double]
  /** registers a listener for action events. */
  def addActionListener(l: XActionListener): scala.Unit
  /** adds an item at the specified position. */
  def addItem(aItem: java.lang.String, nPos: scala.Double): scala.Unit
  /** registers a listener for item events. */
  def addItemListener(l: XItemListener): scala.Unit
  /** adds multiple items at the specified position. */
  def addItems(aItems: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], nPos: scala.Double): scala.Unit
  /** returns the number of visible lines in drop down mode. */
  def getDropDownLineCount(): scala.Double
  /** returns the item at the specified position. */
  def getItem(nPos: scala.Double): java.lang.String
  /** returns the number of items in the listbox. */
  def getItemCount(): scala.Double
  /** returns all items of the list box. */
  def getItems(): stdLib.SafeArray[java.lang.String]
  /**
    * returns the currently selected item. When multiple items are selected, the first one is returned. When nothing is selected, an empty string is
    * returned.
    */
  def getSelectedItem(): java.lang.String
  /**
    * returns the position of the currently selected item. When multiple items are selected, the position of the first one is returned. When nothing is
    * selected, -1 is returned.
    */
  def getSelectedItemPos(): scala.Double
  /** returns all currently selected items. */
  def getSelectedItems(): stdLib.SafeArray[java.lang.String]
  /** returns the positions of all currently selected items. */
  def getSelectedItemsPos(): stdLib.SafeArray[scala.Double]
  /** returns `TRUE` if multiple items can be selected, `FALSE` if only one item can be selected. */
  def isMutipleMode(): scala.Boolean
  /** makes the item at the specified position visible by scrolling. */
  def makeVisible(nEntry: scala.Double): scala.Unit
  /** unregisters a listener for action events. */
  def removeActionListener(l: XActionListener): scala.Unit
  /** unregisters a listener for item events. */
  def removeItemListener(l: XItemListener): scala.Unit
  /** removes a number of items at the specified position. */
  def removeItems(nPos: scala.Double, nCount: scala.Double): scala.Unit
  /** selects/deselects the specified item. */
  def selectItem(aItem: java.lang.String, bSelect: scala.Boolean): scala.Unit
  /** selects/deselects the item at the specified position. */
  def selectItemPos(nPos: scala.Double, bSelect: scala.Boolean): scala.Unit
  /** selects/deselects multiple items at the specified positions. */
  def selectItemsPos(aPositions: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], bSelect: scala.Boolean): scala.Unit
  /** sets the number of visible lines for drop down mode. */
  def setDropDownLineCount(nLines: scala.Double): scala.Unit
  /** determines if only a single item or multiple items can be selected. */
  def setMultipleMode(bMulti: scala.Boolean): scala.Unit
}

object XListBox {
  @scala.inline
  def apply(
    DropDownLineCount: scala.Double,
    ItemCount: scala.Double,
    Items: stdLib.SafeArray[java.lang.String],
    SelectedItem: java.lang.String,
    SelectedItemPos: scala.Double,
    SelectedItems: stdLib.SafeArray[java.lang.String],
    SelectedItemsPos: stdLib.SafeArray[scala.Double],
    acquire: () => scala.Unit,
    addActionListener: XActionListener => scala.Unit,
    addItem: (java.lang.String, scala.Double) => scala.Unit,
    addItemListener: XItemListener => scala.Unit,
    addItems: (activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], scala.Double) => scala.Unit,
    getDropDownLineCount: () => scala.Double,
    getItem: scala.Double => java.lang.String,
    getItemCount: () => scala.Double,
    getItems: () => stdLib.SafeArray[java.lang.String],
    getSelectedItem: () => java.lang.String,
    getSelectedItemPos: () => scala.Double,
    getSelectedItems: () => stdLib.SafeArray[java.lang.String],
    getSelectedItemsPos: () => stdLib.SafeArray[scala.Double],
    isMutipleMode: () => scala.Boolean,
    makeVisible: scala.Double => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeActionListener: XActionListener => scala.Unit,
    removeItemListener: XItemListener => scala.Unit,
    removeItems: (scala.Double, scala.Double) => scala.Unit,
    selectItem: (java.lang.String, scala.Boolean) => scala.Unit,
    selectItemPos: (scala.Double, scala.Boolean) => scala.Unit,
    selectItemsPos: (activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], scala.Boolean) => scala.Unit,
    setDropDownLineCount: scala.Double => scala.Unit,
    setMultipleMode: scala.Boolean => scala.Unit
  ): XListBox = {
    val __obj = js.Dynamic.literal(DropDownLineCount = DropDownLineCount, ItemCount = ItemCount, Items = Items, SelectedItem = SelectedItem, SelectedItemPos = SelectedItemPos, SelectedItems = SelectedItems, SelectedItemsPos = SelectedItemsPos, acquire = js.Any.fromFunction0(acquire), addActionListener = js.Any.fromFunction1(addActionListener), addItem = js.Any.fromFunction2(addItem), addItemListener = js.Any.fromFunction1(addItemListener), addItems = js.Any.fromFunction2(addItems), getDropDownLineCount = js.Any.fromFunction0(getDropDownLineCount), getItem = js.Any.fromFunction1(getItem), getItemCount = js.Any.fromFunction0(getItemCount), getItems = js.Any.fromFunction0(getItems), getSelectedItem = js.Any.fromFunction0(getSelectedItem), getSelectedItemPos = js.Any.fromFunction0(getSelectedItemPos), getSelectedItems = js.Any.fromFunction0(getSelectedItems), getSelectedItemsPos = js.Any.fromFunction0(getSelectedItemsPos), isMutipleMode = js.Any.fromFunction0(isMutipleMode), makeVisible = js.Any.fromFunction1(makeVisible), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeActionListener = js.Any.fromFunction1(removeActionListener), removeItemListener = js.Any.fromFunction1(removeItemListener), removeItems = js.Any.fromFunction2(removeItems), selectItem = js.Any.fromFunction2(selectItem), selectItemPos = js.Any.fromFunction2(selectItemPos), selectItemsPos = js.Any.fromFunction2(selectItemsPos), setDropDownLineCount = js.Any.fromFunction1(setDropDownLineCount), setMultipleMode = js.Any.fromFunction1(setMultipleMode))
  
    __obj.asInstanceOf[XListBox]
  }
}

