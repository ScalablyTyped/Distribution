package typings.activexExcel.Excel

import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeviewControl extends StObject {
  
  val Application: typings.activexExcel.Excel.Application
  
  val Creator: XlCreator
  
  var Drilled: Any
  
  /* private */ @JSName("Excel.TreeviewControl_typekey")
  var ExcelDotTreeviewControl_typekey: TreeviewControl
  
  var Hidden: SafeArray[SafeArray[String]]
  
  val Parent: Any
}
object TreeviewControl {
  
  inline def apply(
    Application: Application,
    Creator: XlCreator,
    Drilled: Any,
    ExcelDotTreeviewControl_typekey: TreeviewControl,
    Hidden: SafeArray[SafeArray[String]],
    Parent: Any
  ): TreeviewControl = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Drilled = Drilled.asInstanceOf[js.Any], Hidden = Hidden.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.TreeviewControl_typekey")(ExcelDotTreeviewControl_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeviewControl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TreeviewControl] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDrilled(value: Any): Self = StObject.set(x, "Drilled", value.asInstanceOf[js.Any])
    
    inline def setExcelDotTreeviewControl_typekey(value: TreeviewControl): Self = StObject.set(x, "Excel.TreeviewControl_typekey", value.asInstanceOf[js.Any])
    
    inline def setHidden(value: SafeArray[SafeArray[String]]): Self = StObject.set(x, "Hidden", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
  }
}
