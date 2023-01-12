package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PivotAxis extends StObject {
  
  val Application: typings.activexExcel.Excel.Application
  
  val Creator: XlCreator
  
  /* private */ @JSName("Excel.PivotAxis_typekey")
  var ExcelDotPivotAxis_typekey: PivotAxis
  
  val Parent: Any
  
  def PivotLines(Index: Double): PivotLine
  @JSName("PivotLines")
  val PivotLines_Original: PivotLines
}
object PivotAxis {
  
  inline def apply(
    Application: Application,
    Creator: XlCreator,
    ExcelDotPivotAxis_typekey: PivotAxis,
    Parent: Any,
    PivotLines: PivotLines
  ): PivotAxis = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PivotLines = PivotLines.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.PivotAxis_typekey")(ExcelDotPivotAxis_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotAxis]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PivotAxis] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setExcelDotPivotAxis_typekey(value: PivotAxis): Self = StObject.set(x, "Excel.PivotAxis_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPivotLines(value: PivotLines): Self = StObject.set(x, "PivotLines", value.asInstanceOf[js.Any])
  }
}
