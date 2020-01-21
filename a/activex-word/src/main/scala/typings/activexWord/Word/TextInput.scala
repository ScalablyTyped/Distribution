package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.TextInput")
@js.native
class TextInput protected () extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
  val Creator: Double = js.native
  var Default: String = js.native
  val Format: String = js.native
  val Parent: js.Any = js.native
  val Type: WdTextFormFieldType = js.native
  val Valid: Boolean = js.native
  var Width: Double = js.native
  @JSName("Word.TextInput_typekey")
  var WordDotTextInput_typekey: TextInput = js.native
  def Clear(): Unit = js.native
  def EditType(Type: WdTextFormFieldType): Unit = js.native
  def EditType(Type: WdTextFormFieldType, Default: js.Any): Unit = js.native
  def EditType(Type: WdTextFormFieldType, Default: js.Any, Format: js.Any): Unit = js.native
  def EditType(Type: WdTextFormFieldType, Default: js.Any, Format: js.Any, Enabled: js.Any): Unit = js.native
}

