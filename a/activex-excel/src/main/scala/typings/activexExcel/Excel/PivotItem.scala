package typings.activexExcel.Excel

import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PivotItem extends StObject {
  
  val Application: typings.activexExcel.Excel.Application
  
  var Caption: String
  
  def ChildItems(Indexes: SafeArray[Double | String]): PivotItems
  def ChildItems(Index: String): PivotItem
  def ChildItems(Index: Double): PivotItem
  @JSName("ChildItems")
  var ChildItems_Original: PivotItemsResult
  
  val Creator: XlCreator
  
  def DataRange(Address: String): Range
  def DataRange(RowIndex: Double): Range
  def DataRange(RowIndex: Double, ColumnIndex: Double): Range
  @JSName("DataRange")
  val DataRange_Original: Range
  
  def Delete(): Unit
  
  def DrillTo(Field: String): Unit
  
  var DrilledDown: Boolean
  
  /* private */ @JSName("Excel.PivotItem_typekey")
  var ExcelDotPivotItem_typekey: PivotItem
  
  var Formula: String
  
  val IsCalculated: Boolean
  
  def LabelRange(Address: String): Range
  def LabelRange(RowIndex: Double): Range
  def LabelRange(RowIndex: Double, ColumnIndex: Double): Range
  @JSName("LabelRange")
  val LabelRange_Original: Range
  
  var Name: String
  
  val Parent: PivotField
  
  val ParentItem: PivotItem
  
  val ParentShowDetail: Boolean
  
  var Position: Double
  
  val RecordCount: Double
  
  var ShowDetail: Boolean
  
  val SourceName: Any
  
  val SourceNameStandard: String
  
  var StandardFormula: String
  
  var Value: String
  
  var Visible: Boolean
  
  var _Default: String
}
object PivotItem {
  
  inline def apply(
    Application: Application,
    Caption: String,
    ChildItems: PivotItemsResult,
    Creator: XlCreator,
    DataRange: Range,
    Delete: () => Unit,
    DrillTo: String => Unit,
    DrilledDown: Boolean,
    ExcelDotPivotItem_typekey: PivotItem,
    Formula: String,
    IsCalculated: Boolean,
    LabelRange: Range,
    Name: String,
    Parent: PivotField,
    ParentItem: PivotItem,
    ParentShowDetail: Boolean,
    Position: Double,
    RecordCount: Double,
    ShowDetail: Boolean,
    SourceName: Any,
    SourceNameStandard: String,
    StandardFormula: String,
    Value: String,
    Visible: Boolean,
    _Default: String
  ): PivotItem = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Caption = Caption.asInstanceOf[js.Any], ChildItems = ChildItems.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], DataRange = DataRange.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), DrillTo = js.Any.fromFunction1(DrillTo), DrilledDown = DrilledDown.asInstanceOf[js.Any], Formula = Formula.asInstanceOf[js.Any], IsCalculated = IsCalculated.asInstanceOf[js.Any], LabelRange = LabelRange.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], ParentItem = ParentItem.asInstanceOf[js.Any], ParentShowDetail = ParentShowDetail.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], RecordCount = RecordCount.asInstanceOf[js.Any], ShowDetail = ShowDetail.asInstanceOf[js.Any], SourceName = SourceName.asInstanceOf[js.Any], SourceNameStandard = SourceNameStandard.asInstanceOf[js.Any], StandardFormula = StandardFormula.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any], _Default = _Default.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.PivotItem_typekey")(ExcelDotPivotItem_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PivotItem] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCaption(value: String): Self = StObject.set(x, "Caption", value.asInstanceOf[js.Any])
    
    inline def setChildItems(value: PivotItemsResult): Self = StObject.set(x, "ChildItems", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDataRange(value: Range): Self = StObject.set(x, "DataRange", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    inline def setDrillTo(value: String => Unit): Self = StObject.set(x, "DrillTo", js.Any.fromFunction1(value))
    
    inline def setDrilledDown(value: Boolean): Self = StObject.set(x, "DrilledDown", value.asInstanceOf[js.Any])
    
    inline def setExcelDotPivotItem_typekey(value: PivotItem): Self = StObject.set(x, "Excel.PivotItem_typekey", value.asInstanceOf[js.Any])
    
    inline def setFormula(value: String): Self = StObject.set(x, "Formula", value.asInstanceOf[js.Any])
    
    inline def setIsCalculated(value: Boolean): Self = StObject.set(x, "IsCalculated", value.asInstanceOf[js.Any])
    
    inline def setLabelRange(value: Range): Self = StObject.set(x, "LabelRange", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setParent(value: PivotField): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setParentItem(value: PivotItem): Self = StObject.set(x, "ParentItem", value.asInstanceOf[js.Any])
    
    inline def setParentShowDetail(value: Boolean): Self = StObject.set(x, "ParentShowDetail", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Double): Self = StObject.set(x, "Position", value.asInstanceOf[js.Any])
    
    inline def setRecordCount(value: Double): Self = StObject.set(x, "RecordCount", value.asInstanceOf[js.Any])
    
    inline def setShowDetail(value: Boolean): Self = StObject.set(x, "ShowDetail", value.asInstanceOf[js.Any])
    
    inline def setSourceName(value: Any): Self = StObject.set(x, "SourceName", value.asInstanceOf[js.Any])
    
    inline def setSourceNameStandard(value: String): Self = StObject.set(x, "SourceNameStandard", value.asInstanceOf[js.Any])
    
    inline def setStandardFormula(value: String): Self = StObject.set(x, "StandardFormula", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "Visible", value.asInstanceOf[js.Any])
    
    inline def set_Default(value: String): Self = StObject.set(x, "_Default", value.asInstanceOf[js.Any])
  }
}
