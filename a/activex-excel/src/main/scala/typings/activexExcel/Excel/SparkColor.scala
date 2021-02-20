package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SparkColor extends StObject {
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  val Color: FormatColor = js.native
  
  val Creator: XlCreator = js.native
  
  @JSName("Excel.SparkColor_typekey")
  var ExcelDotSparkColor_typekey: SparkColor = js.native
  
  val Parent: js.Any = js.native
  
  var Visible: Boolean = js.native
}
object SparkColor {
  
  @scala.inline
  def apply(
    Application: Application,
    Color: FormatColor,
    Creator: XlCreator,
    ExcelDotSparkColor_typekey: SparkColor,
    Parent: js.Any,
    Visible: Boolean
  ): SparkColor = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Color = Color.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.SparkColor_typekey")(ExcelDotSparkColor_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SparkColor]
  }
  
  @scala.inline
  implicit class SparkColorMutableBuilder[Self <: SparkColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: FormatColor): Self = StObject.set(x, "Color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcelDotSparkColor_typekey(value: SparkColor): Self = StObject.set(x, "Excel.SparkColor_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "Visible", value.asInstanceOf[js.Any])
  }
}
