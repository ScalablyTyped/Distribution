package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMsoPlotArea extends js.Object {
  val Application: js.Any
  val Border: IMsoBorder
  val Creator: Double
  val Fill: ChartFillFormat
  val Format: IMsoChartFormat
  var Height: Double
  var InsideHeight: Double
  var InsideLeft: Double
  var InsideTop: Double
  var InsideWidth: Double
  val Interior: IMsoInterior
  var Left: Double
  val Name: String
  @JSName("Office.IMsoPlotArea_typekey")
  var OfficeDotIMsoPlotArea_typekey: IMsoPlotArea
  val Parent: js.Any
  var Position: XlChartElementPosition
  var Top: Double
  var Width: Double
  def ClearFormats(): js.Any
  def Select(): js.Any
}

object IMsoPlotArea {
  @scala.inline
  def apply(
    Application: js.Any,
    Border: IMsoBorder,
    ClearFormats: () => js.Any,
    Creator: Double,
    Fill: ChartFillFormat,
    Format: IMsoChartFormat,
    Height: Double,
    InsideHeight: Double,
    InsideLeft: Double,
    InsideTop: Double,
    InsideWidth: Double,
    Interior: IMsoInterior,
    Left: Double,
    Name: String,
    OfficeDotIMsoPlotArea_typekey: IMsoPlotArea,
    Parent: js.Any,
    Position: XlChartElementPosition,
    Select: () => js.Any,
    Top: Double,
    Width: Double
  ): IMsoPlotArea = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Border = Border.asInstanceOf[js.Any], ClearFormats = js.Any.fromFunction0(ClearFormats), Creator = Creator.asInstanceOf[js.Any], Fill = Fill.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], InsideHeight = InsideHeight.asInstanceOf[js.Any], InsideLeft = InsideLeft.asInstanceOf[js.Any], InsideTop = InsideTop.asInstanceOf[js.Any], InsideWidth = InsideWidth.asInstanceOf[js.Any], Interior = Interior.asInstanceOf[js.Any], Left = Left.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select), Top = Top.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.IMsoPlotArea_typekey")(OfficeDotIMsoPlotArea_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMsoPlotArea]
  }
}

