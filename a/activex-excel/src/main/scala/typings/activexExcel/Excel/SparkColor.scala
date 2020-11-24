package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SparkColor extends js.Object {
  
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
  implicit class SparkColorOps[Self <: SparkColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: FormatColor): Self = this.set("Color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: XlCreator): Self = this.set("Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcelDotSparkColor_typekey(value: SparkColor): Self = this.set("Excel.SparkColor_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("Visible", value.asInstanceOf[js.Any])
  }
}
