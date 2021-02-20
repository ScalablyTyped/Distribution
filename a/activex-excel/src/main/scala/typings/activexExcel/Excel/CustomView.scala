package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomView extends StObject {
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  val Creator: XlCreator = js.native
  
  def Delete(): Unit = js.native
  
  @JSName("Excel.CustomView_typekey")
  var ExcelDotCustomView_typekey: CustomView = js.native
  
  val Name: String = js.native
  
  val Parent: js.Any = js.native
  
  val PrintSettings: Boolean = js.native
  
  val RowColSettings: Boolean = js.native
  
  def Show(): Unit = js.native
}
object CustomView {
  
  @scala.inline
  def apply(
    Application: Application,
    Creator: XlCreator,
    Delete: () => Unit,
    ExcelDotCustomView_typekey: CustomView,
    Name: String,
    Parent: js.Any,
    PrintSettings: Boolean,
    RowColSettings: Boolean,
    Show: () => Unit
  ): CustomView = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PrintSettings = PrintSettings.asInstanceOf[js.Any], RowColSettings = RowColSettings.asInstanceOf[js.Any], Show = js.Any.fromFunction0(Show))
    __obj.updateDynamic("Excel.CustomView_typekey")(ExcelDotCustomView_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomView]
  }
  
  @scala.inline
  implicit class CustomViewMutableBuilder[Self <: CustomView] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExcelDotCustomView_typekey(value: CustomView): Self = StObject.set(x, "Excel.CustomView_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrintSettings(value: Boolean): Self = StObject.set(x, "PrintSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowColSettings(value: Boolean): Self = StObject.set(x, "RowColSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShow(value: () => Unit): Self = StObject.set(x, "Show", js.Any.fromFunction0(value))
  }
}
