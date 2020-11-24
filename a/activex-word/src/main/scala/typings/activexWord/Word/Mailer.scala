package typings.activexWord.Word

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mailer extends js.Object {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  var BCCRecipients: js.Any = js.native
  
  var CCRecipients: js.Any = js.native
  
  val Creator: Double = js.native
  
  var Enclosures: js.Any = js.native
  
  val Parent: js.Any = js.native
  
  val Received: Boolean = js.native
  
  var Recipients: js.Any = js.native
  
  val SendDateTime: VarDate = js.native
  
  val Sender: String = js.native
  
  var Subject: String = js.native
  
  @JSName("Word.Mailer_typekey")
  var WordDotMailer_typekey: Mailer = js.native
}
object Mailer {
  
  @scala.inline
  def apply(
    Application: Application,
    BCCRecipients: js.Any,
    CCRecipients: js.Any,
    Creator: Double,
    Enclosures: js.Any,
    Parent: js.Any,
    Received: Boolean,
    Recipients: js.Any,
    SendDateTime: VarDate,
    Sender: String,
    Subject: String,
    WordDotMailer_typekey: Mailer
  ): Mailer = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], BCCRecipients = BCCRecipients.asInstanceOf[js.Any], CCRecipients = CCRecipients.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Enclosures = Enclosures.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Received = Received.asInstanceOf[js.Any], Recipients = Recipients.asInstanceOf[js.Any], SendDateTime = SendDateTime.asInstanceOf[js.Any], Sender = Sender.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Mailer_typekey")(WordDotMailer_typekey.asInstanceOf[js.Any])
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
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnclosures(value: js.Any): Self = this.set("Enclosures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceived(value: Boolean): Self = this.set("Received", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipients(value: js.Any): Self = this.set("Recipients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendDateTime(value: VarDate): Self = this.set("SendDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSender(value: String): Self = this.set("Sender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubject(value: String): Self = this.set("Subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotMailer_typekey(value: Mailer): Self = this.set("Word.Mailer_typekey", value.asInstanceOf[js.Any])
  }
}
