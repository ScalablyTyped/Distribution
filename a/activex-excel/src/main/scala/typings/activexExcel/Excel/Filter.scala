package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filter extends js.Object {
  val Application: typings.activexExcel.Excel.Application
  val Count: Double
  val Creator: XlCreator
  val Criteria1: js.Any
  val Criteria2: js.Any
  @JSName("Excel.Filter_typekey")
  var ExcelDotFilter_typekey: Filter
  val On: Boolean
  var Operator: XlAutoFilterOperator
  val Parent: js.Any
  val _Operator: XlAutoFilterOperator
}

object Filter {
  @scala.inline
  def apply(
    Application: Application,
    Count: Double,
    Creator: XlCreator,
    Criteria1: js.Any,
    Criteria2: js.Any,
    ExcelDotFilter_typekey: Filter,
    On: Boolean,
    Operator: XlAutoFilterOperator,
    Parent: js.Any,
    _Operator: XlAutoFilterOperator
  ): Filter = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Criteria1 = Criteria1.asInstanceOf[js.Any], Criteria2 = Criteria2.asInstanceOf[js.Any], On = On.asInstanceOf[js.Any], Operator = Operator.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], _Operator = _Operator.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.Filter_typekey")(ExcelDotFilter_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filter]
  }
}

