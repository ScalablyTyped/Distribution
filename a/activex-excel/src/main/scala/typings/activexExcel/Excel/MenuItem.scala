package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuItem extends js.Object {
  val Application: typings.activexExcel.Excel.Application
  var Caption: String
  var Checked: Boolean
  val Creator: XlCreator
  var Enabled: Boolean
  @JSName("Excel.MenuItem_typekey")
  var ExcelDotMenuItem_typekey: MenuItem
  var HelpContextID: Double
  var HelpFile: String
  val Index: Double
  var OnAction: String
  val Parent: js.Any
  var StatusBar: String
  def Delete(): Unit
}

object MenuItem {
  @scala.inline
  def apply(
    Application: Application,
    Caption: String,
    Checked: Boolean,
    Creator: XlCreator,
    Delete: () => Unit,
    Enabled: Boolean,
    ExcelDotMenuItem_typekey: MenuItem,
    HelpContextID: Double,
    HelpFile: String,
    Index: Double,
    OnAction: String,
    Parent: js.Any,
    StatusBar: String
  ): MenuItem = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Caption = Caption.asInstanceOf[js.Any], Checked = Checked.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Enabled = Enabled.asInstanceOf[js.Any], HelpContextID = HelpContextID.asInstanceOf[js.Any], HelpFile = HelpFile.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], OnAction = OnAction.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], StatusBar = StatusBar.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.MenuItem_typekey")(ExcelDotMenuItem_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuItem]
  }
}

