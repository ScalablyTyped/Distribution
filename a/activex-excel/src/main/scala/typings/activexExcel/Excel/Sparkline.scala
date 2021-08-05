package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sparkline extends StObject {
  
  val Application: typings.activexExcel.Excel.Application
  
  val Creator: XlCreator
  
  /* private */ @JSName("Excel.Sparkline_typekey")
  var ExcelDotSparkline_typekey: Sparkline
  
  def Location(Address: String): Range
  def Location(RowIndex: Double): Range
  def Location(RowIndex: Double, ColumnIndex: Double): Range
  @JSName("Location")
  var Location_Original: Range
  
  def ModifyLocation(Range: Range): Unit
  
  def ModifySourceData(Formula: String): Unit
  
  val Parent: js.Any
  
  var SourceData: String
}
object Sparkline {
  
  inline def apply(
    Application: Application,
    Creator: XlCreator,
    ExcelDotSparkline_typekey: Sparkline,
    Location: Range,
    ModifyLocation: Range => Unit,
    ModifySourceData: String => Unit,
    Parent: js.Any,
    SourceData: String
  ): Sparkline = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Location = Location.asInstanceOf[js.Any], ModifyLocation = js.Any.fromFunction1(ModifyLocation), ModifySourceData = js.Any.fromFunction1(ModifySourceData), Parent = Parent.asInstanceOf[js.Any], SourceData = SourceData.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.Sparkline_typekey")(ExcelDotSparkline_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sparkline]
  }
  
  extension [Self <: Sparkline](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setExcelDotSparkline_typekey(value: Sparkline): Self = StObject.set(x, "Excel.Sparkline_typekey", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: Range): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    inline def setModifyLocation(value: Range => Unit): Self = StObject.set(x, "ModifyLocation", js.Any.fromFunction1(value))
    
    inline def setModifySourceData(value: String => Unit): Self = StObject.set(x, "ModifySourceData", js.Any.fromFunction1(value))
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setSourceData(value: String): Self = StObject.set(x, "SourceData", value.asInstanceOf[js.Any])
  }
}
