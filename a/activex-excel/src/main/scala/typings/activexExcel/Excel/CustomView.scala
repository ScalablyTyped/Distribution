package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomView extends js.Object {
  val Application: typings.activexExcel.Excel.Application
  val Creator: XlCreator
  @JSName("Excel.CustomView_typekey")
  var ExcelDotCustomView_typekey: CustomView
  val Name: String
  val Parent: js.Any
  val PrintSettings: Boolean
  val RowColSettings: Boolean
  def Delete(): Unit
  def Show(): Unit
}

object CustomView {
  @scala.inline
  def apply(
    Application: Application,
    Creator: XlCreator,
    Delete: () => Unit,
    ExcelDotCustomView_typekey: CustomView,
    Name: String,
    Parent: js.Any,
    PrintSettings: Boolean,
    RowColSettings: Boolean,
    Show: () => Unit
  ): CustomView = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PrintSettings = PrintSettings.asInstanceOf[js.Any], RowColSettings = RowColSettings.asInstanceOf[js.Any], Show = js.Any.fromFunction0(Show))
    __obj.updateDynamic("Excel.CustomView_typekey")(ExcelDotCustomView_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomView]
  }
}

