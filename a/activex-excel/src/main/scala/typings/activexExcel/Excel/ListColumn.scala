package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListColumn extends StObject {
  
  val Application: typings.activexExcel.Excel.Application
  
  val Creator: XlCreator
  
  def DataBodyRange(Address: String): Range
  def DataBodyRange(RowIndex: Double): Range
  def DataBodyRange(RowIndex: Double, ColumnIndex: Double): Range
  @JSName("DataBodyRange")
  val DataBodyRange_Original: Range
  
  def Delete(): Unit
  
  /* private */ @JSName("Excel.ListColumn_typekey")
  var ExcelDotListColumn_typekey: ListColumn
  
  val Index: Double
  
  val ListDataFormat: typings.activexExcel.Excel.ListDataFormat
  
  var Name: String
  
  val Parent: Any
  
  def Range(Address: String): typings.activexExcel.Excel.Range
  def Range(RowIndex: Double): typings.activexExcel.Excel.Range
  def Range(RowIndex: Double, ColumnIndex: Double): typings.activexExcel.Excel.Range
  @JSName("Range")
  val Range_Original: Range
  
  val SharePointFormula: String
  
  def Total(Address: String): Range
  def Total(RowIndex: Double): Range
  def Total(RowIndex: Double, ColumnIndex: Double): Range
  @JSName("Total")
  val Total_Original: Range
  
  var TotalsCalculation: XlTotalsCalculation
  
  val XPath: typings.activexExcel.Excel.XPath
  
  val _Default: String
}
object ListColumn {
  
  inline def apply(
    Application: Application,
    Creator: XlCreator,
    DataBodyRange: Range,
    Delete: () => Unit,
    ExcelDotListColumn_typekey: ListColumn,
    Index: Double,
    ListDataFormat: ListDataFormat,
    Name: String,
    Parent: Any,
    Range: Range,
    SharePointFormula: String,
    Total: Range,
    TotalsCalculation: XlTotalsCalculation,
    XPath: XPath,
    _Default: String
  ): ListColumn = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], DataBodyRange = DataBodyRange.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Index = Index.asInstanceOf[js.Any], ListDataFormat = ListDataFormat.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any], SharePointFormula = SharePointFormula.asInstanceOf[js.Any], Total = Total.asInstanceOf[js.Any], TotalsCalculation = TotalsCalculation.asInstanceOf[js.Any], XPath = XPath.asInstanceOf[js.Any], _Default = _Default.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.ListColumn_typekey")(ExcelDotListColumn_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListColumn]
  }
  
  extension [Self <: ListColumn](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDataBodyRange(value: Range): Self = StObject.set(x, "DataBodyRange", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    inline def setExcelDotListColumn_typekey(value: ListColumn): Self = StObject.set(x, "Excel.ListColumn_typekey", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
    
    inline def setListDataFormat(value: ListDataFormat): Self = StObject.set(x, "ListDataFormat", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setRange(value: Range): Self = StObject.set(x, "Range", value.asInstanceOf[js.Any])
    
    inline def setSharePointFormula(value: String): Self = StObject.set(x, "SharePointFormula", value.asInstanceOf[js.Any])
    
    inline def setTotal(value: Range): Self = StObject.set(x, "Total", value.asInstanceOf[js.Any])
    
    inline def setTotalsCalculation(value: XlTotalsCalculation): Self = StObject.set(x, "TotalsCalculation", value.asInstanceOf[js.Any])
    
    inline def setXPath(value: XPath): Self = StObject.set(x, "XPath", value.asInstanceOf[js.Any])
    
    inline def set_Default(value: String): Self = StObject.set(x, "_Default", value.asInstanceOf[js.Any])
  }
}
