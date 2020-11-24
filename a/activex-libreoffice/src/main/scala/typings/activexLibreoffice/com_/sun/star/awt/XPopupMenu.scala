package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.graphic.XGraphic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** controls a pop-up menu. */
@js.native
trait XPopupMenu extends XMenu {
  
  /**
    * returns the menu default item.
    * @returns the ID of the default item.
    */
  var DefaultItem: Double = js.native
  
  /**
    * sets the state of the item to be checked or unchecked.
    * @param nItemId specifies the menu item identifier.
    * @param bCheck specifies if the item is checked ( `TRUE` ) or unchecked ( `FALSE` ).
    */
  def checkItem(nItemId: Double, bCheck: Boolean): Unit = js.native
  
  /**
    * ends the execution of the {@link PopupMenu} .
    *
    * {@link com.sun.star.awt.XPopupMenu.execute()} will then return 0.
    * @see com.sun.star.awt.XPopupMenu.execute()
    */
  def endExecute(): Unit = js.native
  
  /**
    * executes the popup menu and returns the selected item or `0` , if cancelled.
    * @param Parent the parent window.
    * @param Position a {@link Rectangle} representing the coordinates system where the popup menu should be executed.
    * @param Direction the direction in which a popup menu will grow, as specified by one of the {@link PopupMenuDirection} constants.
    * @returns returns the selected item or `0` , if cancelled.
    */
  def execute(Parent: XWindowPeer, Position: Rectangle, Direction: Double): Double = js.native
  
  /**
    * retrieves the {@link KeyEvent} for the menu item.
    *
    * The {@link KeyEvent} is **only** used as a container to transport the shortcut information, so that in this case {@link
    * com.sun.star.lang.EventObject.Source} is NULL.
    * @param nItemId specifies the menu item identifier for which the {@link KeyEvent} should be retrieved.
    * @returns the {@link KeyEvent} struct assigned to the requested menu item.
    */
  def getAcceleratorKeyEvent(nItemId: Double): KeyEvent = js.native
  
  /**
    * returns the menu default item.
    * @returns the ID of the default item.
    */
  def getDefaultItem(): Double = js.native
  
  /**
    * retrieves the image for the menu item.
    * @param nItemId specifies the menu item identifier for which the image should be retrieved.
    * @returns a XGraphic reference to the current image for the requested menu item.
    */
  def getItemImage(nItemId: Double): XGraphic = js.native
  
  /**
    * inserts a separator at the specified position.
    * @param nItemPos specifies the position where the menu separator will be inserted.
    */
  def insertSeparator(nItemPos: Double): Unit = js.native
  
  /**
    * queries if the {@link PopupMenu} is being.
    *
    * Returns `TRUE` only if the {@link PopupMenu} is being executed as a result of invoking {@link XPopupMenu.execute()} ; that is, for a {@link PopupMenu}
    * activated by a {@link MenuBar} item, this methods returns `FALSE` .
    * @returns `TRUE` if the {@link PopupMenu} is being executed, `FALSE` otherwise.
    * @see XPopupMenu.execute()
    */
  def isInExecute(): Boolean = js.native
  
  /**
    * returns whether the item is checked or unchecked.
    * @param nItemId specifies the menu item identifier.
    * @returns `TRUE` if the item is checked, `FALSE` otherwise.
    */
  def isItemChecked(nItemId: Double): Boolean = js.native
  
  /**
    * sets the {@link KeyEvent} for the menu item.
    *
    * The {@link KeyEvent} is **only** used as a container to transport the shortcut information, this methods only draws the text corresponding to this
    * keyboard shortcut. The client code is responsible for listening to keyboard events (typically done via {@link XUserInputInterception} ), and dispatch
    * the respective command.
    * @param nItemId specifies the menu item identifier for which the {@link KeyEvent} should be set.
    * @param aKeyEvent specifies the {@link KeyEvent} for the menu item.
    */
  def setAcceleratorKeyEvent(nItemId: Double, aKeyEvent: KeyEvent): Unit = js.native
  
  /**
    * sets the menu default item.
    * @param nItemId specifies the menu item identifier.
    */
  def setDefaultItem(nItemId: Double): Unit = js.native
  
  /**
    * sets the image for the menu item.
    * @param nItemId specifies the menu item identifier for which the image should be set.
    * @param xGraphic specifies the image for the menu item.
    * @param bScale if `TRUE` , the image will be scaled to the standard size used internally by the implementation.
    */
  def setItemImage(nItemId: Double, xGraphic: XGraphic, bScale: Boolean): Unit = js.native
}
object XPopupMenu {
  
  @scala.inline
  def apply(
    DefaultItem: Double,
    ItemCount: Double,
    acquire: () => Unit,
    addMenuListener: XMenuListener => Unit,
    checkItem: (Double, Boolean) => Unit,
    clear: () => Unit,
    enableAutoMnemonics: Boolean => Unit,
    enableItem: (Double, Boolean) => Unit,
    endExecute: () => Unit,
    execute: (XWindowPeer, Rectangle, Double) => Double,
    getAcceleratorKeyEvent: Double => KeyEvent,
    getCommand: Double => String,
    getDefaultItem: () => Double,
    getHelpCommand: Double => String,
    getHelpText: Double => String,
    getItemCount: () => Double,
    getItemId: Double => Double,
    getItemImage: Double => XGraphic,
    getItemPos: Double => Double,
    getItemText: Double => String,
    getItemType: Double => MenuItemType,
    getPopupMenu: Double => XPopupMenu,
    getTipHelpText: Double => String,
    hideDisabledEntries: Boolean => Unit,
    insertItem: (Double, String, Double, Double) => Unit,
    insertSeparator: Double => Unit,
    isInExecute: () => Boolean,
    isItemChecked: Double => Boolean,
    isItemEnabled: Double => Boolean,
    isPopupMenu: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeItem: (Double, Double) => Unit,
    removeMenuListener: XMenuListener => Unit,
    setAcceleratorKeyEvent: (Double, KeyEvent) => Unit,
    setCommand: (Double, String) => Unit,
    setDefaultItem: Double => Unit,
    setHelpCommand: (Double, String) => Unit,
    setHelpText: (Double, String) => Unit,
    setItemImage: (Double, XGraphic, Boolean) => Unit,
    setItemText: (Double, String) => Unit,
    setPopupMenu: (Double, XPopupMenu) => Unit,
    setTipHelpText: (Double, String) => Unit
  ): XPopupMenu = {
    val __obj = js.Dynamic.literal(DefaultItem = DefaultItem.asInstanceOf[js.Any], ItemCount = ItemCount.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addMenuListener = js.Any.fromFunction1(addMenuListener), checkItem = js.Any.fromFunction2(checkItem), clear = js.Any.fromFunction0(clear), enableAutoMnemonics = js.Any.fromFunction1(enableAutoMnemonics), enableItem = js.Any.fromFunction2(enableItem), endExecute = js.Any.fromFunction0(endExecute), execute = js.Any.fromFunction3(execute), getAcceleratorKeyEvent = js.Any.fromFunction1(getAcceleratorKeyEvent), getCommand = js.Any.fromFunction1(getCommand), getDefaultItem = js.Any.fromFunction0(getDefaultItem), getHelpCommand = js.Any.fromFunction1(getHelpCommand), getHelpText = js.Any.fromFunction1(getHelpText), getItemCount = js.Any.fromFunction0(getItemCount), getItemId = js.Any.fromFunction1(getItemId), getItemImage = js.Any.fromFunction1(getItemImage), getItemPos = js.Any.fromFunction1(getItemPos), getItemText = js.Any.fromFunction1(getItemText), getItemType = js.Any.fromFunction1(getItemType), getPopupMenu = js.Any.fromFunction1(getPopupMenu), getTipHelpText = js.Any.fromFunction1(getTipHelpText), hideDisabledEntries = js.Any.fromFunction1(hideDisabledEntries), insertItem = js.Any.fromFunction4(insertItem), insertSeparator = js.Any.fromFunction1(insertSeparator), isInExecute = js.Any.fromFunction0(isInExecute), isItemChecked = js.Any.fromFunction1(isItemChecked), isItemEnabled = js.Any.fromFunction1(isItemEnabled), isPopupMenu = js.Any.fromFunction0(isPopupMenu), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeItem = js.Any.fromFunction2(removeItem), removeMenuListener = js.Any.fromFunction1(removeMenuListener), setAcceleratorKeyEvent = js.Any.fromFunction2(setAcceleratorKeyEvent), setCommand = js.Any.fromFunction2(setCommand), setDefaultItem = js.Any.fromFunction1(setDefaultItem), setHelpCommand = js.Any.fromFunction2(setHelpCommand), setHelpText = js.Any.fromFunction2(setHelpText), setItemImage = js.Any.fromFunction3(setItemImage), setItemText = js.Any.fromFunction2(setItemText), setPopupMenu = js.Any.fromFunction2(setPopupMenu), setTipHelpText = js.Any.fromFunction2(setTipHelpText))
    __obj.asInstanceOf[XPopupMenu]
  }
  
  @scala.inline
  implicit class XPopupMenuOps[Self <: XPopupMenu] (val x: Self) extends AnyVal {
    
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
    def setDefaultItem(value: Double): Self = this.set("DefaultItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckItem(value: (Double, Boolean) => Unit): Self = this.set("checkItem", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEndExecute(value: () => Unit): Self = this.set("endExecute", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExecute(value: (XWindowPeer, Rectangle, Double) => Double): Self = this.set("execute", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetAcceleratorKeyEvent(value: Double => KeyEvent): Self = this.set("getAcceleratorKeyEvent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetDefaultItem(value: () => Double): Self = this.set("getDefaultItem", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetItemImage(value: Double => XGraphic): Self = this.set("getItemImage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInsertSeparator(value: Double => Unit): Self = this.set("insertSeparator", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsInExecute(value: () => Boolean): Self = this.set("isInExecute", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsItemChecked(value: Double => Boolean): Self = this.set("isItemChecked", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetAcceleratorKeyEvent(value: (Double, KeyEvent) => Unit): Self = this.set("setAcceleratorKeyEvent", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetDefaultItem(value: Double => Unit): Self = this.set("setDefaultItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetItemImage(value: (Double, XGraphic, Boolean) => Unit): Self = this.set("setItemImage", js.Any.fromFunction3(value))
  }
}
