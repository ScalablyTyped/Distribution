package typings.aceDiff.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AceDiffLROpts extends js.Object {
  
  var content: js.UndefOr[String | Null] = js.native
  
  var copyLinkEnabled: js.UndefOr[Boolean] = js.native
  
  var editable: js.UndefOr[Boolean] = js.native
  
  var mode: js.UndefOr[String] = js.native
  
  var theme: js.UndefOr[String] = js.native
}
object AceDiffLROpts {
  
  @scala.inline
  def apply(): AceDiffLROpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AceDiffLROpts]
  }
  
  @scala.inline
  implicit class AceDiffLROptsOps[Self <: AceDiffLROpts] (val x: Self) extends AnyVal {
    
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
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setContentNull: Self = this.set("content", null)
    
    @scala.inline
    def setCopyLinkEnabled(value: Boolean): Self = this.set("copyLinkEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCopyLinkEnabled: Self = this.set("copyLinkEnabled", js.undefined)
    
    @scala.inline
    def setEditable(value: Boolean): Self = this.set("editable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditable: Self = this.set("editable", js.undefined)
    
    @scala.inline
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setTheme(value: String): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
}
