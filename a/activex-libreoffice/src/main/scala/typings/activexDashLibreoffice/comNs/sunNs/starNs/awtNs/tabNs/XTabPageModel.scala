package typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.tabNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies an {@link XTabPageModel} interface.
  * @since OOo 3.4
  */
trait XTabPageModel extends js.Object {
  /** determines whether a tab page is enabled or disabled. */
  var Enabled: Boolean
  /** specifies a URL that references a graphic that should be displayed in the tab bar. */
  var ImageURL: String
  /** ID for tab page. */
  var TabPageID: Double
  /** specifies the text that is displayed in the tab bar of the tab page. */
  var Title: String
  /** specifies a tooltip text that should be displayed in the tab bar. */
  var ToolTip: String
}

object XTabPageModel {
  @scala.inline
  def apply(Enabled: Boolean, ImageURL: String, TabPageID: Double, Title: String, ToolTip: String): XTabPageModel = {
    val __obj = js.Dynamic.literal(Enabled = Enabled, ImageURL = ImageURL, TabPageID = TabPageID, Title = Title, ToolTip = ToolTip)
  
    __obj.asInstanceOf[XTabPageModel]
  }
}

