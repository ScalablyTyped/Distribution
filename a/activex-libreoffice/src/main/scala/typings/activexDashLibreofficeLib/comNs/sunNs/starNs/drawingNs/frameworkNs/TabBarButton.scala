package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.frameworkNs

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
  var ButtonLabel: java.lang.String
  /** The localized help text that may be displayed in a tool tip. */
  var HelpText: java.lang.String
  /**
    * {@link XResourceId} object of the resource that is requested to be displayed when the tab bar button is activated.
    *
    * For some methods of the {@link XTabBar} interface only this member is evaluated. That is because only this member is used to identify a tab bar
    * button.
    */
  var ResourceId: XResourceId
}

