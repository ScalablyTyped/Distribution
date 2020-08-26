package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiThreadedCalculation extends js.Object {
  val Application: typings.activexExcel.Excel.Application = js.native
  val Creator: XlCreator = js.native
  var Enabled: Boolean = js.native
  @JSName("Excel.MultiThreadedCalculation_typekey")
  var ExcelDotMultiThreadedCalculation_typekey: MultiThreadedCalculation = js.native
  val Parent: js.Any = js.native
  var ThreadCount: Double = js.native
  var ThreadMode: XlThreadMode = js.native
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
  @scala.inline
  implicit class MultiThreadedCalculationOps[Self <: MultiThreadedCalculation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreator(value: XlCreator): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setExcelDotMultiThreadedCalculation_typekey(value: MultiThreadedCalculation): Self = this.set("Excel.MultiThreadedCalculation_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setThreadCount(value: Double): Self = this.set("ThreadCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setThreadMode(value: XlThreadMode): Self = this.set("ThreadMode", value.asInstanceOf[js.Any])
  }
  
}

