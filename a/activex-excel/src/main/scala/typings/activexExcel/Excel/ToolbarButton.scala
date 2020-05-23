package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolbarButton extends js.Object {
  val Application: typings.activexExcel.Excel.Application
  val BuiltIn: Boolean
  var BuiltInFace: Boolean
  val Creator: XlCreator
  var Enabled: Boolean
  @JSName("Excel.ToolbarButton_typekey")
  var ExcelDotToolbarButton_typekey: ToolbarButton
  var HelpContextID: Double
  var HelpFile: String
  val ID: Double
  val IsGap: Boolean
  var Name: String
  var OnAction: String
  val Parent: js.Any
  var Pushed: Boolean
  var StatusBar: String
  var Width: Double
  def Copy(Toolbar: Toolbar, Before: Double): Unit
  def CopyFace(): Unit
  def Delete(): Unit
  def Edit(): Unit
  def Move(Toolbar: Toolbar, Before: Double): Unit
  def PasteFace(): Unit
  def Reset(): Unit
}

object ToolbarButton {
  @scala.inline
  def apply(
    Application: Application,
    BuiltIn: Boolean,
    BuiltInFace: Boolean,
    Copy: (Toolbar, Double) => Unit,
    CopyFace: () => Unit,
    Creator: XlCreator,
    Delete: () => Unit,
    Edit: () => Unit,
    Enabled: Boolean,
    ExcelDotToolbarButton_typekey: ToolbarButton,
    HelpContextID: Double,
    HelpFile: String,
    ID: Double,
    IsGap: Boolean,
    Move: (Toolbar, Double) => Unit,
    Name: String,
    OnAction: String,
    Parent: js.Any,
    PasteFace: () => Unit,
    Pushed: Boolean,
    Reset: () => Unit,
    StatusBar: String,
    Width: Double
  ): ToolbarButton = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], BuiltIn = BuiltIn.asInstanceOf[js.Any], BuiltInFace = BuiltInFace.asInstanceOf[js.Any], Copy = js.Any.fromFunction2(Copy), CopyFace = js.Any.fromFunction0(CopyFace), Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Edit = js.Any.fromFunction0(Edit), Enabled = Enabled.asInstanceOf[js.Any], HelpContextID = HelpContextID.asInstanceOf[js.Any], HelpFile = HelpFile.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], IsGap = IsGap.asInstanceOf[js.Any], Move = js.Any.fromFunction2(Move), Name = Name.asInstanceOf[js.Any], OnAction = OnAction.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PasteFace = js.Any.fromFunction0(PasteFace), Pushed = Pushed.asInstanceOf[js.Any], Reset = js.Any.fromFunction0(Reset), StatusBar = StatusBar.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.ToolbarButton_typekey")(ExcelDotToolbarButton_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolbarButton]
  }
}

