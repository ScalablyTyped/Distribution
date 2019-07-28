package typings.activexDashLibreoffice.comNs.sunNs.starNs.uiNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.Rectangle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an item in a status bar
  * @see com.sun.star.frame.XStatusbarController
  * @since LibreOffice 4.1
  */
trait XStatusbarItem extends js.Object {
  /** the accessible name of the status bar item */
  var AccessibleName: String
  /** the command of the status bar item */
  var Command: String
  /** the help text of the status bar item when extended help tips are on */
  var HelpText: String
  /** the unique ID of the control within the status bar */
  var ItemId: Double
  /**
    * the rectangle on the status bar device onto which the item is drawn
    * @see com.sun.star.frame.XStatusbarController.paint()
    */
  var ItemRect: Rectangle
  /** the offset between this status bar item and the following */
  var Offset: Double
  /** the help text of the status bar item when help tips are on */
  var QuickHelpText: String
  /**
    * the style of the status bar item
    *
    * The following values apply for a status bar item:
    *
    * Alignment {@link com.sun.star.ui.ItemStyle.ALIGN_LEFT}{@link com.sun.star.ui.ItemStyle.ALIGN_CENTER}{@link
    * com.sun.star.ui.ItemStyle.ALIGN_RIGHT}Drawing {@link com.sun.star.ui.ItemStyle.DRAW_OUT3D}{@link com.sun.star.ui.ItemStyle.DRAW_IN3D}{@link
    * com.sun.star.ui.ItemStyle.DRAW_FLAT}{@link com.sun.star.ui.ItemStyle.AUTO_SIZE}{@link com.sun.star.ui.ItemStyle.OWNER_DRAW}
    * @see com.sun.star.ui.ItemStyle
    */
  var Style: Double
  /** the text of status bar item */
  var Text: String
  /** whether the item is visible or not */
  var Visible: Boolean
  /** the width of the status bar item */
  var Width: Double
  /**
    * forces repainting the item onto the status bar device
    * @see com.sun.star.frame.XStatusbarController.paint()
    */
  def repaint(): Unit
}

object XStatusbarItem {
  @scala.inline
  def apply(
    AccessibleName: String,
    Command: String,
    HelpText: String,
    ItemId: Double,
    ItemRect: Rectangle,
    Offset: Double,
    QuickHelpText: String,
    Style: Double,
    Text: String,
    Visible: Boolean,
    Width: Double,
    repaint: () => Unit
  ): XStatusbarItem = {
    val __obj = js.Dynamic.literal(AccessibleName = AccessibleName, Command = Command, HelpText = HelpText, ItemId = ItemId, ItemRect = ItemRect, Offset = Offset, QuickHelpText = QuickHelpText, Style = Style, Text = Text, Visible = Visible, Width = Width, repaint = js.Any.fromFunction0(repaint))
  
    __obj.asInstanceOf[XStatusbarItem]
  }
}

