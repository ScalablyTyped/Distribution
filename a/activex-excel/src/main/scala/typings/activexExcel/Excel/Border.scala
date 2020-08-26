package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Border extends js.Object {
  val Application: typings.activexExcel.Excel.Application = js.native
  var Color: XlRgbColor | Double = js.native
  var ColorIndex: Double | XlColorIndex = js.native
  val Creator: XlCreator = js.native
  @JSName("Excel.Border_typekey")
  var ExcelDotBorder_typekey: Border = js.native
  var LineStyle: typings.activexExcel.Excel.LineStyle = js.native
  val Parent: js.Any = js.native
  var ThemeColor: XlThemeColor = js.native
  var TintAndShade: Double = js.native
  var Weight: XlBorderWeight = js.native
}

object Border {
  @scala.inline
  def apply(
    Application: Application,
    Color: XlRgbColor | Double,
    ColorIndex: Double | XlColorIndex,
    Creator: XlCreator,
    ExcelDotBorder_typekey: Border,
    LineStyle: LineStyle,
    Parent: js.Any,
    ThemeColor: XlThemeColor,
    TintAndShade: Double,
    Weight: XlBorderWeight
  ): Border = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Color = Color.asInstanceOf[js.Any], ColorIndex = ColorIndex.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], LineStyle = LineStyle.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], ThemeColor = ThemeColor.asInstanceOf[js.Any], TintAndShade = TintAndShade.asInstanceOf[js.Any], Weight = Weight.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.Border_typekey")(ExcelDotBorder_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Border]
  }
  @scala.inline
  implicit class BorderOps[Self <: Border] (val x: Self) extends AnyVal {
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
    def setColor(value: XlRgbColor | Double): Self = this.set("Color", value.asInstanceOf[js.Any])
    @scala.inline
    def setColorIndex(value: Double | XlColorIndex): Self = this.set("ColorIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreator(value: XlCreator): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setExcelDotBorder_typekey(value: Border): Self = this.set("Excel.Border_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setLineStyle(value: LineStyle): Self = this.set("LineStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setThemeColor(value: XlThemeColor): Self = this.set("ThemeColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setTintAndShade(value: Double): Self = this.set("TintAndShade", value.asInstanceOf[js.Any])
    @scala.inline
    def setWeight(value: XlBorderWeight): Self = this.set("Weight", value.asInstanceOf[js.Any])
  }
  
}

