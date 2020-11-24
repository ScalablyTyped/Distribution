package typings.activexExcel.Excel

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Macintosh only */
@js.native
trait Mailer extends js.Object {
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  var BCCRecipients: js.Any = js.native
  
  var CCRecipients: js.Any = js.native
  
  val Creator: XlCreator = js.native
  
  var Enclosures: js.Any = js.native
  
  @JSName("Excel.Mailer_typekey")
  var ExcelDotMailer_typekey: Mailer = js.native
  
  val Parent: js.Any = js.native
  
  val Received: Boolean = js.native
  
  val SendDateTime: VarDate = js.native
  
  val Sender: String = js.native
  
  var Subject: String = js.native
  
  var ToRecipients: js.Any = js.native
  
  var WhichAddress: js.Any = js.native
}
object Mailer {
  
  @scala.inline
  def apply(
    Application: Application,
    BCCRecipients: js.Any,
    CCRecipients: js.Any,
    Creator: XlCreator,
    Enclosures: js.Any,
    ExcelDotMailer_typekey: Mailer,
    Parent: js.Any,
    Received: Boolean,
    SendDateTime: VarDate,
    Sender: String,
    Subject: String,
    ToRecipients: js.Any,
    WhichAddress: js.Any
  ): Mailer = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], BCCRecipients = BCCRecipients.asInstanceOf[js.Any], CCRecipients = CCRecipients.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Enclosures = Enclosures.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Received = Received.asInstanceOf[js.Any], SendDateTime = SendDateTime.asInstanceOf[js.Any], Sender = Sender.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any], ToRecipients = ToRecipients.asInstanceOf[js.Any], WhichAddress = WhichAddress.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.Mailer_typekey")(ExcelDotMailer_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mailer]
  }
  
  @scala.inline
  implicit class MailerOps[Self <: Mailer] (val x: Self) extends AnyVal {
    
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
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBCCRecipients(value: js.Any): Self = this.set("BCCRecipients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCCRecipients(value: js.Any): Self = this.set("CCRecipients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: XlCreator): Self = this.set("Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnclosures(value: js.Any): Self = this.set("Enclosures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcelDotMailer_typekey(value: Mailer): Self = this.set("Excel.Mailer_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceived(value: Boolean): Self = this.set("Received", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendDateTime(value: VarDate): Self = this.set("SendDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSender(value: String): Self = this.set("Sender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubject(value: String): Self = this.set("Subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToRecipients(value: js.Any): Self = this.set("ToRecipients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhichAddress(value: js.Any): Self = this.set("WhichAddress", value.asInstanceOf[js.Any])
  }
}
