package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Name extends StObject {
  
  val Application: typings.activexExcel.Excel.Application
  
  var Category: String
  
  var CategoryLocal: String
  
  var Comment: String
  
  val Creator: XlCreator
  
  def Delete(): Unit
  
  /* private */ @JSName("Excel.Name_typekey")
  var ExcelDotName_typekey: Name
  
  val Index: Double
  
  var MacroType: XlXLMMacroType
  
  var Name: String
  
  var NameLocal: String
  
  val Parent: Any
  
  var RefersTo: String
  
  var RefersToLocal: String
  
  var RefersToR1C1: String
  
  var RefersToR1C1Local: String
  
  def RefersToRange(Address: String): Range
  def RefersToRange(RowIndex: Double): Range
  def RefersToRange(RowIndex: Double, ColumnIndex: Double): Range
  @JSName("RefersToRange")
  val RefersToRange_Original: Range
  
  var ShortcutKey: String
  
  val ValidWorkbookParameter: Boolean
  
  var Value: String
  
  var Visible: Boolean
  
  var WorkbookParameter: Boolean
  
  val _Default: String
}
object Name {
  
  inline def apply(
    Application: Application,
    Category: String,
    CategoryLocal: String,
    Comment: String,
    Creator: XlCreator,
    Delete: () => Unit,
    ExcelDotName_typekey: Name,
    Index: Double,
    MacroType: XlXLMMacroType,
    Name: String,
    NameLocal: String,
    Parent: Any,
    RefersTo: String,
    RefersToLocal: String,
    RefersToR1C1: String,
    RefersToR1C1Local: String,
    RefersToRange: Range,
    ShortcutKey: String,
    ValidWorkbookParameter: Boolean,
    Value: String,
    Visible: Boolean,
    WorkbookParameter: Boolean,
    _Default: String
  ): Name = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Category = Category.asInstanceOf[js.Any], CategoryLocal = CategoryLocal.asInstanceOf[js.Any], Comment = Comment.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Index = Index.asInstanceOf[js.Any], MacroType = MacroType.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NameLocal = NameLocal.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RefersTo = RefersTo.asInstanceOf[js.Any], RefersToLocal = RefersToLocal.asInstanceOf[js.Any], RefersToR1C1 = RefersToR1C1.asInstanceOf[js.Any], RefersToR1C1Local = RefersToR1C1Local.asInstanceOf[js.Any], RefersToRange = RefersToRange.asInstanceOf[js.Any], ShortcutKey = ShortcutKey.asInstanceOf[js.Any], ValidWorkbookParameter = ValidWorkbookParameter.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any], WorkbookParameter = WorkbookParameter.asInstanceOf[js.Any], _Default = _Default.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.Name_typekey")(ExcelDotName_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
  
  extension [Self <: Name](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCategory(value: String): Self = StObject.set(x, "Category", value.asInstanceOf[js.Any])
    
    inline def setCategoryLocal(value: String): Self = StObject.set(x, "CategoryLocal", value.asInstanceOf[js.Any])
    
    inline def setComment(value: String): Self = StObject.set(x, "Comment", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    inline def setExcelDotName_typekey(value: Name): Self = StObject.set(x, "Excel.Name_typekey", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
    
    inline def setMacroType(value: XlXLMMacroType): Self = StObject.set(x, "MacroType", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameLocal(value: String): Self = StObject.set(x, "NameLocal", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setRefersTo(value: String): Self = StObject.set(x, "RefersTo", value.asInstanceOf[js.Any])
    
    inline def setRefersToLocal(value: String): Self = StObject.set(x, "RefersToLocal", value.asInstanceOf[js.Any])
    
    inline def setRefersToR1C1(value: String): Self = StObject.set(x, "RefersToR1C1", value.asInstanceOf[js.Any])
    
    inline def setRefersToR1C1Local(value: String): Self = StObject.set(x, "RefersToR1C1Local", value.asInstanceOf[js.Any])
    
    inline def setRefersToRange(value: Range): Self = StObject.set(x, "RefersToRange", value.asInstanceOf[js.Any])
    
    inline def setShortcutKey(value: String): Self = StObject.set(x, "ShortcutKey", value.asInstanceOf[js.Any])
    
    inline def setValidWorkbookParameter(value: Boolean): Self = StObject.set(x, "ValidWorkbookParameter", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "Visible", value.asInstanceOf[js.Any])
    
    inline def setWorkbookParameter(value: Boolean): Self = StObject.set(x, "WorkbookParameter", value.asInstanceOf[js.Any])
    
    inline def set_Default(value: String): Self = StObject.set(x, "_Default", value.asInstanceOf[js.Any])
  }
}
