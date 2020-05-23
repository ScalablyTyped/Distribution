package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoRecover extends js.Object {
  val Application: typings.activexExcel.Excel.Application
  val Creator: XlCreator
  var Enabled: Boolean
  @JSName("Excel.AutoRecover_typekey")
  var ExcelDotAutoRecover_typekey: AutoRecover
  val Parent: js.Any
  var Path: String
  var Time: Double
}

object AutoRecover {
  @scala.inline
  def apply(
    Application: Application,
    Creator: XlCreator,
    Enabled: Boolean,
    ExcelDotAutoRecover_typekey: AutoRecover,
    Parent: js.Any,
    Path: String,
    Time: Double
  ): AutoRecover = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Path = Path.asInstanceOf[js.Any], Time = Time.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.AutoRecover_typekey")(ExcelDotAutoRecover_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoRecover]
  }
}

