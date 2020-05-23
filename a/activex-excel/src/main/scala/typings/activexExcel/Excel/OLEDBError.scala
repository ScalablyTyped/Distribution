package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OLEDBError extends js.Object {
  val Application: typings.activexExcel.Excel.Application
  val Creator: XlCreator
  val ErrorString: String
  @JSName("Excel.OLEDBError_typekey")
  var ExcelDotOLEDBError_typekey: OLEDBError
  val Native: Double
  val Number: Double
  val Parent: js.Any
  val SqlState: String
  val Stage: Double
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
}

