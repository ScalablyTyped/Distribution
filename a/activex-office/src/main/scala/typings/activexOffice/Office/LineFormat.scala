package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineFormat extends js.Object {
  val Application: js.Any = js.native
  var BackColor: ColorFormat = js.native
  var BeginArrowheadLength: MsoArrowheadLength = js.native
  var BeginArrowheadStyle: MsoArrowheadStyle = js.native
  var BeginArrowheadWidth: MsoArrowheadWidth = js.native
  val Creator: Double = js.native
  var DashStyle: MsoLineDashStyle = js.native
  var EndArrowheadLength: MsoArrowheadLength = js.native
  var EndArrowheadStyle: MsoArrowheadStyle = js.native
  var EndArrowheadWidth: MsoArrowheadWidth = js.native
  var ForeColor: ColorFormat = js.native
  var InsetPen: MsoTriState = js.native
  @JSName("Office.LineFormat_typekey")
  var OfficeDotLineFormat_typekey: LineFormat = js.native
  val Parent: js.Any = js.native
  var Pattern: MsoPatternType = js.native
  var Style: MsoLineStyle = js.native
  var Transparency: Double = js.native
  var Visible: MsoTriState = js.native
  var Weight: Double = js.native
}

object LineFormat {
  @scala.inline
  def apply(
    Application: js.Any,
    BackColor: ColorFormat,
    BeginArrowheadLength: MsoArrowheadLength,
    BeginArrowheadStyle: MsoArrowheadStyle,
    BeginArrowheadWidth: MsoArrowheadWidth,
    Creator: Double,
    DashStyle: MsoLineDashStyle,
    EndArrowheadLength: MsoArrowheadLength,
    EndArrowheadStyle: MsoArrowheadStyle,
    EndArrowheadWidth: MsoArrowheadWidth,
    ForeColor: ColorFormat,
    InsetPen: MsoTriState,
    OfficeDotLineFormat_typekey: LineFormat,
    Parent: js.Any,
    Pattern: MsoPatternType,
    Style: MsoLineStyle,
    Transparency: Double,
    Visible: MsoTriState,
    Weight: Double
  ): LineFormat = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], BackColor = BackColor.asInstanceOf[js.Any], BeginArrowheadLength = BeginArrowheadLength.asInstanceOf[js.Any], BeginArrowheadStyle = BeginArrowheadStyle.asInstanceOf[js.Any], BeginArrowheadWidth = BeginArrowheadWidth.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], DashStyle = DashStyle.asInstanceOf[js.Any], EndArrowheadLength = EndArrowheadLength.asInstanceOf[js.Any], EndArrowheadStyle = EndArrowheadStyle.asInstanceOf[js.Any], EndArrowheadWidth = EndArrowheadWidth.asInstanceOf[js.Any], ForeColor = ForeColor.asInstanceOf[js.Any], InsetPen = InsetPen.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Pattern = Pattern.asInstanceOf[js.Any], Style = Style.asInstanceOf[js.Any], Transparency = Transparency.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any], Weight = Weight.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.LineFormat_typekey")(OfficeDotLineFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineFormat]
  }
  @scala.inline
  implicit class LineFormatOps[Self <: LineFormat] (val x: Self) extends AnyVal {
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
    def setApplication(value: js.Any): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setBackColor(value: ColorFormat): Self = this.set("BackColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setBeginArrowheadLength(value: MsoArrowheadLength): Self = this.set("BeginArrowheadLength", value.asInstanceOf[js.Any])
    @scala.inline
    def setBeginArrowheadStyle(value: MsoArrowheadStyle): Self = this.set("BeginArrowheadStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setBeginArrowheadWidth(value: MsoArrowheadWidth): Self = this.set("BeginArrowheadWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setDashStyle(value: MsoLineDashStyle): Self = this.set("DashStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndArrowheadLength(value: MsoArrowheadLength): Self = this.set("EndArrowheadLength", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndArrowheadStyle(value: MsoArrowheadStyle): Self = this.set("EndArrowheadStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndArrowheadWidth(value: MsoArrowheadWidth): Self = this.set("EndArrowheadWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setForeColor(value: ColorFormat): Self = this.set("ForeColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setInsetPen(value: MsoTriState): Self = this.set("InsetPen", value.asInstanceOf[js.Any])
    @scala.inline
    def setOfficeDotLineFormat_typekey(value: LineFormat): Self = this.set("Office.LineFormat_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setPattern(value: MsoPatternType): Self = this.set("Pattern", value.asInstanceOf[js.Any])
    @scala.inline
    def setStyle(value: MsoLineStyle): Self = this.set("Style", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransparency(value: Double): Self = this.set("Transparency", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisible(value: MsoTriState): Self = this.set("Visible", value.asInstanceOf[js.Any])
    @scala.inline
    def setWeight(value: Double): Self = this.set("Weight", value.asInstanceOf[js.Any])
  }
  
}

