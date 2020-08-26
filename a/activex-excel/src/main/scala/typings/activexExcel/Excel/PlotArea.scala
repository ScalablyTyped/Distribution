package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotArea extends js.Object {
  val Application: typings.activexExcel.Excel.Application = js.native
  val Border: typings.activexExcel.Excel.Border = js.native
  val Creator: XlCreator = js.native
  @JSName("Excel.PlotArea_typekey")
  var ExcelDotPlotArea_typekey: PlotArea = js.native
  val Fill: ChartFillFormat = js.native
  val Format: ChartFormat = js.native
  var Height: Double = js.native
  var InsideHeight: Double = js.native
  var InsideLeft: Double = js.native
  var InsideTop: Double = js.native
  var InsideWidth: Double = js.native
  val Interior: typings.activexExcel.Excel.Interior = js.native
  var Left: Double = js.native
  val Name: String = js.native
  val Parent: js.Any = js.native
  var Position: XlChartElementPosition = js.native
  var Top: Double = js.native
  var Width: Double = js.native
  val _InsideHeight: Double = js.native
  val _InsideLeft: Double = js.native
  val _InsideTop: Double = js.native
  val _InsideWidth: Double = js.native
  def ClearFormats(): js.Any = js.native
  def Select(): js.Any = js.native
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
  @scala.inline
  implicit class PlotAreaOps[Self <: PlotArea] (val x: Self) extends AnyVal {
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
    def setBorder(value: Border): Self = this.set("Border", value.asInstanceOf[js.Any])
    @scala.inline
    def setClearFormats(value: () => js.Any): Self = this.set("ClearFormats", js.Any.fromFunction0(value))
    @scala.inline
    def setCreator(value: XlCreator): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setExcelDotPlotArea_typekey(value: PlotArea): Self = this.set("Excel.PlotArea_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setFill(value: ChartFillFormat): Self = this.set("Fill", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormat(value: ChartFormat): Self = this.set("Format", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("Height", value.asInstanceOf[js.Any])
    @scala.inline
    def setInsideHeight(value: Double): Self = this.set("InsideHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setInsideLeft(value: Double): Self = this.set("InsideLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def setInsideTop(value: Double): Self = this.set("InsideTop", value.asInstanceOf[js.Any])
    @scala.inline
    def setInsideWidth(value: Double): Self = this.set("InsideWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setInterior(value: Interior): Self = this.set("Interior", value.asInstanceOf[js.Any])
    @scala.inline
    def setLeft(value: Double): Self = this.set("Left", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: XlChartElementPosition): Self = this.set("Position", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelect(value: () => js.Any): Self = this.set("Select", js.Any.fromFunction0(value))
    @scala.inline
    def setTop(value: Double): Self = this.set("Top", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("Width", value.asInstanceOf[js.Any])
    @scala.inline
    def set_InsideHeight(value: Double): Self = this.set("_InsideHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def set_InsideLeft(value: Double): Self = this.set("_InsideLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def set_InsideTop(value: Double): Self = this.set("_InsideTop", value.asInstanceOf[js.Any])
    @scala.inline
    def set_InsideWidth(value: Double): Self = this.set("_InsideWidth", value.asInstanceOf[js.Any])
  }
  
}

