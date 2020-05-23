package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormField extends js.Object {
  val Application: typings.activexWord.Word.Application
  var CalculateOnExit: Boolean
  val CheckBox: typings.activexWord.Word.CheckBox
  val Creator: Double
  val DropDown: typings.activexWord.Word.DropDown
  var Enabled: Boolean
  var EntryMacro: String
  var ExitMacro: String
  var HelpText: String
  var Name: String
  val Next: FormField
  var OwnHelp: Boolean
  var OwnStatus: Boolean
  val Parent: js.Any
  val Previous: FormField
  val Range: typings.activexWord.Word.Range
  var Result: String
  var StatusText: String
  val TextInput: typings.activexWord.Word.TextInput
  val Type: WdFieldType
  @JSName("Word.FormField_typekey")
  var WordDotFormField_typekey: FormField
  def Copy(): Unit
  def Cut(): Unit
  def Delete(): Unit
  def Select(): Unit
}

object FormField {
  @scala.inline
  def apply(
    Application: Application,
    CalculateOnExit: Boolean,
    CheckBox: CheckBox,
    Copy: () => Unit,
    Creator: Double,
    Cut: () => Unit,
    Delete: () => Unit,
    DropDown: DropDown,
    Enabled: Boolean,
    EntryMacro: String,
    ExitMacro: String,
    HelpText: String,
    Name: String,
    Next: FormField,
    OwnHelp: Boolean,
    OwnStatus: Boolean,
    Parent: js.Any,
    Previous: FormField,
    Range: Range,
    Result: String,
    Select: () => Unit,
    StatusText: String,
    TextInput: TextInput,
    Type: WdFieldType,
    WordDotFormField_typekey: FormField
  ): FormField = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], CalculateOnExit = CalculateOnExit.asInstanceOf[js.Any], CheckBox = CheckBox.asInstanceOf[js.Any], Copy = js.Any.fromFunction0(Copy), Creator = Creator.asInstanceOf[js.Any], Cut = js.Any.fromFunction0(Cut), Delete = js.Any.fromFunction0(Delete), DropDown = DropDown.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], EntryMacro = EntryMacro.asInstanceOf[js.Any], ExitMacro = ExitMacro.asInstanceOf[js.Any], HelpText = HelpText.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Next = Next.asInstanceOf[js.Any], OwnHelp = OwnHelp.asInstanceOf[js.Any], OwnStatus = OwnStatus.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Previous = Previous.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any], Result = Result.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select), StatusText = StatusText.asInstanceOf[js.Any], TextInput = TextInput.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.FormField_typekey")(WordDotFormField_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormField]
  }
}

