package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.FormField")
@js.native
class FormField protected () extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
  var CalculateOnExit: Boolean = js.native
  val CheckBox: typings.activexWord.Word.CheckBox = js.native
  val Creator: Double = js.native
  val DropDown: typings.activexWord.Word.DropDown = js.native
  var Enabled: Boolean = js.native
  var EntryMacro: String = js.native
  var ExitMacro: String = js.native
  var HelpText: String = js.native
  var Name: String = js.native
  val Next: FormField = js.native
  var OwnHelp: Boolean = js.native
  var OwnStatus: Boolean = js.native
  val Parent: js.Any = js.native
  val Previous: FormField = js.native
  val Range: typings.activexWord.Word.Range = js.native
  var Result: String = js.native
  var StatusText: String = js.native
  val TextInput: typings.activexWord.Word.TextInput = js.native
  val Type: WdFieldType = js.native
  @JSName("Word.FormField_typekey")
  var WordDotFormField_typekey: FormField = js.native
  def Copy(): Unit = js.native
  def Cut(): Unit = js.native
  def Delete(): Unit = js.native
  def Select(): Unit = js.native
}

