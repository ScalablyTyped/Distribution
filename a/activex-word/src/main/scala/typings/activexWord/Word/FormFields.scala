package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.FormFields")
@js.native
class FormFields protected () extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  var Shaded: Boolean = js.native
  @JSName("Word.FormFields_typekey")
  var WordDotFormFields_typekey: FormFields = js.native
  def Add(Range: Range, Type: WdFieldType): FormField = js.native
  def Item(Index: js.Any): FormField = js.native
}

