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
trait TabBarButton extends js.Object {
  /**
    * This label is displayed on the UI as button text.
    *
    * The label is expected to be localized.
    */
  var ButtonLabel: String
  /** The localized help text that may be displayed in a tool tip. */
  var HelpText: String
  /**
    * {@link XResourceId} object of the resource that is requested to be displayed when the tab bar button is activated.
    *
    * For some methods of the {@link XTabBar} interface only this member is evaluated. That is because only this member is used to identify a tab bar
    * button.
    */
  var ResourceId: XResourceId
}

object TabBarButton {
  @scala.inline
  def apply(ButtonLabel: String, HelpText: String, ResourceId: XResourceId): TabBarButton = {
    val __obj = js.Dynamic.literal(ButtonLabel = ButtonLabel.asInstanceOf[js.Any], HelpText = HelpText.asInstanceOf[js.Any], ResourceId = ResourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabBarButton]
  }
}

