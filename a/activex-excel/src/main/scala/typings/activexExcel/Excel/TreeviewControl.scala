package typings.activexExcel.Excel

import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeviewControl extends js.Object {
  val Application: typings.activexExcel.Excel.Application
  val Creator: XlCreator
  var Drilled: js.Any
  @JSName("Excel.TreeviewControl_typekey")
  var ExcelDotTreeviewControl_typekey: TreeviewControl
  var Hidden: SafeArray[SafeArray[String]]
  val Parent: js.Any
}

object TreeviewControl {
  @scala.inline
  def apply(
    Application: Application,
    Creator: XlCreator,
    Drilled: js.Any,
    ExcelDotTreeviewControl_typekey: TreeviewControl,
    Hidden: SafeArray[SafeArray[String]],
    Parent: js.Any
  ): TreeviewControl = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Drilled = Drilled.asInstanceOf[js.Any], Hidden = Hidden.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.TreeviewControl_typekey")(ExcelDotTreeviewControl_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeviewControl]
  }
}

