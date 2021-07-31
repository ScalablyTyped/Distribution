package typings.activexLibreoffice.com_.sun.star.ui

import typings.activexLibreoffice.com_.sun.star.awt.Rectangle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an item in a status bar
  * @see com.sun.star.frame.XStatusbarController
  * @since LibreOffice 4.1
  */
trait XStatusbarItem extends StObject {
  
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
    val __obj = js.Dynamic.literal(AccessibleName = AccessibleName.asInstanceOf[js.Any], Command = Command.asInstanceOf[js.Any], HelpText = HelpText.asInstanceOf[js.Any], ItemId = ItemId.asInstanceOf[js.Any], ItemRect = ItemRect.asInstanceOf[js.Any], Offset = Offset.asInstanceOf[js.Any], QuickHelpText = QuickHelpText.asInstanceOf[js.Any], Style = Style.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any], repaint = js.Any.fromFunction0(repaint))
    __obj.asInstanceOf[XStatusbarItem]
  }
  
  @scala.inline
  implicit class XStatusbarItemMutableBuilder[Self <: XStatusbarItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessibleName(value: String): Self = StObject.set(x, "AccessibleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommand(value: String): Self = StObject.set(x, "Command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelpText(value: String): Self = StObject.set(x, "HelpText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemId(value: Double): Self = StObject.set(x, "ItemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemRect(value: Rectangle): Self = StObject.set(x, "ItemRect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "Offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuickHelpText(value: String): Self = StObject.set(x, "QuickHelpText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepaint(value: () => Unit): Self = StObject.set(x, "repaint", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStyle(value: Double): Self = StObject.set(x, "Style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "Visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
  }
}
