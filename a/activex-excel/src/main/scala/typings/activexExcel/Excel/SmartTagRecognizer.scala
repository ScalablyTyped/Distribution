package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmartTagRecognizer extends js.Object {
  val Application: typings.activexExcel.Excel.Application
  val Creator: XlCreator
  var Enabled: Boolean
  @JSName("Excel.SmartTagRecognizer_typekey")
  var ExcelDotSmartTagRecognizer_typekey: SmartTagRecognizer
  val FullName: String
  val Parent: js.Any
  val _Default: String
  val progID: String
}

object SmartTagRecognizer {
  @scala.inline
  def apply(
    Application: Application,
    Creator: XlCreator,
    Enabled: Boolean,
    ExcelDotSmartTagRecognizer_typekey: SmartTagRecognizer,
    FullName: String,
    Parent: js.Any,
    _Default: String,
    progID: String
  ): SmartTagRecognizer = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], FullName = FullName.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], _Default = _Default.asInstanceOf[js.Any], progID = progID.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.SmartTagRecognizer_typekey")(ExcelDotSmartTagRecognizer_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartTagRecognizer]
  }
}

