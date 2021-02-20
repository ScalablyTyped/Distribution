package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SmartTagAction extends StObject {
  
  val ActiveXControl: js.Any = js.native
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  var CheckboxState: Boolean = js.native
  
  val Creator: XlCreator = js.native
  
  @JSName("Excel.SmartTagAction_typekey")
  var ExcelDotSmartTagAction_typekey: SmartTagAction = js.native
  
  def Execute(): Unit = js.native
  
  var ExpandHelp: Boolean = js.native
  
  var ListSelection: Double = js.native
  
  val Name: String = js.native
  
  val Parent: js.Any = js.native
  
  val PresentInPane: Boolean = js.native
  
  var RadioGroupSelection: Double = js.native
  
  var TextboxText: String = js.native
  
  val Type: XlSmartTagControlType = js.native
  
  val _Default: String = js.native
}
object SmartTagAction {
  
  @scala.inline
  def apply(
    ActiveXControl: js.Any,
    Application: Application,
    CheckboxState: Boolean,
    Creator: XlCreator,
    ExcelDotSmartTagAction_typekey: SmartTagAction,
    Execute: () => Unit,
    ExpandHelp: Boolean,
    ListSelection: Double,
    Name: String,
    Parent: js.Any,
    PresentInPane: Boolean,
    RadioGroupSelection: Double,
    TextboxText: String,
    Type: XlSmartTagControlType,
    _Default: String
  ): SmartTagAction = {
    val __obj = js.Dynamic.literal(ActiveXControl = ActiveXControl.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], CheckboxState = CheckboxState.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Execute = js.Any.fromFunction0(Execute), ExpandHelp = ExpandHelp.asInstanceOf[js.Any], ListSelection = ListSelection.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PresentInPane = PresentInPane.asInstanceOf[js.Any], RadioGroupSelection = RadioGroupSelection.asInstanceOf[js.Any], TextboxText = TextboxText.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], _Default = _Default.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.SmartTagAction_typekey")(ExcelDotSmartTagAction_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartTagAction]
  }
  
  @scala.inline
  implicit class SmartTagActionMutableBuilder[Self <: SmartTagAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveXControl(value: js.Any): Self = StObject.set(x, "ActiveXControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckboxState(value: Boolean): Self = StObject.set(x, "CheckboxState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcelDotSmartTagAction_typekey(value: SmartTagAction): Self = StObject.set(x, "Excel.SmartTagAction_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecute(value: () => Unit): Self = StObject.set(x, "Execute", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExpandHelp(value: Boolean): Self = StObject.set(x, "ExpandHelp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListSelection(value: Double): Self = StObject.set(x, "ListSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPresentInPane(value: Boolean): Self = StObject.set(x, "PresentInPane", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadioGroupSelection(value: Double): Self = StObject.set(x, "RadioGroupSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextboxText(value: String): Self = StObject.set(x, "TextboxText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: XlSmartTagControlType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_Default(value: String): Self = StObject.set(x, "_Default", value.asInstanceOf[js.Any])
  }
}
