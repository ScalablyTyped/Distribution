package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** gives access to the items of a list box and makes it possible to register item and action event listeners. */
trait XListBox
  extends StObject
     with XInterface {
  
  /** returns the number of visible lines in drop down mode. */
  var DropDownLineCount: Double
  
  /** returns the number of items in the listbox. */
  val ItemCount: Double
  
  /** returns all items of the list box. */
  val Items: SafeArray[String]
  
  /**
    * returns the currently selected item. When multiple items are selected, the first one is returned. When nothing is selected, an empty string is
    * returned.
    */
  val SelectedItem: String
  
  /**
    * returns the position of the currently selected item. When multiple items are selected, the position of the first one is returned. When nothing is
    * selected, -1 is returned.
    */
  val SelectedItemPos: Double
  
  /** returns all currently selected items. */
  val SelectedItems: SafeArray[String]
  
  /** returns the positions of all currently selected items. */
  val SelectedItemsPos: SafeArray[Double]
  
  /** registers a listener for action events. */
  def addActionListener(l: XActionListener): Unit
  
  /** adds an item at the specified position. */
  def addItem(aItem: String, nPos: Double): Unit
  
  /** registers a listener for item events. */
  def addItemListener(l: XItemListener): Unit
  
  /** adds multiple items at the specified position. */
  def addItems(aItems: SeqEquiv[String], nPos: Double): Unit
  
  /** returns the number of visible lines in drop down mode. */
  def getDropDownLineCount(): Double
  
  /** returns the item at the specified position. */
  def getItem(nPos: Double): String
  
  /** returns the number of items in the listbox. */
  def getItemCount(): Double
  
  /** returns all items of the list box. */
  def getItems(): SafeArray[String]
  
  /**
    * returns the currently selected item. When multiple items are selected, the first one is returned. When nothing is selected, an empty string is
    * returned.
    */
  def getSelectedItem(): String
  
  /**
    * returns the position of the currently selected item. When multiple items are selected, the position of the first one is returned. When nothing is
    * selected, -1 is returned.
    */
  def getSelectedItemPos(): Double
  
  /** returns all currently selected items. */
  def getSelectedItems(): SafeArray[String]
  
  /** returns the positions of all currently selected items. */
  def getSelectedItemsPos(): SafeArray[Double]
  
  /** returns `TRUE` if multiple items can be selected, `FALSE` if only one item can be selected. */
  def isMutipleMode(): Boolean
  
  /** makes the item at the specified position visible by scrolling. */
  def makeVisible(nEntry: Double): Unit
  
  /** unregisters a listener for action events. */
  def removeActionListener(l: XActionListener): Unit
  
  /** unregisters a listener for item events. */
  def removeItemListener(l: XItemListener): Unit
  
  /** removes a number of items at the specified position. */
  def removeItems(nPos: Double, nCount: Double): Unit
  
  /** selects/deselects the specified item. */
  def selectItem(aItem: String, bSelect: Boolean): Unit
  
  /** selects/deselects the item at the specified position. */
  def selectItemPos(nPos: Double, bSelect: Boolean): Unit
  
  /** selects/deselects multiple items at the specified positions. */
  def selectItemsPos(aPositions: SeqEquiv[Double], bSelect: Boolean): Unit
  
  /** sets the number of visible lines for drop down mode. */
  def setDropDownLineCount(nLines: Double): Unit
  
  /** determines if only a single item or multiple items can be selected. */
  def setMultipleMode(bMulti: Boolean): Unit
}
object XListBox {
  
  inline def apply(
    DropDownLineCount: Double,
    ItemCount: Double,
    Items: SafeArray[String],
    SelectedItem: String,
    SelectedItemPos: Double,
    SelectedItems: SafeArray[String],
    SelectedItemsPos: SafeArray[Double],
    acquire: () => Unit,
    addActionListener: XActionListener => Unit,
    addItem: (String, Double) => Unit,
    addItemListener: XItemListener => Unit,
    addItems: (SeqEquiv[String], Double) => Unit,
    getDropDownLineCount: () => Double,
    getItem: Double => String,
    getItemCount: () => Double,
    getItems: () => SafeArray[String],
    getSelectedItem: () => String,
    getSelectedItemPos: () => Double,
    getSelectedItems: () => SafeArray[String],
    getSelectedItemsPos: () => SafeArray[Double],
    isMutipleMode: () => Boolean,
    makeVisible: Double => Unit,
    queryInterface: `type` => Any,
    release: () => Unit,
    removeActionListener: XActionListener => Unit,
    removeItemListener: XItemListener => Unit,
    removeItems: (Double, Double) => Unit,
    selectItem: (String, Boolean) => Unit,
    selectItemPos: (Double, Boolean) => Unit,
    selectItemsPos: (SeqEquiv[Double], Boolean) => Unit,
    setDropDownLineCount: Double => Unit,
    setMultipleMode: Boolean => Unit
  ): XListBox = {
    val __obj = js.Dynamic.literal(DropDownLineCount = DropDownLineCount.asInstanceOf[js.Any], ItemCount = ItemCount.asInstanceOf[js.Any], Items = Items.asInstanceOf[js.Any], SelectedItem = SelectedItem.asInstanceOf[js.Any], SelectedItemPos = SelectedItemPos.asInstanceOf[js.Any], SelectedItems = SelectedItems.asInstanceOf[js.Any], SelectedItemsPos = SelectedItemsPos.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addActionListener = js.Any.fromFunction1(addActionListener), addItem = js.Any.fromFunction2(addItem), addItemListener = js.Any.fromFunction1(addItemListener), addItems = js.Any.fromFunction2(addItems), getDropDownLineCount = js.Any.fromFunction0(getDropDownLineCount), getItem = js.Any.fromFunction1(getItem), getItemCount = js.Any.fromFunction0(getItemCount), getItems = js.Any.fromFunction0(getItems), getSelectedItem = js.Any.fromFunction0(getSelectedItem), getSelectedItemPos = js.Any.fromFunction0(getSelectedItemPos), getSelectedItems = js.Any.fromFunction0(getSelectedItems), getSelectedItemsPos = js.Any.fromFunction0(getSelectedItemsPos), isMutipleMode = js.Any.fromFunction0(isMutipleMode), makeVisible = js.Any.fromFunction1(makeVisible), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeActionListener = js.Any.fromFunction1(removeActionListener), removeItemListener = js.Any.fromFunction1(removeItemListener), removeItems = js.Any.fromFunction2(removeItems), selectItem = js.Any.fromFunction2(selectItem), selectItemPos = js.Any.fromFunction2(selectItemPos), selectItemsPos = js.Any.fromFunction2(selectItemsPos), setDropDownLineCount = js.Any.fromFunction1(setDropDownLineCount), setMultipleMode = js.Any.fromFunction1(setMultipleMode))
    __obj.asInstanceOf[XListBox]
  }
  
  extension [Self <: XListBox](x: Self) {
    
    inline def setAddActionListener(value: XActionListener => Unit): Self = StObject.set(x, "addActionListener", js.Any.fromFunction1(value))
    
    inline def setAddItem(value: (String, Double) => Unit): Self = StObject.set(x, "addItem", js.Any.fromFunction2(value))
    
    inline def setAddItemListener(value: XItemListener => Unit): Self = StObject.set(x, "addItemListener", js.Any.fromFunction1(value))
    
    inline def setAddItems(value: (SeqEquiv[String], Double) => Unit): Self = StObject.set(x, "addItems", js.Any.fromFunction2(value))
    
    inline def setDropDownLineCount(value: Double): Self = StObject.set(x, "DropDownLineCount", value.asInstanceOf[js.Any])
    
    inline def setGetDropDownLineCount(value: () => Double): Self = StObject.set(x, "getDropDownLineCount", js.Any.fromFunction0(value))
    
    inline def setGetItem(value: Double => String): Self = StObject.set(x, "getItem", js.Any.fromFunction1(value))
    
    inline def setGetItemCount(value: () => Double): Self = StObject.set(x, "getItemCount", js.Any.fromFunction0(value))
    
    inline def setGetItems(value: () => SafeArray[String]): Self = StObject.set(x, "getItems", js.Any.fromFunction0(value))
    
    inline def setGetSelectedItem(value: () => String): Self = StObject.set(x, "getSelectedItem", js.Any.fromFunction0(value))
    
    inline def setGetSelectedItemPos(value: () => Double): Self = StObject.set(x, "getSelectedItemPos", js.Any.fromFunction0(value))
    
    inline def setGetSelectedItems(value: () => SafeArray[String]): Self = StObject.set(x, "getSelectedItems", js.Any.fromFunction0(value))
    
    inline def setGetSelectedItemsPos(value: () => SafeArray[Double]): Self = StObject.set(x, "getSelectedItemsPos", js.Any.fromFunction0(value))
    
    inline def setIsMutipleMode(value: () => Boolean): Self = StObject.set(x, "isMutipleMode", js.Any.fromFunction0(value))
    
    inline def setItemCount(value: Double): Self = StObject.set(x, "ItemCount", value.asInstanceOf[js.Any])
    
    inline def setItems(value: SafeArray[String]): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setMakeVisible(value: Double => Unit): Self = StObject.set(x, "makeVisible", js.Any.fromFunction1(value))
    
    inline def setRemoveActionListener(value: XActionListener => Unit): Self = StObject.set(x, "removeActionListener", js.Any.fromFunction1(value))
    
    inline def setRemoveItemListener(value: XItemListener => Unit): Self = StObject.set(x, "removeItemListener", js.Any.fromFunction1(value))
    
    inline def setRemoveItems(value: (Double, Double) => Unit): Self = StObject.set(x, "removeItems", js.Any.fromFunction2(value))
    
    inline def setSelectItem(value: (String, Boolean) => Unit): Self = StObject.set(x, "selectItem", js.Any.fromFunction2(value))
    
    inline def setSelectItemPos(value: (Double, Boolean) => Unit): Self = StObject.set(x, "selectItemPos", js.Any.fromFunction2(value))
    
    inline def setSelectItemsPos(value: (SeqEquiv[Double], Boolean) => Unit): Self = StObject.set(x, "selectItemsPos", js.Any.fromFunction2(value))
    
    inline def setSelectedItem(value: String): Self = StObject.set(x, "SelectedItem", value.asInstanceOf[js.Any])
    
    inline def setSelectedItemPos(value: Double): Self = StObject.set(x, "SelectedItemPos", value.asInstanceOf[js.Any])
    
    inline def setSelectedItems(value: SafeArray[String]): Self = StObject.set(x, "SelectedItems", value.asInstanceOf[js.Any])
    
    inline def setSelectedItemsPos(value: SafeArray[Double]): Self = StObject.set(x, "SelectedItemsPos", value.asInstanceOf[js.Any])
    
    inline def setSetDropDownLineCount(value: Double => Unit): Self = StObject.set(x, "setDropDownLineCount", js.Any.fromFunction1(value))
    
    inline def setSetMultipleMode(value: Boolean => Unit): Self = StObject.set(x, "setMultipleMode", js.Any.fromFunction1(value))
  }
}
