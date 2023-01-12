package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameter extends StObject {
  
  val Application: typings.activexExcel.Excel.Application
  
  val Creator: XlCreator
  
  var DataType: XlParameterDataType
  
  /* private */ @JSName("Excel.Parameter_typekey")
  var ExcelDotParameter_typekey: Parameter
  
  var Name: String
  
  val Parent: Any
  
  val PromptString: String
  
  var RefreshOnChange: Boolean
  
  def SetParam(Type: XlParameterType, Value: Any): Unit
  
  def SourceRange(Address: String): Range
  def SourceRange(RowIndex: Double): Range
  def SourceRange(RowIndex: Double, ColumnIndex: Double): Range
  @JSName("SourceRange")
  val SourceRange_Original: Range
  
  val Type: XlParameterType
  
  val Value: Any
}
object Parameter {
  
  inline def apply(
    Application: Application,
    Creator: XlCreator,
    DataType: XlParameterDataType,
    ExcelDotParameter_typekey: Parameter,
    Name: String,
    Parent: Any,
    PromptString: String,
    RefreshOnChange: Boolean,
    SetParam: (XlParameterType, Any) => Unit,
    SourceRange: Range,
    Type: XlParameterType,
    Value: Any
  ): Parameter = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], DataType = DataType.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PromptString = PromptString.asInstanceOf[js.Any], RefreshOnChange = RefreshOnChange.asInstanceOf[js.Any], SetParam = js.Any.fromFunction2(SetParam), SourceRange = SourceRange.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.Parameter_typekey")(ExcelDotParameter_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameter] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDataType(value: XlParameterDataType): Self = StObject.set(x, "DataType", value.asInstanceOf[js.Any])
    
    inline def setExcelDotParameter_typekey(value: Parameter): Self = StObject.set(x, "Excel.Parameter_typekey", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPromptString(value: String): Self = StObject.set(x, "PromptString", value.asInstanceOf[js.Any])
    
    inline def setRefreshOnChange(value: Boolean): Self = StObject.set(x, "RefreshOnChange", value.asInstanceOf[js.Any])
    
    inline def setSetParam(value: (XlParameterType, Any) => Unit): Self = StObject.set(x, "SetParam", js.Any.fromFunction2(value))
    
    inline def setSourceRange(value: Range): Self = StObject.set(x, "SourceRange", value.asInstanceOf[js.Any])
    
    inline def setType(value: XlParameterType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
