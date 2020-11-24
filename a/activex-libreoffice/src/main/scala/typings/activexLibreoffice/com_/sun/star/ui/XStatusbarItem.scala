package typings.activexLibreoffice.com_.sun.star.ui

import typings.activexLibreoffice.com_.sun.star.awt.Rectangle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an item in a status bar
  * @see com.sun.star.frame.XStatusbarController
  * @since LibreOffice 4.1
  */
@js.native
trait XStatusbarItem extends js.Object {
  
  /** the accessible name of the status bar item */
  var AccessibleName: String = js.native
  
  /** the command of the status bar item */
  var Command: String = js.native
  
  /** the help text of the status bar item when extended help tips are on */
  var HelpText: String = js.native
  
  /** the unique ID of the control within the status bar */
  var ItemId: Double = js.native
  
  /**
    * the rectangle on the status bar device onto which the item is drawn
    * @see com.sun.star.frame.XStatusbarController.paint()
    */
  var ItemRect: Rectangle = js.native
  
  /** the offset between this status bar item and the following */
  var Offset: Double = js.native
  
  /** the help text of the status bar item when help tips are on */
  var QuickHelpText: String = js.native
  
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
  var Style: Double = js.native
  
  /** the text of status bar item */
  var Text: String = js.native
  
  /** whether the item is visible or not */
  var Visible: Boolean = js.native
  
  /** the width of the status bar item */
  var Width: Double = js.native
  
  /**
    * forces repainting the item onto the status bar device
    * @see com.sun.star.frame.XStatusbarController.paint()
    */
  def repaint(): Unit = js.native
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
    val __obj = js.Dynamic.literal(AccessibleName = AccessibleName.asInstanceOf[js.Any], Command = Command.asInstanceOf[js.Any], HelpText = HelpText.asInstanceOf[js.Any], ItemId = ItemId.asInstanceOf[js.Any], ItemRect = ItemRect.asInstanceOf[js.Any], Offset = Offset.asInstanceOf[js.Any], QuickHelpText = QuickHelpText.asInstanceOf[js.Any], Style = Style.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any], repaint = js.Any.fromFunction0(repaint))
    __obj.asInstanceOf[XStatusbarItem]
  }
  
  @scala.inline
  implicit class XStatusbarItemOps[Self <: XStatusbarItem] (val x: Self) extends AnyVal {
    
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
    def setAccessibleName(value: String): Self = this.set("AccessibleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommand(value: String): Self = this.set("Command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelpText(value: String): Self = this.set("HelpText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemId(value: Double): Self = this.set("ItemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemRect(value: Rectangle): Self = this.set("ItemRect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("Offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuickHelpText(value: String): Self = this.set("QuickHelpText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: Double): Self = this.set("Style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = this.set("Text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("Visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("Width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepaint(value: () => Unit): Self = this.set("repaint", js.Any.fromFunction0(value))
  }
}
