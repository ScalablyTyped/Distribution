package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineFormat extends js.Object {
  val Application: js.Any
  var BackColor: ColorFormat
  var BeginArrowheadLength: MsoArrowheadLength
  var BeginArrowheadStyle: MsoArrowheadStyle
  var BeginArrowheadWidth: MsoArrowheadWidth
  val Creator: Double
  var DashStyle: MsoLineDashStyle
  var EndArrowheadLength: MsoArrowheadLength
  var EndArrowheadStyle: MsoArrowheadStyle
  var EndArrowheadWidth: MsoArrowheadWidth
  var ForeColor: ColorFormat
  var InsetPen: MsoTriState
  @JSName("Office.LineFormat_typekey")
  var OfficeDotLineFormat_typekey: LineFormat
  val Parent: js.Any
  var Pattern: MsoPatternType
  var Style: MsoLineStyle
  var Transparency: Double
  var Visible: MsoTriState
  var Weight: Double
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
}

