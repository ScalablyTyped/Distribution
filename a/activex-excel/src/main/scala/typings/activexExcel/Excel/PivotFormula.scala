package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PivotFormula extends js.Object {
  val Application: typings.activexExcel.Excel.Application
  val Creator: XlCreator
  @JSName("Excel.PivotFormula_typekey")
  var ExcelDotPivotFormula_typekey: PivotFormula
  var Formula: String
  var Index: Double
  val Parent: js.Any
  var StandardFormula: String
  var Value: String
  var _Default: String
  def Delete(): Unit
}

object PivotFormula {
  @scala.inline
  def apply(
    Application: Application,
    Creator: XlCreator,
    Delete: () => Unit,
    ExcelDotPivotFormula_typekey: PivotFormula,
    Formula: String,
    Index: Double,
    Parent: js.Any,
    StandardFormula: String,
    Value: String,
    _Default: String
  ): PivotFormula = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Formula = Formula.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], StandardFormula = StandardFormula.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], _Default = _Default.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.PivotFormula_typekey")(ExcelDotPivotFormula_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotFormula]
  }
}

