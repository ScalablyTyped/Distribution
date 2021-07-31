package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Corners extends StObject {
  
  val Application: typings.activexExcel.Excel.Application
  
  val Creator: XlCreator
  
  @JSName("Excel.Corners_typekey")
  var ExcelDotCorners_typekey: Corners
  
  val Name: String
  
  val Parent: js.Any
  
  def Select(): js.Any
}
object Corners {
  
  @scala.inline
  def apply(
    Application: Application,
    Creator: XlCreator,
    ExcelDotCorners_typekey: Corners,
    Name: String,
    Parent: js.Any,
    Select: () => js.Any
  ): Corners = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select))
    __obj.updateDynamic("Excel.Corners_typekey")(ExcelDotCorners_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Corners]
  }
  
  @scala.inline
  implicit class CornersMutableBuilder[Self <: Corners] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcelDotCorners_typekey(value: Corners): Self = StObject.set(x, "Excel.Corners_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelect(value: () => js.Any): Self = StObject.set(x, "Select", js.Any.fromFunction0(value))
  }
}
