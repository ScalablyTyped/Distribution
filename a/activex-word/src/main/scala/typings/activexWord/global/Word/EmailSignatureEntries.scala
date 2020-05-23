package typings.activexWord.global.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.EmailSignatureEntries")
@js.native
class EmailSignatureEntries protected ()
  extends typings.activexWord.Word.EmailSignatureEntries {
  /* CompleteClass */
  override val Application: typings.activexWord.Word.Application = js.native
  /* CompleteClass */
  override val Count: Double = js.native
  /* CompleteClass */
  override val Creator: Double = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  @JSName("Word.EmailSignatureEntries_typekey")
  override var WordDotEmailSignatureEntries_typekey: typings.activexWord.Word.EmailSignatureEntries = js.native
  /* CompleteClass */
  override def Add(Name: String, Range: typings.activexWord.Word.Range): typings.activexWord.Word.EmailSignatureEntry = js.native
  /* CompleteClass */
  override def Item(Index: js.Any): typings.activexWord.Word.EmailSignatureEntry = js.native
}

