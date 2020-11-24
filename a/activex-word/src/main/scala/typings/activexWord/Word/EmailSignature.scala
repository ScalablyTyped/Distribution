package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmailSignature extends js.Object {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Creator: Double = js.native
  
  val EmailSignatureEntries: typings.activexWord.Word.EmailSignatureEntries = js.native
  
  var NewMessageSignature: String = js.native
  
  val Parent: js.Any = js.native
  
  var ReplyMessageSignature: String = js.native
  
  @JSName("Word.EmailSignature_typekey")
  var WordDotEmailSignature_typekey: EmailSignature = js.native
}
object EmailSignature {
  
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    EmailSignatureEntries: EmailSignatureEntries,
    NewMessageSignature: String,
    Parent: js.Any,
    ReplyMessageSignature: String,
    WordDotEmailSignature_typekey: EmailSignature
  ): EmailSignature = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], EmailSignatureEntries = EmailSignatureEntries.asInstanceOf[js.Any], NewMessageSignature = NewMessageSignature.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], ReplyMessageSignature = ReplyMessageSignature.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.EmailSignature_typekey")(WordDotEmailSignature_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailSignature]
  }
  
  @scala.inline
  implicit class EmailSignatureOps[Self <: EmailSignature] (val x: Self) extends AnyVal {
    
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
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailSignatureEntries(value: EmailSignatureEntries): Self = this.set("EmailSignatureEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewMessageSignature(value: String): Self = this.set("NewMessageSignature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplyMessageSignature(value: String): Self = this.set("ReplyMessageSignature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotEmailSignature_typekey(value: EmailSignature): Self = this.set("Word.EmailSignature_typekey", value.asInstanceOf[js.Any])
  }
}
