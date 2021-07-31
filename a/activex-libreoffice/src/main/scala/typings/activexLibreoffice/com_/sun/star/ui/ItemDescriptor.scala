package typings.activexLibreoffice.com_.sun.star.ui

import typings.activexLibreoffice.com_.sun.star.container.XIndexAccess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describes a user interface item that is part of a user interface element.
  *
  * Common examples for such elements are: menustool barsstatus bars No assumption is made about any graphical representation: You could have a menu or a
  * toolbox working with the same item descriptor.
  * @since OOo 2.0
  */
trait ItemDescriptor extends StObject {
  
  /** contains the command URL which specifies which action should be accomplished. */
  var CommandURL: String
  
  /** contains the a URL that points to a help text. */
  var HelpURL: String
  
  /**
    * specifies if this item is visible or not.
    *
    * This property is only valid if the item describes a toolbar or statusbar item.
    */
  var IsVisible: Boolean
  
  /**
    * specifies an optional sub container.
    *
    * This property is valid for menus only. It can be used to define sub menus.
    */
  var ItemDescriptorContainer: XIndexAccess
  
  /** the text of the user interface item. */
  var Label: String
  
  /**
    * specifies the pixel distance by which the text of the item is shifted on the x-axis.
    *
    * This property is only valid if the item describes a statusbar item.
    */
  var Offset: Double
  
  /**
    * different styles which influence the appearance of the item and its behavior.
    *
    * This property is only valid if the item describes a toolbar or statusbar item. See {@link ItemStyle} for more information about possible styles.
    */
  var Style: Double
  
  /**
    * specifies which type this item descriptor belongs to.
    *
    * See constant definition {@link ItemType} .
    */
  var Type: Double
  
  /**
    * specifies a pixel width for this item inside the user interface element.
    *
    * This property is only valid if the item describes a toolbar or statusbar item.
    */
  var Width: Double
}
object ItemDescriptor {
  
  @scala.inline
  def apply(
    CommandURL: String,
    HelpURL: String,
    IsVisible: Boolean,
    ItemDescriptorContainer: XIndexAccess,
    Label: String,
    Offset: Double,
    Style: Double,
    Type: Double,
    Width: Double
  ): ItemDescriptor = {
    val __obj = js.Dynamic.literal(CommandURL = CommandURL.asInstanceOf[js.Any], HelpURL = HelpURL.asInstanceOf[js.Any], IsVisible = IsVisible.asInstanceOf[js.Any], ItemDescriptorContainer = ItemDescriptorContainer.asInstanceOf[js.Any], Label = Label.asInstanceOf[js.Any], Offset = Offset.asInstanceOf[js.Any], Style = Style.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemDescriptor]
  }
  
  @scala.inline
  implicit class ItemDescriptorMutableBuilder[Self <: ItemDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommandURL(value: String): Self = StObject.set(x, "CommandURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelpURL(value: String): Self = StObject.set(x, "HelpURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsVisible(value: Boolean): Self = StObject.set(x, "IsVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemDescriptorContainer(value: XIndexAccess): Self = StObject.set(x, "ItemDescriptorContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "Label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "Offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: Double): Self = StObject.set(x, "Style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Double): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
  }
}
