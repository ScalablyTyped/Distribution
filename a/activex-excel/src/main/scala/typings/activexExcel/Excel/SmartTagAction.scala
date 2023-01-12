package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SmartTagAction extends StObject {
  
  val ActiveXControl: Any
  
  val Application: typings.activexExcel.Excel.Application
  
  var CheckboxState: Boolean
  
  val Creator: XlCreator
  
  /* private */ @JSName("Excel.SmartTagAction_typekey")
  var ExcelDotSmartTagAction_typekey: SmartTagAction
  
  def Execute(): Unit
  
  var ExpandHelp: Boolean
  
  var ListSelection: Double
  
  val Name: String
  
  val Parent: Any
  
  val PresentInPane: Boolean
  
  var RadioGroupSelection: Double
  
  var TextboxText: String
  
  val Type: XlSmartTagControlType
  
  val _Default: String
}
object SmartTagAction {
  
  inline def apply(
    ActiveXControl: Any,
    Application: Application,
    CheckboxState: Boolean,
    Creator: XlCreator,
    ExcelDotSmartTagAction_typekey: SmartTagAction,
    Execute: () => Unit,
    ExpandHelp: Boolean,
    ListSelection: Double,
    Name: String,
    Parent: Any,
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
  implicit open class MutableBuilder[Self <: SmartTagAction] (val x: Self) extends AnyVal {
    
    inline def setActiveXControl(value: Any): Self = StObject.set(x, "ActiveXControl", value.asInstanceOf[js.Any])
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCheckboxState(value: Boolean): Self = StObject.set(x, "CheckboxState", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setExcelDotSmartTagAction_typekey(value: SmartTagAction): Self = StObject.set(x, "Excel.SmartTagAction_typekey", value.asInstanceOf[js.Any])
    
    inline def setExecute(value: () => Unit): Self = StObject.set(x, "Execute", js.Any.fromFunction0(value))
    
    inline def setExpandHelp(value: Boolean): Self = StObject.set(x, "ExpandHelp", value.asInstanceOf[js.Any])
    
    inline def setListSelection(value: Double): Self = StObject.set(x, "ListSelection", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPresentInPane(value: Boolean): Self = StObject.set(x, "PresentInPane", value.asInstanceOf[js.Any])
    
    inline def setRadioGroupSelection(value: Double): Self = StObject.set(x, "RadioGroupSelection", value.asInstanceOf[js.Any])
    
    inline def setTextboxText(value: String): Self = StObject.set(x, "TextboxText", value.asInstanceOf[js.Any])
    
    inline def setType(value: XlSmartTagControlType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def set_Default(value: String): Self = StObject.set(x, "_Default", value.asInstanceOf[js.Any])
  }
}
