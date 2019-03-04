package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a simple menu. */
trait XMenu
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * returns the number of items in the menu.
    * @returns the number of items in this {@link XMenu} .
    */
  val ItemCount: scala.Double
  /**
    * adds the specified menu listener to receive events from this menu.
    * @param xListener the {@link XMenuListener} to be added.
    */
  def addMenuListener(xListener: XMenuListener): scala.Unit
  /** removes all items from the menu. */
  def clear(): scala.Unit
  /**
    * specifies whether mnemonics are automatically assigned to menu items, or not.
    * @param bEnable if `TRUE` , mnemonics are automatically assigned to menu items.
    */
  def enableAutoMnemonics(bEnable: scala.Boolean): scala.Unit
  /**
    * enables or disables the menu item.
    * @param nItemId specifies the menu item ID.
    * @param bEnable specifies whether the menu item should be enabled ( `TRUE` ) or disabled ( `FALSE` ).
    */
  def enableItem(nItemId: scala.Double, bEnable: scala.Boolean): scala.Unit
  /**
    * retrieves the command string for the menu item.
    * @param nItemId specifies the menu item ID for which the command URL should be set.
    * @returns the command of the menu item.
    */
  def getCommand(nItemId: scala.Double): java.lang.String
  /**
    * retrieves the help command string for the menu item.
    * @param nItemId specifies the menu item ID for which the help command should be set.
    * @returns the help command of the menu item.
    */
  def getHelpCommand(nItemId: scala.Double): java.lang.String
  /**
    * retrieves the help text for the menu item.
    * @param nItemId specifies the menu item identifier for which the help text should be retrieved.
    * @returns a string with the help text.
    */
  def getHelpText(nItemId: scala.Double): java.lang.String
  /**
    * returns the number of items in the menu.
    * @returns the number of items in this {@link XMenu} .
    */
  def getItemCount(): scala.Double
  /**
    * returns the ID of the item at the specified position.
    * @param nItemPos specifies the position of the menu item for which the item ID is queried.
    * @returns the ID of the menu item at the given position.
    */
  def getItemId(nItemPos: scala.Double): scala.Double
  /**
    * returns the position of the item with the specified ID.
    * @param nItemId specifies the ID of the menu item for which the item position is queried.
    * @returns the position of the menu item with the specified ID.
    */
  def getItemPos(nItemId: scala.Double): scala.Double
  /**
    * returns the string for the given item id.
    * @param nItemId specifies the ID of the menu item.
    * @returns the label of the menu item.
    */
  def getItemText(nItemId: scala.Double): java.lang.String
  /**
    * retrieves the type of the menu item.
    * @param nItemPos specifies the position of the menu item for which the item type is queried.
    * @returns a MenuItemType indicating the item type.
    */
  def getItemType(nItemPos: scala.Double): MenuItemType
  /**
    * returns the popup menu from the menu item.
    * @param nItemId specifies the menu item ID for which the {@link XPopupMenu} should be retrieved.
    * @returns a {@link XPopupMenu} .
    */
  def getPopupMenu(nItemId: scala.Double): XPopupMenu
  /**
    * retrieves the tip help text for the menu item.
    * @param nItemId specifies the menu item identifier for which the tip help text should be retrieved.
    * @returns a string with the tip help text.
    */
  def getTipHelpText(nItemId: scala.Double): java.lang.String
  /**
    * specifies whether disabled menu entries should be hidden, or not.
    * @param bHide if `TRUE` , disabled menu entries are hidden.
    */
  def hideDisabledEntries(bHide: scala.Boolean): scala.Unit
  /**
    * inserts an item into the menu.
    *
    * The item is appended if the position is greater than or equal to {@link getItemCount()} or if it is negative.
    * @param nItemId specifies the ID of the menu item to be inserted.
    * @param aText specifies the label of the menu item.
    * @param nItemStyle specifies the style of the menu item, as defined in {@link MenuItemStyle} .
    * @param nItemPos specifies the position where the menu item will be inserted.
    */
  def insertItem(nItemId: scala.Double, aText: java.lang.String, nItemStyle: scala.Double, nItemPos: scala.Double): scala.Unit
  /**
    * returns the state of the menu item.
    * @param nItemId specifies the menu item ID.
    * @returns `TRUE` if the item is enabled, `FALSE` otherwise.
    */
  def isItemEnabled(nItemId: scala.Double): scala.Boolean
  /**
    * checks whether an {@link XMenu} is an {@link XPopupMenu} .
    * @returns `TRUE` if the menu is a {@link PopupMenu} , `FALSE` if it is a {@link MenuBar} .
    */
  def isPopupMenu(): scala.Boolean
  /**
    * removes one or more items from the menu.
    * @param nItemPos specifies the position of the (first) menu item to be removed.
    * @param nCount specifies the number of menu items to remove.
    */
  def removeItem(nItemPos: scala.Double, nCount: scala.Double): scala.Unit
  /**
    * removes the specified menu listener so that it no longer receives events from this menu.
    * @param xListener the {@link XMenuListener} to be removed.
    */
  def removeMenuListener(xListener: XMenuListener): scala.Unit
  /**
    * sets the command string for the menu item.
    * @param nItemId specifies the menu item ID for which the command should be set.
    * @param aCommand specifies the command for the menu item.
    */
  def setCommand(nItemId: scala.Double, aCommand: java.lang.String): scala.Unit
  /**
    * sets the help command string for the menu item.
    * @param nItemId specifies the menu item ID for which the help command URL be set.
    * @param aCommand specifies the help command for the menu item.
    */
  def setHelpCommand(nItemId: scala.Double, aCommand: java.lang.String): scala.Unit
  /**
    * sets the help text for the menu item.
    * @param nItemId specifies the menu item identifier for which the help text should be set.
    * @param sHelpText specifies the help text for the menu item.
    */
  def setHelpText(nItemId: scala.Double, sHelpText: java.lang.String): scala.Unit
  /**
    * sets the text for the menu item.
    * @param nItemId specifies the ID of the menu item.
    * @param aText specifies the label of the menu item.
    */
  def setItemText(nItemId: scala.Double, aText: java.lang.String): scala.Unit
  /**
    * sets the popup menu for a specified menu item.
    * @param nItemId specifies the menu item ID for which the {@link XPopupMenu} should be set.
    * @param aPopupMenu specifies a {@link XPopupMenu} .
    */
  def setPopupMenu(nItemId: scala.Double, aPopupMenu: XPopupMenu): scala.Unit
  /**
    * sets the tip help text for the menu item.
    * @param nItemId specifies the menu item identifier for which the tip help text should be set.
    * @param sTipHelpText specifies the tip help text for the menu item.
    */
  def setTipHelpText(nItemId: scala.Double, sTipHelpText: java.lang.String): scala.Unit
}

object XMenu {
  @scala.inline
  def apply(
    ItemCount: scala.Double,
    acquire: js.Function0[scala.Unit],
    addMenuListener: js.Function1[XMenuListener, scala.Unit],
    clear: js.Function0[scala.Unit],
    enableAutoMnemonics: js.Function1[scala.Boolean, scala.Unit],
    enableItem: js.Function2[scala.Double, scala.Boolean, scala.Unit],
    getCommand: js.Function1[scala.Double, java.lang.String],
    getHelpCommand: js.Function1[scala.Double, java.lang.String],
    getHelpText: js.Function1[scala.Double, java.lang.String],
    getItemCount: js.Function0[scala.Double],
    getItemId: js.Function1[scala.Double, scala.Double],
    getItemPos: js.Function1[scala.Double, scala.Double],
    getItemText: js.Function1[scala.Double, java.lang.String],
    getItemType: js.Function1[scala.Double, MenuItemType],
    getPopupMenu: js.Function1[scala.Double, XPopupMenu],
    getTipHelpText: js.Function1[scala.Double, java.lang.String],
    hideDisabledEntries: js.Function1[scala.Boolean, scala.Unit],
    insertItem: js.Function4[scala.Double, java.lang.String, scala.Double, scala.Double, scala.Unit],
    isItemEnabled: js.Function1[scala.Double, scala.Boolean],
    isPopupMenu: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeItem: js.Function2[scala.Double, scala.Double, scala.Unit],
    removeMenuListener: js.Function1[XMenuListener, scala.Unit],
    setCommand: js.Function2[scala.Double, java.lang.String, scala.Unit],
    setHelpCommand: js.Function2[scala.Double, java.lang.String, scala.Unit],
    setHelpText: js.Function2[scala.Double, java.lang.String, scala.Unit],
    setItemText: js.Function2[scala.Double, java.lang.String, scala.Unit],
    setPopupMenu: js.Function2[scala.Double, XPopupMenu, scala.Unit],
    setTipHelpText: js.Function2[scala.Double, java.lang.String, scala.Unit]
  ): XMenu = {
    val __obj = js.Dynamic.literal(ItemCount = ItemCount, acquire = acquire, addMenuListener = addMenuListener, clear = clear, enableAutoMnemonics = enableAutoMnemonics, enableItem = enableItem, getCommand = getCommand, getHelpCommand = getHelpCommand, getHelpText = getHelpText, getItemCount = getItemCount, getItemId = getItemId, getItemPos = getItemPos, getItemText = getItemText, getItemType = getItemType, getPopupMenu = getPopupMenu, getTipHelpText = getTipHelpText, hideDisabledEntries = hideDisabledEntries, insertItem = insertItem, isItemEnabled = isItemEnabled, isPopupMenu = isPopupMenu, queryInterface = queryInterface, release = release, removeItem = removeItem, removeMenuListener = removeMenuListener, setCommand = setCommand, setHelpCommand = setHelpCommand, setHelpText = setHelpText, setItemText = setItemText, setPopupMenu = setPopupMenu, setTipHelpText = setTipHelpText)
  
    __obj.asInstanceOf[XMenu]
  }
}

