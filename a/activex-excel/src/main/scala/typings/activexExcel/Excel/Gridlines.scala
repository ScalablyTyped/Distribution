package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Gridlines extends StObject {
  
  val Application: typings.activexExcel.Excel.Application
  
  val Border: typings.activexExcel.Excel.Border
  
  val Creator: XlCreator
  
  def Delete(): Any
  
  /* private */ @JSName("Excel.Gridlines_typekey")
  var ExcelDotGridlines_typekey: Gridlines
  
  val Format: ChartFormat
  
  val Name: String
  
  val Parent: Any
  
  def Select(): Any
}
object Gridlines {
  
  inline def apply(
    Application: Application,
    Border: Border,
    Creator: XlCreator,
    Delete: () => Any,
    ExcelDotGridlines_typekey: Gridlines,
    Format: ChartFormat,
    Name: String,
    Parent: Any,
    Select: () => Any
  ): Gridlines = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Border = Border.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Format = Format.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select))
    __obj.updateDynamic("Excel.Gridlines_typekey")(ExcelDotGridlines_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gridlines]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Gridlines] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setBorder(value: Border): Self = StObject.set(x, "Border", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: () => Any): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    inline def setExcelDotGridlines_typekey(value: Gridlines): Self = StObject.set(x, "Excel.Gridlines_typekey", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: ChartFormat): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setSelect(value: () => Any): Self = StObject.set(x, "Select", js.Any.fromFunction0(value))
  }
}
