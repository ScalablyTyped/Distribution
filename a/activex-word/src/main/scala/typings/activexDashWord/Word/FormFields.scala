package typings.activexDashWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.FormFields")
@js.native
class FormFields protected () extends js.Object {
  val Application: typings.activexDashWord.Word.Application = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  var Shaded: Boolean = js.native
  var `Word.FormFields_typekey`: FormFields = js.native
  def Add(Range: Range, Type: WdFieldType): FormField = js.native
  def Item(Index: js.Any): FormField = js.native
}

