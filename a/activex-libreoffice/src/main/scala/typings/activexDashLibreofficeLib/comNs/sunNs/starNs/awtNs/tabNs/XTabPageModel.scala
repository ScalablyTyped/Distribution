package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.tabNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies an {@link XTabPageModel} interface.
  * @since OOo 3.4
  */
trait XTabPageModel extends js.Object {
  /** determines whether a tab page is enabled or disabled. */
  var Enabled: scala.Boolean
  /** specifies a URL that references a graphic that should be displayed in the tab bar. */
  var ImageURL: java.lang.String
  /** ID for tab page. */
  var TabPageID: scala.Double
  /** specifies the text that is displayed in the tab bar of the tab page. */
  var Title: java.lang.String
  /** specifies a tooltip text that should be displayed in the tab bar. */
  var ToolTip: java.lang.String
}

object XTabPageModel {
  @scala.inline
  def apply(
    Enabled: scala.Boolean,
    ImageURL: java.lang.String,
    TabPageID: scala.Double,
    Title: java.lang.String,
    ToolTip: java.lang.String
  ): XTabPageModel = {
    val __obj = js.Dynamic.literal(Enabled = Enabled, ImageURL = ImageURL, TabPageID = TabPageID, Title = Title, ToolTip = ToolTip)
  
    __obj.asInstanceOf[XTabPageModel]
  }
}

