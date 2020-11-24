package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** gives access to the items of a combo box and makes it possible to register item and action event listeners. */
@js.native
trait XComboBox extends XInterface {
  
  /** returns the number of visible lines in the drop down mode. */
  var DropDownLineCount: Double = js.native
  
  /** returns the number of items in the combo box. */
  val ItemCount: Double = js.native
  
  /** returns all items of the combo box. */
  val Items: SafeArray[String] = js.native
  
  /** registers a listener for action events. */
  def addActionListener(l: XActionListener): Unit = js.native
  
  /** adds an item at the specified position. */
  def addItem(aItem: String, nPos: Double): Unit = js.native
  
  /** registers a listener for item events. */
  def addItemListener(l: XItemListener): Unit = js.native
  
  /** adds multiple items at the specified position. */
  def addItems(aItems: SeqEquiv[String], nPos: Double): Unit = js.native
  
  /** returns the number of visible lines in the drop down mode. */
  def getDropDownLineCount(): Double = js.native
  
  /** returns the item at the specified position. */
  def getItem(nPos: Double): String = js.native
  
  /** returns the number of items in the combo box. */
  def getItemCount(): Double = js.native
  
  /** returns all items of the combo box. */
  def getItems(): SafeArray[String] = js.native
  
  /** unregisters a listener for action events. */
  def removeActionListener(l: XActionListener): Unit = js.native
  
  /** unregisters a listener for item events. */
  def removeItemListener(l: XItemListener): Unit = js.native
  
  /** removes a number of items at the specified position. */
  def removeItems(nPos: Double, nCount: Double): Unit = js.native
  
  /** sets the number of visible lines for drop down mode. */
  def setDropDownLineCount(nLines: Double): Unit = js.native
}
object XComboBox {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class XComboBoxOps[Self <: XComboBox] (val x: Self) extends AnyVal {
    
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
    def setDropDownLineCount(value: Double): Self = this.set("DropDownLineCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemCount(value: Double): Self = this.set("ItemCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItems(value: SafeArray[String]): Self = this.set("Items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddActionListener(value: XActionListener => Unit): Self = this.set("addActionListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddItem(value: (String, Double) => Unit): Self = this.set("addItem", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAddItemListener(value: XItemListener => Unit): Self = this.set("addItemListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddItems(value: (SeqEquiv[String], Double) => Unit): Self = this.set("addItems", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetDropDownLineCount(value: () => Double): Self = this.set("getDropDownLineCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetItem(value: Double => String): Self = this.set("getItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetItemCount(value: () => Double): Self = this.set("getItemCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetItems(value: () => SafeArray[String]): Self = this.set("getItems", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveActionListener(value: XActionListener => Unit): Self = this.set("removeActionListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveItemListener(value: XItemListener => Unit): Self = this.set("removeItemListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveItems(value: (Double, Double) => Unit): Self = this.set("removeItems", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetDropDownLineCount(value: Double => Unit): Self = this.set("setDropDownLineCount", js.Any.fromFunction1(value))
  }
}
