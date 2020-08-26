package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Interior extends js.Object {
  val Application: typings.activexExcel.Excel.Application = js.native
  var Color: XlRgbColor | Double = js.native
  var ColorIndex: Double | XlColorIndex = js.native
  val Creator: XlCreator = js.native
  @JSName("Excel.Interior_typekey")
  var ExcelDotInterior_typekey: Interior = js.native
  val Gradient: js.Any = js.native
  var InvertIfNegative: Boolean = js.native
  val Parent: js.Any = js.native
  var Pattern: XlPattern = js.native
  var PatternColor: XlRgbColor | Double = js.native
  var PatternColorIndex: Double | XlColorIndex = js.native
  var PatternThemeColor: XlThemeColor = js.native
  var PatternTintAndShade: Double = js.native
  var ThemeColor: XlThemeColor = js.native
  var TintAndShade: Double = js.native
}

object Interior {
  @scala.inline
  def apply(
    Application: Application,
    Color: XlRgbColor | Double,
    ColorIndex: Double | XlColorIndex,
    Creator: XlCreator,
    ExcelDotInterior_typekey: Interior,
    Gradient: js.Any,
    InvertIfNegative: Boolean,
    Parent: js.Any,
    Pattern: XlPattern,
    PatternColor: XlRgbColor | Double,
    PatternColorIndex: Double | XlColorIndex,
    PatternThemeColor: XlThemeColor,
    PatternTintAndShade: Double,
    ThemeColor: XlThemeColor,
    TintAndShade: Double
  ): Interior = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Color = Color.asInstanceOf[js.Any], ColorIndex = ColorIndex.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Gradient = Gradient.asInstanceOf[js.Any], InvertIfNegative = InvertIfNegative.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Pattern = Pattern.asInstanceOf[js.Any], PatternColor = PatternColor.asInstanceOf[js.Any], PatternColorIndex = PatternColorIndex.asInstanceOf[js.Any], PatternThemeColor = PatternThemeColor.asInstanceOf[js.Any], PatternTintAndShade = PatternTintAndShade.asInstanceOf[js.Any], ThemeColor = ThemeColor.asInstanceOf[js.Any], TintAndShade = TintAndShade.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.Interior_typekey")(ExcelDotInterior_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Interior]
  }
  @scala.inline
  implicit class InteriorOps[Self <: Interior] (val x: Self) extends AnyVal {
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
    def setExcelDotInterior_typekey(value: Interior): Self = this.set("Excel.Interior_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setGradient(value: js.Any): Self = this.set("Gradient", value.asInstanceOf[js.Any])
    @scala.inline
    def setInvertIfNegative(value: Boolean): Self = this.set("InvertIfNegative", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setPattern(value: XlPattern): Self = this.set("Pattern", value.asInstanceOf[js.Any])
    @scala.inline
    def setPatternColor(value: XlRgbColor | Double): Self = this.set("PatternColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setPatternColorIndex(value: Double | XlColorIndex): Self = this.set("PatternColorIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setPatternThemeColor(value: XlThemeColor): Self = this.set("PatternThemeColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setPatternTintAndShade(value: Double): Self = this.set("PatternTintAndShade", value.asInstanceOf[js.Any])
    @scala.inline
    def setThemeColor(value: XlThemeColor): Self = this.set("ThemeColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setTintAndShade(value: Double): Self = this.set("TintAndShade", value.asInstanceOf[js.Any])
  }
  
}

