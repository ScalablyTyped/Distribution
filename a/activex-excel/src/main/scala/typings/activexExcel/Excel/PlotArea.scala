package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotArea extends js.Object {
  val Application: typings.activexExcel.Excel.Application
  val Border: typings.activexExcel.Excel.Border
  val Creator: XlCreator
  @JSName("Excel.PlotArea_typekey")
  var ExcelDotPlotArea_typekey: PlotArea
  val Fill: ChartFillFormat
  val Format: ChartFormat
  var Height: Double
  var InsideHeight: Double
  var InsideLeft: Double
  var InsideTop: Double
  var InsideWidth: Double
  val Interior: typings.activexExcel.Excel.Interior
  var Left: Double
  val Name: String
  val Parent: js.Any
  var Position: XlChartElementPosition
  var Top: Double
  var Width: Double
  val _InsideHeight: Double
  val _InsideLeft: Double
  val _InsideTop: Double
  val _InsideWidth: Double
  def ClearFormats(): js.Any
  def Select(): js.Any
}

object PlotArea {
  @scala.inline
  def apply(
    Application: Application,
    Border: Border,
    ClearFormats: () => js.Any,
    Creator: XlCreator,
    ExcelDotPlotArea_typekey: PlotArea,
    Fill: ChartFillFormat,
    Format: ChartFormat,
    Height: Double,
    InsideHeight: Double,
    InsideLeft: Double,
    InsideTop: Double,
    InsideWidth: Double,
    Interior: Interior,
    Left: Double,
    Name: String,
    Parent: js.Any,
    Position: XlChartElementPosition,
    Select: () => js.Any,
    Top: Double,
    Width: Double,
    _InsideHeight: Double,
    _InsideLeft: Double,
    _InsideTop: Double,
    _InsideWidth: Double
  ): PlotArea = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Border = Border.asInstanceOf[js.Any], ClearFormats = js.Any.fromFunction0(ClearFormats), Creator = Creator.asInstanceOf[js.Any], Fill = Fill.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], InsideHeight = InsideHeight.asInstanceOf[js.Any], InsideLeft = InsideLeft.asInstanceOf[js.Any], InsideTop = InsideTop.asInstanceOf[js.Any], InsideWidth = InsideWidth.asInstanceOf[js.Any], Interior = Interior.asInstanceOf[js.Any], Left = Left.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select), Top = Top.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any], _InsideHeight = _InsideHeight.asInstanceOf[js.Any], _InsideLeft = _InsideLeft.asInstanceOf[js.Any], _InsideTop = _InsideTop.asInstanceOf[js.Any], _InsideWidth = _InsideWidth.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.PlotArea_typekey")(ExcelDotPlotArea_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotArea]
  }
}

