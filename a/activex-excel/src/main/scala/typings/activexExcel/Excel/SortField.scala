package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SortField extends StObject {
  
  val Application: typings.activexExcel.Excel.Application
  
  val Creator: XlCreator
  
  var CustomOrder: js.Any
  
  var DataOption: XlSortDataOption
  
  def Delete(): Unit
  
  @JSName("Excel.SortField_typekey")
  var ExcelDotSortField_typekey: SortField
  
  def Key(Address: String): Range
  def Key(RowIndex: Double): Range
  def Key(RowIndex: Double, ColumnIndex: Double): Range
  @JSName("Key")
  val Key_Original: Range
  
  def ModifyKey(Key: Range): Unit
  
  var Order: XlSortOrder
  
  val Parent: js.Any
  
  var Priority: Double
  
  def SetIcon(Icon: Icon): Unit
  
  var SortOn: XlSortOn
  
  val SortOnValue: js.Any
}
object SortField {
  
  @scala.inline
  def apply(
    Application: Application,
    Creator: XlCreator,
    CustomOrder: js.Any,
    DataOption: XlSortDataOption,
    Delete: () => Unit,
    ExcelDotSortField_typekey: SortField,
    Key: Range,
    ModifyKey: Range => Unit,
    Order: XlSortOrder,
    Parent: js.Any,
    Priority: Double,
    SetIcon: Icon => Unit,
    SortOn: XlSortOn,
    SortOnValue: js.Any
  ): SortField = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], CustomOrder = CustomOrder.asInstanceOf[js.Any], DataOption = DataOption.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Key = Key.asInstanceOf[js.Any], ModifyKey = js.Any.fromFunction1(ModifyKey), Order = Order.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Priority = Priority.asInstanceOf[js.Any], SetIcon = js.Any.fromFunction1(SetIcon), SortOn = SortOn.asInstanceOf[js.Any], SortOnValue = SortOnValue.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.SortField_typekey")(ExcelDotSortField_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortField]
  }
  
  @scala.inline
  implicit class SortFieldMutableBuilder[Self <: SortField] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomOrder(value: js.Any): Self = StObject.set(x, "CustomOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataOption(value: XlSortDataOption): Self = StObject.set(x, "DataOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExcelDotSortField_typekey(value: SortField): Self = StObject.set(x, "Excel.SortField_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: Range): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifyKey(value: Range => Unit): Self = StObject.set(x, "ModifyKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOrder(value: XlSortOrder): Self = StObject.set(x, "Order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriority(value: Double): Self = StObject.set(x, "Priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetIcon(value: Icon => Unit): Self = StObject.set(x, "SetIcon", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSortOn(value: XlSortOn): Self = StObject.set(x, "SortOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortOnValue(value: js.Any): Self = StObject.set(x, "SortOnValue", value.asInstanceOf[js.Any])
  }
}
