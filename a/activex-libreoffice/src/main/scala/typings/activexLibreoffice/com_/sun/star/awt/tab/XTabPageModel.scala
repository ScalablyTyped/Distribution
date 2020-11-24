package typings.activexLibreoffice.com_.sun.star.awt.tab

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies an {@link XTabPageModel} interface.
  * @since OOo 3.4
  */
@js.native
trait XTabPageModel extends js.Object {
  
  /** determines whether a tab page is enabled or disabled. */
  var Enabled: Boolean = js.native
  
  /** specifies a URL that references a graphic that should be displayed in the tab bar. */
  var ImageURL: String = js.native
  
  /** ID for tab page. */
  var TabPageID: Double = js.native
  
  /** specifies the text that is displayed in the tab bar of the tab page. */
  var Title: String = js.native
  
  /** specifies a tooltip text that should be displayed in the tab bar. */
  var ToolTip: String = js.native
}
object XTabPageModel {
  
  @scala.inline
  def apply(Enabled: Boolean, ImageURL: String, TabPageID: Double, Title: String, ToolTip: String): XTabPageModel = {
    val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any], ImageURL = ImageURL.asInstanceOf[js.Any], TabPageID = TabPageID.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], ToolTip = ToolTip.asInstanceOf[js.Any])
    __obj.asInstanceOf[XTabPageModel]
  }
  
  @scala.inline
  implicit class XTabPageModelOps[Self <: XTabPageModel] (val x: Self) extends AnyVal {
    
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
    def setEnabled(value: Boolean): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageURL(value: String): Self = this.set("ImageURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabPageID(value: Double): Self = this.set("TabPageID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("Title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolTip(value: String): Self = this.set("ToolTip", value.asInstanceOf[js.Any])
  }
}
