package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmailSignatureEntries extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Count: Double
  val Creator: Double
  val Parent: js.Any
  @JSName("Word.EmailSignatureEntries_typekey")
  var WordDotEmailSignatureEntries_typekey: EmailSignatureEntries
  def Add(Name: String, Range: Range): EmailSignatureEntry
  def Item(Index: js.Any): EmailSignatureEntry
}

object EmailSignatureEntries {
  @scala.inline
  def apply(
    Add: (String, Range) => EmailSignatureEntry,
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: js.Any => EmailSignatureEntry,
    Parent: js.Any,
    WordDotEmailSignatureEntries_typekey: EmailSignatureEntries
  ): EmailSignatureEntries = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.EmailSignatureEntries_typekey")(WordDotEmailSignatureEntries_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailSignatureEntries]
  }
}

