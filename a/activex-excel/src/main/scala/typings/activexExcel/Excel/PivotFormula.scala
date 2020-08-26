package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PivotFormula extends js.Object {
  val Application: typings.activexExcel.Excel.Application = js.native
  val Creator: XlCreator = js.native
  @JSName("Excel.PivotFormula_typekey")
  var ExcelDotPivotFormula_typekey: PivotFormula = js.native
  var Formula: String = js.native
  var Index: Double = js.native
  val Parent: js.Any = js.native
  var StandardFormula: String = js.native
  var Value: String = js.native
  var _Default: String = js.native
  def Delete(): Unit = js.native
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
  @scala.inline
  implicit class PivotFormulaOps[Self <: PivotFormula] (val x: Self) extends AnyVal {
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
    def setDelete(value: () => Unit): Self = this.set("Delete", js.Any.fromFunction0(value))
    @scala.inline
    def setExcelDotPivotFormula_typekey(value: PivotFormula): Self = this.set("Excel.PivotFormula_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormula(value: String): Self = this.set("Formula", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndex(value: Double): Self = this.set("Index", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setStandardFormula(value: String): Self = this.set("StandardFormula", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("Value", value.asInstanceOf[js.Any])
    @scala.inline
    def set_Default(value: String): Self = this.set("_Default", value.asInstanceOf[js.Any])
  }
  
}

