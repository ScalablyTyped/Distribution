package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotArea extends js.Object {
  val Application: js.Any
  val Border: ChartBorder
  val Creator: Double
  val Fill: ChartFillFormat
  val Format: ChartFormat
  var Height: Double
  var InsideHeight: Double
  var InsideLeft: Double
  var InsideTop: Double
  var InsideWidth: Double
  val Interior: typings.activexWord.Word.Interior
  var Left: Double
  val Name: String
  val Parent: js.Any
  var Position: XlChartElementPosition
  var Top: Double
  var Width: Double
  @JSName("Word.PlotArea_typekey")
  var WordDotPlotArea_typekey: PlotArea
  def ClearFormats(): js.Any
  def Select(): js.Any
}

object PlotArea {
  @scala.inline
  def apply(
    Application: js.Any,
    Border: ChartBorder,
    ClearFormats: () => js.Any,
    Creator: Double,
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
    WordDotPlotArea_typekey: PlotArea
  ): PlotArea = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Border = Border.asInstanceOf[js.Any], ClearFormats = js.Any.fromFunction0(ClearFormats), Creator = Creator.asInstanceOf[js.Any], Fill = Fill.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], InsideHeight = InsideHeight.asInstanceOf[js.Any], InsideLeft = InsideLeft.asInstanceOf[js.Any], InsideTop = InsideTop.asInstanceOf[js.Any], InsideWidth = InsideWidth.asInstanceOf[js.Any], Interior = Interior.asInstanceOf[js.Any], Left = Left.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select), Top = Top.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.PlotArea_typekey")(WordDotPlotArea_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotArea]
  }
}

