package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormField extends js.Object {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  var CalculateOnExit: Boolean = js.native
  
  val CheckBox: typings.activexWord.Word.CheckBox = js.native
  
  def Copy(): Unit = js.native
  
  val Creator: Double = js.native
  
  def Cut(): Unit = js.native
  
  def Delete(): Unit = js.native
  
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
  
  def Select(): Unit = js.native
  
  var StatusText: String = js.native
  
  val TextInput: typings.activexWord.Word.TextInput = js.native
  
  val Type: WdFieldType = js.native
  
  @JSName("Word.FormField_typekey")
  var WordDotFormField_typekey: FormField = js.native
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
  
  @scala.inline
  implicit class FormFieldOps[Self <: FormField] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalculateOnExit(value: Boolean): Self = this.set("CalculateOnExit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckBox(value: CheckBox): Self = this.set("CheckBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopy(value: () => Unit): Self = this.set("Copy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCut(value: () => Unit): Self = this.set("Cut", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDelete(value: () => Unit): Self = this.set("Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDropDown(value: DropDown): Self = this.set("DropDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntryMacro(value: String): Self = this.set("EntryMacro", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExitMacro(value: String): Self = this.set("ExitMacro", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelpText(value: String): Self = this.set("HelpText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext(value: FormField): Self = this.set("Next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnHelp(value: Boolean): Self = this.set("OwnHelp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnStatus(value: Boolean): Self = this.set("OwnStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevious(value: FormField): Self = this.set("Previous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: Range): Self = this.set("Range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: String): Self = this.set("Result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelect(value: () => Unit): Self = this.set("Select", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStatusText(value: String): Self = this.set("StatusText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextInput(value: TextInput): Self = this.set("TextInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: WdFieldType): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotFormField_typekey(value: FormField): Self = this.set("Word.FormField_typekey", value.asInstanceOf[js.Any])
  }
}
