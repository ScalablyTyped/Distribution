package typings.activexLibreoffice.com_.sun.star.ui

import typings.activexLibreoffice.com_.sun.star.awt.XBitmap
import typings.activexLibreoffice.com_.sun.star.container.XIndexContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describes a trigger for an (user inter-)action.
  *
  * Common examples for such triggers are menu entries or toolbar icons.
  */
@js.native
trait ActionTrigger extends StObject {
  
  /** contains the command URL for the menu entry. */
  var CommandURL: String = js.native
  
  /** contains the a URL that points to a help text. */
  var HelpURL: String = js.native
  
  /** contains the menu item image. */
  var Image: XBitmap = js.native
  
  /** contains a sub menu. */
  var SubContainer: XIndexContainer = js.native
  
  /** contains the text of the menu entry. */
  var Text: String = js.native
}
object ActionTrigger {
  
  @scala.inline
  def apply(CommandURL: String, HelpURL: String, Image: XBitmap, SubContainer: XIndexContainer, Text: String): ActionTrigger = {
    val __obj = js.Dynamic.literal(CommandURL = CommandURL.asInstanceOf[js.Any], HelpURL = HelpURL.asInstanceOf[js.Any], Image = Image.asInstanceOf[js.Any], SubContainer = SubContainer.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionTrigger]
  }
  
  @scala.inline
  implicit class ActionTriggerMutableBuilder[Self <: ActionTrigger] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommandURL(value: String): Self = StObject.set(x, "CommandURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelpURL(value: String): Self = StObject.set(x, "HelpURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage(value: XBitmap): Self = StObject.set(x, "Image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubContainer(value: XIndexContainer): Self = StObject.set(x, "SubContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
  }
}
