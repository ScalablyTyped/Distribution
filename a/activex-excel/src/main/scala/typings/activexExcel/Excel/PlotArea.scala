package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlotArea extends StObject {
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  val Border: typings.activexExcel.Excel.Border = js.native
  
  def ClearFormats(): js.Any = js.native
  
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
  
  def Select(): js.Any = js.native
  
  var Top: Double = js.native
  
  var Width: Double = js.native
  
  val _InsideHeight: Double = js.native
  
  val _InsideLeft: Double = js.native
  
  val _InsideTop: Double = js.native
  
  val _InsideWidth: Double = js.native
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
  implicit class PlotAreaMutableBuilder[Self <: PlotArea] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorder(value: Border): Self = StObject.set(x, "Border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearFormats(value: () => js.Any): Self = StObject.set(x, "ClearFormats", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcelDotPlotArea_typekey(value: PlotArea): Self = StObject.set(x, "Excel.PlotArea_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFill(value: ChartFillFormat): Self = StObject.set(x, "Fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: ChartFormat): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "Height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsideHeight(value: Double): Self = StObject.set(x, "InsideHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsideLeft(value: Double): Self = StObject.set(x, "InsideLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsideTop(value: Double): Self = StObject.set(x, "InsideTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsideWidth(value: Double): Self = StObject.set(x, "InsideWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterior(value: Interior): Self = StObject.set(x, "Interior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeft(value: Double): Self = StObject.set(x, "Left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: XlChartElementPosition): Self = StObject.set(x, "Position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelect(value: () => js.Any): Self = StObject.set(x, "Select", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTop(value: Double): Self = StObject.set(x, "Top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_InsideHeight(value: Double): Self = StObject.set(x, "_InsideHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_InsideLeft(value: Double): Self = StObject.set(x, "_InsideLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_InsideTop(value: Double): Self = StObject.set(x, "_InsideTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_InsideWidth(value: Double): Self = StObject.set(x, "_InsideWidth", value.asInstanceOf[js.Any])
  }
}
