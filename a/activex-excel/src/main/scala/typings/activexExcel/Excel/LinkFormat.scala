package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinkFormat extends StObject {
  
  val Application: typings.activexExcel.Excel.Application
  
  var AutoUpdate: Boolean
  
  val Creator: XlCreator
  
  /* private */ @JSName("Excel.LinkFormat_typekey")
  var ExcelDotLinkFormat_typekey: LinkFormat
  
  var Locked: Boolean
  
  val Parent: Any
  
  def Update(): Unit
}
object LinkFormat {
  
  inline def apply(
    Application: Application,
    AutoUpdate: Boolean,
    Creator: XlCreator,
    ExcelDotLinkFormat_typekey: LinkFormat,
    Locked: Boolean,
    Parent: Any,
    Update: () => Unit
  ): LinkFormat = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], AutoUpdate = AutoUpdate.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Locked = Locked.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Update = js.Any.fromFunction0(Update))
    __obj.updateDynamic("Excel.LinkFormat_typekey")(ExcelDotLinkFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkFormat]
  }
  
  extension [Self <: LinkFormat](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setAutoUpdate(value: Boolean): Self = StObject.set(x, "AutoUpdate", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setExcelDotLinkFormat_typekey(value: LinkFormat): Self = StObject.set(x, "Excel.LinkFormat_typekey", value.asInstanceOf[js.Any])
    
    inline def setLocked(value: Boolean): Self = StObject.set(x, "Locked", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setUpdate(value: () => Unit): Self = StObject.set(x, "Update", js.Any.fromFunction0(value))
  }
}
