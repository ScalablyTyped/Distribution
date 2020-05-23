package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMsoChartArea extends js.Object {
  val Application: js.Any
  var AutoScaleFont: js.Any
  val Border: IMsoBorder
  val Creator: Double
  val Fill: ChartFillFormat
  val Font: ChartFont
  val Format: IMsoChartFormat
  var Height: Double
  val Interior: IMsoInterior
  var Left: Double
  val Name: String
  @JSName("Office.IMsoChartArea_typekey")
  var OfficeDotIMsoChartArea_typekey: IMsoChartArea
  val Parent: js.Any
  var RoundedCorners: Boolean
  var Shadow: Boolean
  var Top: Double
  var Width: Double
  def Clear(): js.Any
  def ClearContents(): js.Any
  def ClearFormats(): js.Any
  def Copy(): js.Any
  def Select(): js.Any
}

object IMsoChartArea {
  @scala.inline
  def apply(
    Application: js.Any,
    AutoScaleFont: js.Any,
    Border: IMsoBorder,
    Clear: () => js.Any,
    ClearContents: () => js.Any,
    ClearFormats: () => js.Any,
    Copy: () => js.Any,
    Creator: Double,
    Fill: ChartFillFormat,
    Font: ChartFont,
    Format: IMsoChartFormat,
    Height: Double,
    Interior: IMsoInterior,
    Left: Double,
    Name: String,
    OfficeDotIMsoChartArea_typekey: IMsoChartArea,
    Parent: js.Any,
    RoundedCorners: Boolean,
    Select: () => js.Any,
    Shadow: Boolean,
    Top: Double,
    Width: Double
  ): IMsoChartArea = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], AutoScaleFont = AutoScaleFont.asInstanceOf[js.Any], Border = Border.asInstanceOf[js.Any], Clear = js.Any.fromFunction0(Clear), ClearContents = js.Any.fromFunction0(ClearContents), ClearFormats = js.Any.fromFunction0(ClearFormats), Copy = js.Any.fromFunction0(Copy), Creator = Creator.asInstanceOf[js.Any], Fill = Fill.asInstanceOf[js.Any], Font = Font.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], Interior = Interior.asInstanceOf[js.Any], Left = Left.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RoundedCorners = RoundedCorners.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select), Shadow = Shadow.asInstanceOf[js.Any], Top = Top.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.IMsoChartArea_typekey")(OfficeDotIMsoChartArea_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMsoChartArea]
  }
}

