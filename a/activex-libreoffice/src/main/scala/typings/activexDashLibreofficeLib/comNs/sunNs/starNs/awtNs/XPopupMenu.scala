package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** controls a pop-up menu. */
trait XPopupMenu extends XMenu {
  /**
    * returns the menu default item.
    * @returns the ID of the default item.
    */
  var DefaultItem: scala.Double
  /**
    * sets the state of the item to be checked or unchecked.
    * @param nItemId specifies the menu item identifier.
    * @param bCheck specifies if the item is checked ( `TRUE` ) or unchecked ( `FALSE` ).
    */
  def checkItem(nItemId: scala.Double, bCheck: scala.Boolean): scala.Unit
  /**
    * ends the execution of the {@link PopupMenu} .
    *
    * {@link com.sun.star.awt.XPopupMenu.execute()} will then return 0.
    * @see com.sun.star.awt.XPopupMenu.execute()
    */
  def endExecute(): scala.Unit
  /**
    * executes the popup menu and returns the selected item or `0` , if cancelled.
    * @param Parent the parent window.
    * @param Position a {@link Rectangle} representing the coordinates system where the popup menu should be executed.
    * @param Direction the direction in which a popup menu will grow, as specified by one of the {@link PopupMenuDirection} constants.
    * @returns returns the selected item or `0` , if cancelled.
    */
  def execute(Parent: XWindowPeer, Position: Rectangle, Direction: scala.Double): scala.Double
  /**
    * retrieves the {@link KeyEvent} for the menu item.
    *
    * The {@link KeyEvent} is **only** used as a container to transport the shortcut information, so that in this case {@link
    * com.sun.star.lang.EventObject.Source} is NULL.
    * @param nItemId specifies the menu item identifier for which the {@link KeyEvent} should be retrieved.
    * @returns the {@link KeyEvent} struct assigned to the requested menu item.
    */
  def getAcceleratorKeyEvent(nItemId: scala.Double): KeyEvent
  /**
    * returns the menu default item.
    * @returns the ID of the default item.
    */
  def getDefaultItem(): scala.Double
  /**
    * retrieves the image for the menu item.
    * @param nItemId specifies the menu item identifier for which the image should be retrieved.
    * @returns a XGraphic reference to the current image for the requested menu item.
    */
  def getItemImage(nItemId: scala.Double): activexDashLibreofficeLib.comNs.sunNs.starNs.graphicNs.XGraphic
  /**
    * inserts a separator at the specified position.
    * @param nItemPos specifies the position where the menu separator will be inserted.
    */
  def insertSeparator(nItemPos: scala.Double): scala.Unit
  /**
    * queries if the {@link PopupMenu} is being.
    *
    * Returns `TRUE` only if the {@link PopupMenu} is being executed as a result of invoking {@link XPopupMenu.execute()} ; that is, for a {@link PopupMenu}
    * activated by a {@link MenuBar} item, this methods returns `FALSE` .
    * @returns `TRUE` if the {@link PopupMenu} is being executed, `FALSE` otherwise.
    * @see XPopupMenu.execute()
    */
  def isInExecute(): scala.Boolean
  /**
    * returns whether the item is checked or unchecked.
    * @param nItemId specifies the menu item identifier.
    * @returns `TRUE` if the item is checked, `FALSE` otherwise.
    */
  def isItemChecked(nItemId: scala.Double): scala.Boolean
  /**
    * sets the {@link KeyEvent} for the menu item.
    *
    * The {@link KeyEvent} is **only** used as a container to transport the shortcut information, this methods only draws the text corresponding to this
    * keyboard shortcut. The client code is responsible for listening to keyboard events (typically done via {@link XUserInputInterception} ), and dispatch
    * the respective command.
    * @param nItemId specifies the menu item identifier for which the {@link KeyEvent} should be set.
    * @param aKeyEvent specifies the {@link KeyEvent} for the menu item.
    */
  def setAcceleratorKeyEvent(nItemId: scala.Double, aKeyEvent: KeyEvent): scala.Unit
  /**
    * sets the menu default item.
    * @param nItemId specifies the menu item identifier.
    */
  def setDefaultItem(nItemId: scala.Double): scala.Unit
  /**
    * sets the image for the menu item.
    * @param nItemId specifies the menu item identifier for which the image should be set.
    * @param xGraphic specifies the image for the menu item.
    * @param bScale if `TRUE` , the image will be scaled to the standard size used internally by the implementation.
    */
  def setItemImage(
    nItemId: scala.Double,
    xGraphic: activexDashLibreofficeLib.comNs.sunNs.starNs.graphicNs.XGraphic,
    bScale: scala.Boolean
  ): scala.Unit
}

object XPopupMenu {
  @scala.inline
  def apply(
    DefaultItem: scala.Double,
    ItemCount: scala.Double,
    acquire: () => scala.Unit,
    addMenuListener: XMenuListener => scala.Unit,
    checkItem: (scala.Double, scala.Boolean) => scala.Unit,
    clear: () => scala.Unit,
    enableAutoMnemonics: scala.Boolean => scala.Unit,
    enableItem: (scala.Double, scala.Boolean) => scala.Unit,
    endExecute: () => scala.Unit,
    execute: (XWindowPeer, Rectangle, scala.Double) => scala.Double,
    getAcceleratorKeyEvent: scala.Double => KeyEvent,
    getCommand: scala.Double => java.lang.String,
    getDefaultItem: () => scala.Double,
    getHelpCommand: scala.Double => java.lang.String,
    getHelpText: scala.Double => java.lang.String,
    getItemCount: () => scala.Double,
    getItemId: scala.Double => scala.Double,
    getItemImage: scala.Double => activexDashLibreofficeLib.comNs.sunNs.starNs.graphicNs.XGraphic,
    getItemPos: scala.Double => scala.Double,
    getItemText: scala.Double => java.lang.String,
    getItemType: scala.Double => MenuItemType,
    getPopupMenu: scala.Double => XPopupMenu,
    getTipHelpText: scala.Double => java.lang.String,
    hideDisabledEntries: scala.Boolean => scala.Unit,
    insertItem: (scala.Double, java.lang.String, scala.Double, scala.Double) => scala.Unit,
    insertSeparator: scala.Double => scala.Unit,
    isInExecute: () => scala.Boolean,
    isItemChecked: scala.Double => scala.Boolean,
    isItemEnabled: scala.Double => scala.Boolean,
    isPopupMenu: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeItem: (scala.Double, scala.Double) => scala.Unit,
    removeMenuListener: XMenuListener => scala.Unit,
    setAcceleratorKeyEvent: (scala.Double, KeyEvent) => scala.Unit,
    setCommand: (scala.Double, java.lang.String) => scala.Unit,
    setDefaultItem: scala.Double => scala.Unit,
    setHelpCommand: (scala.Double, java.lang.String) => scala.Unit,
    setHelpText: (scala.Double, java.lang.String) => scala.Unit,
    setItemImage: (scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.graphicNs.XGraphic, scala.Boolean) => scala.Unit,
    setItemText: (scala.Double, java.lang.String) => scala.Unit,
    setPopupMenu: (scala.Double, XPopupMenu) => scala.Unit,
    setTipHelpText: (scala.Double, java.lang.String) => scala.Unit
  ): XPopupMenu = {
    val __obj = js.Dynamic.literal(DefaultItem = DefaultItem, ItemCount = ItemCount, acquire = js.Any.fromFunction0(acquire), addMenuListener = js.Any.fromFunction1(addMenuListener), checkItem = js.Any.fromFunction2(checkItem), clear = js.Any.fromFunction0(clear), enableAutoMnemonics = js.Any.fromFunction1(enableAutoMnemonics), enableItem = js.Any.fromFunction2(enableItem), endExecute = js.Any.fromFunction0(endExecute), execute = js.Any.fromFunction3(execute), getAcceleratorKeyEvent = js.Any.fromFunction1(getAcceleratorKeyEvent), getCommand = js.Any.fromFunction1(getCommand), getDefaultItem = js.Any.fromFunction0(getDefaultItem), getHelpCommand = js.Any.fromFunction1(getHelpCommand), getHelpText = js.Any.fromFunction1(getHelpText), getItemCount = js.Any.fromFunction0(getItemCount), getItemId = js.Any.fromFunction1(getItemId), getItemImage = js.Any.fromFunction1(getItemImage), getItemPos = js.Any.fromFunction1(getItemPos), getItemText = js.Any.fromFunction1(getItemText), getItemType = js.Any.fromFunction1(getItemType), getPopupMenu = js.Any.fromFunction1(getPopupMenu), getTipHelpText = js.Any.fromFunction1(getTipHelpText), hideDisabledEntries = js.Any.fromFunction1(hideDisabledEntries), insertItem = js.Any.fromFunction4(insertItem), insertSeparator = js.Any.fromFunction1(insertSeparator), isInExecute = js.Any.fromFunction0(isInExecute), isItemChecked = js.Any.fromFunction1(isItemChecked), isItemEnabled = js.Any.fromFunction1(isItemEnabled), isPopupMenu = js.Any.fromFunction0(isPopupMenu), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeItem = js.Any.fromFunction2(removeItem), removeMenuListener = js.Any.fromFunction1(removeMenuListener), setAcceleratorKeyEvent = js.Any.fromFunction2(setAcceleratorKeyEvent), setCommand = js.Any.fromFunction2(setCommand), setDefaultItem = js.Any.fromFunction1(setDefaultItem), setHelpCommand = js.Any.fromFunction2(setHelpCommand), setHelpText = js.Any.fromFunction2(setHelpText), setItemImage = js.Any.fromFunction3(setItemImage), setItemText = js.Any.fromFunction2(setItemText), setPopupMenu = js.Any.fromFunction2(setPopupMenu), setTipHelpText = js.Any.fromFunction2(setTipHelpText))
  
    __obj.asInstanceOf[XPopupMenu]
  }
}

