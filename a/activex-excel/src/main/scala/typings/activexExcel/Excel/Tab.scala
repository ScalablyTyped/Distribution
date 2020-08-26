package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tab extends js.Object {
  val Application: typings.activexExcel.Excel.Application = js.native
  var Color: XlRgbColor | Double = js.native
  var ColorIndex: XlColorIndex = js.native
  val Creator: XlCreator = js.native
  @JSName("Excel.Tab_typekey")
  var ExcelDotTab_typekey: Tab = js.native
  val Parent: js.Any = js.native
  var ThemeColor: XlThemeColor = js.native
  var TintAndShade: Double = js.native
}

object Tab {
  @scala.inline
  def apply(
    Application: Application,
    Color: XlRgbColor | Double,
    ColorIndex: XlColorIndex,
    Creator: XlCreator,
    ExcelDotTab_typekey: Tab,
    Parent: js.Any,
    ThemeColor: XlThemeColor,
    TintAndShade: Double
  ): Tab = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Color = Color.asInstanceOf[js.Any], ColorIndex = ColorIndex.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], ThemeColor = ThemeColor.asInstanceOf[js.Any], TintAndShade = TintAndShade.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.Tab_typekey")(ExcelDotTab_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tab]
  }
  @scala.inline
  implicit class TabOps[Self <: Tab] (val x: Self) extends AnyVal {
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
    def setColorIndex(value: XlColorIndex): Self = this.set("ColorIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreator(value: XlCreator): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setExcelDotTab_typekey(value: Tab): Self = this.set("Excel.Tab_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setThemeColor(value: XlThemeColor): Self = this.set("ThemeColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setTintAndShade(value: Double): Self = this.set("TintAndShade", value.asInstanceOf[js.Any])
  }
  
}

