package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmailSignatureEntry extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Creator: Double
  val Index: Double
  var Name: String
  val Parent: js.Any
  @JSName("Word.EmailSignatureEntry_typekey")
  var WordDotEmailSignatureEntry_typekey: EmailSignatureEntry
  def Delete(): Unit
}

object EmailSignatureEntry {
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Delete: () => Unit,
    Index: Double,
    Name: String,
    Parent: js.Any,
    WordDotEmailSignatureEntry_typekey: EmailSignatureEntry
  ): EmailSignatureEntry = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Index = Index.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.EmailSignatureEntry_typekey")(WordDotEmailSignatureEntry_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailSignatureEntry]
  }
}

