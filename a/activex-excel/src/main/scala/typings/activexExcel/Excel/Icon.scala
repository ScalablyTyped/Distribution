package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Icon extends StObject {
  
  val Application: typings.activexExcel.Excel.Application
  
  val Creator: XlCreator
  
  /* private */ @JSName("Excel.Icon_typekey")
  var ExcelDotIcon_typekey: Icon
  
  val Index: Double
  
  def Parent(Index: Double): Icon
  @JSName("Parent")
  val Parent_Original: IconSet
}
object Icon {
  
  inline def apply(
    Application: Application,
    Creator: XlCreator,
    ExcelDotIcon_typekey: Icon,
    Index: Double,
    Parent: IconSet
  ): Icon = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.Icon_typekey")(ExcelDotIcon_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Icon]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Icon] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setExcelDotIcon_typekey(value: Icon): Self = StObject.set(x, "Excel.Icon_typekey", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
    
    inline def setParent(value: IconSet): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
  }
}
