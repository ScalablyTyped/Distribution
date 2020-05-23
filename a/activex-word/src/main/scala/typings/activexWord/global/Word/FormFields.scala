package typings.activexWord.global.Word

import typings.activexWord.Word.WdFieldType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.FormFields")
@js.native
class FormFields protected ()
  extends typings.activexWord.Word.FormFields {
  /* CompleteClass */
  override val Application: typings.activexWord.Word.Application = js.native
  /* CompleteClass */
  override val Count: Double = js.native
  /* CompleteClass */
  override val Creator: Double = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override var Shaded: Boolean = js.native
  /* CompleteClass */
  @JSName("Word.FormFields_typekey")
  override var WordDotFormFields_typekey: typings.activexWord.Word.FormFields = js.native
  /* CompleteClass */
  override def Add(Range: typings.activexWord.Word.Range, Type: WdFieldType): typings.activexWord.Word.FormField = js.native
  /* CompleteClass */
  override def Item(Index: js.Any): typings.activexWord.Word.FormField = js.native
}

