package typings.activexLibreoffice.com_.sun.star.ui

import typings.activexLibreoffice.com_.sun.star.awt.XBitmap
import typings.activexLibreoffice.com_.sun.star.container.XIndexContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes a trigger for an (user inter-)action.
  *
  * Common examples for such triggers are menu entries or toolbar icons.
  */
@js.native
trait ActionTrigger extends js.Object {
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
  implicit class ActionTriggerOps[Self <: ActionTrigger] (val x: Self) extends AnyVal {
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
    def setCommandURL(value: String): Self = this.set("CommandURL", value.asInstanceOf[js.Any])
    @scala.inline
    def setHelpURL(value: String): Self = this.set("HelpURL", value.asInstanceOf[js.Any])
    @scala.inline
    def setImage(value: XBitmap): Self = this.set("Image", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubContainer(value: XIndexContainer): Self = this.set("SubContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("Text", value.asInstanceOf[js.Any])
  }
  
}

