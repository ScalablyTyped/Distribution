package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PivotFormula extends StObject {
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  val Creator: XlCreator = js.native
  
  def Delete(): Unit = js.native
  
  @JSName("Excel.PivotFormula_typekey")
  var ExcelDotPivotFormula_typekey: PivotFormula = js.native
  
  var Formula: String = js.native
  
  var Index: Double = js.native
  
  val Parent: js.Any = js.native
  
  var StandardFormula: String = js.native
  
  var Value: String = js.native
  
  var _Default: String = js.native
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
  implicit class PivotFormulaMutableBuilder[Self <: PivotFormula] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExcelDotPivotFormula_typekey(value: PivotFormula): Self = StObject.set(x, "Excel.PivotFormula_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormula(value: String): Self = StObject.set(x, "Formula", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStandardFormula(value: String): Self = StObject.set(x, "StandardFormula", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_Default(value: String): Self = StObject.set(x, "_Default", value.asInstanceOf[js.Any])
  }
}
