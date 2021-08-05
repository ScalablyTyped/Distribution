package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRow extends StObject {
  
  val Application: typings.activexExcel.Excel.Application
  
  val Creator: XlCreator
  
  def Delete(): Unit
  
  /* private */ @JSName("Excel.ListRow_typekey")
  var ExcelDotListRow_typekey: ListRow
  
  val Index: Double
  
  val InvalidData: Boolean
  
  val Parent: js.Any
  
  def Range(Address: String): typings.activexExcel.Excel.Range
  def Range(RowIndex: Double): typings.activexExcel.Excel.Range
  def Range(RowIndex: Double, ColumnIndex: Double): typings.activexExcel.Excel.Range
  @JSName("Range")
  val Range_Original: Range
}
object ListRow {
  
  inline def apply(
    Application: Application,
    Creator: XlCreator,
    Delete: () => Unit,
    ExcelDotListRow_typekey: ListRow,
    Index: Double,
    InvalidData: Boolean,
    Parent: js.Any,
    Range: Range
  ): ListRow = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Index = Index.asInstanceOf[js.Any], InvalidData = InvalidData.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.ListRow_typekey")(ExcelDotListRow_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRow]
  }
  
  extension [Self <: ListRow](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    inline def setExcelDotListRow_typekey(value: ListRow): Self = StObject.set(x, "Excel.ListRow_typekey", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
    
    inline def setInvalidData(value: Boolean): Self = StObject.set(x, "InvalidData", value.asInstanceOf[js.Any])
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setRange(value: Range): Self = StObject.set(x, "Range", value.asInstanceOf[js.Any])
  }
}
