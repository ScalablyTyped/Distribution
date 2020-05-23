package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Watch extends js.Object {
  val Application: typings.activexExcel.Excel.Application
  val Creator: XlCreator
  @JSName("Excel.Watch_typekey")
  var ExcelDotWatch_typekey: Watch
  val Parent: js.Any
  val Source: js.Any
  def Delete(): Unit
}

object Watch {
  @scala.inline
  def apply(
    Application: Application,
    Creator: XlCreator,
    Delete: () => Unit,
    ExcelDotWatch_typekey: Watch,
    Parent: js.Any,
    Source: js.Any
  ): Watch = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Parent = Parent.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.Watch_typekey")(ExcelDotWatch_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Watch]
  }
}

