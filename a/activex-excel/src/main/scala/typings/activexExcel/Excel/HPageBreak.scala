package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HPageBreak extends StObject {
  
  val Application: typings.activexExcel.Excel.Application
  
  val Creator: XlCreator
  
  def Delete(): Unit
  
  def DragOff(Direction: XlDirection, RegionIndex: Double): Unit
  
  /* private */ @JSName("Excel.HPageBreak_typekey")
  var ExcelDotHPageBreak_typekey: HPageBreak
  
  val Extent: XlPageBreakExtent
  
  def Location(Address: String): Range
  def Location(RowIndex: Double): Range
  def Location(RowIndex: Double, ColumnIndex: Double): Range
  @JSName("Location")
  var Location_Original: Range
  
  val Parent: Worksheet
  
  var Type: XlPageBreak
}
object HPageBreak {
  
  inline def apply(
    Application: Application,
    Creator: XlCreator,
    Delete: () => Unit,
    DragOff: (XlDirection, Double) => Unit,
    ExcelDotHPageBreak_typekey: HPageBreak,
    Extent: XlPageBreakExtent,
    Location: Range,
    Parent: Worksheet,
    Type: XlPageBreak
  ): HPageBreak = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), DragOff = js.Any.fromFunction2(DragOff), Extent = Extent.asInstanceOf[js.Any], Location = Location.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.HPageBreak_typekey")(ExcelDotHPageBreak_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HPageBreak]
  }
  
  extension [Self <: HPageBreak](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    inline def setDragOff(value: (XlDirection, Double) => Unit): Self = StObject.set(x, "DragOff", js.Any.fromFunction2(value))
    
    inline def setExcelDotHPageBreak_typekey(value: HPageBreak): Self = StObject.set(x, "Excel.HPageBreak_typekey", value.asInstanceOf[js.Any])
    
    inline def setExtent(value: XlPageBreakExtent): Self = StObject.set(x, "Extent", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: Range): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Worksheet): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setType(value: XlPageBreak): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
