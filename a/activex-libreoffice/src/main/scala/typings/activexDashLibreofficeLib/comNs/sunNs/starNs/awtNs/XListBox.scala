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
  val Items: activexDashInteropLib.SafeArray[java.lang.String]
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
  val SelectedItems: activexDashInteropLib.SafeArray[java.lang.String]
  /** returns the positions of all currently selected items. */
  val SelectedItemsPos: activexDashInteropLib.SafeArray[scala.Double]
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
  def getItems(): activexDashInteropLib.SafeArray[java.lang.String]
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
  def getSelectedItems(): activexDashInteropLib.SafeArray[java.lang.String]
  /** returns the positions of all currently selected items. */
  def getSelectedItemsPos(): activexDashInteropLib.SafeArray[scala.Double]
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
    Items: activexDashInteropLib.SafeArray[java.lang.String],
    SelectedItem: java.lang.String,
    SelectedItemPos: scala.Double,
    SelectedItems: activexDashInteropLib.SafeArray[java.lang.String],
    SelectedItemsPos: activexDashInteropLib.SafeArray[scala.Double],
    acquire: js.Function0[scala.Unit],
    addActionListener: js.Function1[XActionListener, scala.Unit],
    addItem: js.Function2[java.lang.String, scala.Double, scala.Unit],
    addItemListener: js.Function1[XItemListener, scala.Unit],
    addItems: js.Function2[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      scala.Double, 
      scala.Unit
    ],
    getDropDownLineCount: js.Function0[scala.Double],
    getItem: js.Function1[scala.Double, java.lang.String],
    getItemCount: js.Function0[scala.Double],
    getItems: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    getSelectedItem: js.Function0[java.lang.String],
    getSelectedItemPos: js.Function0[scala.Double],
    getSelectedItems: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    getSelectedItemsPos: js.Function0[activexDashInteropLib.SafeArray[scala.Double]],
    isMutipleMode: js.Function0[scala.Boolean],
    makeVisible: js.Function1[scala.Double, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeActionListener: js.Function1[XActionListener, scala.Unit],
    removeItemListener: js.Function1[XItemListener, scala.Unit],
    removeItems: js.Function2[scala.Double, scala.Double, scala.Unit],
    selectItem: js.Function2[java.lang.String, scala.Boolean, scala.Unit],
    selectItemPos: js.Function2[scala.Double, scala.Boolean, scala.Unit],
    selectItemsPos: js.Function2[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], 
      scala.Boolean, 
      scala.Unit
    ],
    setDropDownLineCount: js.Function1[scala.Double, scala.Unit],
    setMultipleMode: js.Function1[scala.Boolean, scala.Unit]
  ): XListBox = {
    val __obj = js.Dynamic.literal(DropDownLineCount = DropDownLineCount, ItemCount = ItemCount, Items = Items, SelectedItem = SelectedItem, SelectedItemPos = SelectedItemPos, SelectedItems = SelectedItems, SelectedItemsPos = SelectedItemsPos, acquire = acquire, addActionListener = addActionListener, addItem = addItem, addItemListener = addItemListener, addItems = addItems, getDropDownLineCount = getDropDownLineCount, getItem = getItem, getItemCount = getItemCount, getItems = getItems, getSelectedItem = getSelectedItem, getSelectedItemPos = getSelectedItemPos, getSelectedItems = getSelectedItems, getSelectedItemsPos = getSelectedItemsPos, isMutipleMode = isMutipleMode, makeVisible = makeVisible, queryInterface = queryInterface, release = release, removeActionListener = removeActionListener, removeItemListener = removeItemListener, removeItems = removeItems, selectItem = selectItem, selectItemPos = selectItemPos, selectItemsPos = selectItemsPos, setDropDownLineCount = setDropDownLineCount, setMultipleMode = setMultipleMode)
  
    __obj.asInstanceOf[XListBox]
  }
}

