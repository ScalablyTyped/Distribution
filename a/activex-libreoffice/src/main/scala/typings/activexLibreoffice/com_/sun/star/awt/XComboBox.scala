package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** gives access to the items of a combo box and makes it possible to register item and action event listeners. */
trait XComboBox
  extends StObject
     with XInterface {
  
  /** returns the number of visible lines in the drop down mode. */
  var DropDownLineCount: Double
  
  /** returns the number of items in the combo box. */
  val ItemCount: Double
  
  /** returns all items of the combo box. */
  val Items: SafeArray[String]
  
  /** registers a listener for action events. */
  def addActionListener(l: XActionListener): Unit
  
  /** adds an item at the specified position. */
  def addItem(aItem: String, nPos: Double): Unit
  
  /** registers a listener for item events. */
  def addItemListener(l: XItemListener): Unit
  
  /** adds multiple items at the specified position. */
  def addItems(aItems: SeqEquiv[String], nPos: Double): Unit
  
  /** returns the number of visible lines in the drop down mode. */
  def getDropDownLineCount(): Double
  
  /** returns the item at the specified position. */
  def getItem(nPos: Double): String
  
  /** returns the number of items in the combo box. */
  def getItemCount(): Double
  
  /** returns all items of the combo box. */
  def getItems(): SafeArray[String]
  
  /** unregisters a listener for action events. */
  def removeActionListener(l: XActionListener): Unit
  
  /** unregisters a listener for item events. */
  def removeItemListener(l: XItemListener): Unit
  
  /** removes a number of items at the specified position. */
  def removeItems(nPos: Double, nCount: Double): Unit
  
  /** sets the number of visible lines for drop down mode. */
  def setDropDownLineCount(nLines: Double): Unit
}
object XComboBox {
  
  inline def apply(
    DropDownLineCount: Double,
    ItemCount: Double,
    Items: SafeArray[String],
    acquire: () => Unit,
    addActionListener: XActionListener => Unit,
    addItem: (String, Double) => Unit,
    addItemListener: XItemListener => Unit,
    addItems: (SeqEquiv[String], Double) => Unit,
    getDropDownLineCount: () => Double,
    getItem: Double => String,
    getItemCount: () => Double,
    getItems: () => SafeArray[String],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeActionListener: XActionListener => Unit,
    removeItemListener: XItemListener => Unit,
    removeItems: (Double, Double) => Unit,
    setDropDownLineCount: Double => Unit
  ): XComboBox = {
    val __obj = js.Dynamic.literal(DropDownLineCount = DropDownLineCount.asInstanceOf[js.Any], ItemCount = ItemCount.asInstanceOf[js.Any], Items = Items.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addActionListener = js.Any.fromFunction1(addActionListener), addItem = js.Any.fromFunction2(addItem), addItemListener = js.Any.fromFunction1(addItemListener), addItems = js.Any.fromFunction2(addItems), getDropDownLineCount = js.Any.fromFunction0(getDropDownLineCount), getItem = js.Any.fromFunction1(getItem), getItemCount = js.Any.fromFunction0(getItemCount), getItems = js.Any.fromFunction0(getItems), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeActionListener = js.Any.fromFunction1(removeActionListener), removeItemListener = js.Any.fromFunction1(removeItemListener), removeItems = js.Any.fromFunction2(removeItems), setDropDownLineCount = js.Any.fromFunction1(setDropDownLineCount))
    __obj.asInstanceOf[XComboBox]
  }
  
  extension [Self <: XComboBox](x: Self) {
    
    inline def setAddActionListener(value: XActionListener => Unit): Self = StObject.set(x, "addActionListener", js.Any.fromFunction1(value))
    
    inline def setAddItem(value: (String, Double) => Unit): Self = StObject.set(x, "addItem", js.Any.fromFunction2(value))
    
    inline def setAddItemListener(value: XItemListener => Unit): Self = StObject.set(x, "addItemListener", js.Any.fromFunction1(value))
    
    inline def setAddItems(value: (SeqEquiv[String], Double) => Unit): Self = StObject.set(x, "addItems", js.Any.fromFunction2(value))
    
    inline def setDropDownLineCount(value: Double): Self = StObject.set(x, "DropDownLineCount", value.asInstanceOf[js.Any])
    
    inline def setGetDropDownLineCount(value: () => Double): Self = StObject.set(x, "getDropDownLineCount", js.Any.fromFunction0(value))
    
    inline def setGetItem(value: Double => String): Self = StObject.set(x, "getItem", js.Any.fromFunction1(value))
    
    inline def setGetItemCount(value: () => Double): Self = StObject.set(x, "getItemCount", js.Any.fromFunction0(value))
    
    inline def setGetItems(value: () => SafeArray[String]): Self = StObject.set(x, "getItems", js.Any.fromFunction0(value))
    
    inline def setItemCount(value: Double): Self = StObject.set(x, "ItemCount", value.asInstanceOf[js.Any])
    
    inline def setItems(value: SafeArray[String]): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setRemoveActionListener(value: XActionListener => Unit): Self = StObject.set(x, "removeActionListener", js.Any.fromFunction1(value))
    
    inline def setRemoveItemListener(value: XItemListener => Unit): Self = StObject.set(x, "removeItemListener", js.Any.fromFunction1(value))
    
    inline def setRemoveItems(value: (Double, Double) => Unit): Self = StObject.set(x, "removeItems", js.Any.fromFunction2(value))
    
    inline def setSetDropDownLineCount(value: Double => Unit): Self = StObject.set(x, "setDropDownLineCount", js.Any.fromFunction1(value))
  }
}
