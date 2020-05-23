package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmartTagAction extends js.Object {
  val ActiveXControl: js.Any
  val Application: typings.activexExcel.Excel.Application
  var CheckboxState: Boolean
  val Creator: XlCreator
  @JSName("Excel.SmartTagAction_typekey")
  var ExcelDotSmartTagAction_typekey: SmartTagAction
  var ExpandHelp: Boolean
  var ListSelection: Double
  val Name: String
  val Parent: js.Any
  val PresentInPane: Boolean
  var RadioGroupSelection: Double
  var TextboxText: String
  val Type: XlSmartTagControlType
  val _Default: String
  def Execute(): Unit
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
}

