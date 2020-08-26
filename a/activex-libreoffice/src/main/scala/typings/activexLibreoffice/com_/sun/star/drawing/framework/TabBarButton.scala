package typings.activexLibreoffice.com_.sun.star.drawing.framework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Descriptor of a tab bar button. Tab bar buttons are typically used to offer the user the choice between different views to be displayed in one pane.
  *
  * For identification only the {@link ResourceId} is used, so for some methods of the {@link XTabBar} interface only the {@link ResourceId} member is
  * evaluated.
  */
@js.native
trait TabBarButton extends js.Object {
  /**
    * This label is displayed on the UI as button text.
    *
    * The label is expected to be localized.
    */
  var ButtonLabel: String = js.native
  /** The localized help text that may be displayed in a tool tip. */
  var HelpText: String = js.native
  /**
    * {@link XResourceId} object of the resource that is requested to be displayed when the tab bar button is activated.
    *
    * For some methods of the {@link XTabBar} interface only this member is evaluated. That is because only this member is used to identify a tab bar
    * button.
    */
  var ResourceId: XResourceId = js.native
}

object TabBarButton {
  @scala.inline
  def apply(ButtonLabel: String, HelpText: String, ResourceId: XResourceId): TabBarButton = {
    val __obj = js.Dynamic.literal(ButtonLabel = ButtonLabel.asInstanceOf[js.Any], HelpText = HelpText.asInstanceOf[js.Any], ResourceId = ResourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabBarButton]
  }
  @scala.inline
  implicit class TabBarButtonOps[Self <: TabBarButton] (val x: Self) extends AnyVal {
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
    def setButtonLabel(value: String): Self = this.set("ButtonLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def setHelpText(value: String): Self = this.set("HelpText", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceId(value: XResourceId): Self = this.set("ResourceId", value.asInstanceOf[js.Any])
  }
  
}

