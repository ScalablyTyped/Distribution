package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartArea extends js.Object {
  val Application: typings.activexExcel.Excel.Application
  var AutoScaleFont: js.Any
  val Border: typings.activexExcel.Excel.Border
  val Creator: XlCreator
  @JSName("Excel.ChartArea_typekey")
  var ExcelDotChartArea_typekey: ChartArea
  val Fill: ChartFillFormat
  val Font: typings.activexExcel.Excel.Font
  val Format: ChartFormat
  var Height: Double
  val Interior: typings.activexExcel.Excel.Interior
  var Left: Double
  val Name: String
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

object ChartArea {
  @scala.inline
  def apply(
    Application: Application,
    AutoScaleFont: js.Any,
    Border: Border,
    Clear: () => js.Any,
    ClearContents: () => js.Any,
    ClearFormats: () => js.Any,
    Copy: () => js.Any,
    Creator: XlCreator,
    ExcelDotChartArea_typekey: ChartArea,
    Fill: ChartFillFormat,
    Font: Font,
    Format: ChartFormat,
    Height: Double,
    Interior: Interior,
    Left: Double,
    Name: String,
    Parent: js.Any,
    RoundedCorners: Boolean,
    Select: () => js.Any,
    Shadow: Boolean,
    Top: Double,
    Width: Double
  ): ChartArea = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], AutoScaleFont = AutoScaleFont.asInstanceOf[js.Any], Border = Border.asInstanceOf[js.Any], Clear = js.Any.fromFunction0(Clear), ClearContents = js.Any.fromFunction0(ClearContents), ClearFormats = js.Any.fromFunction0(ClearFormats), Copy = js.Any.fromFunction0(Copy), Creator = Creator.asInstanceOf[js.Any], Fill = Fill.asInstanceOf[js.Any], Font = Font.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], Interior = Interior.asInstanceOf[js.Any], Left = Left.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RoundedCorners = RoundedCorners.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select), Shadow = Shadow.asInstanceOf[js.Any], Top = Top.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.ChartArea_typekey")(ExcelDotChartArea_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartArea]
  }
}

