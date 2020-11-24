package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SmartTagAction extends js.Object {
  
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
  implicit class SmartTagActionOps[Self <: SmartTagAction] (val x: Self) extends AnyVal {
    
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
    def setActiveXControl(value: js.Any): Self = this.set("ActiveXControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckboxState(value: Boolean): Self = this.set("CheckboxState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: XlCreator): Self = this.set("Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcelDotSmartTagAction_typekey(value: SmartTagAction): Self = this.set("Excel.SmartTagAction_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecute(value: () => Unit): Self = this.set("Execute", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExpandHelp(value: Boolean): Self = this.set("ExpandHelp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListSelection(value: Double): Self = this.set("ListSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPresentInPane(value: Boolean): Self = this.set("PresentInPane", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadioGroupSelection(value: Double): Self = this.set("RadioGroupSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextboxText(value: String): Self = this.set("TextboxText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: XlSmartTagControlType): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_Default(value: String): Self = this.set("_Default", value.asInstanceOf[js.Any])
  }
}
