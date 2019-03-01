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
    acquire: js.Function0[scala.Unit],
    addMenuListener: js.Function1[XMenuListener, scala.Unit],
    checkItem: js.Function2[scala.Double, scala.Boolean, scala.Unit],
    clear: js.Function0[scala.Unit],
    enableAutoMnemonics: js.Function1[scala.Boolean, scala.Unit],
    enableItem: js.Function2[scala.Double, scala.Boolean, scala.Unit],
    endExecute: js.Function0[scala.Unit],
    execute: js.Function3[XWindowPeer, Rectangle, scala.Double, scala.Double],
    getAcceleratorKeyEvent: js.Function1[scala.Double, KeyEvent],
    getCommand: js.Function1[scala.Double, java.lang.String],
    getDefaultItem: js.Function0[scala.Double],
    getHelpCommand: js.Function1[scala.Double, java.lang.String],
    getHelpText: js.Function1[scala.Double, java.lang.String],
    getItemCount: js.Function0[scala.Double],
    getItemId: js.Function1[scala.Double, scala.Double],
    getItemImage: js.Function1[scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.graphicNs.XGraphic],
    getItemPos: js.Function1[scala.Double, scala.Double],
    getItemText: js.Function1[scala.Double, java.lang.String],
    getItemType: js.Function1[scala.Double, MenuItemType],
    getPopupMenu: js.Function1[scala.Double, XPopupMenu],
    getTipHelpText: js.Function1[scala.Double, java.lang.String],
    hideDisabledEntries: js.Function1[scala.Boolean, scala.Unit],
    insertItem: js.Function4[scala.Double, java.lang.String, scala.Double, scala.Double, scala.Unit],
    insertSeparator: js.Function1[scala.Double, scala.Unit],
    isInExecute: js.Function0[scala.Boolean],
    isItemChecked: js.Function1[scala.Double, scala.Boolean],
    isItemEnabled: js.Function1[scala.Double, scala.Boolean],
    isPopupMenu: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeItem: js.Function2[scala.Double, scala.Double, scala.Unit],
    removeMenuListener: js.Function1[XMenuListener, scala.Unit],
    setAcceleratorKeyEvent: js.Function2[scala.Double, KeyEvent, scala.Unit],
    setCommand: js.Function2[scala.Double, java.lang.String, scala.Unit],
    setDefaultItem: js.Function1[scala.Double, scala.Unit],
    setHelpCommand: js.Function2[scala.Double, java.lang.String, scala.Unit],
    setHelpText: js.Function2[scala.Double, java.lang.String, scala.Unit],
    setItemImage: js.Function3[
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.graphicNs.XGraphic, 
      scala.Boolean, 
      scala.Unit
    ],
    setItemText: js.Function2[scala.Double, java.lang.String, scala.Unit],
    setPopupMenu: js.Function2[scala.Double, XPopupMenu, scala.Unit],
    setTipHelpText: js.Function2[scala.Double, java.lang.String, scala.Unit]
  ): XPopupMenu = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("DefaultItem")(DefaultItem)
    __obj.updateDynamic("ItemCount")(ItemCount)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addMenuListener")(addMenuListener)
    __obj.updateDynamic("checkItem")(checkItem)
    __obj.updateDynamic("clear")(clear)
    __obj.updateDynamic("enableAutoMnemonics")(enableAutoMnemonics)
    __obj.updateDynamic("enableItem")(enableItem)
    __obj.updateDynamic("endExecute")(endExecute)
    __obj.updateDynamic("execute")(execute)
    __obj.updateDynamic("getAcceleratorKeyEvent")(getAcceleratorKeyEvent)
    __obj.updateDynamic("getCommand")(getCommand)
    __obj.updateDynamic("getDefaultItem")(getDefaultItem)
    __obj.updateDynamic("getHelpCommand")(getHelpCommand)
    __obj.updateDynamic("getHelpText")(getHelpText)
    __obj.updateDynamic("getItemCount")(getItemCount)
    __obj.updateDynamic("getItemId")(getItemId)
    __obj.updateDynamic("getItemImage")(getItemImage)
    __obj.updateDynamic("getItemPos")(getItemPos)
    __obj.updateDynamic("getItemText")(getItemText)
    __obj.updateDynamic("getItemType")(getItemType)
    __obj.updateDynamic("getPopupMenu")(getPopupMenu)
    __obj.updateDynamic("getTipHelpText")(getTipHelpText)
    __obj.updateDynamic("hideDisabledEntries")(hideDisabledEntries)
    __obj.updateDynamic("insertItem")(insertItem)
    __obj.updateDynamic("insertSeparator")(insertSeparator)
    __obj.updateDynamic("isInExecute")(isInExecute)
    __obj.updateDynamic("isItemChecked")(isItemChecked)
    __obj.updateDynamic("isItemEnabled")(isItemEnabled)
    __obj.updateDynamic("isPopupMenu")(isPopupMenu)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeItem")(removeItem)
    __obj.updateDynamic("removeMenuListener")(removeMenuListener)
    __obj.updateDynamic("setAcceleratorKeyEvent")(setAcceleratorKeyEvent)
    __obj.updateDynamic("setCommand")(setCommand)
    __obj.updateDynamic("setDefaultItem")(setDefaultItem)
    __obj.updateDynamic("setHelpCommand")(setHelpCommand)
    __obj.updateDynamic("setHelpText")(setHelpText)
    __obj.updateDynamic("setItemImage")(setItemImage)
    __obj.updateDynamic("setItemText")(setItemText)
    __obj.updateDynamic("setPopupMenu")(setPopupMenu)
    __obj.updateDynamic("setTipHelpText")(setTipHelpText)
    __obj.asInstanceOf[XPopupMenu]
  }
}

