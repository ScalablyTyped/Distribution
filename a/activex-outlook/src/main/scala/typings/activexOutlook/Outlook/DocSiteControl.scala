package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocSiteControl extends js.Object {
  
  @JSName("Outlook._DocSiteControl_typekey")
  var OutlookDot_DocSiteControl_typekey: DocSiteControl = js.native
  
  var ReadOnly: Double = js.native
  
  var SuppressAttachments: Double = js.native
}
object DocSiteControl {
  
  @scala.inline
  def apply(OutlookDot_DocSiteControl_typekey: DocSiteControl, ReadOnly: Double, SuppressAttachments: Double): DocSiteControl = {
    val __obj = js.Dynamic.literal(ReadOnly = ReadOnly.asInstanceOf[js.Any], SuppressAttachments = SuppressAttachments.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook._DocSiteControl_typekey")(OutlookDot_DocSiteControl_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocSiteControl]
  }
  
  @scala.inline
  implicit class DocSiteControlOps[Self <: DocSiteControl] (val x: Self) extends AnyVal {
    
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
    def setOutlookDot_DocSiteControl_typekey(value: DocSiteControl): Self = this.set("Outlook._DocSiteControl_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnly(value: Double): Self = this.set("ReadOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuppressAttachments(value: Double): Self = this.set("SuppressAttachments", value.asInstanceOf[js.Any])
  }
}
