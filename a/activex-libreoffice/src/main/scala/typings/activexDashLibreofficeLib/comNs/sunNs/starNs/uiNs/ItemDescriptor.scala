package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes a user interface item that is part of a user interface element.
  *
  * Common examples for such elements are: menustool barsstatus bars No assumption is made about any graphical representation: You could have a menu or a
  * toolbox working with the same item descriptor.
  * @since OOo 2.0
  */
trait ItemDescriptor extends js.Object {
  /** contains the command URL which specifies which action should be accomplished. */
  var CommandURL: java.lang.String
  /** contains the a URL that points to a help text. */
  var HelpURL: java.lang.String
  /**
    * specifies if this item is visible or not.
    *
    * This property is only valid if the item describes a toolbar or statusbar item.
    */
  var IsVisible: scala.Boolean
  /**
    * specifies an optional sub container.
    *
    * This property is valid for menus only. It can be used to define sub menus.
    */
  var ItemDescriptorContainer: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess
  /** the text of the user interface item. */
  var Label: java.lang.String
  /**
    * specifies the pixel distance by which the text of the item is shifted on the x-axis.
    *
    * This property is only valid if the item describes a statusbar item.
    */
  var Offset: scala.Double
  /**
    * different styles which influence the appearance of the item and its behavior.
    *
    * This property is only valid if the item describes a toolbar or statusbar item. See {@link ItemStyle} for more information about possible styles.
    */
  var Style: scala.Double
  /**
    * specifies which type this item descriptor belongs to.
    *
    * See constant definition {@link ItemType} .
    */
  var Type: scala.Double
  /**
    * specifies a pixel width for this item inside the user interface element.
    *
    * This property is only valid if the item describes a toolbar or statusbar item.
    */
  var Width: scala.Double
}

object ItemDescriptor {
  @scala.inline
  def apply(
    CommandURL: java.lang.String,
    HelpURL: java.lang.String,
    IsVisible: scala.Boolean,
    ItemDescriptorContainer: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess,
    Label: java.lang.String,
    Offset: scala.Double,
    Style: scala.Double,
    Type: scala.Double,
    Width: scala.Double
  ): ItemDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("CommandURL")(CommandURL)
    __obj.updateDynamic("HelpURL")(HelpURL)
    __obj.updateDynamic("IsVisible")(IsVisible)
    __obj.updateDynamic("ItemDescriptorContainer")(ItemDescriptorContainer)
    __obj.updateDynamic("Label")(Label)
    __obj.updateDynamic("Offset")(Offset)
    __obj.updateDynamic("Style")(Style)
    __obj.updateDynamic("Type")(Type)
    __obj.updateDynamic("Width")(Width)
    __obj.asInstanceOf[ItemDescriptor]
  }
}

