package typings.activexInfopath.InfoPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MailEnvelopeObject extends js.Object {
  
  var BCC: String = js.native
  
  var CC: String = js.native
  
  @JSName("InfoPath.MailEnvelopeObject_typekey")
  var InfoPathDotMailEnvelopeObject_typekey: MailEnvelopeObject = js.native
  
  var Subject: String = js.native
  
  var To: String = js.native
  
  var Visible: Boolean = js.native
}
object MailEnvelopeObject {
  
  @scala.inline
  def apply(
    BCC: String,
    CC: String,
    InfoPathDotMailEnvelopeObject_typekey: MailEnvelopeObject,
    Subject: String,
    To: String,
    Visible: Boolean
  ): MailEnvelopeObject = {
    val __obj = js.Dynamic.literal(BCC = BCC.asInstanceOf[js.Any], CC = CC.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any], To = To.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.MailEnvelopeObject_typekey")(InfoPathDotMailEnvelopeObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[MailEnvelopeObject]
  }
  
  @scala.inline
  implicit class MailEnvelopeObjectOps[Self <: MailEnvelopeObject] (val x: Self) extends AnyVal {
    
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
    def setBCC(value: String): Self = this.set("BCC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCC(value: String): Self = this.set("CC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoPathDotMailEnvelopeObject_typekey(value: MailEnvelopeObject): Self = this.set("InfoPath.MailEnvelopeObject_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubject(value: String): Self = this.set("Subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTo(value: String): Self = this.set("To", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("Visible", value.asInstanceOf[js.Any])
  }
}
