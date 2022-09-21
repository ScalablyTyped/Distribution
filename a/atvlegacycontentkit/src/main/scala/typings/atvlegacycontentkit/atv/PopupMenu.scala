package typings.atvlegacycontentkit.atv

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A menu that pops up over the current content.
  */
@js.native
trait PopupMenu extends StObject {
  
  /**
    * Close the popup menu.
    */
  def cancel(): Unit = js.native
  
  /**
    * Load and show the menu.
    * @param menu The element containing the pop up menu. This should be a normal popUpMenu element, wrapped in an atv and body tag.
    * @param callback Called when the menu is processed. The success boolean indicates whether the menu was shown or not.
    */
  def load(menu: Document): Unit = js.native
  def load(menu: Document, callback: js.Function1[/* success */ Boolean, Unit]): Unit = js.native
}
