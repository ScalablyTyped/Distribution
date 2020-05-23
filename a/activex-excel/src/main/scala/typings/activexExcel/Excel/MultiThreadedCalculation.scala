package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiThreadedCalculation extends js.Object {
  val Application: typings.activexExcel.Excel.Application
  val Creator: XlCreator
  var Enabled: Boolean
  @JSName("Excel.MultiThreadedCalculation_typekey")
  var ExcelDotMultiThreadedCalculation_typekey: MultiThreadedCalculation
  val Parent: js.Any
  var ThreadCount: Double
  var ThreadMode: XlThreadMode
}

object MultiThreadedCalculation {
  @scala.inline
  def apply(
    Application: Application,
    Creator: XlCreator,
    Enabled: Boolean,
    ExcelDotMultiThreadedCalculation_typekey: MultiThreadedCalculation,
    Parent: js.Any,
    ThreadCount: Double,
    ThreadMode: XlThreadMode
  ): MultiThreadedCalculation = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], ThreadCount = ThreadCount.asInstanceOf[js.Any], ThreadMode = ThreadMode.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.MultiThreadedCalculation_typekey")(ExcelDotMultiThreadedCalculation_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiThreadedCalculation]
  }
}

