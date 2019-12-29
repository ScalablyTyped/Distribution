package typings.activexDashWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.EmailSignatureEntries")
@js.native
class EmailSignatureEntries protected () extends js.Object {
  val Application: typings.activexDashWord.Word.Application = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  @JSName("Word.EmailSignatureEntries_typekey")
  var WordDotEmailSignatureEntries_typekey: EmailSignatureEntries = js.native
  def Add(Name: String, Range: Range): EmailSignatureEntry = js.native
  def Item(Index: js.Any): EmailSignatureEntry = js.native
}

