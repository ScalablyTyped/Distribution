package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmailSignature extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Creator: Double
  val EmailSignatureEntries: typings.activexWord.Word.EmailSignatureEntries
  var NewMessageSignature: String
  val Parent: js.Any
  var ReplyMessageSignature: String
  @JSName("Word.EmailSignature_typekey")
  var WordDotEmailSignature_typekey: EmailSignature
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
}

