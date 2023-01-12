package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormField extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  var CalculateOnExit: Boolean
  
  val CheckBox: typings.activexWord.Word.CheckBox
  
  def Copy(): Unit
  
  val Creator: Double
  
  def Cut(): Unit
  
  def Delete(): Unit
  
  val DropDown: typings.activexWord.Word.DropDown
  
  var Enabled: Boolean
  
  var EntryMacro: String
  
  var ExitMacro: String
  
  var HelpText: String
  
  var Name: String
  
  val Next: FormField
  
  var OwnHelp: Boolean
  
  var OwnStatus: Boolean
  
  val Parent: Any
  
  val Previous: FormField
  
  val Range: typings.activexWord.Word.Range
  
  var Result: String
  
  def Select(): Unit
  
  var StatusText: String
  
  val TextInput: typings.activexWord.Word.TextInput
  
  val Type: WdFieldType
  
  /* private */ @JSName("Word.FormField_typekey")
  var WordDotFormField_typekey: FormField
}
object FormField {
  
  inline def apply(
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
    Parent: Any,
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
  implicit open class MutableBuilder[Self <: FormField] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCalculateOnExit(value: Boolean): Self = StObject.set(x, "CalculateOnExit", value.asInstanceOf[js.Any])
    
    inline def setCheckBox(value: CheckBox): Self = StObject.set(x, "CheckBox", value.asInstanceOf[js.Any])
    
    inline def setCopy(value: () => Unit): Self = StObject.set(x, "Copy", js.Any.fromFunction0(value))
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setCut(value: () => Unit): Self = StObject.set(x, "Cut", js.Any.fromFunction0(value))
    
    inline def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    inline def setDropDown(value: DropDown): Self = StObject.set(x, "DropDown", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEntryMacro(value: String): Self = StObject.set(x, "EntryMacro", value.asInstanceOf[js.Any])
    
    inline def setExitMacro(value: String): Self = StObject.set(x, "ExitMacro", value.asInstanceOf[js.Any])
    
    inline def setHelpText(value: String): Self = StObject.set(x, "HelpText", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNext(value: FormField): Self = StObject.set(x, "Next", value.asInstanceOf[js.Any])
    
    inline def setOwnHelp(value: Boolean): Self = StObject.set(x, "OwnHelp", value.asInstanceOf[js.Any])
    
    inline def setOwnStatus(value: Boolean): Self = StObject.set(x, "OwnStatus", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPrevious(value: FormField): Self = StObject.set(x, "Previous", value.asInstanceOf[js.Any])
    
    inline def setRange(value: Range): Self = StObject.set(x, "Range", value.asInstanceOf[js.Any])
    
    inline def setResult(value: String): Self = StObject.set(x, "Result", value.asInstanceOf[js.Any])
    
    inline def setSelect(value: () => Unit): Self = StObject.set(x, "Select", js.Any.fromFunction0(value))
    
    inline def setStatusText(value: String): Self = StObject.set(x, "StatusText", value.asInstanceOf[js.Any])
    
    inline def setTextInput(value: TextInput): Self = StObject.set(x, "TextInput", value.asInstanceOf[js.Any])
    
    inline def setType(value: WdFieldType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setWordDotFormField_typekey(value: FormField): Self = StObject.set(x, "Word.FormField_typekey", value.asInstanceOf[js.Any])
  }
}
