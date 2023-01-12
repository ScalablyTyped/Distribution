package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SparkColor extends StObject {
  
  val Application: typings.activexExcel.Excel.Application
  
  val Color: FormatColor
  
  val Creator: XlCreator
  
  /* private */ @JSName("Excel.SparkColor_typekey")
  var ExcelDotSparkColor_typekey: SparkColor
  
  val Parent: Any
  
  var Visible: Boolean
}
object SparkColor {
  
  inline def apply(
    Application: Application,
    Color: FormatColor,
    Creator: XlCreator,
    ExcelDotSparkColor_typekey: SparkColor,
    Parent: Any,
    Visible: Boolean
  ): SparkColor = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Color = Color.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.SparkColor_typekey")(ExcelDotSparkColor_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SparkColor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SparkColor] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setColor(value: FormatColor): Self = StObject.set(x, "Color", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setExcelDotSparkColor_typekey(value: SparkColor): Self = StObject.set(x, "Excel.SparkColor_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "Visible", value.asInstanceOf[js.Any])
  }
}
