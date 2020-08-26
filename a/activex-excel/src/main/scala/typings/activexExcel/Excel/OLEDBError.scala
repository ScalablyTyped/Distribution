package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OLEDBError extends js.Object {
  val Application: typings.activexExcel.Excel.Application = js.native
  val Creator: XlCreator = js.native
  val ErrorString: String = js.native
  @JSName("Excel.OLEDBError_typekey")
  var ExcelDotOLEDBError_typekey: OLEDBError = js.native
  val Native: Double = js.native
  val Number: Double = js.native
  val Parent: js.Any = js.native
  val SqlState: String = js.native
  val Stage: Double = js.native
}

object OLEDBError {
  @scala.inline
  def apply(
    Application: Application,
    Creator: XlCreator,
    ErrorString: String,
    ExcelDotOLEDBError_typekey: OLEDBError,
    Native: Double,
    Number: Double,
    Parent: js.Any,
    SqlState: String,
    Stage: Double
  ): OLEDBError = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], ErrorString = ErrorString.asInstanceOf[js.Any], Native = Native.asInstanceOf[js.Any], Number = Number.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], SqlState = SqlState.asInstanceOf[js.Any], Stage = Stage.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.OLEDBError_typekey")(ExcelDotOLEDBError_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OLEDBError]
  }
  @scala.inline
  implicit class OLEDBErrorOps[Self <: OLEDBError] (val x: Self) extends AnyVal {
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
    def setErrorString(value: String): Self = this.set("ErrorString", value.asInstanceOf[js.Any])
    @scala.inline
    def setExcelDotOLEDBError_typekey(value: OLEDBError): Self = this.set("Excel.OLEDBError_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setNative(value: Double): Self = this.set("Native", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumber(value: Double): Self = this.set("Number", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setSqlState(value: String): Self = this.set("SqlState", value.asInstanceOf[js.Any])
    @scala.inline
    def setStage(value: Double): Self = this.set("Stage", value.asInstanceOf[js.Any])
  }
  
}

