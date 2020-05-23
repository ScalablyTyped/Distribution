package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error extends js.Object {
  val Application: typings.activexExcel.Excel.Application
  val Creator: XlCreator
  @JSName("Excel.Error_typekey")
  var ExcelDotError_typekey: Error
  var Ignore: Boolean
  val Parent: js.Any
  val Value: Boolean
}

object Error {
  @scala.inline
  def apply(
    Application: Application,
    Creator: XlCreator,
    ExcelDotError_typekey: Error,
    Ignore: Boolean,
    Parent: js.Any,
    Value: Boolean
  ): Error = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Ignore = Ignore.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.Error_typekey")(ExcelDotError_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
}

