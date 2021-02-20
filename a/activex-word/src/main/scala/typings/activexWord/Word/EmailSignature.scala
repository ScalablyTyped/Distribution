package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmailSignature extends StObject {
  
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
  implicit class EmailSignatureMutableBuilder[Self <: EmailSignature] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailSignatureEntries(value: EmailSignatureEntries): Self = StObject.set(x, "EmailSignatureEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewMessageSignature(value: String): Self = StObject.set(x, "NewMessageSignature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplyMessageSignature(value: String): Self = StObject.set(x, "ReplyMessageSignature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotEmailSignature_typekey(value: EmailSignature): Self = StObject.set(x, "Word.EmailSignature_typekey", value.asInstanceOf[js.Any])
  }
}
